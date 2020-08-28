// this is class
class Pit{ 
    
    // this is atribute
    int cadence = 0; 
    int speed = 0;
    int gear = 1;

    void changeCadance (int newValue){
        cadence = newValue;
    }

    void changeGear (int newValue) {
        gear = newValue;
    }

    void speedUp (int increment) {
        speed = speed + increment;
    }

    void applyBrakes(int decrement) {
        speed = speed - decrement;
    }

    void printStates() {
       System.out.println("cadence:" + cadence + " speed:" + speed + " gear:" + gear);            
    }
}

class BicycleDemo {
    public static void main(String[] args){
        Pit bike1 = new Pit();
        Pit bike2 = new Pit();
        
        bike1.changeCadance(50);
        bike1.speedUp(10);
        bike1.changeGear(2);
        bike1.printStates();

        bike2.changeCadance(50);
        bike2.speedUp(10);
        bike2.changeGear(2);
        bike2.changeCadance(40);
        bike2.speedUp(10);
        bike2.changeGear(3);
        bike2.printStates();
    }
}