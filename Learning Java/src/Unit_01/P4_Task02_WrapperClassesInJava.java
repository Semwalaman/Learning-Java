package Unit_01;

public class P4_Task02_WrapperClassesInJava {
	
public static void main(String[] args) {
		
		//Converting int into Integer
		int a=20;
		
		String s=""+a+"";
		
		//Converting int into Integer explicitly
		Integer i=Integer.valueOf(a);
		
		//Autoboxing, now complier will write Integer, valueOf(a) internally
		Integer j=a;

		System.out.println("Value of a: "+a +" Value of i: "+ i +" Value of j: " + j);
		
		System.out.println("Converted int in string is: "+i.toString());
		
		//a.toString() can not be done due to a is int not object
		
		//Autoboxing: Converting primitives into objects
		byte b=10;
		Byte byteobj=b;
		
		System.out.println("DataType in object: "+byteobj);
		
		//Unboxing: Converting Objects To Primitives
		byte bytevalue=byteobj;
		System.out.println("Object in Datatype: "+bytevalue);
	}

}
