//Count the spaces between your entered key words
class Q1{
	public static void main(String args[])
	throws java.io.IOException{
		char ch,ignore,answer='K';
		int count=0;
		System.out.println("Welcome to space counter");
		System.out.println("Write what ever you want but don't press Enter Before End.");
		//ch= (char) System.in.read();
		//do{
			//ignore= (char ) System.in.read();
			//if (ignore == ' ') count++; 
		//} while(ignore != '$');
		do{
			ch= (char ) System.in.read();
			if (ch == ' ') count++; 
		} while(ch != '\n');
		System.out.print("Total Spaces are pressed : "+count);
	}
}; 