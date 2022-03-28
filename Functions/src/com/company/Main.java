package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	//Write a program with a method named getTotal that accepts two integers as an argument and return its sum. Call this method from main( ) and print the results.
     Scanner input = new Scanner(System.in);
        /*System.out.print("The two numbers are: ");
        int num1 = input.nextInt();;
        int num2 = input.nextInt();
        int result = getTotal(num1,num2);
        System.out.println(result);
        System.out.println("The string input is: ");
        String word = input.nextLine();*/

        System.out.println("The integer is: ");
        int number = input.nextInt();
       boolean result =  isEven(number);
        System.out.println(result);

        boolean result1 = isPrime(number);
        System.out.println(result1);

        /*int count =0;
        for(int i = 0; i < word.length(); i++){
            if(isVowel(word.charAt(i))){
                count++;
            }
        }
        System.out.println("No.of vowels are: " + count);*/

    }
    public static int getTotal(int a,int b){
        int sum = a + b;
        return sum;
    }
    public static boolean isVowel(char c){
        switch(c){
            case 'a':
            case 'A':
            case 'e':
            case 'E':
            case 'I':
            case 'O':
            case 'i':
            case 'o':
            case 'u':
            case 'U':
                 return true;
            default:
                 return false;
        }


    }
    public static boolean isEven(int num){
        if(num%2 == 0){
            return true;
        }else{
            return false;
        }
    }
    public static boolean isPrime(int number) {
        int count1 = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count1++;
            }
        }T
            if (count1 == 2)
                return true;
            else
                return false;


    }
}
