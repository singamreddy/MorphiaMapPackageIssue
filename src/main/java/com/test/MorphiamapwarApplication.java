package com.test;

import org.mongodb.morphia.Morphia;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;

import com.test.model.TestModel;

@SpringBootApplication(exclude = { MongoAutoConfiguration.class })
public class MorphiamapwarApplication {
	private static final Logger LOGGER = LoggerFactory.getLogger(MorphiamapwarApplication.class);

	public static void main(String[] args) {

		try (ConfigurableApplicationContext ctx = SpringApplication.run(MorphiamapwarApplication.class, args)) {
			Morphia morphia = new Morphia();
			morphia.mapPackage("com.test.model");
			LOGGER.info("morphia.isMapped(TestModel.class) = {}", morphia.isMapped(TestModel.class));
		}

	}
}
