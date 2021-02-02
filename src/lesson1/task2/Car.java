package lesson1.task2;



abstract class Car {
    private Engine engine;
    public String color;
    public String name;


    public void moveable() {
        System.out.println("mov e");;
    }

    public void stopable() {
        System.out.println("stop");
    }


    protected void start() {
        System.out.println("Car starting");
    }

    public void open(){
        System.out.println("open door");
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

 class LightWeightCar extends Car{
     @Override
     public void moveable() {
         super.moveable();
     }

     @Override
     protected void start() {
         super.start();
     }

     @Override
     public void open() {
         super.open();
     }

     @Override
     public void stopable() {
         super.stopable();
     }
 }

 class Lorry extends Car{

     @Override
     public void moveable() {
         super.moveable();
     }

     @Override
     protected void start() {
         super.start();
     }

     @Override
     public void open() {
         super.open();
     }

     @Override
     public void stopable() {
         super.stopable();
     }
 }
