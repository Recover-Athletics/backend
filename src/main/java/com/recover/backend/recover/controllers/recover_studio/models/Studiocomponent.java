package com.recover.backend.recover.controllers.recover_studio.models;

import com.recover.backend.recover.controllers.recover_routines.model.components.Routineexercises;

public class Studiocomponent {
    private String studiocomponentname;
    private String studiocomponentimage;
    private Routineexercises routineexercise;
    public String getStudiocomponentname() {
        return studiocomponentname;
    }

    public void setStudiocomponentname(String studiocomponentname) {
        this.studiocomponentname = studiocomponentname;
    }

    public String getStudiocomponentimage() {
        return studiocomponentimage;
    }

    public void setStudiocomponentimage(String studiocomponentimage) {
        this.studiocomponentimage = studiocomponentimage;
    }

    public Routineexercises getRoutineexercise() {
        return routineexercise;
    }

    public void setRoutineexercise(Routineexercises routineexercise) {
        this.routineexercise = routineexercise;
    }
}