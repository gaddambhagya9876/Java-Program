package com.corejava.GQT.programs;
import java.util.Scanner;
public class JavaQuizGame {
	    static final String GREEN = "\u001B[32m";
	    static final String RED = "\u001B[31m";
	    static final String BLUE = "\u001B[30m";
	    static final String RESET = "\u001B[0m";

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);
	        Lifeline lifeline = new Lifeline();

	        System.out.print("Enter your name: ");
	        String name = sc.nextLine();
	       
	        System.out.println("\nWelcome " + name );
	        System.out.println("AI Quiz Started!\n");

	        int choice;

	        // Q1
	        Question q1 = new Question("Q1. AI stands for?", "Auto", "Artificial", "Intelligence", "Artificial Intelligence", 4, 250);
	        q1.displayQuestion();
	        choice = sc.nextInt();
	        if (choice == 5) {
	            System.out.println(BLUE + "Choose Lifeline: 1. 50-50  2. Audience Poll" + RESET);
	            int ll = sc.nextInt();

	            if (ll == 1)
	                lifeline.useFiftyFifty(q1);
	            else if (ll == 2)
	                lifeline.useAudiencePoll(q1);

	            System.out.print("Enter your answer again: ");
	            choice = sc.nextInt();
	        }

	        if (choice == q1.correctAnswer) System.out.println(GREEN + name + " it is correct answer you rewarded with " + q1.reward + RESET);
	       	        else { System.out.println(RED + "Wrong Answer! You are eliminated." + RESET); 
	        
                return; }
	        
	        

	        // Q2
	        Question q2 = new Question("Q2. Which is AI branch?", "DBMS", "OS", "MachineLearning", "Networking", 3, 500);
	        q2.displayQuestion();
	        choice = sc.nextInt();
	        if (choice == 5) {
	            System.out.println(BLUE + "Choose Lifeline: 1. 50-50  2. Audience Poll" + RESET);
	            int ll = sc.nextInt();
	            if (ll == 1)
	                lifeline.useFiftyFifty(q2);
	            else if (ll == 2)
	                lifeline.useAudiencePoll(q2);

	            System.out.print("Enter your answer again: ");
	            choice = sc.nextInt();
	        }

	        if (choice == q2.correctAnswer) System.out.println(GREEN + name + " it is correct answer you rewarded with " + q2.reward + RESET);
	        else { System.out.println(RED + "Wrong Answer! You are eliminated." + RESET); return; }
	        
	        // Q3
	        Question q3 = new Question(
	        	    "Q3. AI that learns from data?",
	        	    "Compiler", "Assembler", "Interpreter", "Machine Learning",
	        	    4, 750);
	        	
	        	q3.displayQuestion();
	        	choice = sc.nextInt();
	        	if (choice == 5) {
	        	    System.out.println(BLUE + "Choose Lifeline: 1. 50-50  2. Audience Poll" + RESET);
	        	    int ll = sc.nextInt();
	        	    if (ll == 1)
	        	        lifeline.useFiftyFifty(q3);  
	        	    else if (ll == 2)
	        	        lifeline.useAudiencePoll(q3); 

	        	    System.out.print("Enter your answer: ");
	        	    choice = sc.nextInt();
	        	}

	        if (choice == q3.correctAnswer) System.out.println(GREEN + name + " it is correct answer you rewarded with " + q3.reward + RESET);
	        else { System.out.println(RED + "Wrong Answer! You are eliminated." + RESET); return; }

	        // Q4
	        Question q4 = new Question("Q4. Which learning uses reward?", "Supervised", "Unsupervised", "Reinforcement", "Regression", 3, 1000);
	        q4.displayQuestion();
	        choice = sc.nextInt();
	        if (choice == 5) {
	            System.out.println(BLUE + "Choose Lifeline: 1. 50-50  2. Audience Poll" + RESET);
	            int ll = sc.nextInt();

	            if (ll == 1)
	                lifeline.useFiftyFifty(q4);
	            else if (ll == 2)
	                lifeline.useAudiencePoll(q4);

	            System.out.print("Enter your answer again: ");
	            choice = sc.nextInt();
	        }

	        if (choice == q4.correctAnswer) System.out.println(GREEN + name + " it is correct answer you rewarded with " + q4.reward + RESET);
	        else { System.out.println(RED + "Wrong Answer! You are eliminated." + RESET); return; }

	        // Q5
	        Question q5 = new Question("Q5. NLP deals with?", "Images", "Numbers", "Language", "Signals", 3, 1250);
	        q5.displayQuestion();
	        choice = sc.nextInt();
	        if (choice == 5) {
	            System.out.println(BLUE + "Choose Lifeline: 1. 50-50  2. Audience Poll" + RESET);
	            int ll = sc.nextInt();

	            if (ll == 1)
	                lifeline.useFiftyFifty(q5);
	            else if (ll == 2)
	                lifeline.useAudiencePoll(q5);

	            System.out.print("Enter your answer again: ");
	            choice = sc.nextInt();
	        }

	        if (choice == q5.correctAnswer) System.out.println(GREEN + name + " it is correct answer you rewarded with " + q5.reward + RESET);
	        else { System.out.println(RED + "Wrong Answer! You are eliminated." + RESET); return; }

	        // Q6
	        Question q6 = new Question("Q6. Brain inspired AI model?", "Tree", "Graph", "NeuralNetwork", "Table", 3, 1500);
	        q6.displayQuestion();
	        choice = sc.nextInt();
	        if (choice == 5) {
	            System.out.println(BLUE + "Choose Lifeline: 1. 50-50  2. Audience Poll" + RESET);
	            int ll = sc.nextInt();

	            if (ll == 1)
	                lifeline.useFiftyFifty(q6);
	            else if (ll == 2)
	                lifeline.useAudiencePoll(q6);

	            System.out.print("Enter your answer again: ");
	            choice = sc.nextInt();
	        }

	        if (choice == q6.correctAnswer) System.out.println(GREEN + name + " it is correct answer you rewarded with " + q6.reward + RESET);
	        else { System.out.println(RED + "Wrong Answer! You are eliminated." + RESET); return; }

	        // Q7
	        Question q7 = new Question("Q7. AI field for images?", "Graphics", "Vision", "ComputerVision", "Pixels", 3, 1750);
	        q7.displayQuestion();
	        choice = sc.nextInt();
	        if (choice == 5) {
	            System.out.println(BLUE + "Choose Lifeline: 1. 50-50  2. Audience Poll" + RESET);
	            int ll = sc.nextInt();

	            if (ll == 1)
	                lifeline.useFiftyFifty(q7);
	            else if (ll == 2)
	                lifeline.useAudiencePoll(q7);

	            System.out.print("Enter your answer again: ");
	            choice = sc.nextInt();
	        }

	        if (choice == q7.correctAnswer) System.out.println(GREEN + name + " it is correct answer you rewarded with " + q7.reward + RESET);
	        else { System.out.println(RED + "Wrong Answer! You are eliminated." + RESET); return; }

	        // Q8
	        Question q8 = new Question("Q8. Heuristic search algorithm?", "DFS", "BFS", "AStar", "Binary", 3, 2000);
	        q8.displayQuestion();
	        choice = sc.nextInt();
	        if (choice == 5) {
	            System.out.println(BLUE + "Choose Lifeline: 1. 50-50  2. Audience Poll" + RESET);
	            int ll = sc.nextInt();

	            if (ll == 1)
	                lifeline.useFiftyFifty(q8);
	            else if (ll == 2)
	                lifeline.useAudiencePoll(q8);

	            System.out.print("Enter your answer again: ");
	            choice = sc.nextInt();
	        }

	        if (choice == q8.correctAnswer) System.out.println(GREEN + name + " it is correct answer you rewarded with " + q8.reward + RESET);
	        else { System.out.println(RED + "Wrong Answer! You are eliminated." + RESET); return; }

	        // Q9
	        Question q9 = new Question("Q9. AI agent type?", "Simple", "Model", "Rational", "Reflex", 3, 2250);
	        q9.displayQuestion();
	        choice = sc.nextInt();
	        if (choice == 5) {
	            System.out.println(BLUE + "Choose Lifeline: 1. 50-50  2. Audience Poll" + RESET);
	            int ll = sc.nextInt();

	            if (ll == 1)
	                lifeline.useFiftyFifty(q9);
	            else if (ll == 2)
	                lifeline.useAudiencePoll(q9);

	            System.out.print("Enter your answer again: ");
	            choice = sc.nextInt();
	        }

	        if (choice == q9.correctAnswer) System.out.println(GREEN + name + " it is correct answer you rewarded with " + q9.reward + RESET);
	        else { System.out.println(RED + "Wrong Answer! You are eliminated." + RESET); return; }

	        // Q10 (No lifeline allowed)
	        Question q10 = new Question("Q10. Most used AI language?", "Java", "C", "Python", "HTML", 3, 2500);
	        q10.displayQuestion();
	        choice = sc.nextInt();
	        if (choice == q10.correctAnswer) System.out.println(GREEN + name + " it is correct answer you rewarded with " + q10.reward + RESET);
	        else { System.out.println(RED + "Wrong Answer! You are eliminated." + RESET); return; }

	        System.out.println(GREEN + "\n🎉 Congratulations! You Won The Game....🎉");

	        sc.close();
	    }
	}
	