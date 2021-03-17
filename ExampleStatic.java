class ExampleStatic{
	
	static int a=10;
	static void display(int x,int y){   //this is method

		System.out.println("x value:"+x);
		System.out.println("y value:"+y);
	}
	
	public static void main(String args[]){
		
		int x=10,y=20;
		
		
		ExampleStatic es = new ExampleStatic()/*constructor*/;  //creating an object
		es.display(x,y);
		System.out.println("a value:"+es.a);
	}
}