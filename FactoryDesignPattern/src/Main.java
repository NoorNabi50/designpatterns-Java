import Classes.Laptop;
import FactoryClasses.*;
import Interfaces.Computer;

public class Main {
    public static void main(String[] args) throws Exception {

        Laptop laptop = new Laptop();
        System.out.println(laptop.getconfiguration());

        //we can create instance of laptop with interface, it's implementing
        Computer laptop2 = new Laptop();
        System.out.println(laptop2.getconfiguration());

        //Abstract Factory class will be responsible for creating object of the class(LaptopFactory is used to initialization)
        ComputerFactory laptopFactory = new LaptopFactory();
        laptopFactory.printConfiguration();

        //we can get the functionalities of laptop from factory class which has method to create the object of Laptop
        Laptop hpLapTop = (Laptop) laptopFactory.createComputer();
        hpLapTop.getTitle();

        ComputerFactory serverFactory = new ServerFactory();
        serverFactory.printConfiguration();

        //what if we've to initiate the object based on any input from user, another service, or API?
        String requireProduct = "Server";
        ComputerFactory computerFactory;
        /*switch (requireProduct) {
            case "Laptop":
                computerFactory = new LaptopFactory();
                break;
            case "Server":
                computerFactory = new ServerFactory();
                break;
            default:
                throw new Exception("No such Product/Service is Available");
        }*/

        /*Whenever we've to add new product entity into system, following procedures need to be done
         1-Create Concrete class of product(business logic)
        2-Create Factory class of product (for object creation of concrete class)
        This approach will introduce if-else in client side, hmm lets make another class which stores the factory classes and their
        concrete classes, return object by key, can register the new factory class as well with this approach*/

        //suppose we're registering factory map on start of application
        ComputerFactoryProvider.registerFactoryClass("PC", new PCFactory());
        computerFactory = ComputerFactoryProvider.getFactoryClass(requireProduct);
        computerFactory.printConfiguration();
    }
}