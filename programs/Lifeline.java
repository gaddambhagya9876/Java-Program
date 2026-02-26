package com.corejava.GQT.programs;
import java.util.Random;

public class Lifeline {

    // Only ONE lifeline allowed for entire quiz
    private boolean lifelineUsed = false;

    // ================= 50-50 Lifeline =================
    public void useFiftyFifty(Question q) {

        if (lifelineUsed) {
            System.out.println("⚠ Lifeline already used.");
            return;
        }

        lifelineUsed = true;
        System.out.println("\n🎯 50-50 Lifeline Activated!");

        Random r = new Random();
        int correct = q.correctAnswer;
        int random;

        do {
            random = r.nextInt(4) + 1;
        } while (random == correct);

        for (int i = 1; i <= 4; i++) {
            if (i == correct || i == random) {
                System.out.println(i + ". " + q.getOption(i));
            }
        }
    }

    // ================= Audience Poll Lifeline =================
    public void useAudiencePoll(Question q) {

        if (lifelineUsed) {
            System.out.println("⚠ Lifeline already used.");
            return;
        }

        lifelineUsed = true;
        System.out.println("\n📊 Audience Poll Lifeline Activated!");

        Random r = new Random();

        int correctPercent = 50 + r.nextInt(31); // 50–80%
        int remaining = 100 - correctPercent;

        int a = r.nextInt(remaining);
        int b = r.nextInt(remaining - a);
        int c = remaining - a - b;

        for (int i = 1; i <= 4; i++) {
            if (i == q.correctAnswer) {
                System.out.println(i + ". " + q.getOption(i) + " → " + correctPercent + "%");
            } else if (a > 0) {
                System.out.println(i + ". " + q.getOption(i) + " → " + a + "%");
                a = 0;
            } else if (b > 0) {
                System.out.println(i + ". " + q.getOption(i) + " → " + b + "%");
                b = 0;
            } else {
                System.out.println(i + ". " + q.getOption(i) + " → " + c + "%");
            }
        }
    }
}
