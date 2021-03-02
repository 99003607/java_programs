//break and continue
public class demobreakandcontinue {
	public static void main(String[] args) {
		int a=10,i=1;
		//break begin
		while(i<=a)
		{
			if(i==5)
			{
				break;
			}
			System.out.println(i);
			i++;
		}
		//break end
		
		//continue begin
		System.out.println("-----continue-----");
		i=0;
		while(i<=a)
		{
			if(i==5)
			{
				i++;
				continue;
			}
			System.out.println(i);
			i++;
			
		}
		//continue end
	}
}
