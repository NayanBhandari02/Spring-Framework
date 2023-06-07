package com.example.spring.helloworld;



import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application2SpringBasics {
    public static void main(String[] args){
        try(var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class)) {
            System.out.println(context.getBean("name"));
            System.out.println(context.getBean("age"));
            System.out.println(context.getBean("person"));
            System.out.println(context.getBean("address2"));
            System.out.println(context.getBean(Person.class));//Add Primary to get one
            System.out.println(context.getBean("person2methodcall"));
            System.out.println(context.getBean("person3parameters"));
            //Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
            //System.out.println(context.getBeanDefinitionCount());
        }
    }
}
