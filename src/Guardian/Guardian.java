package Guardian;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Guardian<T> {
    private List<T> accepted;
    private Map<T, String> rejecteds;

    public Guardian() {
        this.accepted = new ArrayList<>();
        this.rejecteds = new HashMap<>();
    }

    public boolean accept(T subject, int age){
        if(age >= 18){
            accepted.add(subject);
            return true;
        }else {
            rejecteds.put(subject, "His age is less than 18");
            return false;
        }
    }

    public boolean accept(T subject, boolean informal){
        if(!informal){
            accepted.add(subject);
            return true;
        }else {
            rejecteds.put(subject, "Is informal");
            return false;
        }
    }

    public boolean accept(T subject, boolean informal, boolean homeless){
        if(!informal && !homeless){
            accepted.add(subject);
            return true;
        }else {
            rejecteds.put(subject, "Is homeless");
            return false;
        }
    }

    public List<T> acceptedHistory(){
        return accepted;
    }

    public Map<T, String> rejectedsHistory(){
        return rejecteds;
    }
}
