import java.util.Scanner;

public class rockpaperscissors 
{
	private static Scanner scan;
	
	public static void main (String[] args)
	{
		String oneInput = getValidPlay(1);
		String twoInput = getValidPlay(2);
		scan.close();
		System.out.println(determineWinner(oneInput, twoInput));
	}
	
	/**
	 * Continues to scann for input until valid String is inputed.
	 * @param player number associated with player's identity.
	 * @return valid String input
	 */
	public static String getValidPlay(int player)
	{
		scan = new Scanner(System.in);
		String validPlay = "";
		while (!(validPlay.equals("scissors") || validPlay.equals("paper") || validPlay.equals("rock")))
		{
			System.out.println("Player " + player + ", enter rock, paper, or scissors.");
			validPlay = scan.nextLine().toLowerCase();
		}
		return validPlay;
	}
	
	/**
	 * Given two (valid) Strings, determines winner.
	 * Winner is calculated according to rules of rock, paper, scissors.
	 * If 'one' wins, "Player 1 wins!"
	 * If 'two' wins, "Player 2 wins!"
	 * @param one first valid String to be considered.
	 * @param two second valid String to be considered.
	 * @return String with winner's message.
	 */
	public static String determineWinner(String one, String two)
	{
		String winner = "";
		if (one.equals(two))
		{
			winner = "It is a tie!";
		}
		else
		{
			switch (one)
			{
				case "rock":
					if (two.equals("paper"))
						winner = "Player 2 wins!";
					else	//rock beats scissors
						winner = "Player 1 wins!";
					break;
				case "paper":
					if (two.equals("rock"))
						winner = "Player 1 wins!";
					else	//scissors beats paper
						winner = "Player 2 wins!";
					break;
				case "scissors":
					if (two.equals("paper"))
						winner = "Player 1 wins!";
					else	//rock beats scissors
						winner = "Player 2 wins!";
					break;
			}
		}
		return winner;
	}
}
