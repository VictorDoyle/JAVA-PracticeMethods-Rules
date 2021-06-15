import java.util.Scanner;

public class UserScannerInput {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter The Year You Were Born");
        int DOB = scanner.nextInt();
        /* there must be a scanner.nextLine() to accept another following scanner input */
        scanner.nextLine();
        System.out.println("Enter Your Name");
        String name = scanner.nextLine();
        /* after using scanner, close required so it releases underlying memory scanner is using */
        int currentAge = 2021 - DOB;


        if(currentAge >= 0 && currentAge <= 100) {
            System.out.println("Nice To Meet You " + name + ". You are " + currentAge + " years old");
        } else {
            System.out.println("Invalid Year Of Birth Given");
        }
        scanner.close();
    }



}
