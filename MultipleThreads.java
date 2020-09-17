// Write a multi threaded program to create multiple threads by extending
// Thread class.


class MultipleThreads extends Thread{  
  public void run(){  
    for(int i = 1; i < 5;i++){  
      try{
        Thread.sleep(500);
      }
      catch(InterruptedException e){
        System.out.println(e);
      }  
      System.out.println(i);  
    }
  }  
  public static void main(String args[]){ 
    MultipleThreads t1=new MultipleThreads();
    MultipleThreads t2=new MultipleThreads();   
    t1.run();  
    t2.run();  
  }    
}  