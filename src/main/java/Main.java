import java.util.List;

public class Main {
    public static void main(String [] args) {
//        Library myLibrary = new Library();//without generics
        LibraryG<Medium> myLibrary= new LibraryG<Medium>();//using generics
        Medium m1 = new Newspaper("gospodi");
        Medium m2 = new Book("bozhe");
        try {
            myLibrary.add(m1);
            myLibrary.add(m2);
            System.out.println(myLibrary.get(0).getName());
            System.out.println(myLibrary.get(1).getName());
            myLibrary.remove(m1);
            myLibrary.remove(m2);
            System.out.println(myLibrary.get(0).getName());
        }
        catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
