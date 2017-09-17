public class Circle {
    Point center;
    int radius;

    Circle(Point c, int r) {
        center = c;
        radius = r;
    }

    Point getCenter() {
        return center;
    }

    int getRadius() {
        return radius;
    }

    void setCenter(Point c){
        center = c;
    }

    void setRadius(int r) {
        radius = r;
    }

    public static void main(String argv[]) {
        Point c1 = new Point(0, 0);
        Circle circle1 = new Circle(c1, 5);

        Point c2 = new Point(3, 2);
        Circle circle2 = new Circle(c2, 4);

        int r1 = circle1.getRadius();
        int r2 = circle2.getRadius();

        if (r1 * r1 > r2 * r2) {
            System.out.println("circle1 is bigger");
        }
        else if (r1 * r1 < r2 * r2) {
            System.out.println("circle2 is bigger");
        }
        else {
            System.out.println("the circles have the same area");
        }

        System.out.println("-----------------------------------");

        System.out.println("circle2's center before moving is: " + "(" + circle2.getCenter().getX() + "," + circle2.getCenter().getY() + ")");

        circle2.setCenter(c1);

        System.out.println("circle2's center after moving is: " + "(" + circle2.getCenter().getX() + "," + circle2.getCenter().getY() + ")");
    }

}

