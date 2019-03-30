//Guess the letter game. #rd versions
class Guess3{
	public static void main(String args[])
	throws java.io.IOException {
		char ch,answer='K';
		System.out.print("I'm thinking of a letter Between A and Z.");
		System.out.print("Can you guess it : ");
		ch = (char) System.in.read();
		if(ch==answer) 
			System.out.println("**Right**");
		else 
		{
			System.out.print("...Sorry, You're ");
			if(ch<answer)System.out.println("too low...");
			else System.out.println("too high...");
		}
	}
}