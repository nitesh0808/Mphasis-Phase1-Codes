import java.util.Scanner;

public class W24 {
	

	    public static void main(String[] args) {
	        int[] num = {1, 2, 3, 4, 5};
	        try (var sc = new Scanner(System.in)) {
				int x = sc.nextInt();
				boolean found = false;

				for (int i : num) {
				    if (i == x) {
				        found = true;
				        break;
				    }
				}

				if(found)
				{
				  int l= num.length;
				  int j=0;
				  while(j<l)
				  {
				     if(num[j] == x)
				     {
				      return;
				    
				     }
				     else
				     {
				       j=j+1;
				     }
				 }
				}
				 else{
				    System.out.println("-1");
   }
			}
	}


}
