package com.devsuperior.desafio1;

import com.devsuperior.desafio1.entities.Order;
import com.devsuperior.desafio1.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Desafio1Application implements CommandLineRunner {
	@Autowired
	private OrderService orderService;

	public static void main(String[] args) {
		SpringApplication.run(Desafio1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Order order = new Order(1309, 95.90, 0.0);
		double result = orderService.total(order);
		String message = String.format("""
				Pedido código %d
				Valor total: R$ %,.2f
				""", order.getCode(), result);

		System.out.println(message);
	}
}
