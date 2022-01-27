public class Main 
	{ 
	    public static void main(String args[]) 
	    { 
	        try
	        { 
	            throw new Myexcp("temp"); 
	        } 
	        catch (Myexcp ex) 
	        { 
	            System.out.println("Caught"); 
	            System.out.println(ex.getMessage()); 
	        } 
	    } 
	}
	 class Myexcp  extends Exception {
	    public Myexcp(String s) 
	    { 
	        super(s); 
	    } 
	} 
