package com.company;

public class Main {

    public static void main(String[] args) {
	/* Arithmetic Operator
	Assignment Operator
	Relational Operator
	Logical Operator
	Unary Operator
	Bitwise Operator
	 */
       int a = 10, b= 12;
        System.out.println("a + b =" + (a + b));//addition of two numbers
        System.out.println("a - b =" + (a - b));//subtraction of two numbers
        System.out.println("a * b =" + (a * b));//multiplication of two numbers
        System.out.println("a / b =" + (a / b));//division of two numbers
        System.out.println("a % b =" + (a % b));//modulo operator

       //Assignment Operator
       int age = 12;
       int var;
       var = age;//assign value to var
        System.out.println("var using =: " + var);
        var += age;// using +=
        System.out.println("var using +=: "+ var);
        var *= age;//using *=
        System.out.println(" var using *=: " + var);

        //Relational Operators
        System.out.println("a is " + a + " and b is " + b);
        System.out.println(a == b);// == checks equal or not
        System.out.println(a != b);// != not equal
        System.out.println(a > b);//greater than
        System.out.println(a < b);//less than
        System.out.println(a >= b);//greater than or equal to
        System.out.println(a <= b);//less than or equal to

        //logical Operator
        System.out.println((5 > 3) && (8 > 5));//and operator
        System.out.println(((5 < 3) || (8 > 5)));// OR operator
        System.out.println(!(5 == 3));//NOT operator

        
    }
}
