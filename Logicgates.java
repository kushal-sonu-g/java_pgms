//WAP to implement logic gates

//find how to pass variable length arguments in java it is ... example function( ...a)
class Logicgates{
	
	int or_gate(int input1,int input2){
		
		int a,b,out_or;
		a=input1;
		b=input2;
		out_or= a|b;
		
		return out_or;
		
	}
	int nor_gate(int input1,int input2){
		
		int a,b,out_nor;
		a=input1;
		b=input2;
		
		if(a==0 && b==0) //if you give a=0 && b=0  error: incompatible types: int cannot be converted to boolean  
			out_nor = 1;
		else
			out_nor = 0;
		
		return out_nor;
	}
	public static void main(String args[]){
		
		int input1=0;
		int input2=1;
		
		Logicgates lg=new Logicgates();
		
		int result_or=lg.or_gate(input1,input2);
		int result_nor=lg.nor_gate(input1,input2);
		
		System.out.println("result_or :"+result_or);
		System.out.println("result_nor :"+result_nor);
	}
	
	
}