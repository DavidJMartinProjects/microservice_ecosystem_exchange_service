package exchange_rates.business;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import exchange_rates.config.ExchangeRateConfig;
import exchange_rates.domain.ExchangeRates;

@Component
public class ExchangeImpl implements Exchange {
	
	@Autowired
	ExchangeRateConfig exchangeRateConfig;	
	
	String exchangeApiUrl;
	RestTemplate restTemplate;
	
	Logger logger = LoggerFactory.getLogger(ExchangeImpl.class);
	
	
	@PostConstruct
	public void init() {
		restTemplate = new RestTemplate();
		exchangeApiUrl = exchangeRateConfig.getExchangeApiUrl();
		logger.info("getExchangeRates() - exchangeApiUrl set to : {} ", exchangeApiUrl);
	}

	@Override
	public ResponseEntity<ExchangeRates> getExchangeRates() {	
		logger.info("getExchangeRates() - attempting to retrieve exchange rate data from api. {}", exchangeApiUrl);
		return restTemplate.getForEntity(exchangeApiUrl, ExchangeRates.class);
	}

}
	