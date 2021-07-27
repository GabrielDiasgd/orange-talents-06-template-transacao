package br.com.zupacademy.gabriel.transacao.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import br.com.zupacademy.gabriel.transacao.transaction.Transaction;
import br.com.zupacademy.gabriel.transacao.transaction.TransactionRepository;

@Component
public class TransactionListener {
	
	@Autowired
	private TransactionRepository transactionRepository;
	
	private final Logger logger = LoggerFactory.getLogger(TransactionListener.class);
	
	@KafkaListener(topics = "${spring.kafka.topic.transactions}")
	public void toListen(TransactionMessage event) {
		logger.info(event.toString());
		try {
			Transaction transaction = event.toModel();
			transactionRepository.save(transaction);
			logger.info("Transação salva com sucesso!");
		} catch (Exception e) {
			logger.info("Não foi possível salvar a transação, motivo: " + e.getMessage());
		}
		
	}

}
