

public class ThreadTest extends Thread
{
 public static void main(String[] args) 
 {
          Thread h = Thread.currentThread();
      
           System.out.println("Thread name is ="+ h.getName());
           h.setName("1st thread");
           System.out.println("After Changing name = " + h.getName());
           h.setPriority(h.MAX_PRIORITY);
           System.out.println("Priority of thread is =" + h.getPriority());
          
           for(int i = 0 ; i<5;i++)
           {
        	     System.out.println("Current Thread");
           }
           h.suspend();
           h.resume();
           h.stop();
          
 }
        
 }



