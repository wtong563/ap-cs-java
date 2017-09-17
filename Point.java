public class Point {
    int x;
    int y;

    Point(int x1, int y1){
        x = x1;
        y = y1;
    }

    int getX() {
        return x;
    }

    int getY() {
        return y;
    }

    void setX(int newx){
        x = newx;
    }

    public static void main (String arg[]){
        Point p1 = new Point(1,2);
        Point p2 = new Point (3, 4);

        System.out.println(p1.x);
        System.out.println(p1.getX());
        p1.setX(10);

    }

}
