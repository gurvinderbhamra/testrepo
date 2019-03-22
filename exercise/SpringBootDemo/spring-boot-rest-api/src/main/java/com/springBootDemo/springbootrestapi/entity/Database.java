package com.springBootDemo.springbootrestapi.entity;

import org.springframework.beans.factory.annotation.Value;

public class Database {

    @Value("${database.name}")
    private String name;

    @Value("${database.port}")
    private Integer port;

    public Database(){}

    public Database(Integer port, String name) {
        this.port = port;
        this.name = name;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Database{" +
                "port=" + port +
                ", name='" + name + '\'' +
                '}';
    }
}
