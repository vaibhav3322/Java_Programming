package For_Each_Method;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main
{
  public static void main(String[] args)
  {
	   List<String> sublist=new ArrayList<String>();
	                sublist.add("Marathi");
	                sublist.add("English");
	                sublist.add("Bio");
	                sublist.add("Maths");
	                sublist.add("History");
	                // java 8 approach
	                sublist.forEach(ss->System.out.println(ss));
	                
	                //traditional approach
	                Iterator itr=sublist.iterator();
	                while (itr.hasNext()) {
						System.out.println(itr.next());
						
					}
	
}
}
