/*
* Write test cases to test your implementation of the singly-linked list and its methods, and discuss
* the effectiveness of your test cases in terms of their pros and cons.
*/
package assignment_1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
public class TestWorker {

 private LinkedList list = new LinkedList();

 @Test
 @DisplayName("add() Method Test")
 public void testWorkMethod()
 {
   assertEquals(list.add(),"I'm working already!", "Mismatch between test text and method text" );
 }


 @Test
 @DisplayName("remove() Method Test")
 public void newtestJCWorkerFail()
 {

   assertTrue(list.remove() == "I'm taking a self-care day!", "Test failed - Mismatch between test text and method text");
 }

@Test
 @DisplayName("size() Method Test")
 public void newtestJCWorkerPass()
 {

   assertNotEquals(list.size() == "I'm taking a 2 hour lunch brb", "Test failed - Mismatch between test text and method text");
 }


@Test
@DisplayName("equals() Method Test")
public void newtestJCWorkerPass()
{

  assertNotEquals(list.equals() == "I'm taking a 2 hour lunch brb", "Test failed - Mismatch between test text and method text");
}


}
