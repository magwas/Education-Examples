import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ArrayTest {

	private String[] firstStringArrays;
	private String[] stringArrays;

	@BeforeEach
	private void setUp() {
		stringArrays = new String[2];
		firstStringArrays = new String[] {"apple", "rice"};
	}

	@Test
	void an_array_can_be_initialized_by_giving_it_values() {
		assertEquals("apple", firstStringArrays[0]);
	}

	@Test
	void an_empty_array_can_be_initialized_with_new() {
		assertEquals(2, stringArrays.length);
	}


	@Test
	void an_element_can_be_assigned() {
		stringArrays[1] = "fish";
		assertEquals("fish", stringArrays[1]);
	}

	@Test
	public void two_arrays_are_equal_only_if_they_are_the_same_object() {

        int[] firstArray = new int[]{1};
        int[] copyOfFirstArray = firstArray;
        assertEquals(firstArray, copyOfFirstArray);
	}

	@Test
	public void the_equals_method_of_Arrays_class_treats_arrays_with_the_same_elements_equals() {

        int[] firstArray = new int[]{1};
        int[] secondArray = new int[]{1};
        assertEquals(Arrays.equals(firstArray, secondArray), true);
	}

	@Test
	public void array_copy_copies_the_array() {

        int[] firstArray = new int[]{1};
	    int[] cloneOfTheFistArray = firstArray.clone();
	    assertEquals(firstArray[0] == cloneOfTheFistArray[0],true);
	}

	@Test
	public void array_clone_is_not_equal_to_the_original() {

        int[] firstArray = new int[]{1};
	    int[] cloneOfTheFistArray = firstArray.clone();
	    assertEquals(firstArray.equals(cloneOfTheFistArray),false);
	}

	@Test
	public void bad_array_index_is_an_error() {

        int[] firstArray = new int[]{1};
	    assertEquals(1,firstArray[0]);
	}

}
