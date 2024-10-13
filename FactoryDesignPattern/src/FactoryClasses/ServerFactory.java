package FactoryClasses;

import Classes.Server;
import Interfaces.Computer;

public class ServerFactory extends ComputerFactory {

    @Override
    public Computer createComputer() {
        return new Server();
    }
}
