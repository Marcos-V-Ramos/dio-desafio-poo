package br.com.marcos;

import br.com.marcos.model.Battery;
import br.com.marcos.model.FireFoxBrowser;
import br.com.marcos.model.iPhone;

public class Main {

    public static void main(String[] args) {

        iPhone iphone = new iPhone("IOS 14", "IPhone 11", 1222.2, new FireFoxBrowser("17.3"), new Battery());

        iphone.turnOn();
        iphone.call("11960826242");
        iphone.answer();
        iphone.play();
        iphone.select("The Less I Know the Better");
        iphone.pause();
        iphone.turnOff();
        iphone.turnOn();
    }
}
