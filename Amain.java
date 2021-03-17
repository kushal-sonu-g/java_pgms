class A{
	int a=10;
	int b=30;
	void display(){
		
		System.out.println("a "+a);
		System.out.println("b "+b);
	}
}

class Amain{
	public static void main(String args[]){
		
		String a[]={"Hello","world"};
		
		A obj=new A();
		Amain Am=new Amain();
		obj.display();
		//System.out.println(args[0]);
		main(a);
		System.out.println(args[0]);
	}
		
}				