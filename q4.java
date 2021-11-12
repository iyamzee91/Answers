import java.util.Scanner;
class q4{
    public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.print("please enter number of Gallon");
    int gallon = sc.nextInt();
     System.out.print("please enter number of miles per Gallon ");
    int miles = sc.nextInt();
     System.out.print("please enter price");
    int price = sc.nextInt();
    int distance = (gallon * miles);
    float cost = (250/gallon);
    System.out.println("The car can travel with the gas in miles:" + distance);
    System.out.println("The cost of travelling with miles per car:" + cost);
    }
    
    
}