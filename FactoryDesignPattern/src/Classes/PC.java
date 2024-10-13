package Classes;

import Interfaces.Computer;

public class PC implements Computer {
    @Override
    public String getconfiguration() {
        return "PC Configuration: 16GB RAM, 512GB SSD, Intel i5 Processor";
    }
}
