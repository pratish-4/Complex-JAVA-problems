/**
 * Create three classes – Shape, Triangle, and Rectangle – which constitute a method display that has to be overridden. You need to take the number of sides in a shape as the input and predict the kind of shape it is. The output of your program is as follows: 
If the number of the input side is 0, print “The shape is a circle”. 
If the number of the input side is 3, print “The shape is a triangle”. 
If the number of the input side is 4, print “The shape is a rectangle”. 
If the number of sides is anything other than 0, 3, or 4, print “Enter a valid number of sides!”.              

Input: The input should be an integer 'n' that represents number of sides in a shape.

Output: The output will consist of one line that displays the kind of shape according to the number of sides.

Sample Input
3
Sample Output
The shape is a triangle
 */

 
import java.util.*;
class Shape{ // PARENT CLASS
    // instance variable
     int sides;
    // Parametric Constructor
       Shape(int sides){
        this.sides = sides;
    }
        public void display(){
            if(sides ==0){
        System.out.println("The shape is a circle");
    }
    else{
        System.out.println("Enter a valid number of sides");
    }
    }
}
class Triangle extends Shape{ // Child Class of Shape
    Triangle(int sides){
        super(sides);
    }
    public void display(){
          if(sides == 3){
        System.out.println("The shape is a Triangle");
    
    }
    else{
    super.display();
}
}
}
class Rectangle extends Triangle{
    Rectangle(int sides){
        super(sides);
    }

    public void display(){
        if( sides == 4){
        System.out.println("The shape is a Rectangle");
        }
    else{
    super.display();
    }
    
}
}
//Write your code here
public class Source {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int numberOfSides = in.nextInt();
        Shape obj1 = new Rectangle(numberOfSides);
        obj1.display();
       
    }
}



