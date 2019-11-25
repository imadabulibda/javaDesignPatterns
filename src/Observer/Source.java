package Observer;

import java.util.ArrayList;
import java.util.List;

public class Source {
    private String data;
    private List<Observer> observers = new ArrayList<Observer>();

    public String getData() {
        return data;
    }

    public void setData(String data){
        this.data = data;
        notifyAllObservers();
    }

    public void attach(Observer observer){
        observers.add(observer);
    }

    public void notifyAllObservers(){
        for (Observer observer:
             observers) {
            opserver.update();
        }
    }
}
