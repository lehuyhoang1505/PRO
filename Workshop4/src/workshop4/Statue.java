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

public class Statue extends Item {
    private int weight;
    private String colour;

    public Statue() {
        super();
    }

    public Statue(int value, String creator, int weight, String colour) {
        super(value, creator);
        this.weight = weight;
        this.colour = colour;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void inputStatue() {
        super.input();
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter weight: ");
            weight = Integer.parseInt(sc.nextLine());
            System.out.print("Enter colour: ");
            colour = sc.nextLine();
        } catch (Exception e) {
            System.out.println("Invalid input: " + e.getMessage());
        }
    }

    public void outputStatue() {
        super.output();
        System.out.println("Weight: " + weight);
        System.out.println("Colour: " + colour);
    }
}
