//Strings
/*
 * Strings are stored in heap memory.
 * both s1 and s2 refer to same memory location.
 * s3 is not stored in string pool.so s1 is not equal to s3.
 */
package stringDemo;

public class StringDe {
	public static void main(String[] args) {
		String s1="Sandesh";
		String s2="Sandesh";
		String s3=new String("Sandesh");
		System.out.println("s1:"+s1+"\ns2:"+s2);
		
		//to check hashCode
		System.out.println("-----hashCode-----");
		System.out.println("s1.hashcode():"+s1.hashCode());
		System.out.println("s2.hashcode():"+s2.hashCode());
		
		//equals
		System.out.println("-----equals-----");
		System.out.println("s1.equals(s2): "+s1.equals(s2));
		System.out.println("s1.equals(s3): "+s1.equals(s3));
		
		//charAt(index)
		System.out.println("-----chartAt-----");
		System.out.println("s3.hashcode():"+s3.hashCode());
		System.out.println("s1.charAt(0):"+s1.charAt(3));
		System.out.println("s1.compareTo(s2):"+s1.compareTo(s2));
		
		//Concatenate
		System.out.println("-----Concatenate-----");
		s1=new String("Sandesh");
		s2=new String("Prabhu");
		String s4=s1.concat(s2);
		System.out.println(s1);
		System.out.println("s1.concat(s2):"+s4);
		
		//compareTo
		System.out.println("-----compareTo-----");
		String s11="hello";  
		String s21="hello";  
		String s31="meklo";  
		String s41="hemlo";  
		String s51="flag";  
		System.out.println("s11: "+s11);
		System.out.println("s21: "+s21);
		System.out.println("s31: "+s31);
		System.out.println("s41: "+s41);
		System.out.println("s51: "+s51);
		System.out.println("s11.compareTo(s21) ->"+s11.compareTo(s21));
		System.out.println("s11.compareTo(s31)-> "+s11.compareTo(s31)); 
		System.out.println("s11.compareTo(s41) -> "+s11.compareTo(s41)); 
		System.out.println("s11.compareTo(s51) ->"+s11.compareTo(s51));
		
		//getBytes
		s1="sandesh";
		System.out.println("-----getBytes-----");
		System.out.println("s1: "+s1);
		byte[] b=s1.getBytes(); 
		System.out.println("s1.getBytes() ->");
		for(int i=0;i<b.length;i++)
		{  
			System.out.println(b[i]);  
		} 
		
		//indexOf
		System.out.println("-----indexOf-----");
		s1="this is index of example";  
		System.out.println("s1: "+s1);
		int index1=s1.indexOf("is");
		int index2=s1.indexOf("index");
		System.out.println(index1+"  "+index2);
		System.out.println("s1.indexOf(\"is\",4) -> "+s1.indexOf("is",4));
		System.out.println("s1.indexOf('s') ->"+s1.indexOf('s'));
		
		//replace
		System.out.println("-----replace-----");
		s1="larsen and toubro technology services";  
		System.out.println("s1: "+s1);
		System.out.println("s.replace(\"toubro\", \"power\") ->"+s1.replace("toubro", "power"));
		
		//trim
		System.out.println("-----trim-----");
		s1="  hello java string  ";
		System.out.println(s1.length());  
	    System.out.println(s1); 
	    String tr = s1.trim();  
	    System.out.println(tr.length());  
	    System.out.println(tr);
	}
}
