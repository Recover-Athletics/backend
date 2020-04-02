package com.recover.backend.recover.controllers.recover_routines.model.components.routineexercisessubcomponents;

import com.recover.backend.recover.controllers.recover_exercises.models.Exercises;

public class Progression {
    private String label;
    private Exercises progressionexercise;

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Exercises getProgressionexercise() {
        return progressionexercise;
    }

    public void setProgressionexercise(Exercises progressionexercise) {
        this.progressionexercise = progressionexercise;
    }
}