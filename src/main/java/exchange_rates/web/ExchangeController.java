package exchange_rates.web;

import org.springframework.http.ResponseEntity;

import exchange_rates.domain.ExchangeRates;

public interface ExchangeController {
	public ResponseEntity<ExchangeRates> getExchangeRates();
}
