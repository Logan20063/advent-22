import java.util.Scanner;
import java.io.File;
class Day2_2 {
  public static int dayTwo() throws Exception
  {
    Scanner scan = new Scanner(new File("code/day2/day2input.txt"));
    int total = 0;
    while(scan.hasNext())
    {
      String line = scan.nextLine();
      String[] arr = line.split(" ");
      String hand, oppHand;
      if(arr[0].equals("A"))
      {
        oppHand = "rock";
        if(arr[1].equals("X"))
        {
          hand = "scissors";
          total += 3;
        }
        else if(arr[1].equals("Y"))
        {
          hand = "rock";
          total += 1;
        }
        else
        {
          hand = "paper";
          total += 2;
        }
      }
      else if(arr[0].equals("B"))
      {
        oppHand = "paper";
        if(arr[1].equals("X"))
        {
          hand = "rock";
          total += 1;
        }
        else if(arr[1].equals("Y"))
        {
          hand = "paper";
          total += 2;
        }
        else
        {
          hand = "scissors";
          total += 3;
        }
      }
      else
      {
        oppHand = "scissors";
        if(arr[1].equals("X"))
        {
          hand = "paper";
          total += 2;
        }
        else if(arr[1].equals("Y"))
        {
          hand = "scissors";
          total += 3;
        }
        else
        {
          hand = "rock";
          total += 1;
        }
      }
      total += rpsWin(oppHand, hand);
    }
    return total;
  }

  public static int rpsWin(String oppHand, String hand) {
    if(oppHand.equals(hand))
      return 3;
    if(hand.equals("rock") && oppHand.equals("paper") || hand.equals("paper") && oppHand.equals("scissors") || hand.equals("scissors") && oppHand.equals("rock"))
      return 0;
    else
      return 6;
  }
}