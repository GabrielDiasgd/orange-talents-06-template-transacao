package br.com.zupacademy.gabriel.transacao.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class TransactionListener {
	
	private final Logger logger = LoggerFactory.getLogger(TransactionListener.class);
	
	@KafkaListener(topics = "${spring.kafka.topic.transactions}")
	public void toListen(TransactionMessage event) {
		logger.info("------------ " + event.toString() + " ----------------");
	}

}
