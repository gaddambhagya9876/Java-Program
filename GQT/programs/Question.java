package com.corejava.GQT.programs;

public class Question {

    String question;
    String option1, option2, option3, option4;
    int correctAnswer;
    int reward;

    // Constructor
    public Question(String question, String option1, String option2,
                    String option3, String option4,
                    int correctAnswer, int reward) {

        this.question = question;
        this.option1 = option1;
        this.option2 = option2;
        this.option3 = option3;
        this.option4 = option4;
        this.correctAnswer = correctAnswer;
        this.reward = reward;
    }

    // Display question
    public void displayQuestion() {
        System.out.println("\n" + question);
        System.out.println("1. " + option1);
        System.out.println("2. " + option2);
        System.out.println("3. " + option3);
        System.out.println("4. " + option4);
        System.out.println("5. Lifeline");
        System.out.print("Enter your choice: ");
    }

    // REQUIRED for Lifeline (THIS FIXES YOUR ERROR)
    public String getOption(int i) {
        switch (i) {
            case 1: return option1;
            case 2: return option2;
            case 3: return option3;
            case 4: return option4;
            default: return "";
        }
    }
}

    