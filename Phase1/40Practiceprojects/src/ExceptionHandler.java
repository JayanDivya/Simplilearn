class ExceptionHandler{
		   public static void main(String args[]){
			try{
				System.out.println("Starting of try block");
				// I'm throwing the custom exception using throw
				throw new myexception("This is My error Message");
			}
			catch (myexception exp){
				System.out.println("Catch Block") ;
				System.out.println(exp) ;
			}
		   }
		}
		class myexception extends Exception{
		   String st;
		   myexception(String str2) {
			st=str2;
		   }
		   public String toString(){ 
			return ("Myexception occurred :"+st) ;
		   }
		}
		