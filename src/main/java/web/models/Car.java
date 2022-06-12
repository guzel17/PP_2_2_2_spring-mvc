package web.models;

public class Car {
    private String model;
    private String engine;
    private  int year;

    public Car(String model, String engine, int year) {
        this.model = model;
        this.engine = engine;
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
