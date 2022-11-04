package comparator;
import java.util.*;

public class TransactionMap {
	public static void main(String[] args) {
	
		HashMap<String,Transaction> map = new HashMap<>();
		
		Transaction t1 = new Transaction("TD5678", 110095, 345678, 20000);
		Transaction t2 = new Transaction("TD6764", 149352, 577321, 100000);
		Transaction t3 = new Transaction("TD6785", 210995, 673567, 50000);
		map.put("1", t1);
		map.put("2", t3);
		map.put("3", t3);
		TransactionService transactionService=new TransactionService();
		transactionService.printAllTransaction(map);
			
		}
		}
		
		

	


