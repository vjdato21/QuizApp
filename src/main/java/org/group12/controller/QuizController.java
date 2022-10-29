// This class controls the flow of the program and call methods from different classes

package org.group12.controller;

import org.group12.model.*;
import org.group12.view.QuizMenu;

import java.util.ArrayList;
import java.util.Collections;

public class QuizController {

    private final QuestionRepository questions;
    private final PlayerRepository players;
    private Player currentPlayer;

    public QuizController(QuestionRepository questions, PlayerRepository players) {
        this.questions = questions;
        this.players = players;
    }


    /**
     * Quiz Controller Entry Point
     */
    public void run() {

        do {
            // add player name
            registerUser();

            // run question loop here
            ArrayList<Question> shuffledQuestions = questions.getQuestions();
            Collections.shuffle(shuffledQuestions);
            for (int i = 0; i < 5; i++) {
                if (askQuestion(shuffledQuestions.get(i))) {
                    currentPlayer.incrementScore();
                }
            }
            // saves the player's score to the leaderboard
            players.addPlayer(currentPlayer);

            // show the player's final score
            QuizMenu.quizEndView(currentPlayer);

            // show player list
            QuizMenu.leaderboardView(players.getAllPlayers());

            // exit program decision
        } while (!QuizMenu.exitView());
    }

    private void registerUser() {
        this.currentPlayer = QuizMenu.registerView();
    }

    private boolean askQuestion(Question question) {
        ChoiceLetter playerAnswer = QuizMenu.questionView(question);
        while (playerAnswer == null) {
            playerAnswer = QuizMenu.questionView(question);
        }
        return playerAnswer.equals(question.getAnswer().getChoiceLetter());
    }

}
