import java.util.Scanner;
class q6{
    public static void main(String[]args){
    System.out.println("Performance level of an Employee");
    Scanner input = new Scanner(System.in);
    System.out.print("Enter performance level:");
    int performance = input.nextInt();
     System.out.print("Enter base salary:");
    int b = input.nextInt();
    double newSalary = (b* 0.03); 
    if (performance >= 90){
        
          System.out.println("salary is " + newSalary);
    }
    else{
          System.out.println("salary is "+ b);
 
    }
    
    }
}    

