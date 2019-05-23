package exchange_rates.business;

import org.springframework.http.ResponseEntity;

import exchange_rates.domain.ExchangeRates;

public interface Exchange {
	ResponseEntity<ExchangeRates> getExchangeRates();
}
