/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package workshop5;

/**
 *
 * @author ADMIN
 */
public class FPTUniversity extends University implements Role {
    private String address;

    public FPTUniversity() {}

    public FPTUniversity(int size, String name, String address) {
        super(size, name);
        this.address = address;
    }

    @Override
    public void createWorker() {
        System.out.println("Providing human resources");
    }

    @Override
    public String toString() {
        return "FPTU has four campuses Hanoi, HCM, DaNang, CanTho, QuyNhon";
    }
}
