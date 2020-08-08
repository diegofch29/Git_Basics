/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anagram;

import java.util.Scanner;

/**
 *
 * @author diego
 */
public class Anagram {

    /**
     * @param args the command line arguments
     */
    static boolean isAnagram(String a, String b) {
        a=a.toLowerCase();

        b=b.toLowerCase();

        char a1[]=a.toCharArray();

        char b1[]=b.toCharArray();

        java.util.Arrays.sort(a1);

        java.util.Arrays.sort(b1);

        String a2=new String(a1);

        String b2= new String(b1);

        if(a2.compareTo(b2)==0){

            return true; 

        }
        return false;
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}