package com.ulearnProjects.lod.ShoppingList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.net.InetAddress;
import java.net.UnknownHostException;

@SpringBootApplication
public class ShoppingListApplication {

	public static void main(String[] args) throws UnknownHostException {
		ConfigurableApplicationContext context = SpringApplication.run(ShoppingListApplication.class, args);

		String port = context.getEnvironment().getProperty("server.port");

		InetAddress ip = InetAddress.getLocalHost();
		String hostname = ip.getHostName();

		System.out.println("http://localhost:" + port + "/");
	}

}
