package src.Library;

public class KidUsers implements LibraryUser {
    int age;
    String bookType;

    public KidUsers(int age, String bookType) {
        this.age = age;
        this.bookType = bookType;
    }

    @Override
    public void registerAccount() {
        if(age < 12) {
            System.out.println("You have successfully registered under a Kids Account.");
        }//End if
        else {
            System.out.println("Sorry, you must be 12 or younger to register as a Kid.");
        }//End else
    }//End registerAccount

    @Override
    public void requestBook() {
        if(bookType.equals("Kids")) {
            System.out.println("Book issued successfully, please return the book within 10 days.");
        }//End if
        else {
            System.out.println("Oops, you are only allowed to borrow Kids books.");
        }//End else
    }//End requestBook

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBookType() {
        return bookType;
    }

    public void setBookType(String bookType) {
        this.bookType = bookType;
    }
}//End class
