import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo
{
	public static void main(String[] args)
	{
		List<String> list = new ArrayList<>();
		list.add("Apple");
		list.add("BANANA");
		list.remove("Apple");
		list.remove("Fruit");
		System.out.println(list.size());
		
		
	}
}
