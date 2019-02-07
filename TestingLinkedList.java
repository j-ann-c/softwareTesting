package Linked;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;




public class TestingLinkedList {


 private LinkedList list1 = new LinkedList();
 private LinkedList list2 = new LinkedList();



@Test
@DisplayName("add() Method Test")

 public void testAddMethod()

 {

   int testData = 2;

   list1.add(list1, 2);
   list1.add(list1, 3);
   list1.add(list1, 4);

   assertTrue(list1.add(list1, testData) == false);

 }


 @Test
 @DisplayName("remove() Method Test")

 public void testRemoveMethod()

 {

   int testData = 5;

   list1.add(list1, 2);
   list1.add(list1, 3);
   list1.add(list1, 4);


   assertFalse(list1.remove(list1, testData) == true);

 }


 @Test
 @DisplayName("size() Method Test")

 public void testSizeMethod()

 {

   int testData = 3;

   list1.add(list1, 2);
   list1.add(list1, 3);
   list1.add(list1, 4);

   assertEquals(testData, list1.size(list1));

 }


 @Test
 @DisplayName("equals() Method Test")

 public void testEqualsMethod()
 {

   list2 = list1;

   assertTrue(list1.equals(list1, list2) == true);

 }

}
