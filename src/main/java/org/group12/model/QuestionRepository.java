// Creates an ArrayList that holds a hard-coded set of questions

package org.group12.model;

import java.util.ArrayList;
import java.util.Arrays;

public class QuestionRepository {
    private final ArrayList<Question> questions;

    public QuestionRepository() {
        questions = new ArrayList<Question>(Arrays.asList(
                new Question("" +
                        "What is the Capital of Sweden?",
                       new ArrayList<Choice>(Arrays.asList(
                                new Choice("Tallinn", ChoiceLetter.A),
                                new Choice("Stockholm", ChoiceLetter.B),
                                new Choice("Budapest", ChoiceLetter.C)
                        )),ChoiceLetter.B
                ),
                new Question("" +
                        "What is the national flower of the Philippines",
                        new ArrayList<Choice>(Arrays.asList(
                                new Choice("Sampaguita", ChoiceLetter.A),
                                new Choice("Sunflower", ChoiceLetter.B),
                                new Choice("Rose", ChoiceLetter.C)
                        )), ChoiceLetter.B
                ),
                new Question("" +
                        "Who is the national hero of the Philippines?",
                        new ArrayList<Choice>(Arrays.asList(
                                new Choice("Lapu-lapu", ChoiceLetter.A),
                                new Choice("Jose Rizal", ChoiceLetter.B),
                                new Choice("Andres Bonifacio", ChoiceLetter.C)
                        )), ChoiceLetter.B
                ),
                new Question("" +
                        "One of these Scientists have received 2 Nobel Prizes.",
                        new ArrayList<Choice>(Arrays.asList(
                                new Choice("Marie Curie", ChoiceLetter.A),
                                new Choice("Roger Penrose", ChoiceLetter.B),
                                new Choice("Albert Einstein", ChoiceLetter.C)
                        )), ChoiceLetter.A
                ),
                new Question("" +
                        "What kernel does modern Microsoft Windows Operating Systems (post Windows 98) use?",
                        new ArrayList<Choice>(Arrays.asList(
                                new Choice("Windows NT", ChoiceLetter.A),
                                new Choice("UNIX", ChoiceLetter.B),
                                new Choice("MS-DOS", ChoiceLetter.C)
                        )), ChoiceLetter.A
                ),
                new Question("" +
                        "When did Apple initially transitioned to in-house silicon chips?",
                        new ArrayList<Choice>(Arrays.asList(
                                new Choice("2020", ChoiceLetter.A),
                                new Choice("2019", ChoiceLetter.B),
                                new Choice("2021", ChoiceLetter.C)
                        )), ChoiceLetter.A
                ),
                new Question("" +
                        "When did Apple transitioned away from Power PC to Intel CPU",
                        new ArrayList<Choice>(Arrays.asList(
                                new Choice("1976", ChoiceLetter.A),
                                new Choice("2005", ChoiceLetter.B),
                                new Choice("1983", ChoiceLetter.C)
                        )), ChoiceLetter.B
                ),
                new Question("" +
                        "How many possible Rubik's Cube Combinations are there?",
                        new ArrayList<Choice>(Arrays.asList(
                                new Choice("40,179,223,457,989,110,000", ChoiceLetter.A),
                                new Choice("43,252,003,274,489,856,000", ChoiceLetter.B),
                                new Choice("47,998,178,584,119,287,000", ChoiceLetter.C)
                        )), ChoiceLetter.B
                ),
                new Question("" +
                        "What kernel does modern Microsoft Windows Operating Systems (post Windows 98) use?",
                        new ArrayList<Choice>(Arrays.asList(
                                new Choice("Windows NT", ChoiceLetter.A),
                                new Choice("UNIX", ChoiceLetter.B),
                                new Choice("MS-DOS", ChoiceLetter.C)
                        )), ChoiceLetter.A
                ),
                new Question("" +
                        "Movement of cell against concentration gradient is called",
                        new ArrayList<Choice>(Arrays.asList(
                                new Choice("Active transport", ChoiceLetter.A),
                                new Choice("Diffusion", ChoiceLetter.B),
                                new Choice("Passive transport", ChoiceLetter.C)
                        )), ChoiceLetter.A
                ),
                new Question("" +
                        "In which decade was the American Institute of Electrical Engineers (AIEE) founded?",
                        new ArrayList<Choice>(Arrays.asList(
                                new Choice("1950s", ChoiceLetter.A),
                                new Choice("1880s", ChoiceLetter.B),
                                new Choice("1850s", ChoiceLetter.C)
                        )), ChoiceLetter.B
                ),
                new Question("" +
                        "Area 51 is located in which US state?",
                        new ArrayList<Choice>(Arrays.asList(
                                new Choice("North Carolina", ChoiceLetter.A),
                                new Choice("Nevada", ChoiceLetter.B),
                                new Choice("Illinois", ChoiceLetter.C)
                        )), ChoiceLetter.B
                ),
                new Question("" +
                        "Which planet has the most moons?",
                        new ArrayList<Choice>(Arrays.asList(
                                new Choice("Mercury", ChoiceLetter.A),
                                new Choice("Earth", ChoiceLetter.B),
                                new Choice("Saturn", ChoiceLetter.C)
                        )), ChoiceLetter.C
                ),
                new Question("" +
                        "Which of the following browsers do not use Chromium?",
                        new ArrayList<Choice>(Arrays.asList(
                                new Choice("Opera GX", ChoiceLetter.A),
                                new Choice("Firefox", ChoiceLetter.B),
                                new Choice("Vivaldi", ChoiceLetter.C)
                        )), ChoiceLetter.B
                ),
                new Question("" +
                        "The intersecting lines drawn on maps and globes are",
                        new ArrayList<Choice>(Arrays.asList(
                                new Choice("Geographic Grids", ChoiceLetter.A),
                                new Choice("Latitudes", ChoiceLetter.B),
                                new Choice("Longitudes", ChoiceLetter.C)
                        )), ChoiceLetter.A
                ),
                new Question("" +
                        "What is the smallest volcano in Philippines?",
                        new ArrayList<Choice>(Arrays.asList(
                                new Choice("Mount Apo", ChoiceLetter.A),
                                new Choice("Taal Volcano", ChoiceLetter.B),
                                new Choice("Mayon Volcano", ChoiceLetter.C)
                        )), ChoiceLetter.B
                ),
                new Question("" +
                        "What is the biggest continent?",
                        new ArrayList<Choice>(Arrays.asList(
                                new Choice("South America", ChoiceLetter.A),
                                new Choice("Africa", ChoiceLetter.B),
                                new Choice("Asia", ChoiceLetter.C)
                        )), ChoiceLetter.C
                ),
                new Question("" +
                        "Which Disney Princess Has the Least Amount of Screen Time?",
                        new ArrayList<Choice>(Arrays.asList(
                                new Choice("Aurora", ChoiceLetter.A),
                                new Choice("Snow White", ChoiceLetter.B),
                                new Choice("Pocahontas", ChoiceLetter.C)
                        )), ChoiceLetter.A
                ),
                new Question("" +
                        "What is the fastest flying bird?",
                        new ArrayList<Choice>(Arrays.asList(
                                new Choice("Eagle", ChoiceLetter.A),
                                new Choice("Peregrine Falcon", ChoiceLetter.B),
                                new Choice("Ostrich", ChoiceLetter.C)
                        )), ChoiceLetter.B
                ),
                new Question("" +
                        "Which programming language is the oldest?",
                        new ArrayList<Choice>(Arrays.asList(
                                new Choice("Ruby", ChoiceLetter.A),
                                new Choice("Python", ChoiceLetter.B),
                                new Choice("JavaScript", ChoiceLetter.C)
                        )), ChoiceLetter.B
                ),
            new Question("" +
                    "Who made the PHP Programming Language?",
                    new ArrayList<Choice>(Arrays.asList(
                            new Choice("Anders Hejlsberg", ChoiceLetter.A),
                            new Choice("Guido van Rossum", ChoiceLetter.B),
                            new Choice("Rasmus Lerdorf", ChoiceLetter.C)
                    )), ChoiceLetter.C
            )
        ));
    }

    public ArrayList<Question> getQuestions() {
        return questions;
    }
}
