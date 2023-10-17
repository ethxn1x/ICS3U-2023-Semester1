public class carSimulation {
    
    public static void main(String[] args){



        Car carDetails = new Car("Lamborghini", "Huracan", 2018, 2700);
        Car astonMartin = new Car("Aston Martin", "DB 12", 2015,1000);
        astonMartin.printCarInfo();
        carDetails.drive(120.8);


    }
}

