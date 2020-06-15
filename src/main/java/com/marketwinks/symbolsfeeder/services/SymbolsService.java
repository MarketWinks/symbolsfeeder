package com.marketwinks.symbolsfeeder.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.marketwinks.symbolsfeeder.model.Symbols;
import com.marketwinks.symbolsfeeder.repository.SymbolsRepository;

@RestController
@RequestMapping("/symbol")
public class SymbolsService {

	@Autowired
	private SymbolsRepository SymbolsRepository;

	@org.springframework.scheduling.annotation.Async
	@RequestMapping(value = "/{symbol}/{type}/{exchange}/{name}/onboard", method = RequestMethod.GET)
	public boolean SymbolOnboarder(@PathVariable String symbol, @PathVariable String type,
			@PathVariable String exchange, @PathVariable String name) {

		boolean execution_result = false;

		// save to the db
		Symbols symbolonboard = new Symbols();

		symbolonboard.setSymbol(symbol);
		symbolonboard.setType(type);
		symbolonboard.setExchange(exchange);
		symbolonboard.setName(name);
		symbolonboard.setProfile("");
		symbolonboard.setFundamentals("");
		symbolonboard.setPublicsentiment("");

		Symbols result = SymbolsRepository.save(symbolonboard);

		execution_result = true;
		return execution_result;

	}

}
