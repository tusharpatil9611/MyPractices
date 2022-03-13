package MyPractics;

public class ReturnName {
 String getStudent(String Name){   //create a method to return name provide string arg
	 return Name;                  //return name to the method
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
ReturnName R= new ReturnName(); //create object of the class
String A=R.getStudent("Tushar"); // Calling to method by return student name.
System.out.print("Nmae of the Student is " +A );
	}

}
