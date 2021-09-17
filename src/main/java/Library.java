import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class Library {
    Library(){}
    private List<Medium> listOfMedium = new ArrayList<>();

    public void add (Medium m)
    {
        listOfMedium.add(m);
    }
    public void remove(Medium m) throws Exception{
        try{
            listOfMedium.remove(m);
        }
        catch(Exception ex)
        {
            throw new Exception("Can't remove");
        }
    }
    public Medium get(int i) throws Exception
    {
        try{
            return listOfMedium.get(i);
        }
        catch(Exception ex) {
            throw new Exception("Can't get");
        }
    }

}

