package assignment_1;

/*
* Write test cases to test your implementation of the singly-linked list and its methods, and discuss
* the effectiveness of your test cases in terms of their pros and cons.
*/

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
public class TestWorker {

 private LinkedList list1 = new LinkedList();
 private LinkedList list2 = new LinkedList();

 @Test
 @DisplayName("add() Method Test")
 public void testAddMethod()
 {
   assertEquals(list1.add(),"I'm working already!", "Mismatch between test text and method text" );
 }


 @Test
 @DisplayName("remove() Method Test")
 public void testRemoveMethod()
 {

   assertTrue(list1.remove() == "I'm taking a self-care day!", "Test failed - Mismatch between test text and method text");
 }

@Test
 @DisplayName("size() Method Test")
 public void testSizeMethod()
 {

   assertNotEquals(list1.size() == "I'm taking a 2 hour lunch brb", "Test failed - Mismatch between test text and method text");
 }


@Test
@DisplayName("equals() Method Test")
public void testEqualsMethod()
{

  assertNotEquals(list1.equals() == "I'm taking a 2 hour lunch brb", "Test failed - Mismatch between test text and method text");
}


}
