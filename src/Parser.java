public class Parser {
    public static void main(String[] args) {
        String numberAsAString = "2018";
        System.out.println("numberAsAString = " + numberAsAString);

        int number = Integer.parseInt(numberAsAString);
        System.out.println("parsed into an int" + number);
        
        String doubleAsAString = "2018.125";
        double doubleNumber = Double.parseDouble(doubleAsAString);
        System.out.println("double parsed" + doubleNumber);
        /* test that number is an int */
        /* number 1 should be concatenated to end of string */
        numberAsAString += 1;
        System.out.println("after adding 1" + numberAsAString);
        /* number should increment as int */
        number += 1;
        System.out.println("after adding 1" + number);
    }
}
