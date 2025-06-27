/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package workshop4;

/**
 *
 * @author ADMIN
 */
import java.util.Scanner;

public class Painting extends Item {
    private int height;
    private int width;
    private boolean isWatercolour;
    private boolean isFramed;

    public Painting() {
        super();
    }

    public Painting(int value, String creator, int height, int width, boolean isWatercolour, boolean isFramed) {
        super(value, creator);
        this.height = height;
        this.width = width;
        this.isWatercolour = isWatercolour;
        this.isFramed = isFramed;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public boolean isWatercolour() {
        return isWatercolour;
    }

    public void setWatercolour(boolean isWatercolour) {
        this.isWatercolour = isWatercolour;
    }

    public boolean isFramed() {
        return isFramed;
    }

    public void setFramed(boolean isFramed) {
        this.isFramed = isFramed;
    }

    public void inputPainting() {
        super.input();
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter height: ");
            height = Integer.parseInt(sc.nextLine());
            System.out.print("Enter width: ");
            width = Integer.parseInt(sc.nextLine());
            System.out.print("Is Watercolour (true/false): ");
            isWatercolour = Boolean.parseBoolean(sc.nextLine());
            System.out.print("Is Framed (true/false): ");
            isFramed = Boolean.parseBoolean(sc.nextLine());
        } catch (Exception e) {
            System.out.println("Invalid input: " + e.getMessage());
        }
    }

    public void outputPainting() {
        super.output();
        System.out.println("Height: " + height);
        System.out.println("Width: " + width);
        System.out.println("Is Watercolour: " + isWatercolour);
        System.out.println("Is Framed: " + isFramed);
    }
}
