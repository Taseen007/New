public class Room {
    Light light;
    Thermostat thermostat;
    Speaker speaker;
    Room(){
        light= new Light();
        thermostat=new Thermostat();
        speaker= new Speaker();
    }


}