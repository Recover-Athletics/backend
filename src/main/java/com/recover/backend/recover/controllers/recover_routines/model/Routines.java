package com.recover.backend.recover.controllers.recover_routines.model;

import java.util.List;

import com.recover.backend.recover.controllers.recover_routines.model.components.Routineexercises;


public class Routines {
    private String routinename;
    private Integer exerciseamount;
    private Integer totalduration;
    private Integer stretchpercentage;
    private Integer strengthpercentage;
    private List<Routineexercises> routineexercises;

    public String getRoutinename() {
        return routinename;
    }

    public void setRoutinename(String routinename) {
        this.routinename = routinename;
    }

    public Integer getExerciseamount() {
        return exerciseamount;
    }

    public void setExerciseamount(Integer exerciseamount) {
        this.exerciseamount = exerciseamount;
    }

    public Integer getTotalduration() {
        return totalduration;
    }

    public void setTotalduration(Integer totalduration) {
        this.totalduration = totalduration;
    }

    public Integer getStretchpercentage() {
        return stretchpercentage;
    }

    public void setStretchpercentage(Integer stretchpercentage) {
        this.stretchpercentage = stretchpercentage;
    }

    public Integer getStrengthpercentage() {
        return strengthpercentage;
    }

    public void setStrengthpercentage(Integer strengthpercentage) {
        this.strengthpercentage = strengthpercentage;
    }

    public List<Routineexercises> getRoutineexercises() {
        return routineexercises;
    }

    public void setRoutineexercises(List<Routineexercises> routineexercises) {
        this.routineexercises = routineexercises;
    }
}