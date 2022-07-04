class Lamp {
    boolean isOn; // stores the value for light
    int wattValue; 

    // method to turn on the light
    void turnOn() {
    isOn = true;
    System.out.println("Light on? " + isOn);
    }

    // method to turnoff the light
    void turnOff() {
    isOn = false;
    System.out.println("Light on? " + isOn);
    }
}

class Main {
    public static void main(String[] args) {
    // create objects led and halogen
    Lamp led = new Lamp();
    Lamp halogen = new Lamp();
    led.turnOn(); // turn off the light by
    halogen.turnOff(); // calling method turnOff()
    }
}
