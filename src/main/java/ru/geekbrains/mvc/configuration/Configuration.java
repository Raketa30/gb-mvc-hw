package ru.geekbrains.mvc.configuration;


import org.springframework.context.annotation.Bean;
import ru.geekbrains.mvc.dao.ProductDB;

@org.springframework.context.annotation.Configuration
public class Configuration {
    @Bean
    public ProductDB getDBConnection(){
        return new ProductDB();
    }
}