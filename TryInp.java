import java.util.Scanner;
public class TryInp{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int j = sc.nextInt();
    sc.nextLine();
    String name = sc.nextLine();
    System.out.println(name);
    for(int i=0; i<name.length();i++){
      System.out.println(name.charAt(i));
    }
  }
}
