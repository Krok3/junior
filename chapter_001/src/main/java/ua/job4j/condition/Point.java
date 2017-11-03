package ua.job4j.condition;

/**
 * Class Класс для определения положения точки относительно прямой.
 * @author vfrundin
 * @since 03.11.2017
 * @version 1.0
 */
public class Point {
    private int x;
    private int y;

    /**
     * Method the constructor of the class Point.
     * @param x 1st coordinate.
     * @param y 2nd coordinate.
     */
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Method getX.
     * @return int this.x.
     */
    public int getX() {
        return this.x;
    }

    /**
     * Method getY.
     * @return int this.y.
     */
    public int getY() {
        return this.y;
    }

    /**
     * Method is.
     * @param a 1st coefficient in the equation of the straight line.
     * @param b 2nd coefficient in the equation of the straight line.
     * @return boolean result of compare of two y- coordinates.
     */
    public boolean is(int a, int b) {
        int y = a * getX() + b;
        return (y == getY()); // используя координаты точки и вычисления функции.
    }
}