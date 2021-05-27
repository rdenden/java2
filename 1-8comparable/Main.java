import java.util.*;

public class Main {
	public static void main(String[] args) {
		List<Account>list = new ArrayList<>();
		Account a = new Account();
		a.number = 123456;
		list.add(a);
		Account b = new Account();
		b.number = 333333;
		list.add(b);
		Account c = new Account();
		c.number = 265432;
		list.add(c);
		System.out.println(a);
		Collections.sort(list);
		System.out.println(list);
		
	}
}