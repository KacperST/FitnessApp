package com.example.fitnessapp.Exercise;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class ExerciseConfig {

    @Bean
    CommandLineRunner commandLineRunner(ExerciseRepository exerciseRepository) {
        return args -> exerciseRepository.saveAll(List.of(new Exercise("Pull ups",5,10),
                    new Exercise("Benchpress",5,5)));
    }
}
