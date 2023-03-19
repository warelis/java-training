import java.util.ArrayList;
import java.util.Calendar;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

            Scanner scan = new Scanner(System.in);

            /*Ex 1*/
        /*
        System.out.println("Write your name");
        String name = scan.nextLine();
        System.out.println("Write your age");
        int age = scan.nextInt();
        if(age >= 18){
            System.out.println(name + ", " + age + " You are an adult!");
        }
        else{
            System.out.println("You are too young :/");
        }
        */
            /*Ex 2*/
        /*
        System.out.println("Write number and I will tell you if it is even or odd");
        int num = scan.nextInt();
        if(num % 2 == 0){
            System.out.println("It is even");
        }
        else{
            System.out.println("It is odd");
        }
        */
            /*Ex 3*/
        /*
        System.out.println("It's a simple calc - only addition, subtraction, multiplication and division");
        System.out.println("Write first number");
        int num1 = scan.nextInt();
        System.out.println("Write second number");
        int num2 = scan.nextInt();
        System.out.println("Write an operator");
        char operator = scan.next().charAt(0); //indeksuje literki
        int output = 0;
        switch (operator){
            case '+':
                output = num1 + num2;
                break;
            case '-':
                output = num1 - num2;
                break;
            case '*':
                output = num1 * num2;
                break;
            case '/':
                output = num1 / num2;
                break;
            default:
                System.out.println("Only addition, subtraction, multiplication and division (+, -, *, /)");
        }
        System.out.println(output);
        */
            /*Ex 4*/
        /*
        System.out.println("Let's find uot if your total number is divided by: 10, 9, 6, 5, 3 and 2");
        int totalNum = scan.nextInt();
        int[] numbers = {10, 9, 6, 5, 3, 2};
        int x = 0;
        System.out.println("Number is divided by: ");
        for(int i = 0; i < numbers.length; i++)
        if(totalNum % numbers[i] == 0){
            System.out.println(numbers[i]);
            break;
        }
        */
            /* Ex 5 to do later*/
        /*
        System.out.println("Hello, I'd like you to answer some of my questions");
        System.out.println("Whats your name?");
        String name = scan.next();
        System.out.println("Whats your surname?");
        String surname = scan.next();
        System.out.println("Whats your age?");
        String age = scan.next();
        System.out.println("Whats your hobby?");
        String hobby = scan.next();
        System.out.println("Give me your description");
        String desU = scan.next();
        */

            /*Ex 6*/
        /*
        System.out.println("Convert floating-point arithmetic to integral number by writing your number");
        double doubleData = scan.nextDouble();
        int doubleToInt = (int)Math.round(doubleData);
        System.out.println(doubleToInt);
        */
            /*Ex 7*/
         System.out.println("Upgrading SP");
         ArrayList<String> specialist = new ArrayList<String>();
            specialist.add("Red");
            specialist.add("Holy");
            specialist.add("Blue");
            specialist.add("DG");
            String sp = scan.nextLine();
            boolean found = false;
            for(int i = 0; i < specialist.size(); i++){
                    if(specialist.get(i).equals(sp)){
                        found = true;
                        break;
                    }
            }
            if(found){
                    System.out.println("Znalezione");
            }

            /*Ex 8*/
        /*
        String password = scan.next();
        String passwordUpperCase = password.toUpperCase();
        System.out.println(passwordUpperCase);
        */
            /*Ex 9*/
        /*
        System.out.println("We will check if two phrases are equal");
        System.out.println("Enter text number one");
        String firtsString = scan.next();
        System.out.println("Enter text number two");
        String secondString = scan.next();
        if(firtsString.equals(secondString)){
            System.out.println("Good");
        }
        else{
            System.out.println("Bad");
        }
         */


    }
}