package FactoryClasses;

import Interfaces.Computer;

public abstract class ComputerFactory {
    public abstract Computer createComputer();

    public void printConfiguration() {
        Computer computer = createComputer();
        System.out.println(computer.getconfiguration());
    }

}
