
public class W25 {
	
		public static void main(String[] args) {
			
			int arr[]= {1,2,3,4,5,6,7,8,9,10},i,ele=8,flag=0;
			for(i=0;i<arr.length;i++)
			{
				if(ele==arr[i])
				{
					System.out.println(arr[i]+" is found in index "+i);
					flag=1;
				}
			}
			if(flag==0)
				System.out.println("-1");

		}

	}



