// This class handles various methods to access questions

package org.group12.model;

import java.util.ArrayList;

public class Question {
    private String question;
    private ArrayList<Choice> choices;
    private Choice answer;

    public Question() {
        this.question = "";
        this.choices = null;
        this.answer = null;
    }

    public Question(String question, ArrayList<Choice> choices, ChoiceLetter answer) {
        this.question = question;
        this.choices = choices;
        choices.forEach(choice -> {
            if (choice.getChoiceLetter().equals(answer)) this.answer = choice; });
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public ArrayList<Choice> getChoices() {
        return choices;
    }

    public void addChoice(String choice, ChoiceLetter choiceLetter) {
        this.choices.add(new Choice(choice, choiceLetter));
    }

    public Choice getAnswer() {
        return answer;
    }

    public void setAnswer(String answerLetter) {
        choices.forEach(choice -> {
            if (choice.getChoiceLetter().equals(answerLetter)) this.answer = choice; });
    }
}
