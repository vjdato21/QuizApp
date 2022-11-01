// QuizMenu serves as a class for various user interface

package org.group12.view;

import org.group12.model.*;
import org.group12.util.KBInput;

import java.util.ArrayList;
import java.util.Collections;

public class QuizMenu {
    public static Player registerView() {
        return new Player(KBInput.readString("Enter your name: "));
    }

    public static ChoiceLetter questionView(Question question) {
        System.out.println(question.getQuestion());
        System.out.println();
        for (int i = 0; i < question.getChoices().size(); i++) {
            System.out.print(question.getChoices().get(i).getChoiceLetter().getString()+ ". " + question.getChoices().get(i).getChoice() + "\t");
        }
        System.out.println();
        try {
            return ChoiceLetter.valueOf(KBInput.readString("> ").toUpperCase());
        } catch (IllegalArgumentException iaExc) {
            System.err.println("Invalid choice! Please select either A, B, or C.");
            return null;
        } catch (Exception npExc) {
            System.err.println(npExc.getMessage());
            return null;
        }
    }

    public static void quizEndView(Player player) {
        // show player name, and total player score
        System.out.flush();
        System.out.println();
        System.out.println("Player Name: " + player.getName());
        System.out.println("Score: " + player.getScore());
    }

    /**
     *
     * @param players ArrayList of Players
     */
    public static void leaderboardView(ArrayList<Player> players) {
        Collections.sort(players);
        System.out.println("Leaderboard:");
        players.forEach(player -> {
            System.out.println(player.getName()+"\t"+player.getScore());
        });
    }

    public static boolean exitView() {
        String isExitInput = KBInput.readString("Are you sure you want to exit this program [Y/n]?  ");
        while (isExitInput == null) {
            System.out.println("Invalid Input! Input should be [Y/n].");
            isExitInput = KBInput.readString("Are you sure you want to exit this program [Y/n]?  ");
        }
        return isExitInput.equalsIgnoreCase("Y");
    }
}
