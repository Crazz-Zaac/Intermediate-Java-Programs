// Write a Java program to illustrate the exception propagation using throws keyword.

class ExceptionPropagation{  
	void method1() throws ArithmeticException{
   		throw new ArithmeticException("Calculation error"); 
   }
   void method2() throws ArithmeticException{  
		method1();  
   }  
   void method3(){  
	   	try{  
	   		method2();  
		}
		catch(ArithmeticException e){
			System.out.println("ArithmeticException handled");
		}  
	}  
	public static void main(String args[]){  
		ExceptionPropagation obj = new ExceptionPropagation();  
		obj.method3();  
		System.out.println("End Of Program");  
   }  
}