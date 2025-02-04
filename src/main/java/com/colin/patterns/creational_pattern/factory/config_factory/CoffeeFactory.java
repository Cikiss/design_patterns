package com.colin.patterns.creational_pattern.factory.config_factory;

import java.util.HashMap;
import java.util.Properties;

public class CoffeeFactory {

    // 1.定义容器Map，存储所有的咖啡对象
    private static HashMap<String, Coffee> map = new HashMap<>();

    // 2.加载配置文件
    static {
        // 2.1.创建Properties对象
        Properties properties = new Properties();
        // 2.2.加载配置文件
        try {
            properties.load(CoffeeFactory.class.getClassLoader().getResourceAsStream("bean.properties"));
            // 2.3.获取配置文件中所有的key
            for (Object key : properties.keySet()) {
                // 2.4.获取value
                String className = properties.getProperty((String) key);
                // 2.5.通过反射创建对象
                Class clazz = Class.forName(className);
                Coffee coffee = (Coffee) clazz.newInstance();
                // 2.6.把key和value存入map中
                map.put((String) key,coffee);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 根据name获取Coffee对象
    public static Coffee createCoffee(String name) {
        return map.get(name);
    }
}
