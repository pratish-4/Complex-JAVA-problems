package Inheritance.ComplexNumbers;
/**'Number' class
 *Declare a parameterised constructor in the Number class that will take the real and imaginary parts of a number as input.
 *The Number class should contain the getter and setter methods for getting and setting the real and imaginary parts of a number.
 *Create two more classes ‘NewPackage.Complex’ and ‘NewPackage.PurelyImaginary’.
 *Class NewPackage.Complex extends the Number class and checks if the input number is complex or not using checkComplex().
 The NewPackage.PurelyImaginary class inherits the NewPackage.Complex class and decides if the input number is purely imaginary
 using checkPurelyImaginaryNumber().

 Input: Your program should take the following input:
 The first line will be the real part of the number.
 The next line will contain the imaginary part of the number.

 Output: The output of your program will consist of four lines:
 The first line will display the imaginary part of the input number.
 The next line will print “The given number is complex” if the number is complex; else, it will print “The given number is real”.
 The third line will display the number in the standard format, which is:
 x + iy.
 4. The last line will display “The number is purely imaginary” if the number is purely imaginary; else, it will print
 “The number is not purely imaginary”.

 Note: If the number is purely imaginary then print only the imaginary part of it like “i8”

 Sample Input:
 5
 1.6
 Sample Output:
 1.6
 The given number is complex
 5.0+i1.6
 The number is not purely imaginary */
/**
 * NewPackage.NumberClass
 */
public class ComplexNumbers {
public static void main(String[] args) {
    System.out.println("Hi Pratish");
}
}
