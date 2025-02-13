package com.bridgelabz.inheritance;

class Devices {
    private String deviceId;
    private String status;

    Devices(String deviceId, String status){
        this.deviceId = deviceId;
        this.status = status;
    }

    public void displayStatus(){

        System.out.println("\nCurrent Device Settings");
        System.out.println("Device Id : "+deviceId);
        System.out.println("Status : "+ status);

    }

}

class Thermostat extends Devices{
    private String temperatureSetting;

    Thermostat(String deviceId, String status, String temperatureSetting){
        super(deviceId, status);
        this.temperatureSetting = temperatureSetting;
    }

    @Override
    public void displayStatus() {
        super.displayStatus();
        System.out.println("Temperature Settings : " +temperatureSetting);
    }
}


public class SmartHomeDevices {
    public static void main(String[] args) {

        Devices thermoState = new Thermostat("TH12", "Active", "Normal");
        thermoState.displayStatus();

    }
}
