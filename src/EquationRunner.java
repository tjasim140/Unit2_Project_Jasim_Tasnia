import java.util.Scanner;
public class EquationRunner {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        //Takes user input of a point in (x,y) format then parses out x and y as integers
        System.out.print("Type first coordinate: ");
        String a = s.nextLine();
        String x1 = a.substring(1, a.indexOf(",")); //substring of x value
        int xx1 = Integer.parseInt(x1);
        String y1 = a.substring(a.indexOf(",")+1,a.indexOf(")"));//substring of y value
        int yy1 = Integer.parseInt(y1);

        //Takes user input of a second point in (x,y) format then parses out x2 and y2 as integers
        System.out.println("Type second coordinate: ");
        String b = s.nextLine();
        String x2 = b.substring(1, b.indexOf(","));//substring of x2 value
        int xx2 = Integer.parseInt(x2);
        String y2 = b.substring(b.indexOf(",")+1,b.indexOf(")"));//substring of y2 value
        int yy2 = Integer.parseInt(y2);

        //Creates new LinearEquation object using user input x and y values as attributes
        LinearEquation coords = new LinearEquation(xx1,yy1,xx2,yy2);

        //Prints information about the two points and the line they make using toString method
        System.out.println(coords);

        //Asks for user input for a new x-value
        System.out.println("Type new x-coordinate value: ");
        String nX = s.nextLine();
        double newX = Double.parseDouble(nX); //converts x-value to a double value from a String
        System.out.println(coords.newX(newX)); //prints result of newX() method, print new coordinate point that falls on the found line that includes the given x-value
    }
}
