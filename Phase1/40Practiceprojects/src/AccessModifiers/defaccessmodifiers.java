package AccessModifiers;
public class defaccessmodifiers {
	
	  void display() 
	     { 
	         System.out.println("You are using defalut access modifier"); 
	     } 
	static class accessmodifiers {

		public static void main(String[] args) {
			//default
			System.out.println("Default Access Modifier");
			defaccessmodifiers obj = new defaccessmodifiers(); 		  
	        obj.display(); 
		}
	}
}