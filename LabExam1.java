import java.util.Scanner;
class LeasePayment{
   public static void main (String [] args){
      
      Scanner scan = new Scanner(System.in);
      
      String make = "";
      String city = "";
      double cost = 0;
      double residual = 0;
      int term = 0;
      double moneyFactor = 0.0029;
      double localTax = 0.07;
      
      
      System.out.println("What is the make of your car?");
      make = scan.nextLine();
      System.out.println("What city do you live in?");
      city = scan.nextLine();
      System.out.println("What is the cost of your car?");
      cost = Double.parseDouble(scan.nextLine());
      System.out.println("What is the residual cost of your car?");
      residual = Double.parseDouble(scan.nextLine());
      System.out.println("# terms on your car.");
      term = Integer.parseInt(scan.nextLine());
      
      
      if(make.equals("Toyota")){
         moneyFactor = 0.0018;
            if(city.equals("LA")){
               localTax = 0.09;
               
            }
            else if(city.equals("NYC")){
               localTax = 0.08875;
            }
            else{
               localTax = 0.07;
            }
      }
      else if(make.equals("Ferrari")){
         moneyFactor = 0.0021;
            if(city.equals("LA")){
               localTax = 0.09;
            }
            else if(city.equals("NYC")){
               localTax = 0.08875;
            }
            else{
               localTax = 0.07;
            }
      }
      else{
         moneyFactor = 0.0029;
            if(city.equals("LA")){
               localTax = 0.09;
            }
            else if(city.equals("NYC")){
               localTax = 0.08875;
            }
            else{
               localTax = 0.07;
            }
      }
      double deprecation = (cost - residual) / term;
      int newDep = (int) deprecation;
      double interest = (cost + residual)* moneyFactor;
      int newInterest = (int) interest;
      double tax = (newDep + newInterest)*localTax;
      int newTax = (int) tax;
      double leasePayment = newDep + newInterest + newTax;
      int newLeasePayment = (int) leasePayment;
      System.out.println(newLeasePayment);
      scan.close();
   }
}