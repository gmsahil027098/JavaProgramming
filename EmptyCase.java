//Demonstration the Switch
class NestedSwitch{
	public static void main(String args[]){
		int i;
		char ch1,ch2;
		for(i=0; i<5;i++){
			switch(ch1){
				case 'A':
				System.out.println("This A belongs to outer switch");
				switch(ch2){
					case 'A':
					System.out.println("This A belongs to inner switch");
				break;
				case 4:
				System.out.println("i is 4.");
				break;
			}System.out.println();
		}
	}
}