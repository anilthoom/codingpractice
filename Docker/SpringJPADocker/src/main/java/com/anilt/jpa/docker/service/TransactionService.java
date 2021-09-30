package com.anilt.jpa.docker.service;

import com.anilt.jpa.docker.entity.Transaction;
import com.anilt.jpa.docker.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TransactionService {
    @Autowired
    TransactionRepository transactionRepository;

    public void saveTransaction(Transaction transaction){
        transactionRepository.save(transaction);
    }

    public Iterable<Transaction> getTransactionHistory() {
        return transactionRepository.findAll();
    }

    public Optional<Transaction> getTransaction(Long id) {
        return transactionRepository.findById(id);
    }
}
