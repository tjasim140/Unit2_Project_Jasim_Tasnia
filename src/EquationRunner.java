import java.util.Scanner;
public class EquationRunner {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Type first coordinate: ");
        String x = s.nextLine();
        String x1 = x.substring(1,x.indexOf(","));
        int xx1 = Integer.parseInt(x1);
        String y1 = x.substring(x.indexOf(",")+1,x.indexOf(")"));
        int yy1 = Integer.parseInt(y1);
        System.out.println("Type second coordinate: ");
        String y = s.nextLine();
        String x2 = y.substring(1,x.indexOf(","));
        int xx2 = Integer.parseInt(x2);
        String y2 = y.substring(y.indexOf(",")+1,y.indexOf(")"));
        int yy2 = Integer.parseInt(y2);
        System.out.println("Type new x-coordinate value: ");
        String nX = s.nextLine();
        double newX = Double.parseDouble(nX);
        LinearEquation coords = new LinearEquation(xx1,yy1,xx2,yy2,newX);
//        System.out.println(coords.slope());
//        System.out.println(coords.yInt());
//        System.out.println(coords.distance());
//        System.out.println(coords.newX());
//        System.out.println(coords.format());
        System.out.println(coords.format());
    }
}
