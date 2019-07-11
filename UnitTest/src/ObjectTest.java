import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ObjectTest {

	private ArrayList<String> myList;

	@BeforeEach
	private void setUp() {
		ArrayList<String> animalList = new ArrayList<String>(); animalList.add("Chicken"); animalList.add("Dog"); animalList.add("Cat");
		
		myList = new ArrayList<>();
		myList.add("apple");
	}

	@Test
	void new_creates_a_new_instance() {
		Class<?> class1 = myList.getClass();
		assertEquals(ArrayList.class, class1);
	}

	@Test
	void you_can_add_values_to_a_list() {
		assertTrue(myList.contains("apple"));
		assertEquals(1, myList.size());
	}

}
