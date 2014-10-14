

/**
 * @author (Congshu Wang) 
 */
public class KPCBQueue
{
    private int[] queue;
    private int rear;
    private int top;

    /**
     * Constructor for objects of class KPCBQueue that setting the length of the queue.
     */
    public KPCBQueue(int len)
    {
      queue = new int[len];
      rear = -1;
      top = 0;
    }

    /**
     * Function enqueue puts integer type parameter called input into the queue if it is not full.
     */
    public void enqueue(int input)
    {
      if(rear >= queue.length-1)
      {
        System.out.println("Queue if full.");
        System.exit(0);
      }   
      ++rear;
      queue[rear] = input;
      System.out.println("Just embedded " + input +" in the queue.");
      System.out.print("The queue is: ");
      for(int i = 0; i <= rear; i++)
      {
          if(i < rear)
             System.out.print(queue[i] + "<-");
          else
            System.out.println(queue[i] + ".");
         
      }
      System.out.println("*********************************************************************");
    }
    
    /**
     * Function dequeue removes the top cell integer from the queue if it is not empty.
     */
    public int dequeue()
    {
        if(rear < top)
        {
            System.out.println("Queue if empty.");
            System.exit(0);
        }
        int removedInt = queue[top];
        ++top;
        for(int j = top; j <= rear; j++)
        {
            int temp = queue[j];
            queue[j-1] = temp;
        }
        --rear;
        top = 0;
        System.out.println("Integer just removed from the queue was " + removedInt + ".");
        System.out.print("The queue is: ");
        for(int i = top; i <= rear; i++)
        {
            if(i < rear)
                System.out.print(queue[i] + "<-");
            else
                System.out.println(queue[i] + ".");
            
        }
        System.out.println("*********************************************************************");
        return removedInt;
    }
    
    /**
     * The main function that drives the program.
     */
    public static void main(String[] args)
    {
        KPCBQueue queue = new KPCBQueue(3);
        queue.enqueue(23);
        queue.enqueue(24);
        queue.enqueue(1);
        queue.dequeue();
        queue.enqueue(1);
        queue.dequeue();
        queue.enqueue(1);
    }
}
