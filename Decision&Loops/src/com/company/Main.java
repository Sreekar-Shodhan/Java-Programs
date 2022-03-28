package com.company;
import java.util.Locale;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	//Java program to check leap year
      Scanner input = new Scanner(System.in);
      /*int year = input.nextInt();
      if(year%4 == 0){
          System.out.println("The year "+ year +"is leap year");
      }
      else{
          System.out.println("The year "+ year + "is not a leap year");
      }
    // Java Program to check whether a number is positive or negative
    int a = input.nextInt();
     if( a < 0){
         System.out.println("The number "+ a + "is negative number");
     }
     else{
         System.out.println("The number "+ a + "is positive number");
     }
     //Java program to calculate sum of all natural numbers
        int n =input.nextInt();
        int sum = 0;
        for(int i = 0; i<=n;i++){
            sum += i;
        }
        System.out.println(sum);
     // Java program to find factorial of number
     int m = input.nextInt();
     int product = 1;
     for(int i = m; i >= 1; i--){
         product *= i;
     }
        System.out.println(product);
     //Java program to count number of digits in integer
     int count = 0;
     int num = input.nextInt();
     while(num != 0){
         num /= 10;
         ++count;
     }
        System.out.println("Number of digits: " + count);
     //java program to reverse a number
        System.out.print("The number is: ");
        int number = input.nextInt();
        int reversed = 0;
        while(number!=0){
            int digit = number%10;
            reversed = reversed*10 + digit;
            number/=10;
        }
        System.out.println(reversed);
     //Check palindrome
     String str = "mom", reverseStr = "";
     int strLength = str.length();
     for(int i = (strLength - 1); i >= 0; --i){
         reverseStr = reverseStr + str.charAt(i);
     }
     if(str.toLowerCase().equals(reverseStr.toLowerCase())){
         System.out.println(str + "is a Palindrome String.");
     }
     else{
         System.out.println(str + "is not a Palindrome String");
     }
     /*Check whether the number is prime or not
       Take a number t as input representing count of input numbers to be tested
       Take a number n as input t number of times
       For each input value of n, print prime or not prime

        System.out.println("The number of input values are: ");
        int t = input.nextInt();
        for(int i = 0; i< t; i++){
            int n = input.nextInt();

            int count = 0;
            for(int div = 1; div <= n; div++){
                if(n % div == 0){
                    count++;
                }
            }
            if(count == 2){
                System.out.println(n+" is a prime number");
            }
            else{
                System.out.println(n+" is not a prime number");
            }
        }
       //Print all prime numbers between a range
       // Take as input 'low', the lower limit of range
       // Take as input 'high', the higher limit og range
       // For the range print all the prime numbers between low and high (include both)
        System.out.print("The lower limit of range is: ");
        int low = input.nextInt();
        System.out.println("The higher limit of range is: ");
        int high = input.nextInt();

        for(int i = low; i <= high; i++){
            int count = 0;
            for(int div = 1; div <= high; div++){
                if(i%div == 0){
                    count++;
                }
            }
            if(count == 2){
                System.out.println(i+" is a prime number");
            }
            else{
                System.out.println(i+" is not a prime number");
            }
        }
    //Print first n fibonacci numbers
    // Take as input 'n' the count of fibonacci numbers to input
    // print the first n fibonacci numbers
        System.out.print("The value of n is: ");
        int n1 = input.nextInt();
        // fibonacci is sum of last two/ previous two numbers
        int firstNum = 0;
        int secondNum = 1;
        for(int i = 0; i <=n1; i++){
            System.out.println(firstNum);
            int nextNum = firstNum + secondNum;
            firstNum = secondNum;
            secondNum = nextNum;
        }*/
    //Print digits of a number
        int count = 0;
        int num = input.nextInt();

        int reversed = 0;
        while(num!=0){
            int digit = num%10;
            reversed = reversed*10 + digit;
            num/=10;
        }
        System.out.println(reversed);
        while(reversed != 0){
            int rem = reversed%10;
            reversed /= 10;
            System.out.println(rem);
        }




    }
}
