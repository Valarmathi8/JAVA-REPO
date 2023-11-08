import java.util.Scanner;
class AtmProcess
{
	Scanner s = new Scanner(System.in);
	String name="valarmathi";
	int password=80702;
	int avlbal=100000;
	void entryPro()
	{
		System.out.println("Enter your name:");
		String firstvalue=s.nextLine();
		System.out.println("Enter your password:");
		int secondvalue=s.nextInt();
		if (name.equals(firstvalue) && password==secondvalue)
		{
			System.out.println("Welcome to KVB");
			System.out.println("Choose 1 for Withdraw");
			System.out.println("Choose 2 for Deposit");
			System.out.println("Choose 3 for Checkbook_Request");
			System.out.println("Choose 4 for Exit");
			System.out.println("Enter your choice:");
			int nvalue=s.nextInt();
			switch(nvalue){
			case 1:
			withDraw();
			break;
			case 2:
			deposit();
			break;
			case 3:
			checkBook_Request();
			break;
			case 4:
			System.out.println("THANK YOU");
			break;
			default:
			System.out.println("Invalid choice try again!");
			}	
		}
		else
		{
			System.out.println("Invalid Account");
		}
	}

	void withDraw()
	{
		System.out.println("Enter your amount:");
		int withdraw=s.nextInt();
		if(withdraw <= avlbal)
		{
			int a= avlbal - withdraw;
			System .out.println("Please Collect your Money");
			System.out.println("Available Balance in your account is "+a);			
		}
		else
		{
			System.out.println("Insufficient Amount");
		}
	}
	void deposit()
	{
		System.out.println("Enter your deposit amount:");
		int Deposit=s.nextInt();
		System.out.println("Successfully deposited");
		int cbal= Deposit+avlbal;
		System.out.println("Your Current Balance Amount is "+cbal);
	}
	void checkBook_Request()
	{
		System.out.println("Checkbook request is accepted, shortly collect Checkbook in your branch");
	}
public static void main(String args[])
{
	AtmProcess ap=new AtmProcess();
	ap.entryPro();
}
}





	













	