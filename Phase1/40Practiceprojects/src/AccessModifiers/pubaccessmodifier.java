package AccessModifiers;
public class pubaccessmodifier {
	public void display() 
    { 
        System.out.println("you are using Public Access Modifier"); 
    } 

static class accessSpecifiers3 {

	public static void main(String[] args) {
		System.out.println("Public Access Modifier");
		pubaccessmodifier obj = new pubaccessmodifier(); 
        obj.display();  
		
	}
}
}
