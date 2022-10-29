package org.group12.model;

public enum ChoiceLetter {
    A("A"),
    B("B"),
    C("C");

    private String choiceLetter;

    ChoiceLetter(String choiceLetter) {
        this.choiceLetter = choiceLetter;
    }

    public String getString() {
        return this.choiceLetter;
    }
}
