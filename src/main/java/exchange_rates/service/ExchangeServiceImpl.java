package exchange_rates.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import exchange_rates.business.Exchange;
import exchange_rates.domain.ExchangeRates;

@Component
public class ExchangeServiceImpl implements ExchangeService {
	
	@Autowired
	Exchange exchange;
	
	Logger logger = LoggerFactory.getLogger(ExchangeServiceImpl.class);

	@Override
	public ResponseEntity<ExchangeRates> getExchangeRates() {
		logger.info("getExchangeRates() service : recieved request to retrieve exchange rates.");
		return exchange.getExchangeRates();
	}	

}
