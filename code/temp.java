import java.util.Scanner;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
class Main {
  public static void main(String[] args) {
    try { System.out.println(Day6.partTwo());} catch(Exception e){System.out.println(e);}
  }
  public static int dayOne() throws Exception
  {
    Scanner scan = new Scanner(new File("input.txt"));
    int calories = 0;
    int currentCalories = 0;
    String line;
    while(scan.hasNext())
    {
      line = scan.nextLine();
      if(isNumeric(line))
      {
        currentCalories += Integer.parseInt(line);
      }
      else
      {
        //System.out.println(line);
        //System.out.println(currentCalories);
        if(currentCalories > calories)
        {
          calories = currentCalories;
          currentCalories = 0;
        }
      }
    }
    scan.close();
    return calories;
  }
  public static boolean isNumeric(String strNum)   {
    if (strNum == null) {
        return false;
    }
    try {
        double d = Double.parseDouble(strNum);
    } catch (NumberFormatException nfe) {
        return false;
    }
    return true;
  }
}