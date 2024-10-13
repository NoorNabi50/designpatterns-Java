package FactoryClasses;

import Classes.Laptop;
import Interfaces.Computer;

public class LaptopFactory extends ComputerFactory {
    @Override
    public Computer createComputer() {
        return new Laptop();
    }
}
