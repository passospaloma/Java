import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


/**
 * 
 * A class for testing the methods of the Train simulator behave as expected.
 * See: http://junit.sourceforge.net/javadoc/org/junit/Assert.html For more
 * JUnit Assertion Statements
 * 
 * @author Chris Schmidt
 * 
 */

class TestTrain {

	int[] train1Cars = { 20, 30, 20 };
	int[] train2Cars = { 1, 1, 36 };
	int[] mergedTrain = { 20, 30, 20, 1, 1, 36 };

	@Test
	void testConstructor() {
		Train t1 = new Train("Newton", 20);
		assertEquals(t1.getTrainName(), "Newton");
		assertEquals(t1.getpowerLocomotives(), 20);
	}

	@Test
	void testGettersAndSetters() {
		Train t1 = new Train("Rick", -3);
		t1.setpowerLocomotives(-3);
		assertEquals(t1.getpowerLocomotives(), -3);
		assertEquals(t1.getFreightCars(null), null);

		Train t2 = new Train("", 4);
		t2.setTrainName("");
		assertEquals(t2.getTrainName(), "");
		assertArrayEquals(t2.getFreightCars(train1Cars), train1Cars);

	}

	@Test
	void testTrainWeight() {
		Train t1 = new Train("Jeff", 2);
		assertEquals(t1.getTotalWeightOfCars(train1Cars), 70);

	}

	@Test
	void testNumOfCars() {
		Train t1 = new Train("Mike", 1);
		assertEquals(t1.getNumOfCars(train1Cars), 3);

	}

	@Test
	void testMaxSpeed() {
		Train t1 = new Train("Mike", 2);
		assertEquals(t1.compMaxSpeed(train1Cars), 30);
	}

	@Test
	void testRemoveCars() {
		Train t1 = new Train("Mike", 2);
		assertArrayEquals(t1.removeAllCars(train1Cars), null);
	}
    
	@Test
	void testAddCars() {
		Train t1 = new Train("Mike", 2);
		assertArrayEquals(t1.addCars(1, 1, 36), mergedTrain);
	}
}
