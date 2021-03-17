class ExampleStatic1{
	
	static int a=10;
	static void display(){   //this is method

		System.out.println("a value:"+a);
	}
	//static block, executes once before main 
	//static{System.out.println("inside static block");a=20;}
	
	ExampleStatic1(){
		a++;
		
	}
	
	public static void main(String args[]){
		
		
		
		
		ExampleStatic1 es1=new ExampleStatic1()/*constructor*/;  //creating an object
		es1.display();  //if static block not used then a=11; if used then a=21;
		ExampleStatic1 es2=new ExampleStatic1();
		es2.display(); // if static block not used then a=12;  if used them a=22;
	}
}