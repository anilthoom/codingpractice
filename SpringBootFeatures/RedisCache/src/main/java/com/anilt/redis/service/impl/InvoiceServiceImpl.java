package com.anilt.redis.service.impl;

import com.anilt.redis.exceptions.InvoiceNotFoundException;
import com.anilt.redis.model.Invoice;
import com.anilt.redis.repository.InvoiceRepository;
import com.anilt.redis.service.InvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InvoiceServiceImpl implements InvoiceService {

    @Autowired
    private InvoiceRepository invoiceRepository;

    @Override
    public Invoice saveInvoice(Invoice inv) {
        return invoiceRepository.save(inv);
    }

    @Override
    @CachePut(value = "Invoice", key = "#invId")
    public Invoice updateInvoice(Invoice inv, Integer invId) {
        Invoice invoice = invoiceRepository.findById(invId)
                .orElseThrow(() -> new InvoiceNotFoundException("Invoice not found"));
        invoice.setInvAmount(inv.getInvAmount());
        invoice.setInvName(inv.getInvName());
        return invoiceRepository.save(invoice);
    }

    @Override
    @CacheEvict(value = "Invoice", key = "#invId")
    public void deleteInvoice(Integer invId) {
        Invoice invoice = invoiceRepository.findById(invId)
                .orElseThrow(() -> new InvoiceNotFoundException("Invoice not found"));
        invoiceRepository.delete(invoice);
    }

    @Override
    @Cacheable(value = "Invoice", key="#invId")
    public Invoice getOneInvoice(Integer invId) {
        Invoice invoice = invoiceRepository.findById(invId)
                .orElseThrow(() -> new InvoiceNotFoundException("Invoice not found"));
        return invoice;
    }

    @Override
    @Cacheable(value = "Invoice")
    public List<Invoice> getAllInvoices() {
        return invoiceRepository.findAll();
    }
}
