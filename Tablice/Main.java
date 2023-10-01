import java.util.Scanner;

public class Main {
    //Ex1
//    public static int sumOf(int[] values){
//        int sum = 0;
//        for(int x : values){
//            sum += x;
//        }
//        return sum;
//    }

    //Ex2
//    public static int sumOf(int[] values, int greaterThen){
//        int sum = 0;
//        for(int x : values) {
//            if (x > greaterThen) {
//                sum += x;
//            }
//        }
//        return sum;
//    }

    //Ex3
//      public static int sumOf(int howMany){
//          Scanner scan = new Scanner(System.in);
//          int[] values = new int[howMany];
//          int sum = 0;
//          for(int i = 0; i < howMany; i++){
//              System.out.println("Give" + " " + (i + 1) + " " + "number: ");
//              int value = scan.nextInt();
//              System.out.println(value);
//              values[i] = value;
//              sum += value;
//          }
//          return sum;
//      }

//    //Ex4
//        static int max = 10;
//        static int pointer = 0;
//        public static String[] usernames = new String[max];
//        public static String[] passwords = new String[max];
//        public static boolean loginSuccessful = false;
//        public static void registration(String username, String password) {
//            if (pointer < max) {
//                usernames[pointer] = username;
//                passwords[pointer] = password;
//                pointer++;
//            } else {
//                System.out.println("Not enough memory");
//            }
//        }
//        public static void login(String username, String password){
//            for(int i = 0; i < pointer; i++){
//                if(usernames[i].equals(username) && passwords[i].equals(password)){
//                    System.out.println("Welcome " + username);
//                    loginSuccessful = true;
//                    return;
//                }
//            }
//            if(!loginSuccessful){
//                System.out.println("Invalid username or password");
//            }
//        }

    public static void main(String[] args) {
//       Ex1
//        int[] values = {3, 1};
//        System.out.println(sumOf(values));

//       Ex2
//        int[] values = {1, 3, 6, 14};
//        int result = sumOf(values, 3);
//        System.out.println(result);

//       Ex3
//        Scanner scan = new Scanner(System.in);
//        System.out.println("How many numbers are you going to give?");
//        int howMany = scan.nextInt();
//        int result = sumOf(howMany);
//        System.out.println(result);

//        //Ex4
//          Scanner scan = new Scanner(System.in);
//          System.out.println("Press 1 for registration, 2 for login or 3 to exit");
//          int input = scan.nextInt();
//          //Example data
////            registration("1", "a");
////            registration("2", "b");
////            registration("3", "c");
////            registration("4", "d");
////            registration("5", "a");
////            registration("6", "b");
////            registration("7", "c");
////            registration("8", "d");
////            registration("9", "a");
////            registration("10", "b");
////            registration("11", "b");
//
//              switch (input) {
//
//                  case 1:
//                          System.out.println("Registration");
//                          System.out.print("Enter login: ");
//                          String username = scan.next();
//                          System.out.print("Enter password: ");
//                          String password = scan.next();
//                          registration(username, password);
//                      break;
//                  case 2:
//                          System.out.println("Login");
//                          System.out.print("Enter login: ");
//                          username = scan.next();
//                          System.out.print("Enter password: ");
//                          password = scan.next();
//                          login(username, password);
//                      break;
//          }




        }
    }
