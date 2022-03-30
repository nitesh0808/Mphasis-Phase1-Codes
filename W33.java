
public class W33 {
	
 W33(double w, double h, double d) 
	    { 
	        double width = w; 
	        double height = h; 
	        double depth = d; 
	    } 
	  
	   
	  
	   
	    double volume() 
	    { 
	        int width=10;
			int depth = 20;
			int height=15;
			return width * height * depth; 
	    } 

	  


	    public static void main(String args[]) 
	    { 
	         
	        W33 s = new W33(10, 20, 15); 
	        
	  
	        double vol; 
	  
	        
	        vol = s.volume(); 
	        System.out.println(" Volume of the box is " + vol); 
	  
	        
	        
	    
	}


}
