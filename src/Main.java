import java.util.Scanner;         // import Scanner for user to be able to type a response

public class Main                              // name of the program is main
    {
        public static void main(String[] args) {               // its public and static and it takes strings!

            int r = 10;            //  declare ( r ) as int and give it a value

            double  pi = 3.14;        // declare pi as a double and give it a value

            Scanner s = new Scanner(System.in);    // start scanner

            System.out.println("Enter the radious of the circle"); // ask for user input

            r = s.nextInt();    // put that input in the r value

            double area = pi * r * r;    //calculate the user input (r) using the formula

            System.out.println("Area of the circle is  "+area);   // print the formula
        }
    }

