package ChibuzorWeekendSnakes;
import java.util.Arrays;
import java.util.Scanner;
public class MBTITest {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            String[] questions = {"Question 1: A. tough-minded, just or B. tender-hearted, merciful?", "Question 2: A. practical, realistic, experiential or B. imaginative, innovative, theoretical?", "Question 3: A. external, communicative, express yourself or B. internal, reticent, keep to yourself?", "Question 4: A. focus on here-and-now or B. look to the future, global perspective, “big picture”?", "Question 5: A. more outgoing, think out loud or B. more reserved, think to yourself?", "Question 6: A. facts, things, “what is” or B. ideas, dreams, “what could be,” philosophical?", "Question 7: A. candid, straight forward, frank or B. tactful, kind, encouraging?", "Question 8: A. plan, schedule or B. unplanned, spontaneous?", "Question 9: A. seek many tasks, public activities, interaction with others or B. seek private, solitary activities with quiet to concentrate?", "Question 10: A. standard, usual, conventional or B. different, novel, unique?", "Question 11: A. firm, tend to criticize, hold the line or B. gentle, tend to appreciate, conciliate?", "Question 12: A. regulated, structured or B. easygoing, “live” and “let live”?", "Question 13: A. interpret literally or B. look for meaning and possibilities?", "Question 14: A. logical, thinking, questioning or B. empathetic, feeling, accommodating?", "Question 15: A. organized, orderly or B. flexible, adaptable?", "Question 16: A. active, initiate or B. reflective, deliberate?", "Question 17: A. seek many tasks at once or B. focus on one thing at a time?", "Question 18: A. logical and analytical or B. creative and imaginative?", "Question 19: A. factual and realistic or B. intuitive and theoretical?", "Question 20: A. objective and impersonal or B. subjective and personal?"};
            String[] answers = new String[20];

            for (int i = 0; i < questions.length; i++) {
                System.out.println(questions[i]);
                String response = input.nextLine();

                while (!response.equalsIgnoreCase("A") && !response.equalsIgnoreCase("B")) {
                    System.out.println("Please enter either 'A' or 'B'");
                    response = input.nextLine();
                }
                answers[i] = response;
            }
            int aCount = 0;
            int bCount = 0;
            for (int i = 0; i < answers.length; i++) {
                if (answers[i].equalsIgnoreCase("A")) {
                    aCount++;
                } else {
                    bCount++;

                }
            }
            if (aCount > bCount) {
                System.out.println("You have a **tough-minded** temperament.");
            } else if (bCount > aCount) {
                System.out.println("You have a **tender-hearted** temperament.");
            } else {
                System.out.println("You have a **balanced** temperament.");
            }
        }
    }


