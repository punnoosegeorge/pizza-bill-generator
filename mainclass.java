import java.util.Scanner;

public class mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
		System.out.println("			here true indicate veg and false indicate nonveg");
        System.out.print("			Enter a boolean value (true/false): ");

        // Read the boolean value
        boolean userInput = scanner.nextBoolean();
       

		System.out.println("--------------welcome to piozza house----------------");
pizzaprice basepizza=new pizzaprice(userInput);
basepizza.getpizzaprice();
basepizza.add_extra_toppping();
basepizza.add_extra_chess();
basepizza.take_away();
basepizza.getbill();
basepizza.dispaly();
	}

}
