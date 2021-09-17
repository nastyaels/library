import java.util.ArrayList;
import java.util.List;

public class LibraryG<T> {
    LibraryG(){}
    private List<T> listOfT = new ArrayList<>();
    public void add(T t){
        listOfT.add(t);
    }
    public void remove(T t) throws Exception{
        if(listOfT.contains(t))
            listOfT.remove(t);
        else throw new Exception("Can't remove");
    }
    public T get(int i) throws Exception{
        if(i< listOfT.size())
            return listOfT.get(i);
        else throw new Exception("Can't get");
    }
}
