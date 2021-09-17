import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class Library {
    Library(){}
    private List<Medium> listOfMedium = new ArrayList<>();

    public void add (Medium m) {
        listOfMedium.add(m);
    }
    public void remove(Medium m) throws Exception{
       if(listOfMedium.contains(m))
           listOfMedium.remove(m);
       else throw new Exception("Can't remove");
    }
    public Medium get(int i) throws Exception {
        if(i<listOfMedium.size())
            return listOfMedium.get(i);
        else throw new Exception("Can't get");
    }

}

