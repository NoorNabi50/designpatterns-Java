package Classes;

import Interfaces.Computer;

public class Server implements Computer {

    @Override
    public String getconfiguration() {
        return "Server Configuration: 64GB RAM, 1TB SSD, Intel Xeon Processor";
    }
}
