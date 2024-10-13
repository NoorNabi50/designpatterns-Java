package Classes;

import Interfaces.Computer;

public class Laptop implements Computer {

    @Override
    public String getconfiguration() {
        return "Laptop Configuration: 8GB RAM, 256GB SSD, Intel i3 Processor";
    }

    public String getTitle() {
        return "HP Victus 15";
    }
}
