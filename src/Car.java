public class Car {
    String brand;
    String model;
    int year;
    Enginethis enginethis;

    public void displayInfo(){
        System.out.println(year+" "+brand+" "+model);
        enginethis.showPower();
    }

}
