package methodReturnType;

public class sample1 
{
	public static void main(String[] args) 
	{
		int num = addition(10,20);
		System.out.println(num*num);    //900
		System.out.println(num);
		
		
		System.out.println("-----------------");
		
         sample1 R = new sample1();
         int num5 = R.sub(70, 50);
		System.out.println(num5+num5);
		
		System.out.println("-----------------");
		
		int l2 = sample2.getLengthOfString("Rohit");
		System.out.println(l2);
		
		System.out.println(sample2.getLengthOfString("More"));
	
	}
       
	  // method with return type
	public static int addition(int num1, int num2)   //10,20
	{
		int sum = num1+num2;           //30
		return sum;
		
		
	}
	
	public  int sub(int num3, int num4) //70,50
	{
		int sub = num3-num4;           //20
		return sub;
	}
}
