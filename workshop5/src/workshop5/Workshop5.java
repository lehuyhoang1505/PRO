/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package workshop5;

/**
 *
 * @author ADMIN
 */
public class Workshop5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Colony obj1 = new BeeColony(2000, "honey", "land");
        System.out.println(obj1);
        obj1.grow();
        obj1.reproduce();

        University obj2 = new FPTUniversity(100000, "FPT", "CanTho");
        System.out.println(obj2);
        obj2.enroll();
        obj2.educate();

        Role df = new BeeColony(3000, "wasp", "land");
        System.out.println(df);
        df.createWorker();

        df = new FPTUniversity(100000, "FPT", "Hanoi");
        System.out.println(df);
        df.createWorker();
    }
}
