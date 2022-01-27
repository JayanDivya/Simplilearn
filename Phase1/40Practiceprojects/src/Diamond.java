
public class Diamond implements Third, Fourth
{  
    public void show() 
    {  
        Third.super.show(); 
        Fourth.super.show(); 
    } 
    public static void main(String args[]) 
    { 
        TestClass ob = new TestClass(); 
        ob.show(); 
    } 
}
interface Third 
{  
    default void show() 
    { 
        System.out.println("Default First"); 
    } 
} 
interface Fourth
{  
    default void show() 
    { 
        System.out.println("Default Second"); 
    }
}
