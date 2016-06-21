import java.util.Scanner;

public class TharBeDragons {

	static Scanner scan = new Scanner(System.in);
	public static String dragon() {
		double x = Math.random();
		if (x >= 0 && x <= .49) {
			String color = "red";
			System.out.println("It stares at you with its "
					+ color + " eyes.");
			System.out.println("Lucky for you that dragons with " + color + " are friendly! \n"
					+ "You pet it and become friends with it.");
			
			return color;
		} else {
			String color = "blue";
			System.out.println("You swing/shoot at the dragon, but the fierce nature of a blue-eyed dragon \n"
					+ "overwhelms you, he grabs you with his claw and gobbles you up.");
			System.out.println("It stares at you with its "
					+ color + " eyes.");
			return null;
		
		}
	}
	public static void main(String[] args) {
		
		do {
			System.out.println("What is your name?");
			String name = scan.nextLine();
			if (name.startsWith("A") || name.startsWith("a")) {
				System.out.println("So your name is " + name + "... Eh? Ye must be posh, then.");
			} else if (name.startsWith("B")) {
				System.out.println("So your name is " + name + "... Eh? Did your mother hate you or something?");
			} else if (name.startsWith("C")) {
				System.out.println("So your name is " + name + "... Eh? You know what rhymes with that? I don't.");
			} else if (name.startsWith("D")) {
				System.out.println("So your name is " + name + "... Eh? Ye be a god amongst men, with a name like that!");
			} else if (name.startsWith("S")) {
				System.out.println("So your name is " + name + "... Eh? Isn't that a fancy name.");
			} else {
				System.out.println("So your name is " + name + "... Eh? Well, I'm not one to judge.");
			}
			System.out.println("Would you like to play a game, " + name + "?");
			String answer = scan.nextLine();

			if (answer.startsWith("y") || answer.equalsIgnoreCase("yes")) {
				System.out.println(
						"Excellent! You are walking across a field... \n" + "You encounter a fire-breathing dragon! \n"
								+ "What do you do? \n" + "You may either face the beast or run away.");
				String choice = scan.nextLine();
				if (choice.equalsIgnoreCase("face the beast") || choice.equalsIgnoreCase("face") || choice.equalsIgnoreCase("fight") || choice.startsWith("f")) {
					double headCount = Math.random();
					if (headCount <= 0.33 && headCount >= 0) {
						int varHead = 1;
						System.out.println("The dragon has " + varHead + " head!");
					} else if (headCount <= 0.66 && headCount >= 0.34) {
						int varHead = 2;
						System.out.println("The dragon has " + varHead + " heads!");
					} else {
						int varHead = 3;
						System.out.println("The dragon has " + varHead + " heads!");
					}
					System.out.println("All tremble before the might of the dragon. \n"
							+ "None have ever fought a dragon and lived to tell the tale! \n"
							+ "What is your weapon? \n"
							+ "You may choose a *sword*, *slingshot*, or a *bow* and arrow");

					String weaponChoice = scan.nextLine();
					
					if (weaponChoice.equals("sword")) {
						System.out.println("Armed with your sword, you approach the dragon. \n"
								+ "You can feel it's fiery breath as you get closer. \n");
						TharBeDragons.dragon();
						
						if (TharBeDragons.dragon() == null) {
							System.out.println("You lost the game! \n Would you like to play again? (Y/N)");
							
						} else {
							System.out.println("What do you name the dragon?");
							String dragonName = scan.nextLine();
							System.out.println("The dragon scoffs at the thought of being called " + dragonName
									+ " and flys off, never to be seen again.");
							System.out.println("Congratulations! You've won the game!");
							System.out.println("Do you wish to restart? Y or N");
						}
						
					} else if (weaponChoice.equals("slingshot")){
					System.out.println("Armed with your slingshot, you approach the dragon. \n"
							+ "You can feel it's fiery breath as you get closer. \n");
					TharBeDragons.dragon();
					
					if (TharBeDragons.dragon() == null) {
						System.out.println("You lost the game! \n Would you like to play again? (Y/N)");
						
					} else {
						System.out.println("What do you name the dragon?");
						String dragonName = scan.nextLine();
						System.out.println("The dragon scoffs at the thought of being called " + dragonName
								+ " and flys off, never to be seen again.");
						System.out.println("Congratulations! You've won the game!");
						System.out.println("Do you wish to restart? Y or N");
					}
				} else if (weaponChoice.equals("bow")){
					System.out.println("Armed with your bow and arrow, you approach the dragon. \n"
							+ "You can feel it's fiery breath as you get closer. \n");
					TharBeDragons.dragon();
					
					if (TharBeDragons.dragon() == null) {
						System.out.println("You lost the game! \n Would you like to play again? (Y/N)");
						
					} else {
						System.out.println("What do you name the dragon?");
						String dragonName = scan.nextLine();
						System.out.println("The dragon scoffs at the thought of being called " + dragonName
								+ " and flys off, never to be seen again.");
						System.out.println("Congratulations! You've won the game!");
						System.out.println("Do you wish to restart? Y or N");
					}
				} else {
				
				
					System.out.println("Wuss! You ran away from the dragon!");
					System.out.println("Do you wish to restart? Y or N");

				}
			} else {
				System.out.println("You're no fun! Game over.");
				System.out.println("Do you wish to restart? Y or N");


				}
			}
		} while (scan.nextLine().equalsIgnoreCase("yes") || scan.nextLine().equalsIgnoreCase("y"));
	}
}
