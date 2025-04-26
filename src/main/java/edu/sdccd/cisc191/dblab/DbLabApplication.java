package edu.sdccd.cisc191.dblab;

import edu.sdccd.cisc191.dblab.model.Option;
import edu.sdccd.cisc191.dblab.model.Vehicle;
import edu.sdccd.cisc191.dblab.repositories.OptionRepository;
import edu.sdccd.cisc191.dblab.repositories.VehicleRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class DbLabApplication {

    public static void main(String[] args) {
        SpringApplication.run(DbLabApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(VehicleRepository vehicleRepository, OptionRepository optionRepository) {
        return args -> {
            Option moonroof = new Option("moonroof");
            optionRepository.save(moonroof);
            Option ledHeadlights = new Option("LED Headlights");
            optionRepository.save(ledHeadlights);
            List<Option> options = new ArrayList<>();
            options.add(moonroof);
            options.add(ledHeadlights);
            Vehicle ford = new Vehicle("Ford Fiesta", 100, 24999, 5, options);
            vehicleRepository.save(ford);
        };
    }

}
