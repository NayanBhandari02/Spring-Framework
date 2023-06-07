package com.example.spring.helloworld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person(String name,int age, Address address){};
record Address(String FirstLine, String City){};
@Configuration
public class HelloWorldConfiguration {
    @Bean
    public String name(){
        return "Nayan";
    }
    @Bean
    public int age(){
        return 21;
    }
    @Bean
    @Primary
    public Person person(){
        return new Person("Ravi",25, new Address("JPNagar","Bangalore"));
    }
    @Bean
    public Person person2methodcall(){
        return new Person(name(),age(), address());
    }
    @Bean
    public Person person3parameters(String name, int age, Address address){
        return new Person(name,age, address);
    }
    @Bean(name = "address2")
    public Address address(){
        return new Address("Jayanagar","Bangalore");
    }
}
