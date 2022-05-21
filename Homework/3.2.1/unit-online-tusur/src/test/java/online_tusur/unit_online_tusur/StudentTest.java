package online_tusur.unit_online_tusur;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestFactory;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


public class StudentTest {
	/*объект тестового класса  Student*/
	private Student s = new Student();	 	   

	
	//Динамический тест
	
	@TestFactory
	Collection<DynamicTest> dynamicTestAge(){

	
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		Student s4 = new Student();
		Student s5 = new Student();
		
		s1.setAge(17);
		s2.setAge(18);
		s3.setAge(32);
		s4.setAge(50);
		s5.setAge(55);
		
		return Arrays.asList(
				DynamicTest.dynamicTest("test1", ()->assertEquals(s1.getAge(),17)),
				DynamicTest.dynamicTest("test2", ()->assertEquals(s2.getAge(),18)),
				DynamicTest.dynamicTest("test3", ()->assertEquals(s3.getAge(),32)),
				DynamicTest.dynamicTest("test4", ()->assertEquals(s4.getAge(),50)),
				DynamicTest.dynamicTest("test5", ()->assertEquals(s5.getAge(),55))	
				);			
	}
	
	@TestFactory
	Collection<DynamicTest> dynamicTestFirstNameAndLastName(){
	
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		Student s4 = new Student();		
		
		s1.setFirstName("ivvan");
		s2.setFirstName("Ivan");
		s3.setLastName("radiiiionooov");
		s4.setLastName("Radionov");		
		
		return Arrays.asList(
				DynamicTest.dynamicTest("test1", ()->assertEquals(s1.getFirstName(),"Ivan")),
				DynamicTest.dynamicTest("test2", ()->assertEquals(s2.getFirstName(),"Ivan")),
				DynamicTest.dynamicTest("test3", ()->assertEquals(s3.getLastName(),"Radionov")),
				DynamicTest.dynamicTest("test4", ()->assertEquals(s4.getLastName(),"Radionov"))				
			    );			
	}
	
	
	// Параметризированный тест 
	
	@ParameterizedTest
	@CsvSource(value = {"17","18","32","50","55"})
	void ParamsAgeTest(int argument) {
		s.setAge(argument);
		assertEquals(s.getAge(),argument);
	}
	
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