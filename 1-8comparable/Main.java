import java.util.*;

public class Main {
	public static void main(String[] args) {
		List<Account>list = new ArrayList<>();
		Account a = new Account();
		a.number = 123456;
		a.zandaka = 10000;
		list.add(a);
		
		Account b = new Account();
		b.number = 333333;
		b.zandaka = 5000;
		list.add(b);
		
		Account c = new Account();
		c.number = 265432;
		c.zandaka = 7500;
		list.add(c);
		
// 		そのまま表示
		System.out.println(list);
// 		自然順で表示（口座番号順）格納オブジェクト自体のcompare()を呼び出す
		Collections.sort(list);
		System.out.println(list);
// 		残高順で表示　ZandakaComparatorのcompare()を呼び出す
		Collections.sort(list,new ZandakaComparator());
		System.out.println(list);
	}
}