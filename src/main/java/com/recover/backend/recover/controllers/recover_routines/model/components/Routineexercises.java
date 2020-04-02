package com.recover.backend.recover.controllers.recover_routines.model.components;

import com.recover.backend.recover.controllers.recover_exercises.models.Exercises;
import com.recover.backend.recover.controllers.recover_routines.model.components.routineexercisessubcomponents.Progression;
import com.recover.backend.recover.controllers.recover_routines.model.components.routineexercisessubcomponents.Regression;

public class Routineexercises {
    private Exercises mainexercise;
    private Progression progression;
    private Regression regression;

    public Exercises getMainexercise() {
        return mainexercise;
    }

    public void setMainexercise(Exercises mainexercise) {
        this.mainexercise = mainexercise;
    }

    public Progression getProgression() {
        return progression;
    }

    public void setProgression(Progression progression) {
        this.progression = progression;
    }

    public Regression getRegression() {
        return regression;
    }

    public void setRegression(Regression regression) {
        this.regression = regression;
    }
}