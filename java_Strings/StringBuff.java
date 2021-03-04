//StringBuffer
package stringDemo;

public class StringBuff {
	public static void main(String[] args) {
		StringBuffer s1=new StringBuffer("Sandesh");
		StringBuffer s2=new StringBuffer("Prabhu");
		
		//reverse
		System.out.println("-----reverse-----");
		System.out.println("s1->"+s1);
		System.out.println("s1.reverse() -> "+s1.reverse());
		//append
		System.out.println("-----append-----");
		s1=new StringBuffer("Sandesh");
		System.out.println("s1->"+s1);
		System.out.println("s2->"+s2);
		System.out.println("s1.append(s2) -> "+s1.append(s2));
		//capacity
		System.out.println("-----capacity-----");
		s1=new StringBuffer("Sandesh");
		System.out.println("s1->"+s1);
		System.out.println("s1.capacity() -> "+s1.capacity());
		//insert
		System.out.println("-----insert-----");
		s1=new StringBuffer("Sandesh");
		System.out.println("s1->"+s1);
		System.out.println("s1.insert(07, \"Prabhu\") -> "+s1.insert(07, "Prabhu"));
		//length
		System.out.println("-----length-----");
		s1=new StringBuffer("Sandesh");
		System.out.println("s1->"+s1);
		System.out.println("s1.length() -> "+s1.length());
	}
}
