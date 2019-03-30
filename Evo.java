class Evo{
	public static void main(String args[])
	throws java.io.IOException{
		int s;
		System.out.println("Enter A number. ");
		s = (int) System.in.read();
		int a;
		a = s%2;
		if(a==0)
			System.out.println("This is an even number. ");
		else
			System.out.println("This is an odd number. ");
	}
}