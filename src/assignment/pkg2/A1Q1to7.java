/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg2;

/**
 *
 * @author slatz8075
 */
public class A1Q1to7 {

    //Problem 1
    public int digitalSum(int n) {
        //the base case will be when the method itself returns the totals to the top layer
        //add the last digit to the total
        int total = n % 10;
        //get rid of this number
        n = n / 10;
        //create an integer for finding the total of digits on the lower levels
        int lowerTotal = 0;
        //check to see if there are ant digits left in the number
        if (n != 0) {
            //if so run the method to find the next and the next.. digits
            lowerTotal = lowerTotal + digitalSum(n);
        }
        //return the number found on this layer and the ones below up
        return total + lowerTotal;
    }

    //Problem 2
    public int digitalRoot(int n) {
        //call on the digital sum method to find the sum of the number
        n = digitalSum(n);
        //check to see if the number is 1 digit yet
        if (n > 9) {
            //therefore it is more than 1 digit and we need to go 1 'layer' deeper
            n = digitalRoot(n);
        }
        //since the method has gotten past the while loop we know it is only 1 digit
        return n;
    }

    //Problem 3
    public int triangle(int n) {
        //add the blocks on the nth layer to the total
        int blocksTotal = n;
        //since the nth layer has been counted we can move up a level i.e. n - 1
        n = n - 1;
        //check to see if this layer is 0
        if (n != 0) {
            //it is not therefore this layer needs to be counted
            blocksTotal = blocksTotal + triangle(n);
        }
        //since we are past the if statement it is indeed true that there are no more layers to count
        //therefore return the total to the upper called triangle method or to the final answer
        return blocksTotal;

    }

    //Problem 4
    public int hailstone(int n) {
        //print the original number or the number we have recived from the statements below
        System.out.println(n);
        //check to see if n is even
        if (((n % 2 == 0) == true) && n != 1) {
            //therefore preform the expected path
            n = n / 2;
            //continue the process
            hailstone(n);
            //if not, it is odd...
        } else if (n != 1) {
            //therefore preform the other expected path
            n = 3 * n + 1;
            //continue the process
            hailstone(n);
        }
        //since we are past both of these statements it is true that n = 1 so..
        //return answer
        return 1;
    }

    //problem 5
    public String binaryConvert(int n) {
        //create an array to store the 1s and 0s
        String binaryOutput = new String();
        //check to see if there is a remainder when n/2
        if (n % 2 > 0) {
            //since n%2 is greater than 0, add 1 to the string, demonstrating there is a remainder
            binaryOutput = "1" + binaryOutput;
            //if not the remainder is 0
        } else {
            //so add 0 to the string
            binaryOutput = "0" + binaryOutput;
        }
        //check to see if the number is greater than 1
        if (n > 1) {
            //it is so adjust the number for the lower level
            n = n / 2;
            //repeat the method for a lower level of n (n/2)
            binaryOutput = binaryConvert(n) + binaryOutput;
        }
        //return the string up a level or to the user
        return binaryOutput;
    }
    //problem 6

    public String convert(int a, int b) {
        //create an array to store the 1s and 0s
        String convertOutput = new String();
        //check to see if a%b is 10
        if (a % b == 10) {
            //it is so add A in the place of 10
            convertOutput = "A" + convertOutput;
            //check to see if a%b is 11
        } else if (a % b == 11) {
            //it is so add B in the place of 11
            convertOutput = "B" + convertOutput;
            //check to see if a%b is 12
        } else if (a % b == 12) {
            //it is so add C in the place of 12
            convertOutput = "C" + convertOutput;
            //check to see if a%b is 13
        } else if (a % b == 13) {
            //it is so add D in the place of 13
            convertOutput = "D" + convertOutput;
            //check to see if a%b is 14
        } else if (a % b == 14) {
            //it is so add E in the place of 14
            convertOutput = "E" + convertOutput;
            //check to see if a%b is 15
        } else if (a % b == 15) {
            //it is so add F in the place of 15
            convertOutput = "F" + convertOutput;
            //if not a%b is less than 10 for our purpses
        } else {
            //add the remainder of a/b to the string
            convertOutput = a % b + convertOutput;
        }
        //check to see if the number is greater than 1
        if (a > 1) {
            //it is so actually a/b to determine the lower level answers
            a = a / b;
            //repeat the method for a lower level of n (n/2)
            convertOutput = convert(a, b) + convertOutput;
        }
        //return the string up a level or to the user
        return convertOutput;
    }

    //Question 7
    public boolean Palindrome(String s, int length) {
        //check to see if the front position is equal to position in the back
        if ((length != 1 && length != 2) && s.charAt(0) == s.charAt(length - 1)) {
            //these two positions are the same therefore delete them in order to check the next ones
            s = s.substring(1, length - 1);
            //since the string length become 2 letters shorter adjust the length
            length = length - 2;
            //call the method for the new first and last letters
            return Palindrome(s, length);
            //if not check to see if the length is just 1 long
        }else if (length == 1){
            //it is so, so return that this is the last most center character (equal to itself)
            return true;
            //check to see if the 2 most center digits are equal to each other
        }else if ((length == 2) && (s.charAt(0) == s.charAt(length - 1))){
            //it is so return true
            return true;
            //is all of these conditions have not triggered we know that it is not a palindrome
        }else{
            //it is so, so return false
            return false;
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        A1Q1to7 test = new A1Q1to7();
        int bound1 = test.digitalSum(12345);
        System.out.println("The sum of 12345 is : " + bound1);
        int bound2 = test.digitalRoot(928);
        System.out.println("The digitalsum of 2019 is : " + bound2);
        int bound3 = test.triangle(10);
        System.out.println("The sum of all blocks in a pirymid 10 tall is: " + bound3);
        System.out.println("The hailstone process for 12: ");
        int bound4 = test.hailstone(12);
        String bound5 = test.binaryConvert(156);
        System.out.println("The Binary Convert of 156 is : " + bound5);
        String bound6 = test.convert(1000, 16);
        System.out.println("1000 in base 16 is : " + bound6);
        boolean bound7 = test.Palindrome("racecar", 7);
        System.out.println("racecar is a palindrome : " + bound7);



    }
}
