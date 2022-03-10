package com.anilt.redis.controller;

import com.anilt.redis.model.Invoice;
import com.anilt.redis.service.InvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class InvoiceController {
    @Autowired
    InvoiceService invoiceService;

    @PostMapping("/invoice")
    public Invoice saveInvoice(@RequestBody Invoice inv){
        return invoiceService.saveInvoice(inv);
    }

    @GetMapping("/invoices")
    public ResponseEntity<List<Invoice>> getAllInvoices(){
        return ResponseEntity.ok(invoiceService.getAllInvoices());
    }

    @GetMapping("/invoice/{id}")
    public Invoice getInvoice(@PathVariable Integer id){
        return invoiceService.getOneInvoice(id);
    }

}
