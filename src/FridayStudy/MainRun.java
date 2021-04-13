package src.FridayStudy;

public class MainRun {
    public static void main(String[] args) {

        Tuna t1 = new Tuna();
        Tuna t2 = new Tuna(4);
        Tuna t3 = new Tuna(5, 4);
        Tuna t4 = new Tuna(7, 8, 9);
        Tuna t5 = new Tuna(0, 5, 0);

        System.out.println(t1.printTuna());
        System.out.println(t2.printTuna());
        System.out.println(t3.printTuna());
        System.out.println(t4.printTuna());
        System.out.println(t5.printTuna());


    }//End main
}//End class
