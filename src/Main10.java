/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FIRDA
 */
package operatorunary;
public class Main10 {
    public static void main(String[] args) 
{
    // declare variables 
    int a = 12, b = 12;
    int resultl, result2;
    
    // original value
    System.out.println("a = a " + a);
    
    // icrement operator 
    resultl = ++a;
    System.out.println("After increment: " + resultl);
    
    System.out.println("b = " + b);
    
    // decrement operator
    result2 = --b;
    System.out.println("After decrement: " + result2);
}
}
