package com.example.fitnessapp.Exercise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "exercises")
public class ExerciseController {
    private final ExerciseService exerciseService;

    @Autowired
    public ExerciseController(ExerciseService exerciseService) {
        this.exerciseService = exerciseService;
    }

    @GetMapping
    public List<Exercise> getExercises() {
        return exerciseService.getExercises();
    }

    @PostMapping
    public void addExercise(@RequestBody Exercise exercise) {
       exerciseService.addExercise(exercise);
    }
    @DeleteMapping(path = "{id}")
    void deleteExercise(@PathVariable Long id) {
        exerciseService.deleteById(id);
    }


}
