import java.util.Scanner;
import java.io.File;
class Day10{
  public static int partOne() throws Exception {
    Scanner scan = new Scanner(new File("code/day10/day10input.txt"));
    int register = 1;
    int cycles = 0;
    int total = 0;
    while(scan.hasNext()) {
      String line = scan.nextLine();
      if(line.equals("noop")) {
        cycles++;
        if((cycles - 20) % 40 == 0) {
          total += cycles * register;
        }
      } else {
        cycles ++;
        if((cycles - 20) % 40 == 0) {
          total += cycles * register;
        }
        if((cycles - 19) % 40 == 0) {
          total += (cycles + 1) * register;
        } 
        register += Integer.parseInt(line.substring(5));
        cycles++;
      }
    }
    return total;
  }
   public static void partTwo() throws Exception {
     Scanner scan = new Scanner(new File("code/day10/day10input.txt"));
    int register = 1;
    int cycles = 0;
    while(scan.hasNext()) {
      String line = scan.nextLine();
      if(line.equals("noop")) {
        if(cycles % 40 >= register - 1 && cycles % 40 <= register + 1) {
          System.out.print("#");
        } else {
          System.out.print(".");
        }
        if(cycles % 40 == 39) {
          System.out.println();
        }
        cycles++;
      } else {
        if(cycles % 40 >= register - 1 && cycles % 40 <= register + 1) {
          System.out.print("#");
        } else {
          System.out.print(".");
        }
        if(cycles % 40 == 39) {
          System.out.println();
        }
        cycles++;
        if(cycles % 40 >= register - 1 && cycles % 40 <= register + 1) {
          System.out.print("#");
        } else {
          System.out.print(".");
        }
        if(cycles % 40 == 39) {
          System.out.println();
        }
        cycles ++;
        register += Integer.parseInt(line.substring(5));
      }
    }
   }
}