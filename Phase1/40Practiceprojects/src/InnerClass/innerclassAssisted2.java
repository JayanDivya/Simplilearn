package InnerClass;
public class innerclassAssisted2 {
		private String msg="Inner Classes";
		 void display(){  
			 class Inner{  
				 void msg(){
					 System.out.println(msg);
				 }  
		  }  		  
		  Inner l=new Inner();  
		  l.msg();  
		 }  		 
		public static void main(String[] args) {
			innerclassAssisted2  ob=new innerclassAssisted2 ();  
			ob.display();  
			}
		}
