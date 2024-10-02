public class LinearEquation {
    private int x;
    private int y;
    private int x2;
    private int y2;
    private double newX;

    public LinearEquation(int x, int y, int x2, int y2){
        this.x=x;
        this.y=y;
        this.x2=x2;
        this.y2=y2;
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
}
