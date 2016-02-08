//-------------------------------------------------------------------------
// CircularQueueTest.java
// Author: Ariel Valencia
// Description: This program will test the class and its methods.
//-------------------------------------------------------------------------

import ch05.queues.*;

public class CircularQueueTest
{
   public static void main(String[] args)
   {
      CircularListQueue<Integer> test = new CircularListQueue<Integer>();
      System.out.println("This creates an empty queue.");
      
      System.out.println("Now test that the queue is actually empty.");
      System.out.println("Is the queue empty? (true/false) " + test.isEmpty());
      
      test.enqueue(5);
      System.out.println("This tests isEmpty() after 5 has been added.");
      System.out.println("Is the queue empty?(true/false) " + test.isEmpty()); 
      
      test.enqueue(7);
      System.out.println("This tests isEmpty() after 7 has been added.");
      System.out.println("Is the queue empty?(true/false) " + test.isEmpty());
      
      System.out.println("This test that dequeue works.");
      System.out.println("What was just dequeued? " + test.dequeue());
      System.out.println("What was the next numeber dequeued? " + test.dequeue());
      
      System.out.println("Finally, we test to see if the queue is actually empty.");
      System.out.println("Is the queue empty?(true/false) " + test.isEmpty());
      
   }
}