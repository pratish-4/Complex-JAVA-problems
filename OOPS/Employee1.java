class Employee {

   private int empId;
   private String empFirstName;
   private String empSecondName;
   private double empSalary;

   public String getId(){
    return empFirstName;
}
   public String getFirstName(){
     return empFirstName;
 }
  public String getSecondName(){
     return empSecondName;
 }
   public double getSalary(){
     return empSalary;
 }
 // Setters 

 public void setFirstName(String fname){
    this.empFirstName = fname;
}
public void setSecondName(String sname){
  this.empSecondName = sname;
}
public void setSalary(double sal){
  this.empSalary = sal;
}
public void setId(int id){
  this.empId= id;
}
 public void demo() {
  System.out.println("employee full name "+empFirstName+" "+empSecondName);
  System.out.println("employee full annual package "+empSalary);
 }
}

public class Employee1  {
   public static void main(String[] args) {
      Employee E1 = new Employee();
      E1.setId(101512031);
      E1.setFirstName("Sushil");
      E1.setSecondName("Kumar");
      E1.setSalary(540006.96);
      E1.demo();
      Employee E2 = new Employee();
      E2.setId(101512032);
      E2.setFirstName("Tara");
      E2.setSecondName("Sharma");
      E2.setSalary(612011.88);
      E2.demo();
     
     
   }
}


