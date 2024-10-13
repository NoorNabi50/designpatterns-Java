package FactoryClasses;

import java.util.HashMap;
import java.util.Map;

public class ComputerFactoryProvider {
    private static final Map<String, ComputerFactory> factoryMap = new HashMap<>();

    static {
        factoryMap.put("Laptop", new LaptopFactory());
        factoryMap.put("Server", new ServerFactory());
    }

    public static ComputerFactory getFactoryClass(String key) throws Exception {
        if (factoryMap.containsKey(key))
            return factoryMap.get(key);
        throw new Exception("No Such Factory class is available");
    }

    public static void registerFactoryClass(String key, ComputerFactory computerFactory) {
        factoryMap.put(key, computerFactory);
    }
}
