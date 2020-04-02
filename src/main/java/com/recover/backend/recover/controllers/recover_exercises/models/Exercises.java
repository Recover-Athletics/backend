package com.recover.backend.recover.controllers.recover_exercises.models;

import com.recover.backend.recover.controllers.recover_exercises.models.submodels.Repsandsets;

public class Exercises {
    private String exercise;
    private String exerciseid;
    private String exercisedescription;
    private String exerciselink;
    private Repsandsets exerciseinfo;


    public String getExercise() {
        return exercise;
    }

    public void setExercise(String exercise) {
        this.exercise = exercise;
    }

    public String getExerciseid() {
        return exerciseid;
    }

    public void setExerciseid(String exerciseid) {
        this.exerciseid = exerciseid;
    }

    public String getExercisedescription() {
        return exercisedescription;
    }

    public void setExercisedescription(String exercisedescription) {
        this.exercisedescription = exercisedescription;
    }

    public String getExerciselink() {
        return exerciselink;
    }

    public void setExerciselink(String exerciselink) {
        this.exerciselink = exerciselink;
    }

    public Repsandsets getExerciseinfo() {
        return exerciseinfo;
    }

    public void setExerciseinfo(Repsandsets exerciseinfo) {
        this.exerciseinfo = exerciseinfo;
    }


}