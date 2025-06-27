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

public class Vase extends Item {
    private int height;
    private String material;

    public Vase() {
        super();
    }

    public Vase(int value, String creator, int height, String material) {
        super(value, creator);
        this.height = height;
        this.material = material;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void inputVase() {
        super.input();
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter height: ");
            height = Integer.parseInt(sc.nextLine());
            System.out.print("Enter material: ");
            material = sc.nextLine();
        } catch (Exception e) {
            System.out.println("Invalid input: " + e.getMessage());
        }
    }

    public void outputVase() {
        super.output();
        System.out.println("Height: " + height);
        System.out.println("Material: " + material);
    }
}
