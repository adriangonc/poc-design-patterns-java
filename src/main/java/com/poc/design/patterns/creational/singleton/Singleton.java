package com.poc.design.patterns.creational.singleton;
public class Singleton {

    public static void main(String[] args){
        var configuration = SingletonConfigurationApi.getInstance();
        var configurationV2 = SingletonConfigurationApi.getInstance();

        System.out.println(configuration);
        System.out.println(configurationV2);
    }

}
