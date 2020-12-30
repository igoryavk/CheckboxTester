package CheckboxTester;

import java.util.ArrayList;
import java.util.List;

public class Order {
    public List<Roll> getRollList() {
        return rollList;
    }

    public void setRollList(List<Roll> rollList) {
        this.rollList = rollList;
    }

    List<Roll> rollList;

    Order(){
       rollList=new ArrayList<>();
    }
}
