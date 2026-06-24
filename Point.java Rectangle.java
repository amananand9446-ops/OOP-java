public class Point {
    // write the code of point class here
    int x;
    int y;
    
}

public class Rectangle {
    // write the code of rectangle class here
    Point topLeft;
    int height;
    int width;

    int getArea(){
        return height*width;
    }
    int getPerimeter(){
        return 2*(height+width);
    }
    Point getBottomRight(){
        Point bottomRight=new Point();
        bottomRight.x=topLeft.x + width;
        bottomRight.y=topLeft.y - height;
        return bottomRight;
    }
}
