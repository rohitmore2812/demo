package Star;

public class sample1 
{
	public static void main(String[] args) 
	{
		//*
		//**
		//***
		//****
		
		int star=1;
		for(int i=1; i<=4; i++)          //outer for loop----->rows
		{
			for(int j=1; j<=star; j++)   //inner for loop------>cols
	
		{
			System.out.print("*");
		}
		
		System.out.println();
		star++;
		
	}
}
}
