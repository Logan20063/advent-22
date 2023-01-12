import java.util.Scanner;
import java.io.File;
class Day4_2 {
  public static int dayFour() throws Exception
  {
    Scanner scan = new Scanner(new File("code/day4/day4input.txt"));
    int enclosed = 0;
    while(scan.hasNext())
    {
      String line = scan.nextLine();
      int lowOne = Integer.parseInt(line.substring(0, line.indexOf("-")));
      line = line.substring(line.indexOf("-") + 1);
      int highOne = Integer.parseInt(line.substring(0, line.indexOf(",")));
      line = line.substring(line.indexOf(",") + 1);
      int lowTwo = Integer.parseInt(line.substring(0, line.indexOf("-")));
      line = line.substring(line.indexOf("-") + 1);
      int highTwo = Integer.parseInt(line);
      //if(lowOne >= lowTwo && highOne <= highTwo || lowOne <= lowTwo && highOne >= highTwo)
      if(lowOne <= lowTwo && highOne >= lowTwo || lowTwo <= lowOne && highTwo >= lowOne || lowOne <= highTwo && highOne >= highTwo || lowTwo <= highOne && highTwo >= highOne)
      {
        enclosed++;
      }
    }
    return enclosed;
  }
}