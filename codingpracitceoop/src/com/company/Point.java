package com.company;

public class Point {
    private int x;
    private int y;

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    public double distance()
    {
        return distance(0,0);
    }
    public double distance(int x,int y)
    {
        double xA =x;
        double yA =y;
        double xB =this.x;
        double yB =this.y;

        return Math.sqrt((xB-xA)*(xB-xA)+(yB-yA)*(yB-yA));
    }
    public double distance(Point point)
    {
        double xA =point.getX();
        double yA =point.getY();
        double xB =this.x;
        double yB =this.y;

        return Math.sqrt((xB-xA)*(xB-xA)+(yB-yA)*(yB-yA));
    }
}
