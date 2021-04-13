package src.Library;

public class LibraryInterfaceDemo {

    public static void main(String[] args) {
        KidUsers kid1 = new KidUsers(10, "Kids");
        KidUsers kid2 = new KidUsers(18, "Fiction");
        AdultUser ad1 = new AdultUser(5, "Kids");
        AdultUser ad2 = new AdultUser(23, "Fiction");

        kid1.registerAccount();
        kid1.requestBook();
        kid2.registerAccount();
        kid2.requestBook();

        ad1.registerAccount();
        ad1.requestBook();
        ad2.registerAccount();
        ad2.requestBook();



    }//End main
}//End class
