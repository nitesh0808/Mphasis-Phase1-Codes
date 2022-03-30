public class W9 {
	public static void main(String args[])
	{
		int k=Integer.parseInt(args[1]);
		if(args[0].equals("Male"))
			{
			if(k>=1 && k<=58)
				System.out.println("8.4%");
			else
				System.out.println("10.5%");	
			}
		else if(args[0].equals("Female"))
		{
			if(k>=1 && k<=58)
				System.out.println("8.2%");
			else
				System.out.println("9.2%");	
		}
	}

}


