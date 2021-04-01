/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.adpproject1;

import java.util.Scanner;

/**
 *

 * @author Thina Mzosindiso Nontwabaza : 
 * Student no: 219189153
 */
public class Count {

 * @author Siphesonke Notsela 219076235
 *
 */
public class Count {
    private int password, identityNo, age;
    private String inGameName, gamerId, loginName;
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
    

    public void setInGameName(String inGameName) {
        this.inGameName = inGameName;
    }

    public void setGamerId(String gamerId) {
        this.gamerId = gamerId;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getInGameName() {
        return inGameName;
    }

    public String getGamerId() {
        return gamerId;
    }
     public void setPassword(int password) {
        this.password = password;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void setIdentityNo(int identityNo) {
        this.identityNo = identityNo;
    }

    public String getLoginName() {
        return loginName;
      
      public int getAge() {
        return age;
    }
       public int getIdentityNo() {
        return identityNo;
    }
        public int getPassword() {
        return password;
    }
    }

    @Override
    public String toString() {
        return "Count{" + "password=" + password + ", identityNo=" + identityNo + ", age=" + age + '}';
    }
        return "Account{" + "inGameName=" + inGameName + ", gamerId=" + gamerId + ", loginName=" + loginName + '}';
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


