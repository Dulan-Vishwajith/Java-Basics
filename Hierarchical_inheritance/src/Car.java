public class Car extends Vehicle {
    int numDoors;

    public  Car(String make,String model,int year,int numDoors){
        super(make,model,year);
        this.numDoors=numDoors;
    }

    public Car(String make,int year,String model,int numDoors){
        super(make, model, year);
        this.numDoors=numDoors;
    }
    public int getNumDoors(){
        return numDoors;
    }

    public void displayInfo(){
        super.displayInfo();
        System.out.println("Number of Doors: "+numDoors);
    }
}
