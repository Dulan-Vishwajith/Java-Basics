public class Vehicle {
    String make;
    String model;
    int year;

    public Vehicle(String make,String model,int year){
        this.make=make;
        this.model=model;
        this.year=year;
    }

    public String getMake(){
        return make;
    }


    public void displayInfo(){
        System.out.println("Vehicle Info: "+make+" "+model+" ("+year+") ");
    }
}
