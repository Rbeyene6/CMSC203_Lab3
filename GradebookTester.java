package application;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradebookTester {
	
	private GradeBook object1;
	private GradeBook object2;

	@BeforeEach
	void setUp() throws Exception {
		
				
		object1=new GradeBook(5);
		object2=new GradeBook(5);
		
		object1.addScore(7.0);
		object1.addScore(9.0);
		object1.addScore(24.0);
		object2.addScore(3.0);
		object2.addScore(1.0);
		object2.addScore(22.0);
		
	}

	@AfterEach
	void tearDown() throws Exception {
		
		object1=null;
		object2=null;
	}
	@Test
	void testAddScore() {
		
		 assertTrue((object1.toString()).equals("7.0 9.0 24.0 "));
	     assertTrue((object2.toString()).equals("3.0 1.0 22.0 "));
	     
	}

	@Test
	void testSum() {

		assertEquals(40.0, object1.sum(), 0.1);
	    assertEquals(26.0, object2.sum(), 0.1);
		
	}

	@Test
	void testMinimum() {

		assertEquals(7.0, object1.minimum(), 0.1);
	    assertEquals(1.0, object2.minimum(), 0.1);
		
	}

	@Test
	void testFinalScore() {

		assertEquals(33.0, object1.finalScore(),0.1);
		assertEquals(25.0, object2.finalScore(),0.1);
		
	}

	@Test
	void testGetScoreSize() {

		 assertEquals(3, object1.getScoreSize(), 0.1);
	     assertEquals(3, object2.getScoreSize(), 0.1);
		
	}

	
}
