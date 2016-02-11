class Person {

	private int id;
	private String name;

	public Person(int id, String name) {

		this.id = id;
		this.name = name;
	}

	//can be generated using RIGHCLICK>SOURCE>GENERATE toString()
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}

	//can be generated using RIGHT CLICK>SOURCE>GENERATE HashCode and equals() method
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	//can be generated using RIGHT CLICK>SOURCE>GENERATE HashCode and equals() method
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (id != other.id)
			return false;
		return true;
	}

	
	

}

public class App {

	public static void main(String[] args) {

		
		Person person1 = new Person(8,"Bob");
		Person person2 = new Person(8,"Bob");
		
		// == tells you if two references of OBJECTS is pointing to the same object
	    //The following produces FALSE even because they are two different objects
		//even though they contain the same information.
		
		//////// System.out.println(person1 == person2); RETURNS FALSE
		
		//Returns if the the values compared in the .equals() method return true.
		System.out.println(person1.equals(person2));//RETURNS True
		
		
		
		//using Doubles and == vs equals() method
		//Doubles aren't the same number
		
		Double value1 = 7.2d;
		Double value2 = 7.2d;
		
		System.out.println(value1);
		System.out.println(value2);
		
		System.out.println(value1.equals(value2));
		
		if(value1==value2){//RETURNS False
			System.out.println("Shows Equal");
		}else{
			System.out.println("Shows UnEqual");
		}
		
		//Using the == operator with Integers compares the actual integer
		
		Integer number1 = 6;
		Integer number2 = 6;
		System.out.println(number1==number2);//RETURNS True with Integers
		System.out.println(number1.equals(number2));//RETURNS True
		
		
		//
		String text1 = "Hello";
		String text2 = "HelloWorld".substring(0,5);
		
		System.out.println(text2);
		
		//When using an == with a string returns False eventhough text2 contains the substring Hello
		//Only works if Strings are originally the same HELLO == HELLO
		System.out.println(text1 == text2);
		
		//This returns true because text2 contains the value Hello
		System.out.println(text1.equals(text2));
		
	}

}
