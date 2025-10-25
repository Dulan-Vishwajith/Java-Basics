public class Motorcycle extends Vehicle {
    boolean hasSideMirror;

    public Motorcycle(String make, String model, int year, boolean hasSideMirror) {
        super(make, model, year);
        this.hasSideMirror = hasSideMirror;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Has Side Mirror: " +hasSideMirror);
    }
}
