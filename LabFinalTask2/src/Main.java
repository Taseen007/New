public class Main {
    public static void main(String[] args) {
        LivingRoom L1= new LivingRoom();
        Bedroom B1 = new Bedroom();
        GuestRoom G1 = new GuestRoom();

        B1.light.setStatus("OFF");
        L1.light.setStatus("ON");
        G1.light.setStatus("OFF");

        B1.thermostat.setTemperature(20);
        L1.thermostat.setTemperature(25);
        G1.thermostat.setTemperature(18);

        B1.speaker.message = "Welcome to your place of comfort!";
        L1.speaker.message = "Hope you had a great day!";
        G1.speaker.message = "Enjoy your stay!";

        System.out.println(L1.light.Status);
        System.out.println(L1.thermostat.getTemperature());
        System.out.println(L1.speaker.message);

        System.out.println(B1.light.Status);
        System.out.println(B1.thermostat.getTemperature());
        System.out.println(B1.speaker.message);

        System.out.println(G1.light.Status);
        System.out.println(G1.thermostat.getTemperature());
        System.out.println(G1.speaker.message);

    }
}
