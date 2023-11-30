package org.java.spring;

import org.java.spring.db.pojo.Pizza;
import org.java.spring.db.serv.PizzaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner{
	
	@Autowired
	private PizzaService pizzaService;
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		pizzaService.save(new Pizza("margherita troppo buona", "https://it.wikipedia.org/wiki/Pizza_napoletana#/media/File:Eq_it-na_pizza-margherita_sep2005_sml.jpg", 8.5f));
		pizzaService.save(new Pizza("margherita troppo buona", "https://it.wikipedia.org/wiki/Pizza_napoletana#/media/File:Eq_it-na_pizza-margherita_sep2005_sml.jpg", 8.5f));
		pizzaService.save(new Pizza("margherita troppo buona", "https://it.wikipedia.org/wiki/Pizza_napoletana#/media/File:Eq_it-na_pizza-margherita_sep2005_sml.jpg", 8.5f));
		
	}

}
