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
        if(n > 9){
            //therefore it is more than 1 digit and we need to go 1 'layer' deeper
            n = digitalRoot(n);
        }
        //since the method has gotten past the while loop we know it is only 1 digit
        return n ;
    }
    
    //Problem 3
    public int triangle(int n){
        //add the blocks on the nth layer to the total
        int blocksTotal = n;
        //since the nth layer has been counted we can move up a level i.e. n - 1
        n = n-1;
        //check to see if this layer is 0
        if (n != 0){
            //it is not therefore this layer needs to be counted
            blocksTotal = blocksTotal + triangle(n);
        }
        //since we are past the if statement it is indeed true that there are no more layers to count
        //therefore return the total to the upper called triangle method or to the final answer
        return blocksTotal;
        
    }
    
    //Problem 4
    public int hailstone(int n){
        //print the original number or the number we have recived from the statements below
        System.out.println(n);
        //check to see if n is even
        if (((n%2 == 0) == true) && n != 1){
            //therefore preform the expected path
            n = n/2;
            //continue the process
            hailstone(n);
            //if not, it is odd...
        } else if(n != 1){
            //therefore preform the other expected path
            n = 3*n+1;
            //continue the process
            hailstone(n);
        }
        //since we are past both of these statements it is true that n = 1 so..
        //return answer
        return 1;
    }
    
    //problem 5
    
    public int binaryConvert(int n){
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        A1Q1to7 test = new A1Q1to7();
        int bound1 = test.digitalSum(12345);
        System.out.println("The sum of 12345 is : " + bound1);
        int bound2 = test.digitalRoot(2019);
        System.out.println("The digitalsum of 2019 is : " + bound2);
        int bound3 = test.triangle(10);
        System.out.println("The sum of all blocks in a pirymid 10 tall is: " + bound3);
        System.out.println("The hailstone process for 12: ");
        int bound4 = test.hailstone(12);
        

    }
}
