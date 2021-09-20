/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FIRDA
 */
package operatorlogika;
public class Main9 {
    public static void main(String[] args) 
    {
    // && operator 
        System.out.println((5 > 3) && (8 > 5));     // true
        System.out.println((5 > 3) && (8 < 5));     // false
        
    // || operator 
        System.out.println((5 < 3) || (8 > 5));     // true 
        System.out.println((5 > 3) || (8 < 5));     // true
        System.out.println((5 < 3) || (8 < 5));     // false
        
     // ! operator 
        System.out.println(!(5 == 3));     // true 
        System.out.println(!(5 > 3));     // false 
    }
}
