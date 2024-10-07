public class LinearEquation {
    private int x;
    private int y;
    private int x2;
    private int y2;
    private double newX;

    public LinearEquation(int x, int y, int x2, int y2,double newX){
        this.x=x;
        this.y=y;
        this.x2=x2;
        this.y2=y2;
        this.newX=newX;
    }
    public String slope(){
        if ((y2-y) % (x2-x) == 0) {
            if ((((y2-y)/(x2-x))==1)) {
                return "";
            }else {
                int result = ((y2 - y) / (x2 - x));
                    return "" + result;
            }
        } else if ((((y2-y)/(x2-x)) == -1)) {
            return "-";
        } else if (((y2-y) < 1)) {
            if ((x2-x) < 1) {
                return Math.abs(y2 - y) + "/" + Math.abs(x2 - x);
            }
            else {
                return "-" + Math.abs(y2-y) + "/" + (x2-x);
            }
        }
        else if ((x2-x) < 1) {
            return (y2-y) + "/" + Math.abs(x2-x);
        }
        else {
            return (y2-y) + "/" + (x2-x);
        }
    }
    public String distance(){
        double d = Math.sqrt(Math.pow((x2-x),2)+Math.pow((y2-y),2));
        return ""+d;
    }
    public String yInt(){
        double yint;
        double s = ((double)(y2-y)/(x2-x));
        yint = (y2-(s*x2));
        if (yint == 0){
            return "";
            }
        else{
            return "" + yint;
        }
    }
    public String newX(){
        double yint=(y2-(((double)(y2-y)/(x2-x))*x2));
        double newY = newX*(Double.parseDouble(slope())+yint);
        return "Point on Line: ("+newX+","+String.format("%.2f",newY)+")";
    }
    public String format(){
        String s = slope();
        String y = yInt();
        return (s+"x + " + y);
    }

}
