import java.util.Scanner;
public class EquationRunner {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Type first coordinate: ");
        String x = s.nextLine();
        int xx = Integer.parseInt(x);
        System.out.println("Type second coord: ");
        String y = s.nextLine();
        int yy = Integer.parseInt(y);
        LinearEquation coords = new LinearEquation(xx,yy,10,20);
        System.out.println(coords.slope());
    }
}
