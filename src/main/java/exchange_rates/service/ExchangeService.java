package exchange_rates.service;

import org.springframework.http.ResponseEntity;

import exchange_rates.domain.ExchangeRates;

public interface ExchangeService {
	ResponseEntity<ExchangeRates> getExchangeRates();	
}
