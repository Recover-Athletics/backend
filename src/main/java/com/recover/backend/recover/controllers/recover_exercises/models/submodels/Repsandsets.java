package com.recover.backend.recover.controllers.recover_exercises.models.submodels;

import com.recover.backend.recover.controllers.recover_exercises.models.submodels.components.Secondsperside;

public class Repsandsets {
    private Integer sets;
    private Integer reps;
    private Integer duration;
    private Boolean secondsperside;
    private Secondsperside secondpersideobject;
    private Boolean secondsonly;
    private Boolean repsonly;

    public Integer getSets() {
        return sets;
    }

    public void setSets(Integer sets) {
        this.sets = sets;
    }

    public Integer getReps() {
        return reps;
    }

    public void setReps(Integer reps) {
        this.reps = reps;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public Boolean getSecondsperside() {
        return secondsperside;
    }

    public void setSecondsperside(Boolean secondsperside) {
        this.secondsperside = secondsperside;
    }

    public Secondsperside getSecondpersideobject() {
        return secondpersideobject;
    }

    public void setSecondpersideobject(Secondsperside secondpersideobject) {
        this.secondpersideobject = secondpersideobject;
    }

    public Boolean getSecondsonly() {
        return secondsonly;
    }

    public void setSecondsonly(Boolean secondsonly) {
        this.secondsonly = secondsonly;
    }

    public Boolean getRepsonly() {
        return repsonly;
    }

    public void setRepsonly(Boolean repsonly) {
        this.repsonly = repsonly;
    }


}