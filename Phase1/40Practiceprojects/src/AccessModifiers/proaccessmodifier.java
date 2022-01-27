package AccessModifiers;
public class proaccessmodifier {
	protected void display() 
    { 
        System.out.println("This is Protected Access Modifier"); 
    } 
 static class accessmodifier4 {

	public static void main(String[] args) {
		System.out.println("Protected Access modifier");
		proaccessmodifier obj = new proaccessmodifier();   
	       obj.display();  
	}
}
}
