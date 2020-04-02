package com.recover.backend.recover.controllers.recover_users.models.submodels;

import com.recover.backend.recover.controllers.recover_routines.model.components.Routineexercises;

public class Injuries {
    private String injuryname;
    private String injuryid;
    private Boolean prehab;
    private Routineexercises injuryroutine;

    public String getInjuryname() {
        return injuryname;
    }

    public void setInjuryname(String injuryname) {
        this.injuryname = injuryname;
    }

    public String getInjuryid() {
        return injuryid;
    }

    public void setInjuryid(String injuryid) {
        this.injuryid = injuryid;
    }

    public Boolean getPrehab() {
        return prehab;
    }

    public void setPrehab(Boolean prehab) {
        this.prehab = prehab;
    }

    public Routineexercises getInjuryroutine() {
        return injuryroutine;
    }

    public void setInjuryroutine(Routineexercises injuryroutine) {
        this.injuryroutine = injuryroutine;
    }
}