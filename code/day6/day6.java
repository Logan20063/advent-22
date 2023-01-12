import java.util.Scanner;
import java.io.File;
class Day6{
  public static int partOne() throws Exception {
    Scanner scan = new Scanner(new File("code/day6/day6input.txt"));
    String str = scan.next();
    for(int i=3; i<str.length(); i++) {
      if(str.charAt(i-3) != str.charAt(i-2) &&str.charAt(i-3) != str.charAt(i-1) &&str.charAt(i-3) != str.charAt(i) &&str.charAt(i-2) != str.charAt(i-1) && str.charAt(i-2) != str.charAt(i) &&str.charAt(i-1) != str.charAt(i)) {
        return i+1;
      }
    }
    return -1;
  }

  public static int partTwo() throws Exception {
    Scanner scan = new Scanner(new File("code/day6/day6input.txt"));
    String str = scan.next();
    for(int i=13; i<str.length(); i++) {
      boolean same = false;
      for(int j=i-13; j<=i; j++) {
        for(int k=j+1; k<=i; k++) {
          if(str.charAt(j) == str.charAt(k)) {
            same = true;
          }
        }
      }
      if(!same) {
          return i+1;
        }
    }
    return -1;
  }
}