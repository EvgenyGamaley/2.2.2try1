package web.car;

import org.springframework.web.bind.annotation.RequestMapping;

public class Car {
    private int id;
    private String factory ;
    private String model;

    public Car(){
    }

    public Car(int id, String factory, String model) {
        this.id = id;
        this.factory = factory;
        this.model = model;
    }

    public int getCount() {
        return id;
    }

    public void setCount(int id) {
        this.id = id;
    }

    public String getFactory() {
        return factory;
    }

    public void setFactory(String factory) {
        this.factory = factory;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", factory='" + factory + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}



