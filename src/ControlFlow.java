public class ControlFlow {
    public static void main(String[] args){
        int switchValue = 1;

        /* switches are more specific than ifs because they are ltd to given param */
        switch(switchValue) {
            case 1:
                System.out.println("Value was 1");
                /* break terminates */
                break;
                

            case 2: 
                System.out.println("value was 2");
                break;
            
            case 3:case 4:case 5:
                System.out.println("was a 3, a 4 or a 5");
                break;

            default:
            /* else statement */
                System.out.println("Was not in range of 1 to 5");
                break;
        }

        /* switches can be used with other primitives such as char */

        char switchChar = 'b';
        switch(switchChar) {
            case 'a':
                System.out.println("the character was a");
                break;
            case 'b':
                System.out.println("the character was b");
                break;
            case 'c':
                System.out.println("the character was c");
                break;
            default:
                System.out.println("The character was not a,b or c");
                break;
        }

        int count = 0;
        for(int i=10; i<50; i++){
            if(isPrime(i)) {
                count++;
                System.out.println("Number " + i + " is a prime number");
                if(count == 3) {
                    System.out.println("Exiting prime loop");
                    break;
                }
            }
        }
        
    }

    public static boolean isPrime(int n) {
         /* SECTION: number is Prime */

         if(n == 1) {
             return false;
         }

         for(int i=2; i <= n/2; i++) {
             if(n % i == 0) {
                 /* if the remainder is equal to 0 then num cant be prime */
                 System.out.println(n +" Is not a prime numer");
                 return false;
             }
         }
         return true;
    }

    int n = 50;

}

