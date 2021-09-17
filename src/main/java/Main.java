import java.util.List;

public class Main {
    public static void main(String [] args) {
        Library myLibrary = new Library();
        Medium m1 = new Newspaper();
        try {
            m1.setName("gazeta");
            myLibrary.add(m1);
            System.out.println(myLibrary.get(0).getName());
            myLibrary.remove(m1);
            System.out.println(myLibrary.get(0).getName());
            myLibrary.remove(m1);
        }
        catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        }
    }
}
