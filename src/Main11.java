/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FIRDA
 */
package operatorbitwise;
public class Main11 {
    public static void main(String[] args) 
    {
        String str = "POLIJE";
        boolean result;
        
        // check if str is an instance of 
        // the String class 
        result = str instanceof String;
        System.out.println("Is str an object of String? " + result);
    }
}
