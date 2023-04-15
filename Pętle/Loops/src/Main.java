import java.util.ConcurrentModificationException;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //1
        Scanner scan = new Scanner(System.in);
        /*
        String password = "kot1234";
        String passwordUser;
        do{
            passwordUser = scan.nextLine();
            if(password.equals(passwordUser)){
                System.out.println("Correct");
                break;
            }
            else{
                System.out.println("Wrong password, try again");
            }
        }while (true); //niekończonca się
        */
        //2 (5 , 1, 3, 5, 7, 9) nie wiem czemu na początku rozłożyłam choinkę na 2 części i po uja chciałam by robiło też spacje po 2 stronie xd
        /*
        int count = 1;
        int h = scan.nextInt();
        for (int i = 1; i <= h; i++) {
            for (int j = 1; j <= h - i; j++) {
                System.out.print(" ");
            }
            for(int l = 1; l <= count; l++){
                System.out.print("*");
            }
            System.out.println();
            count += 2;
        }
        */
        //3





        //4
        /*
        System.out.println("Welcome to ATM, type your pin");
        int pin;
        int correctPin = 1234;
        int count = 0;
        do{
            pin = scan.nextInt();
            if(pin == correctPin){
                System.out.println("You can have your money :/");
            }
            else {
                System.out.println("Try again");
                count++;
            }
            if(count == 3){
                System.out.println("Your card is blocked!");
                break;
            }
        }while(pin != correctPin);
        */
        //5
        Random rand = new Random(); //nie dawać tu liczby bo jakiś seed :/
        int rando = rand.nextInt(11);
        System.out.println(rando);
        int x;
        int count = 0;
        do{
            if(count == 3){
                break;
            }
        x = scan.nextInt();

        if(x > rando){
            System.out.println("Too much!");
        }
        else if(x < rando){
            System.out.println("Too low!");
        }
        else{
            System.out.println("You won!");
            break;
        }
        count ++;
        }while(true);

        }
    }