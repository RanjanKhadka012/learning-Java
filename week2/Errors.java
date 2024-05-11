package week2;

public class Errors {
    public static void main(String[] args) {
        try{
            Car c = new Car();
        String carBrand = c.getBrand();
        if(carBrand.length()<=0){
            System.out.println("Car brand not set up");
        } else {
            System.out.println("Car brand is already set");
        }
        } catch(Exception e){
            System.out.println("the brand value hasnt been defined");
        }
        
    }
}
