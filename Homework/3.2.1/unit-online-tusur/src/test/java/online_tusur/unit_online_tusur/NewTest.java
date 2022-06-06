package online_tusur.unit_online_tusur;

import static org.testng.Assert.*;
import java.util.ArrayList;

import java.util.*;

import org.testng.annotations.*;
import org.testng.annotations.Optional;



public class NewTest {
	List<Student> st;
	Student s = new Student();
	
	@BeforeClass
	public void bef_class() {
		st = new ArrayList<Student>();
	}	
	
	@AfterClass
	public void aft_class() {
		st.clear();
	}		

	//Параметрезированный тест через массив данных
	@DataProvider(name = "data")
	public static Object[][] ageData(){
		return new Object[][] {{17,18},{18,18},{32,32},{50,50},{55,50}};
	}
	
	@Test(dataProvider = "data",groups = {"testStudent"})
	public void test5(int age, int expAge) {
		long id = Thread.currentThread().getId();
		System.out.println(id);
		
		s.setAge(age);
		assertEquals(expAge,s.getAge());
	}
	
	
	//Параметрезированный тест
  @Test(priority = 0, groups = {"testStudent"})
  @Parameters({"age","expAge"})
  public void test1(@Optional("0") int age, @Optional("0") int expAge) {
	  long id = Thread.currentThread().getId();
		System.out.println(id);
		
	  s.setAge(age);
	  assertEquals(expAge,s.getAge());	  
  }
  
  @Test(priority = 2, groups = {"testCollection"})
  public void test3() {
	  
	  long id = Thread.currentThread().getId();
		System.out.println(id);
	  int k = st.size();
	  st.add(new Student("Piter","Pen",16));
	  
	  assertEquals(k+1,st.size());
  }
  
  @Test(priority = 1, groups = {"testCollection"})
  public void test2() {
	  long id = Thread.currentThread().getId();
		System.out.println(id);
		
	  assertTrue(st.isEmpty());
  }
  
  @Test(priority = 3, groups = {"testCollection"}, dependsOnMethods = {"test3"})
  public void test4() {
	  long id = Thread.currentThread().getId();
		System.out.println(id);
		
	  assertTrue(st.isEmpty());
  }
}
