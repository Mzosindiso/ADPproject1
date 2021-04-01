/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.adpproject1;

import java.util.Scanner;

/**
 *
 * @author mzura
 */
public class Count {
    public static int choice(){
        Scanner sc = new Scanner(System.in);
        int choice;
        System.out.println("Calculator: ");
        System.out.println("1: Division");
        System.out.println("2: Multiplication");
        System.out.println("3: Addition");
        System.out.println("4: Subtraction");
        System.out.println(" ");
        System.out.println("Enter the number of the operatot that you want use: ");
        choice = sc.nextInt();
        return choice;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Would you like to use a caculator(Enter Y/N): ");
        char option = Character.toUpperCase(sc.nextLine().charAt(0));
        
        if (option == 'Y'){
            choice();
        }else{
            System.out.println("You do not want to use a calculator.Proceed!");
        }
        
    }
}
