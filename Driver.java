
public class Driver {

	public static void main (String[] args)
	{
		
		AList lst = new AList();
		System.out.println(lst.getData());
		lst.add("h");
		lst.add("d");
		lst.add("c");
		lst.add("b");
		lst.add("j");
		lst.add("g");
		lst.add("a");
		lst.add("f");
		
		try {
			
		     lst.reverse();
		     lst.display();
		     System.out.println("quickSort result:");
		     lst.quickSort();
		     lst.display();
		     
		} catch (Exception e) {
			
			e.printStackTrace();
		}

	}
}
