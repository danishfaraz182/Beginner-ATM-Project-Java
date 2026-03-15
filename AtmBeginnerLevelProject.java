import java.util.Scanner;


public class AtmBeginnerLevelProject {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        int pin=4431;
        int amount=2345128;
        int choice=0;
        int count=0;
    
     System.out.println("enter the pin :");
                int PinCode=sc.nextInt();

                if(PinCode==pin){
        while (true) {        
     System.out.println("welcome to our bank ");
    System.out.println("1.WITHDRAW");
    System.out.println("2.DISPLAY");
     System.out.println("3.EXIT");
    
    System.out.println("Enter your choice:");
    choice = sc.nextInt();

    
        switch (choice){
            case 1:
                if(count>=6){
                    System.out.println("ALERT: Transaction Limit Exceeded!");
                    System.out.println("You have already performed 6 withdrawals.");
                    break;

                }

                 System.out.println("enter the amount you want to withdraw : ");
               
                int withdraw=sc.nextInt();

                if(withdraw<=amount){
                    amount=amount-withdraw;
                    count++;
                    System.out.println("the amount is withdrawn "); 
                }
                 else{
                    System.out.println("your balance is low Amount Can't be Withdrawn");
                    sc.nextLine();
                    sc.nextLine();

                }
                break;

          case 2:
              System.out.println("the remaining balance is :" +amount);  
               break;
          case 3:
            System.exit(0);
         default:
            System.out.println("invalid choice!.try again!");
            }
        }
    }
    else{
        System.out.println("invlaid pin ! try again.");
    }
    sc.close();
}
}