package AccessModifiers;
public class priaccessmodifier {
		   private void display() 
		    { 
		        System.out.println("You are using private access modifier"); 
		    } 

		static class accessmodifier2 {

			public static void main(String[] args) {
				//private
				System.out.println("Private Access modifier");
				priaccessmodifier  obj = new priaccessmodifier(); 
		        //trying to access private method of another class 
		        obj.display();
			}
		}
}

		