package Sep_5;

public class PracticeStringCharacterOccourance
{
   public static void main(String[] args) {
	
	   String s="Vaibhav";
	   int totalLength=s.length();
	   
	   //for V
	   int length_afterRemoving_V=s.replace("V","").length();
	   //for a
	   int length_afterRemoving_a=s.replace("a","").length();
	 //for i
	   int length_afterRemoving_i=s.replace("i","").length();
	 //for b
	   int length_afterRemoving_b=s.replace("b","").length();
	   //for h
	   int length_afterRemoving_h=s.replace("h","").length(); 
	   //for v
	   int length_afterRemoving_v=s.replace("v","").length();
	   
	   
	   int count_of_V=totalLength-length_afterRemoving_V;
	   int count_of_a=totalLength-length_afterRemoving_a; int count_of_i=totalLength-length_afterRemoving_i;
	   int count_of_b=totalLength-length_afterRemoving_b; int count_of_h=totalLength-length_afterRemoving_h;
	   int count_of_v=totalLength-length_afterRemoving_v;
	   
	   System.out.println("V = "+count_of_V);
	   System.out.println("a = "+count_of_a); System.out.println("i = "+count_of_i);System.out.println("b = "+count_of_b);
	   System.out.println("h = "+count_of_h);  System.out.println("v = "+count_of_v);
}
}
