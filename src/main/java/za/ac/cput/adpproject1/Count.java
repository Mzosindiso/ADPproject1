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
    public static double division(int num1, int num2){
        return num1 / num2;
    }
    public static int multiplication(int num1, int num2){
        return num1 * num2;
    }
    public static int addition(int num1, int num2){
        return num1 + num2;
    }
    public static int subtraction(int num1, int num2){
        return num1 - num2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        
        System.out.println("Would you like to use a caculator(Enter Y/N): ");
        char option = Character.toUpperCase(sc.nextLine().charAt(0));
        
        if (option == 'Y'){
            choice = choice();
        }else{
            System.out.println("You do not want to use a calculator.Proceed!");
        }
        switch(choice){
            case 1:
            {
                System.out.println("Enter your first number: ");
                int number1 = sc.nextInt();
                System.out.println("Enter your second number: ");
                int number2 = sc.nextInt();
                double answer = division(number1, number2);
                System.out.println(" ");
                System.out.println("Your answer is: "+ answer);
                break;
            }
            case 2:
            {
                System.out.println("Enter your first number: ");
                int number1 = sc.nextInt();
                System.out.println("Enter your second number: ");
                int number2 = sc.nextInt();
                int answer = multiplication(number1, number2);
                System.out.println(" ");
                System.out.println("Your answer is: "+ answer);
                break;
            }
            case 3:
            {
                System.out.println("Enter your first number: ");
                int number1 = sc.nextInt();
                System.out.println("Enter your second number: ");
                int number2 = sc.nextInt();
                int answer = addition(number1, number2);
                System.out.println(" ");
                System.out.println("Your answer is: "+ answer);
                break;
            }
            case 4:
            {
                System.out.println("Enter your first number: ");
                int number1 = sc.nextInt();
                System.out.println("Enter your second number: ");
                int number2 = sc.nextInt();
                int answer = subtraction(number1, number2);
                System.out.println(" ");
                System.out.println("Your answer is: "+ answer);
                break;
            }
            default:
            {
                System.out.println("You chose a wrong number!");
                break;
            }
        }
    }
}
