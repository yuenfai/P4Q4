
public class Registration {
    private static int count = 1001;
    
    private int regNo;
    private Owner owner;
    private Car car;

    public Registration(Owner owner, Car car) {
        this.regNo = count;
        this.owner = owner;
        this.car = car;
        
        count++;
    }

    public static int getCount() {
        return count;
    }

    public String toString(){
        return String.format("%-5d %s %s", regNo, owner.toString(), car.toString());
    }
}
