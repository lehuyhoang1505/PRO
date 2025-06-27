/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package workshop4;

/**
 *
 * @author ADMIN
 */
import workshop4.*;
import java.util.Scanner;

public class AntiqueShop {
    public static void main(String[] args) {
        Item item = null;
        int choice = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("1. Create a Vase:");
            System.out.println("2. Create a Statue:");
            System.out.println("3. Create a Painting:");
            System.out.println("4. Display the Item:");
            System.out.print("Input a choice: ");
            choice = Integer.parseInt(sc.nextLine());
            switch(choice) {
                case 1:
                    item = new Vase();
                    ((Vase)item).inputVase();
                    break;
                case 2:
                    item = new Statue();
                    ((Statue)item).inputStatue();
                    break;
                case 3:
                    item = new Painting();
                    ((Painting)item).inputPainting();
                    break;
                case 4:
                    if (item == null) {
                        System.out.println("You need to create an object!");
                    } else if (item instanceof Vase) {
                        ((Vase)item).outputVase();
                    } else if (item instanceof Statue) {
                        ((Statue)item).outputStatue();
                    } else if (item instanceof Painting) {
                        ((Painting)item).outputPainting();
                    }
                    break;
            }
        } while (choice <= 4);
    }
}
