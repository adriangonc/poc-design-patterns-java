package com.poc.design.patterns.singleton;

import java.util.Objects;

public class SingletonConfigurationApi {

    /**
     * Garantir que uma classe tenha somente uma instância no programa
     * e fornecer um ponto de acesso global para a mesma.
     **/

    /*Geralmente usado para acesso a recursos compartilhados, como base de dados, interface gráfica, sistema de arquivos, logger etc*/

    public static SingletonConfigurationApi instance;

    //Construtor private para impedir criação de instâncias em outras classes
    private SingletonConfigurationApi() {

    }

    //Se já existir uma instância criada retorna ela, se não cria uma nova instância
    public static SingletonConfigurationApi getInstance() {
        //O synchronized faz com que somente uma thread possa executar o código por vez, evitando o problema de acesso simultaneo.
        synchronized (SingletonConfigurationApi.class) {
            if (Objects.isNull(instance)) {
                instance = new SingletonConfigurationApi();
            }
        }
        return instance;
    }

}
