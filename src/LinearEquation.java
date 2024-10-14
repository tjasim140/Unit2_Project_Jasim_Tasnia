public class LinearEquation {
    private int x;
    private int y;
    private int x2;
    private int y2;

    //Constructor that creates a new Linear Equation object with x,x2,y, and y2 values
    public LinearEquation(int x, int y, int x2, int y2){
        this.x=x;
        this.y=y;
        this.x2=x2;
        this.y2=y2;
    }
    //Calculates and formats slope based on coordinate points, can be negative/positive, integer/fraction slopes
    public String slope() {
        //if whole # slope returns slope as an integer
        if ((y2 - y) % (x2 - x) == 0) {
            //returns blank string so when the equation is printed, it prints x and not 1x
            if ((((y2 - y) / (x2 - x)) == 1)) {
                return "";
            } else {
                int result = ((y2 - y) / (x2 - x));
                return "" + result;
            }
        }
        else {
            //if slope is negative
            if ((((double)y2 - y) / (x2 - x) < 0)) {
                //formats slope so that slope is printed as -x not -1x if slope = -1
                if (((((double)y2 - y) / (x2 - x)) == -1)) {
                    return "-";
                }
                //formats slope so that it is returned as -y/x and not y/-x if slope is negative and is a fraction
                else if ((((double)x2 - x) < 1) && ((y2 - y) < 1)) {
                    return Math.abs(y2 - y) + "/" + Math.abs(x2 - x);
                } else if (((double)x2 - x) < 1) {
                    return "-" + (y2 - y) + "/" + Math.abs(x2 - x);
                } else {
                    return  "-"+ Math.abs(y2 - y) + "/" + (x2 - x);
                }
            } else {
                return ""+(y2 - y) + "/" + (x2 - x);
            }
        }

    }
    //Returns distance between two given points using distance formula
    public String distance(){
        double d = Math.sqrt(Math.pow((x2-x),2)+Math.pow((y2-y),2));
        return String.format("%.2f",d);
    }
    //returns y-int of the line
    public String yInt(){
        double yint;
        double s = ((double)(y2-y)/(x2-x));
        yint = (y2-(s*x2));
        if (yint == 0){
            return "0";
            }
        //rounds y-int to the nearest hundredth
        else{
            return String.format("%.2f",yint);
        }
    }
    //Finds point in line using given x-coord to solve for y, then returns point in format (x,y) rounded to the nearest hundredth as a printable string
    public String newX(double nX){
        double yint=(y2-(((double)(y2-y)/(x2-x))*x2));
        double newY = nX*((double)(y2-y)/(x2-x))+yint; //solves for y given x
        return "Point on Line: ("+nX+","+String.format("%.2f",newY)+")";
    }
    //Formats relevant information of the object as a printable string
    public String toString(){
        String s = slope();
        String yI = yInt();
        String str;
        //leaves out + or minus sign so no y-int is printed when y-int = 0
        if (yI.contains("0")) {
            str = s + "x";
        }
        //leaves out - sign if y-int is negative so +-y-int is not printed when formating equation
        else {
            if (yI.contains("-")) {
                str = s + "x" + yI;
        //Adds + so y-int is correctly printed in y=mx+b form
            } else {
                str = s + "x+" + yI;
            }
        }
        return "First Point: (" + x + ","+ y +")\nSecond Point: ("+x2+","+y2+")\nSlope: "+s+"\nY-intercept: "+yI+"\nDistance Between Points: "+distance()+"\nEquation of Line: "+str;
    }

}
