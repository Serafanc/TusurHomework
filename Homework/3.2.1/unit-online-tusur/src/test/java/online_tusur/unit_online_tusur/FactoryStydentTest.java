package online_tusur.unit_online_tusur;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.testng.annotations.*;


public class FactoryStydentTest {
	
	private Student s;
	
	@DataProvider
	public static Object []dataMethod() {
		return new Object [] {
				new Student ("Ivan","Radionov",17),
				new Student ("ivaaaaan","Radionov",18),
				new Student ("Ivan","radiiiionov",32),
				new Student ("ivan","Radionov",50),
				new Student ("ivaaaaan","radiiiionov",55)
		};
	}
	
	@Factory(dataProvider ="dataMethod")
	public FactoryStydentTest(Student s) {
		this.s = s;
	}
	
	
  @Test
  public void test1() {
	  int actualeAge = s.getAge();
	  assertEquals(actualeAge,18);
	  System.out.println("test1="+actualeAge);
  }
  @Test
  public void test2() {
	  int actualeAge = s.getAge();
	  assertEquals(actualeAge,32);
	  System.out.println("test2="+actualeAge);
  }
  
  @Test
  public void test3() {
	  int actualeAge = s.getAge();
	  assertEquals(actualeAge,50);
	  System.out.println("test3="+actualeAge);
  }
  
  @Test
  public void test4() {
	  String name = s.getFirstName();
	  assertEquals(name,"Ivan");
	  System.out.println("test2="+name);
  }
  
  @Test
  public void test5() {
	  String secondName = s.getLastName();
	  assertEquals(secondName,"Radionov");
	  System.out.println("test5="+secondName);
  }
  
  
  
  
  
}
