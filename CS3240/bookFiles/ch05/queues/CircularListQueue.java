//---------------------------------------------------------------------------
// CircularListQueue.java
// Author: Ariel Valencia
// Date Last Edited: 2/2/2016
//--------------------------------------------------------------------------

package ch05.queues;

import support.LLNode;

public class CircularListQueue<T> implements UnboundedQueueInterface<T>
{
   protected LLNode<T> rear;     //reference to the rear of this queue
   
   public CircularListQueue()
   {
      rear = null;
   }
   
   public void enqueue(T element)
   //Adds element to the queue
   {
      LLNode<T> newNode = new LLNode<T>(element);
      
      if (rear == null)
         rear = newNode;
      else
      {
         if(rear.getLink() == null)
         {
            rear.setLink(newNode);
            newNode.setLink(rear);
         }
         else
         {
            newNode.setLink(rear.getLink());
            rear.setLink(newNode);
         }
      }
      
      rear = newNode;
   }
   
   public T dequeue()
   //Throws QueueUnderFlowEsception if the queue is empty
   //Otherwise, it removes the front element from this queue and returns it.
   {
      if(isEmpty())
      {
         throw new QueueUnderflowException("Dequeue attemtped on empty queue.");
      }
      else
      {
         T element;
         LLNode<T> front;
         front = rear.getLink();
         element = front.getInfo();
         rear.setLink(front.getLink());
         
         if (front == rear)
            rear = null;
         
         return element;
      }
   }
   
   public boolean isEmpty()
   //Returns true if this queue is empty and false if it is not
   {
      if(rear == null)
         return true;
      else
         return false;
   }
   
}
   