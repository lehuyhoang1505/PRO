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

public class Item {
    protected int value;
    protected String creator;

    public Item() {}

    public Item(int value, String creator) {
        this.value = value;
        this.creator = creator;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter value (>0): ");
            value = Integer.parseInt(sc.nextLine());
            if (value <= 0) {
                System.out.println("Value must be greater than 0!");
            }
        } while (value <= 0);
        do {
            System.out.print("Enter creator (not empty): ");
            creator = sc.nextLine();
            if (creator.trim().isEmpty()) {
                System.out.println("Creator cannot be empty!");
            }
        } while (creator.trim().isEmpty());
    }

    public void output() {
        System.out.println("Value: " + value);
        System.out.println("Creator: " + creator);
    }
}