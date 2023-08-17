import java.util.*;
class NumberGuessingGame {
	static int tries=1;
	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("============================================================================");
		System.out.println("\n WELCOME TO THE NumberGuessingGame ");
		int rNum=(int)(Math.random()*100)+1;
		System.out.println("ENTER THE NUMBER IF YOU DARE ! !");
		int guessNum;
		char ch='y';
		int win=0;
		System.out.println("cheating ="+rNum);
		while(ch=='y') 
		{
			System.out.print(" ENTER HERE ---> ");
			guessNum=sc.nextInt();
			if(guessNum==rNum) {
				System.out.println("CONGRATULATIONS !! \n YOU HAVE SUCCESSFULLY GUESSED CORRECT NUMBER IN "+tries+" TRIES \n GOOD BYE :)");
				win=1;  // won the game
				break;
			}
			else
			{
				System.out.print("INCORRECT GUESS \n \t \t HINT : ");
				if(guessNum<rNum) {
					System.out.println("NUMBER is greater \n");
				}
				else{
					System.out.println("NUMBER is less \n");
				}
				System.out.println("NUMBER OF TRIALS = "+tries+"\n");
				System.out.println("TO TRY AGAIN PRESS y OTHERWISE PRESS ANYTHING ");
				ch=sc.next().charAt(0);
				tries++;
			}
			
		}
		if(win==0) {
			System.out.println("IT'S OK \n YOU TRIED \n GOOD BYE");
		}
		System.out.println("============================================================================");
		
		
	}
}