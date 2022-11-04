package comparator;
import java.util.Map;

public class TransactionService {
	public void printAllTransaction(Map<String, Transaction> map) {
		for(Map.Entry<String, Transaction> item: map.entrySet())
		{
			System.out.println(item.getKey() + "="+item.getValue().getSenderAccountNumber()+"="+item.getValue().getRecipientAccountNumber());;
		}
		
		
	}

}


