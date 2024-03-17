//ATM Program
import java.util.Scanner;

public class ATM 
{

    public static void main(String[] args) {
    int b = 100000;//b for balance
    int w,d,f; // w->Withdraw, d->Deposite, f->fast cash
      Scanner sc = new Scanner(System.in);
      while(true)
      {
        System.out.println("-----Welcome To ATM----");
        System.out.println("Enter Your Pin:");
        int p = sc.nextInt();
        if(p==9418)
        {

        System.out.println("Kindly Choose options");
        System.out.println("1.For Withdraw");
        System.out.println("2.Deposite");
        System.out.println("3.Check Balance");
        System.out.println("4.Fast Cash");
        System.out.println("5.Exit");
        int choice = sc.nextInt();
        switch (choice) {
            //Withdraw 
            case 1:
            System.out.println("Enter Money to withdraw:");
            w = sc.nextInt();
            if( b >= w)
            {
                b = b-w;
                System.out.println("Withdraw successfully..");
            }
            else
            System.out.println("Insufficient Balance in your account");
            break;

            //Deposite
            case 2:
            System.out.println("Enter Money To Be Deposited:");
            d = sc.nextInt();
            b = b+d;
            System.out.println("Your Money successfully deposited..");
            System.out.println(" ");
            break;

            //Check Balance
            case 3:
            System.out.println(" Your Avaliable Balance:" +b);
            break;

            //Fast Cash
            case 4:
            System.out.println("Fast Cash Option");
            System.out.println("1->500");
            System.out.println("2->1000");
            System.out.println("3->2000");
            System.out.println("4->3000");
            System.out.println("5->4000");
            System.out.println("6->5000");
            System.out.println("7->10000");
            System.out.println("Please select one of the above fast cash option");
            f = sc.nextInt();
            if(f==1 && 500 < b)
            {
                b = b-500;
                System.out.println("Please Take Your Cash 500");
            }
            else if( f==2 && 1000 < b )
            {
                b = b-1000;
                System.out.println("Please Take Your Cash 1000");
            }
            else if( f ==3 && 2000 < b)
            {
                b = b-2000;
                System.out.println("Please Take Your Cash 2000");
            }
            else if( f==4 && 3000 < b)
            {
                b= b-3000;
                System.out.println("Please Take Your Cash 3000");
            }
            else if( f==5 && 4000 < b)
            {
                b= b-4000;
                System.out.println("Please Take Your Cash 4000");
            }
            else if( f==5 && 5000 < b)
            {
                b= b-5000;
                System.out.println("Please Take Your Cash 5000");
            }
            else if( f==6 && 10000 < b)
            {
                b= b-10000;
                System.out.println("Please Take Your Cash 10000");
            }  
            else
            {
                System.out.println(" ");
                System.out.println("Invalid option");
            }
            break;
            //Exit
            case 5:
            System.exit(0);
            break;
            default:
            System.out.println("Enter Correct Pin Number");
        
        }
        
        System.out.println("Thanks for Visiting");
    }
    else{
        System.out.println("Invalid Pin Number:");
    }
      }

    }
    
}
