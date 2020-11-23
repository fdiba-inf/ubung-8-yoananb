package exercise8;

public class Point {
    public double x;
    public double y;

    public Point() {
        this.x=0;
        this.y=0;
    }

    public Point(double x, double y) {
        this.x=x;
        this.y=y;
    }

    public Point(Point otherPoint) {
       this.x=otherPoint.x;
       this.y=otherPoint.y;
    }

    public void initialize() {
      System.out.println("Input values for point");
      System.out.println("X: ");
      this.x = Utils.INPUT.nextDouble();
       System.out.println("Y: ");
       this.y = Utils.INPUT.nextDouble();

    }

    public void translate(double xDelta, double yDelta) {
       this.x+=xDelta;
       this.y+=yDelta;
    }

    public Point createNewTranslatedPoint(double xDelta, double yDelta) {
       return new Point(this.x + xDelta, this.y + yDelta);
        
    }

    public boolean equals(Point otherPoint) {
    if(Utils.equals(this.x, otherPoint.x) && Utils.equals(this.y,otherPoint.y)){
            return true;
    }
            return false;
    }

    public String toString() {
      return String.format("(%.1f,%.1f)",this.x,this.y);
        
    }
}