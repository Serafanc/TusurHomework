package online_tusur.unit_online_tusur;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;


public class StudentTest {
	/*объект тестового класса  Student*/
	private Student s = new Student();	 	   

	    
/* проверка возраста студента, 
 выходящего за диапазон */
	  @Test
	  void test_assert() {
		int age = 26;
		s.setAge(age);
	    int expectedAge = 26;
	    int actualsAge=s.getAge();
	    assertEquals(expectedAge, actualsAge);	

	  }
	  
	//Тесты на проверку возраста  
	  @Tag("negative")
	  @Test
	  void testAgeOutsideTheLeftBorder() {
		  int age = 17;
		  s.setAge(age);
		  int expectedAge = age;
		  int actualsAge=s.getAge();
		  System.out.println(s.getAge());
		  assertEquals(expectedAge, actualsAge);
	  }
	  
	  @Tag("positive")
	  @Test
	  void testAgeOnTheLeftBorder() {
		  int age = 18;
		  s.setAge(age);
		  int expectedAge = age;
		  int actualsAge=s.getAge();
		  System.out.println(s.getAge());
		  assertEquals(expectedAge, actualsAge);
	  }
	  
	  @Tag("positive")
	  @Test
	  void testAgeWithinTheBorder() {
		  int age = 35;
		  s.setAge(age);
		  int expectedAge = age;
		  int actualsAge=s.getAge();
		  System.out.println(s.getAge());
		  assertEquals(expectedAge, actualsAge);
	  }
	  
	  @Tag("positive")
	  @Test
	  void testAgeOnTheRightBorder() {
		  int age = 50;
		  s.setAge(age);
		  int expectedAge = age;
		  int actualsAge=s.getAge();
		  System.out.println(s.getAge());
		  assertEquals(expectedAge, actualsAge);
	  }
	  
	  @Tag("negative")
	  @Test
	  void testAgeOutsideOnTheRightBorder() {
		  int age = 51;
		  s.setAge(age);
		  int expectedAge = age;
		  int actualsAge=s.getAge();
		  System.out.println(s.getAge());
		  assertEquals(expectedAge, actualsAge);
	  }
	 // Тесты на проверку регистров 
	  @Tag("positive")
	  @Test
	  void testFirstNameTrue() {
		  String firstName = "Ivan";
		  s.setFirstName(firstName);
		  String expectedFirstName = firstName;
		  String actualsFirstName = s.getFirstName();
		  System.out.println(s.getFirstName());
		  assertEquals(expectedFirstName, actualsFirstName);
	  }
	  
	  @Tag("negative")
	  @Test
	  void testFirstNameFalse() {
		  String firstName = "ivan";
		  s.setFirstName(firstName);
		  String expectedFirstName = firstName;
		  String actualsFirstName = s.getFirstName();
		  System.out.println(s.getFirstName());
		  assertEquals(expectedFirstName, actualsFirstName);
	  }
	  
	  @Tag("negative")
	  @Test
	  void testDoubleFirstNameFalse() {
		  String firstName = "ivan-serg";
		  s.setFirstName(firstName);
		  String expectedFirstName = firstName;
		  String actualsFirstName = s.getFirstName();
		  System.out.println(s.getFirstName());
		  assertEquals(expectedFirstName, actualsFirstName);
	  }
	  
	  @Tag("positive")
	  @Test
	  void testLastNameTrue() {
		  String lastName = "Radionov";
		  s.setLastName(lastName);
		  String expectedLastName = lastName;
		  String actualsLastName = s.getLastName();
		  System.out.println(s.getLastName());
		  assertEquals(expectedLastName, actualsLastName);
	  }
	  
	  @Tag("negative")
	  @Test
	  void testLastNameFalse() {
		  String lastName = "radionov";
		  s.setLastName(lastName);
		  String expectedLastName = lastName;
		  String actualsLastName = s.getLastName();
		  System.out.println(s.getLastName());
		  assertEquals(expectedLastName, actualsLastName);
	  }
	  
	  @Tag("negative")
	  @Test
	  void testDoubleLastNameFalse() {
		  String lastName = "radionov-novikov";
		  s.setLastName(lastName);
		  String expectedLastName = lastName;
		  String actualsLastName = s.getLastName();
		  System.out.println(s.getLastName());
		  assertEquals(expectedLastName, actualsLastName);
	  }
	  
	  @Tag("positive")
	  @Test
	  void testFullNameTrue() {
		  String firstName = "Ivan";
		  String lastName = "Radionov";
		  s.setFirstName(firstName);
		  s.setLastName(lastName);
		  String expectedFullName = "Radionov Ivan";
		  String actualsFullName = s.getFullName();
		  System.out.println(s.getFullName());
		  assertEquals(expectedFullName, actualsFullName);
	  }
	  
	  @Tag("negative")
	  @Test
	  void testFullNameFalse() {
		  String firstName = "Ivan";
		  String lastName = "Radionov";
		  s.setFirstName(firstName);
		  s.setLastName(lastName);
		  String expectedFullName = "Ivan Radionov";
		  String actualsFullName = s.getFullName();
		  System.out.println(s.getFullName());
		  assertEquals(expectedFullName, actualsFullName);
	  }
	  
}