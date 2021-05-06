/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sharing;

/**
 *
 * @author piotr.bilski
 */

public class Sharing {

    /**
     * @param args the command line arguments
     * @throws java.lang.InterruptedException
     * 
     * To jest główny kod, któy uruchamia dwa wątki i łączy efekty ich działanie
     * Oba wątki współdzielą zmienną index w klasie Input. Dlatego jej inkrementacja 
     * musi być blokowana!!!
     */
    public static void main(String[] args) throws InterruptedException {
        Input ip = new Input();
        // Tworzymy zamek
        Object lock = new Object();
        //Tworzymy i uruchamiamy dwa wątki klasy MyThread
        Thread t1 = new Thread(new MyThread(ip, lock), "Thread1");
        Thread t2 = new Thread(new MyThread(ip, lock), "Thread2");
        t1.start();
        t2.start();
        t1.join();
        t2.join();
    }
    
}

/*
Zadanie: zbudować program realizujący modelc producent-konsument
Jeden wątek generuje losowo liczby całkowite, a drugi wątek ma sprawdzać, 
czy są one parzyste, czy nie
*/