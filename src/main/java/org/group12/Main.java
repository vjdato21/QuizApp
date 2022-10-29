// Main runs the QuizController

package org.group12;

import org.group12.controller.QuizController;
import org.group12.db.Database;
import org.group12.model.PlayerRepository;
import org.group12.model.QuestionRepository;

public class Main {
    public static void main(String[] args) {
        QuestionRepository questions = new QuestionRepository();
        PlayerRepository players = new PlayerRepository();
        QuizController quizController = new QuizController(questions, players);
        quizController.run();
    }
}