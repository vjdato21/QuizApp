package org.group12.model;

public class Choice {
    private String choice;
    private ChoiceLetter choiceLetter;

    public Choice() {
        this.choice = "";
        this.choiceLetter = null;
    }

    public Choice(String choice, ChoiceLetter choiceLetter) {
        this.choice = choice;
        this.choiceLetter = choiceLetter;
    }

    public String getChoice() {
        return choice;
    }

    public void setChoice(String choice) {
        this.choice = choice;
    }

    public ChoiceLetter getChoiceLetter() {
        return choiceLetter;
    }

    public void setChoiceLetter(ChoiceLetter choiceLetter) {
        this.choiceLetter = choiceLetter;
    }
}
