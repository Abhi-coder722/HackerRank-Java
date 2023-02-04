// Java's System.out.printf function can be used to print formatted output. The purpose of this exercise is to test your understanding of formatting output using printf.

// To get you started, a portion of the solution is provided for you in the editor; you must format and print the input to complete the solution.

// Input Format

// Every line of input will contain a String followed by an integer.
// Each String will have a maximum of  alphabetic characters, and each integer will be in the inclusive range from  to .

// Output Format

// In each line of output there should be two columns:
// The first column contains the String and is left justified using exactly  characters.
// The second column contains the integer, expressed in exactly  digits; if the original input has less than three digits, you must pad your output's leading digits with zeroes.

// Sample Input

// java 100
// cpp 65
// python 50
// Sample Output

// ================================
// java           100 
// cpp            065 
// python         050 
// ================================
// Explanation

// Each String is left-justified with trailing whitespace through the first  characters. The leading digit of the integer is the  character, and each integer that was less than  digits now has leading zeroes.
import java.util.Scanner;
import java.util.Formatter;
public class solution{
    public static void main(String[]args){
        Formatter fmt = new Formatter();
        Scanner sc=new Scanner(System.in);
        fmt.format("%-15s%s\n",sc.next(),convert(sc.next()));
        fmt.format("%-15s%s\n",sc.next(),convert(sc.next()));
        fmt.format("%-15s%s",sc.next(),convert(sc.next()));
        System.out.println("================================");
        System.out.println(fmt);
        System.out.println("================================");
    }
    public static String convert(String s){
        int n = Integer.parseInt(s);
        if (n<100 && n>9){
            return "0" + s;
        }
        else if (n<10){
            return "00" + s;
        }
        else 
        return s;
    }
}
