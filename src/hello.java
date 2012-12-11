
public class hello {
public static void main(String args[]){
	System.out.println("Hello world");
	int i;
	int a=0;
	int bb=0;
	
	
	for (i=1;i<=100;i++){
		System.out.print("Var i = "+i);
		if (i%2==0){
			System.out.println("<<<< This is Odd");
			
		}
		else System.out.println("");
		
		if (i==100){
			System.out.println("The End of program");
			
		}
		if (i%10==0){
			bb = a/2;
			a--;
						
		}
	}
	if (a%2==0){
		
		System.out.println("var a = "+a+bb);
		System.out.println("hello");
		
		
	}

	int f = -10-4;
	System.out.println("value is "+f);
	
}
}
