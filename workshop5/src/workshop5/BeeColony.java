/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package workshop5;

/**
 *
 * @author ADMIN
 */
public class BeeColony extends Colony implements Role {
    private String type;

    public BeeColony() {}

    public BeeColony(int size, String type, String place) {
        super(size, place);
        this.type = type;
    }

    @Override
    public void createWorker() {
        System.out.println("Worker bees perform all the work of the bees");
    }

    @Override
    public String toString() {
        return "the colony's type is " + type + ", size is about " + getSize() + ", and the place is " + super.toString();
    }
}