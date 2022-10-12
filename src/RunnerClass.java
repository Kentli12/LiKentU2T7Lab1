import java.util.Scanner;
public class RunnerClass {
    public static void main (String [] args ) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your first String: ");
        String string1 = scan.nextLine();

        int length1 = string1.length();
        String split1 = string1.substring(0,(length1/2));
        String split2 = string1.substring(length1/2);


        System.out.println("String Length: " + length1);
        System.out.println("First Half: " + split1);
        System.out.println("Second Half: " + split2);
        System.out.print("enter your second String: ");
        String string2 = scan.nextLine();

        int length2 = string2.length();

        if (length2 > length1) {
            System.out.println(string2 + " is longer");
        } else if (length2 < length1) {
            System.out.println(string1 + " is longer");
        } else {
            System.out.println("Both strings have the same length");
        }

        //comparison

        int larger = string1.compareTo(string2);
        if (larger < 0) {
            System.out.println(string1 + " is first alphabetically");
        } else if (string1.equals(string2)){
            System.out.println("Both strings have the exact same characters");
        } else {
            System.out.println(string2 + " is first alphabetically");
        }

        //index
        int index = string1.indexOf(string2);
        if (index == -1){
            System.out.println(string2 + " is NOT found in " + string1);
        } else {
            System.out.println(string2 + " is found in " + string1 + " at index " + index);
        }
    }


}
