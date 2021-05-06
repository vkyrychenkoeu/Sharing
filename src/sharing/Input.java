/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sharing;

import java.util.Random;

/**
 * To jest klasa generująca napis na konsoli (indeks od 1 do 15)
 * @author piotr.bilski
 */
public class Input {
    
	int index;
    //int[] input = new int[5];
    
	int random = 1 + (int)(Math.random() * (10-1) +1);
	
	// zawsze różna odłegłość listy
    int[] input = new int[random]; {
    
    for (int i = 0; i < input.length; i++) {
    	
        // losowa liczba od 1 do 10
    	
    	input[i] = ((int)(Math.random() * (20-1) + 1));
        
    }
}
    
    public Input(){
        index = 0;
    }
    // Wypisujemy na ekranie wartość indeksu
    public void print(int index){
        System.out.println(input[index]);
    }
    // Uwaga: dostęp do współdzielonej zmiennej index jest synchornizowany!!
    synchronized public int getIndex(){
        if(index == input.length)
            return -1;
        return index++;
    }

}
