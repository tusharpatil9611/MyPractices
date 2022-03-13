package MyPractics;

public class minFunction {
	public  static int minFunction(int a,int b){  // this is a non static method
		int min;
	
		if(a<b){
		min=a;
		System.out.println(min);
		}
	
		else{
			min=b;
			System.out.println(min);
		}
		
		return min;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		minFunction.minFunction(20, 40);				// this is a static method
		minFunction object=new minFunction();  			// for non static method 
		object.minFunction(60, 25);

	}

}
