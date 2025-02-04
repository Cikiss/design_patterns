package com.colin.patterns.creational_pattern.factory.config_abstract_factory;


import java.util.Properties;

// 工厂选择器
public class FactorySelector {
    public static CoffeeDessertFactory getFactory() {
        // 1.创建Properties对象
        Properties properties = new Properties();
        try {
            // 2.加载配置文件
            properties.load(FactorySelector.class.getClassLoader().getResourceAsStream("config.properties"));
            String className = properties.getProperty("factory");

            // 3.根据配置文件中的类名，反射获取类，并创建对象返回
            return (CoffeeDessertFactory) Class.forName(className).getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            throw new RuntimeException("加载工厂失败", e);
        }
    }
}
