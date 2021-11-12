import java.util.Scanner;
class q7{
    public static void main(String[]args){
        int num1,num2, num3,hcf,lcm;
        Scanner er = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int firstnumber = er.nextInt();
        System.out.print("Enter second number: ");
        int secondnumber = er.nextInt();
        num1 = firstnumber;
        num2 = secondnumber;
        while(num2!=0){
            num3 = num2;
            num2 = num1% num2;
            num1 = num3;          
        }
        hcf =num1;
        lcm =(firstnumber * secondnumber)/hcf;
        System.out.println("the hcf is:"+hcf);
        System.out.print("the lcm is:"+lcm);
        
    }
}