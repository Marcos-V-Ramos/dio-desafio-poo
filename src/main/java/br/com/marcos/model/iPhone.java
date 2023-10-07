package br.com.marcos.model;

import br.com.marcos.contract.Browser;
import br.com.marcos.contract.Mobile;
import br.com.marcos.contract.MusicPlayer;

public class iPhone implements Mobile, MusicPlayer {

    private String system;
    private String name;
    private double price;
    private boolean isOn;
    private boolean isOnCall;

    private Battery battery;
    private Browser browser;

    public iPhone() {

    }

    public iPhone(String system, String name, double price, Browser browser, Battery battery) {
        this.system = system;
        this.name = name;
        this.price = price;
        this.isOn = false;
        this.isOnCall = false;
        this.browser = browser;
        this.battery = battery;
    }

    public boolean turnOn() {
        if (isOn()) {
            System.out.println("The device is already turned on!");
            this.battery.setLevel(this.battery.getLevel() -1);
            return false;
        } else {
            System.out.println("Turning the device on...");
            setOn(true);
            this.battery.setLevel(this.battery.getLevel() -1);
            return true;
        }
    }

    public boolean turnOff() {
        if (isOn()) {
            System.out.println("Turning the device off...");
            this.battery.setLevel(this.battery.getLevel() -1);
            setOn(false);
            return true;
        } else {
            System.out.println("The device is already turned off!");
            this.battery.setLevel(this.battery.getLevel() -1);
            return false;
        }
    }

    public void faceID() {
        System.out.println("Opening face ID.");
        this.battery.setLevel(this.battery.getLevel() -1);
    }

    public void info() {
        System.out.println("iPhone { name:" + this.getName() + "}");
    }

    public void reset() {
        System.out.println("Reseting iPhone...");
        this.battery.setLevel(this.battery.getLevel() -1);
    }

    public String getSystem() {
        return system;
    }

    public void setSystem(String system) {
        this.system = system;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    private boolean isOn() {
        return isOn;
    }

    private void setOn(boolean on) {
        isOn = on;
    }

    public boolean isOnCall() {
        return isOnCall;
    }

    public void setOnCall(boolean onCall) {
        isOnCall = onCall;
    }

    public Browser getBrowser() {
        return browser;
    }

    public void setBrowser(Browser browser) {
        this.browser = browser;
    }

    @Override
    public void call(String number) {
        setOnCall(true);
        System.out.println("Calling " + number + " ...");
        this.battery.setLevel(this.battery.getLevel() -1);
    }

    @Override
    public void answer() {
        System.out.println("Answering...");
        setOnCall(true);
        this.battery.setLevel(this.battery.getLevel() -1);
    }

    @Override
    public void voiceMail() {
        System.out.println("Voice mail...");
    }

    @Override
    public void play() {
        System.out.println("Playing music...");
    }

    @Override
    public void pause() {
        System.out.println("Pausing music...");
    }

    @Override
    public void select(String music) {
        System.out.println("Music selected: " + music);
    }
}
