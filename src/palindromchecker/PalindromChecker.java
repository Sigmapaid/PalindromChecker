/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindromchecker;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author lukasz
 */
public class PalindromChecker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PalindromChecker palindrom = new PalindromChecker();
        //char [] word = text.toCharArray();
        char[] word = palindrom.keyboardScanner().toCharArray();
        int k= word.length-1;

        if (palindrom.isPalindrom(word, 0, k) == true){
            System.out.println("Prawda");
        } else {
            System.out.println("Falsz");
        }
        
    }
    
    public boolean isPalindrom (char[] word, int p, int k){
        if(k<=p){
            return true;
        }else if (word[p] != word[k]){
            return false;
        }else return isPalindrom(word, p+1, k-1);
    }
    
    public String keyboardScanner(){
        System.out.println("Wprowadz słowo do sprawdzenia i nacisnij enter: ");
        BufferedReader brIn = new BufferedReader(new InputStreamReader(System.in));
        try{
            String text = brIn.readLine();
            
            return text;
        }
        catch (Exception e){
        return "error";
        }
    }
}
