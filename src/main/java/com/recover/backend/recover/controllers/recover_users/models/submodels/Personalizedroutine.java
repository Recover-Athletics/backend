package com.recover.backend.recover.controllers.recover_users.models.submodels;

public class Personalizedroutine {
    private String injuryname;
    private Boolean prehab;
    private String backgroundimage;

    public String getInjuryname() {
        return injuryname;
    }

    public void setInjuryname(String injuryname) {
        this.injuryname = injuryname;
    }

    public Boolean getPrehab() {
        return prehab;
    }

    public void setPrehab(Boolean prehab) {
        this.prehab = prehab;
    }

    public String getBackgroundimage() {
        return backgroundimage;
    }

    public void setBackgroundimage(String backgroundimage) {
        this.backgroundimage = backgroundimage;
    }
}