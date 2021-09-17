import java.util.ArrayList;
import java.util.List;

public class LibraryG<T> {
    LibraryG(){}
    private List<T> listOfLibraryG = new ArrayList<>();
    public void add(T t){
        listOfLibraryG.add(t);
    }
    public void remove(T t) throws Exception{
        if(listOfLibraryG.contains(t))
            listOfLibraryG.remove(t);
        else throw new Exception("Can't remove");
    }
    public T get(int i) throws Exception{
        try{
            return listOfLibraryG.get(i);
        }
        catch(Exception ex){
            throw new Exception("Can't get");
        }
    }
}
