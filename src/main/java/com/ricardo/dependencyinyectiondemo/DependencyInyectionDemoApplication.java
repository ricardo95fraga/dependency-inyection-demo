package com.ricardo.dependencyinyectiondemo;

import com.ricardo.dependencyinyectiondemo.controllers.ConstructorInjectedController;
import com.ricardo.dependencyinyectiondemo.controllers.GetterInjectedController;
import com.ricardo.dependencyinyectiondemo.controllers.MyController;
import com.ricardo.dependencyinyectiondemo.controllers.PropertyInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DependencyInyectionDemoApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(DependencyInyectionDemoApplication.class, args);

        MyController controller = (MyController) ctx.getBean("myController");

        controller.hello();

        System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
        System.out.println(ctx.getBean(GetterInjectedController.class).sayHello());
        System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());
    }

}
