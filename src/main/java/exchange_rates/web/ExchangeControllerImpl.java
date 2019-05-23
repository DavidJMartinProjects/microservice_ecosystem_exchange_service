package exchange_rates.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import exchange_rates.domain.ExchangeRates;
import exchange_rates.service.ExchangeService;

@RestController
public class ExchangeControllerImpl implements ExchangeController {
	
	@Autowired
	ExchangeService exchangeService;	
	
	Logger logger = LoggerFactory.getLogger(ExchangeControllerImpl.class);
	
	@GetMapping
	public ResponseEntity<ExchangeRates> getExchangeRates() {
		logger.info("getExchangeRates() controller : recieved request to retrieve exchange rates.");
		return exchangeService.getExchangeRates();
	}

}	
	