package InnerClass;
public class innerclassAssisted1 {
		 private String msg="Welcome to Java"; 
		 class Inner{  
		  void hello(){System.out.println(msg+", Let us start learning Inner Classes");}  
		 }  
		public static void main(String[] args) {
			innerclassAssisted1 obj=new innerclassAssisted1();
			innerclassAssisted1.Inner in=obj.new Inner();  
			in.hello();  
		}
	}
