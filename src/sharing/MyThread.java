/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sharing;

/**
 * To jest klasa do obsługi wątków
 * Zapewnia synchornizowany dostęp do pola ip
 * wykorzystując zamek lock
 * @author piotr.bilski
 * 
 */
public class MyThread implements Runnable{

    Input ip;
    Object lock;
    boolean isEvenNumber;
    int max;
    
    public MyThread(Input ip, Object lock){
        this.ip = ip;
        this.lock = lock;
    }

    @Override
    public void run() {
    	
        int index; 
    	
        while((index=ip.getIndex()) != -1){
        	
            if((index) %2==0) {
        
            	synchronized(ip) {
                    System.out.println(Thread.currentThread().getName());
                   
                  //  System.out.println((ip.getIndex()));
                    
                    System.out.println(index + " - parzyste");
                }
            	
            } else {
            	synchronized(ip) {
                    System.out.println(Thread.currentThread().getName());
                    //ip.print(index);
                  
                    System.out.println(index + " - nieparzyste");
                    
                }
            }
        
     
        
        }
    
    
        
      
        
        
    
    
    }   
}
