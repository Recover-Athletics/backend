package com.recover.backend.recover.controllers.recover_routines.model.components.routineexercisessubcomponents;

import com.recover.backend.recover.controllers.recover_exercises.models.Exercises;

public class Regression {
    private String label;
    private Exercises regressionexercise;

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Exercises getRegressionexercise() {
        return regressionexercise;
    }

    public void setRegressionexercise(Exercises regressionexercise) {
        this.regressionexercise = regressionexercise;
    }
}