package br.com.zupacademy.gabriel.transacao.transaction;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/transactions")
public class TransactionController {
	
	@Autowired
	private TransactionRepository transactionRepository;
	
	
	@GetMapping("/{id}")
	public ResponseEntity<List<TransactionResponse>>list10LastTransactions(@PathVariable String id) {
		List<Transaction> existTransactionWithCardId = transactionRepository.findByCardId(id);
		if (existTransactionWithCardId.isEmpty()) {
			return ResponseEntity.notFound().build();
		}
		List<Transaction> transactions = transactionRepository.findTop10ByCardIdOrderByEffectedInDesc(id);
		
		List<TransactionResponse> responseList = transactions.stream().map(transaction -> new TransactionResponse(transaction)).collect(Collectors.toList());
		
		return ResponseEntity.ok(responseList);
	}
	


}
