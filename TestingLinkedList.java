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
   int testData = 2;

   list1.add(2);
   list1.add(3);
   list1.add(4);

   assertTrue(list1.add(list1, testData) == false);
 }


 @Test
 @DisplayName("remove() Method Test")
 public void testRemoveMethod()
 {

   int testData = 5;

  /* list1.add(2);
   list1.add(3);
   list1.add(4); */

   assertFalse(list1.remove(list1, testData) == true);
 }

@Test
 @DisplayName("size() Method Test")
 public void testSizeMethod()
 {
   int testData = 3;

  /* list1.add(2);
   list1.add(3);
   list1.add(4); */

   assertEquals(testData, list1.size(list1));
 }


@Test
@DisplayName("equals() Method Test")
public void testEqualsMethod()
{
  list2 = list1

  assertTrue(list1.equals(list1, list2) == true);

}
