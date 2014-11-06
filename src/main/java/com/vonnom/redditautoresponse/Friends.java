/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vonnom.redditautoresponse;

/**
 *
 * @author jscheel
 */
public class Friends {
    
    public static void main (String[] args) {
        
        int firstArg;
        if (args.length > 0) {
            try {
                firstArg = Integer.parseInt(args[0]);
                System.out.println(firstArg);
            } catch (NumberFormatException e) {
                System.err.println("Argument" + args[0] + " must be an integer.");
                System.exit(1);
            }
        }
        
    }
    
}
