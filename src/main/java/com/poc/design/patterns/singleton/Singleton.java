package com.poc.design.patterns.singleton;
public class Singleton {

    public static void main(String[] args){
        var configuration = SingletonConfigurationApi.getInstance();
        var configurationV2 = SingletonConfigurationApi.getInstance();

        System.out.println(configuration);
        System.out.println(configurationV2);

        var equalInscances = (configuration == configurationV2);

        System.out.println("Instancias são iguais? " + equalInscances);
        System.out.println("Nome do projeto: " + configuration.getProjectName());

    }

}
