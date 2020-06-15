package com.marketwinks.symbolsfeeder.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.marketwinks.symbolsfeeder.model.Symbols;

@Repository
public interface SymbolsRepository extends MongoRepository<Symbols, String> {
}
