package com.zipcodewilmington.preassessment2;

public enum AliceBobEnum {

    ALICE("Hey, my name is ALICE!"),
    
    
    BOB("Hey, my name is BOB!"),;
    private String catchPhrase;

    AliceBobEnum(String s) {
        this.catchPhrase = s;
    }

    public boolean isBob() {
        return this.name().equalsIgnoreCase("bob");
    }

    public boolean isAlice() {

            return this.name().equalsIgnoreCase("alice");
    }

    public String getCatchPhrase() {
        return catchPhrase;
    }


}


