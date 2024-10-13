package FactoryClasses;

import Classes.PC;
import Interfaces.Computer;

public class PCFactory extends ComputerFactory {

    @Override
    public Computer createComputer() {
        return new PC();
    }
}
