package com.example.fitnessapp.Exercise;

import jakarta.persistence.*;

@Entity
@Table
public class Exercise {
    @Id
    @SequenceGenerator(
            name = "exercise_sequence",
            sequenceName = "exercise_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "exercise_sequence"
    )
    private Long id;
    private String name;
    private int sets;
    private int reps;
    public Exercise(){}

    public Exercise(Long ID, String name, int sets, int reps) {
        this.id = ID;
        this.name = name;
        this.sets = sets;
        this.reps = reps;
    }

    public Exercise(String name, int sets, int reps) {
        this.name = name;
        this.sets = sets;
        this.reps = reps;
    }

    public Long getID() {
        return id;
    }

    public void setID(Long ID) {
        this.id = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSets() {
        return sets;
    }

    public void setSets(int sets) {
        this.sets = sets;
    }

    public int getReps() {
        return reps;
    }

    public void setReps(int reps) {
        this.reps = reps;
    }
}
