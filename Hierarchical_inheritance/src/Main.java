public class Main {
    public static void main(String[] args) {
        /*
        Vehicle vehicle = new Vehicle("Toyota", "Prius", 2022);

        Car car1= new Car("Honda", 2022,"fit",4);
        Car car2 = new Car("Suzuki","Wagon-r",2024,4);

        Motorcycle motorcycle = new Motorcycle("Honda", "CD-150", 2021, true);
*/
        Vehicle obj1 = new Car("Nissan","GTR",2022,2);//Each and every car is a vehicle thats why this  is work...!

        System.out.println(obj1.getMake());
        obj1.displayInfo();





        //Car obj2 = new Vehicle("Mitsubishi","Lancer",2005);//EAch an every vehicle is not a car therefore not working...!

/*
        vehicle.displayInfo();
        System.out.println();

        car1.displayInfo();
        car2.displayInfo();
        System.out.println(car1.getNumDoors());

        System.out.println();
        motorcycle.displayInfo();
        System.out.println();

        obj1.displayInfo();
*/
    }
}
