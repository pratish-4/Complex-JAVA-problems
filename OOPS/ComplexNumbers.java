import java.util.Scanner;

/**'Number' class
 *Declare a parameterised constructor in the Number class that will take the real and imaginary parts of a number as input.
 *The Number class should contain the getter and setter methods for getting and setting the real and imaginary parts of a number.
 *Create two more classes ‘Complex’ and ‘PurelyImaginary’.
 *Class 'Complex' extends the 'Number' class and checks if the input number is complex or not using checkComplex().
 The 'PurelyImaginary' class inherits the 'Complex' class and decides if the input number is purely imaginary
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
class Number{
    double r,i;
    //Parametric Constructor
    Number(double real, double imaginary){
        this.i= imaginary;
        this.r= real;
    }
    // Setters
    public void setR(double re) {
        this.r = re;
    }
    public void setI(double im) {
        this.i = im;
    }
    //Getters
    public double getR() {
        return r;
    }
    public double getI(){
        return i;
    }
}
class Complex extends Number{
    Complex(double real,double imaginary){
        super(real,imaginary);
    }
    void checkComplex() {
        double n = getI();
        if(n!=0){
            System.out.println("The given number is complex");
        }
        else {
            System.out.println("The given number is real");
        }
    }
}
class PurelyImaginary extends Complex{
    PurelyImaginary(double real,double imaginary){
        super(real, imaginary);
    }
        void checkPurelyImaginaryNumber() {
            double n = getR();
            if(n ==0){
                System.out.println("The number is purely imaginary");
            }
            else {
                System.out.println("The number is not purely imaginary");
            }
        } 
    }



public class ComplexNumbers {
    
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    PurelyImaginary p1 = new PurelyImaginary(sc.nextDouble(),sc.nextDouble());
    p1.setI();
    
  

}
}
