package com.company;

public class RectangleMethod {
    public static void main(String[] args) {
        int width = 3;
        int lenght = 2;
        System.out.println(calculateCircumference(width,lenght));
        System.out.println(calculateArea(width,lenght));
}
    public static int calculateCircumference (int width, int lenght) {
        return 2 * (lenght + width);
    }
    public static int calculateArea (int width, int lenght) {
        return width * lenght;
        }

}
