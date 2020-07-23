
public class Car {
   private String plateNo;
   private String color;
   private int year;
   private CarType type;
    
    public Car(String plateNo, String color, int year, CarType type) {
        this.plateNo = plateNo;
        this.color = color;
        this.year = year;
        this.type = type;
    }
   
   public String toString(){
       return String.format("%-8s %-10s %-8d %s", plateNo, color, year, type.toString());
   }
}
