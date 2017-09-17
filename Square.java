public class Square {
    Point upperLeft;
    int sideLen;

    Square(Point upperLeft, int s){
        this.upperLeft = upperLeft;
        sideLen = s;
    }

    Point getStartingPoint(){
        return upperLeft;
    }

    int getSideLen(){
        return sideLen;
    }

    int getArea() { return sideLen * sideLen; }

    void printAllVertices() {
        System.out.println("(" + upperLeft.getX() + "," + upperLeft.getY() + ")");
        System.out.println("(" + (upperLeft.getX() + sideLen)  + "," + upperLeft.getY() + ")");
        System.out.println("(" + (upperLeft.getX() + sideLen) + "," + (upperLeft.getY() - sideLen) + ")");
        System.out.println("(" + upperLeft.getX() + "," + (upperLeft.getY() - sideLen) + ")");
        System.out.println("-----------------------------------");
    }

    void setStartingPoint(Point p){
        upperLeft = p;
    }

    void setSideLen(int s){
        sideLen = s;
    }

    public static void main(String argv[]) {

        Point p1 = new Point(1, 2);
        Square square1 = new Square(p1, 3);

        Point p2 = new Point(5, 6);
        Square square2 = new Square(p2, 7);

        System.out.println("the vertices of square1 are: ");
        square1.printAllVertices();

        System.out.println("the vertices of square2 are: ");
        square2.printAllVertices();

        int area1 = square1.getArea();
        int area2 = square2.getArea();

        System.out.println("area of square1 is: " + area1);
        System.out.println("area of square2 is: " + area2);
        System.out.println("-----------------------------------");

        if (area1 > area2)
        {
            System.out.println("square1 is bigger");
        }else if (area1 < area2) {
            System.out.println(("square2 is bigger"));
        }
        else {
            System.out.println("square1 and square2 are equal in area");
        }
    }


}
