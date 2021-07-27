package br.com.zupacademy.gabriel.transacao.transaction;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository	
public interface TransactionRepository extends JpaRepository<Transaction, Long>{

	List<Transaction> findTop10ByCardIdOrderByEffectedInDesc(String cardNumber);

	List<Transaction> findByCardId(String cardNumber);

}
