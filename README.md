# Final-Project
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class FinalProject {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);

        boolean isValid = true;
        while (isValid) {
            //numb of players
            System.out.println("Enter number of players (1 or 2): ");
            int numOfPlayers = input.nextInt();

            if (numOfPlayers == 1) {
                isValid = false;
                onePlayer();
            }

            if (numOfPlayers == 2) {
                isValid = false;
                twoPlayers();
            }

            if (numOfPlayers != 1 && numOfPlayers != 2) {
                System.out.println("Try again, hoe!");
                isValid = true;
            }
        }
    }

    public static void onePlayer() {
        Scanner input = new Scanner(System.in);

        int playerScore = 0;

        System.out.println("Enter player's name: ");
        String player = input.nextLine();

        ArrayList<Integer> numberOrder = QuestionOrder();
        for (int k = 0; k < 10; k++) {
            int number = numberOrder.get(k);
            System.out.println(player + ": Pick a category: ");
            System.out.println("hypebeast");
            System.out.println("memes");
            System.out.println("media");
            System.out.println("science");
            String category = input.nextLine().trim();
            category = category.toLowerCase();

            boolean correctness = false;
            if (category.equals("hypebeast")) {
                correctness = Lauren(number);
            } else if (category.equals("memes")) {
                correctness = Claire(number);
            } else if (category.equals("media")) {
                correctness = Meagan(number);
            } else if (category.equals("science")) {
                correctness = Lenice(number);
            } else {
                System.out.println("Try again, hoe!");
            }

            if (correctness) {
                playerScore += 1;
            }
            System.out.println(player + "'s score: " + playerScore);
        }
    }

    public static void twoPlayers() {
        Scanner input = new Scanner(System.in);

        int player1Score = 0;
        int player2Score = 0;

        System.out.println("Enter player 1's name: ");
        String player1 = input.nextLine();
        System.out.println("Enter player 2's name: ");
        String player2 = input.nextLine();

        ArrayList<Integer> numberOrder = QuestionOrder();
        for (int k = 0; k < 10; k++) {
            int number = numberOrder.get(k);
            System.out.println(player1 + ": Pick a category: ");
            System.out.println("hypebeast");
            System.out.println("memes");
            System.out.println("media");
            System.out.println("science");
            String category1 = input.nextLine().trim();
            category1 = category1.toLowerCase();

            boolean correctness1 = false;
            if (category1.equals("hypebeast")) {
                correctness1 = Lauren(number);
            }
            else if (category1.equals("memes")) {
                correctness1 = Claire(number);
            }
            else if (category1.equals("media")) {
                correctness1 = Meagan(number);
            }
            else if (category1.equals("science")) {
                correctness1 = Lenice(number);
            }
            else {
                System.out.println("Try again, hoe!");
            }

            if (correctness1) {
                player1Score += 1;
            }

            System.out.println(player1 + "'s score: " + player1Score);

            System.out.println(player2 + ": Pick a category: ");
            System.out.println("hypebeast");
            System.out.println("memes");
            System.out.println("media");
            System.out.println("science");
            String category2 = input.nextLine().trim();
            category2 = category2.toLowerCase();

            boolean correctness2 = false;
            if (category2.equals("hypebeast")) {
                correctness2 = Lauren(number);
            }
            else if (category2.equals("memes")) {
                correctness2 = Claire(number);
            }
            else if (category2.equals("media")) {
                correctness2 = Meagan(number);
            }
            else if (category2.equals("science")) {
                correctness2 = Lenice(number);
            }
            else {
                System.out.println("Try again, hoe!");
            }

            if (correctness2) {
                player2Score += 1;
            }
            System.out.println(player2 + "'s score: " + player2Score);
        }
    }

    public static boolean Lauren(int number) {
        Scanner input = new Scanner(System.in);

        if (number == 1) {
                String question = "On Sneaker Shopping with Complex, who spent the most money and how much did they spend?";
                String choice1 = "A: Juice Wrld - $42,032.28";
                String choice2 = "B: Future - $38,971.85";
                String choice3 = "C: Ozuna - $29,312.58";
                String choice4 = "D: Neymar - 18.623.44";
                String questionSection = question + "\n" + choice1 + "\n" + choice2 + "\n" + choice3 + "\n" + choice4;
                System.out.println(questionSection);
            }
        if (number == 2) {
                String question = "What was the retail price for a red Supreme chopstick set? (StockX)";
                String choice1 = "A: $86";
                String choice2 = "B: $74";
                String choice3 = "C: $67";
                String choice4 = "D: $58";
                String questionSection = question + "\n" + choice1 + "\n" + choice2 + "\n" + choice3 + "\n" + choice4;
                System.out.println(questionSection);
            }
            if (number == 3) {
                String question = "How many different colorways are there for the Nike Air Max 97? (mens)";
                String choice1 = "A: Less than 50";
                String choice2 = "B: 50 to 99";
                String choice3 = "C: 100 to 199";
                String choice4 = "D: 200 or more";
                String questionSection = question + "\n" + choice1 + "\n" + choice2 + "\n" + choice3 + "\n" + choice4;
                System.out.println(questionSection);
            }
            if (number == 4) {
                String question = "What’s the most expensive mens Jordan 1 and its price? (StockX)";
                String choice1 = "A: Retro High Travis Scott - $29,000";
                String choice2 = "B: OG Chicago (1985) - $28,000";
                String choice3 = "C: Retro High Off-White - $24,000";
                String choice4 = "D: Retro High Satin Banned - $16,000";
                String questionSection = question + "\n" + choice1 + "\n" + choice2 + "\n" + choice3 + "\n" + choice4;
                System.out.println(questionSection);
            }
            if (number == 5) {
                String question = "How much does the Supreme brick resell for? (StockX)";
                String choice1 = "A: $352";
                String choice2 = "B: $239";
                String choice3 = "C: $193";
                String choice4 = "D: $156";
                String questionSection = question + "\n" + choice1 + "\n" + choice2 + "\n" + choice3 + "\n" + choice4;
                System.out.println(questionSection);
            }
            if (number == 6) {
                String question = "How many different Supreme box logo sticker designs have been produced?";
                String choice1 = "A: Less than 50";
                String choice2 = "B: 50 to 100";
                String choice3 = "C: 100 to 150";
                String choice4 = "D: 150 or more";
                String questionSection = question + "\n" + choice1 + "\n" + choice2 + "\n" + choice3 + "\n" + choice4;
                System.out.println(questionSection);
            }
            if (number == 7) {
                String question = "Who is the founder of Off-White?";
                String choice1 = "A: Lev Tanju";
                String choice2 = "B: Virgil Abloh";
                String choice3 = "C: Ronnie Fieg";
                String choice4 = "D: Bill Bowerman";
                String questionSection = question + "\n" + choice1 + "\n" + choice2 + "\n" + choice3 + "\n" + choice4;
                System.out.println(questionSection);
            }
            if (number == 8) {
                String question = "What’s the resale value for a pair of Nike Air Mags?";
                String choice1 = "A: $62,740";
                String choice2 = "B: $56,180";
                String choice3 = "C: $49,950";
                String choice4 = "D: $42,280";
                String questionSection = question + "\n" + choice1 + "\n" + choice2 + "\n" + choice3 + "\n" + choice4;
                System.out.println(questionSection);
            }
            if (number == 9) {
                String question = "What is f.o.g.?";
                String choice1 = "A: A visible aerosol consisting of tiny water droplets or ice crystals suspended in the " + "\n" + "air near the earths surface";
                String choice2 = "B: An environmental agency that has also become known for their T-shirts";
                String choice3 = "C: A religious group, named “Fear of God” that’s focused on spreading his word to the " + "\n" + "youth via fear tactics";
                String choice4 = "D: A clothing brand named “Fear of God” that really has nothing to do with religion";
                String questionSection = question + "\n" + choice1 + "\n" + choice2 + "\n" + choice3 + "\n" + choice4;
                System.out.println(questionSection);
            }
            if (number == 0) {
                String question = "What brand has Off-White not collaborated with?";
                String choice1 = "A: Nike";
                String choice2 = "B: Timberland";
                String choice3 = "C: Supreme";
                String choice4 = "D: Ikea";
                String questionSection = question + "\n" + choice1 + "\n" + choice2 + "\n" + choice3 + "\n" + choice4;
                System.out.println(questionSection);
            }

            String answer = input.nextLine();
            answer = answer.toUpperCase();

            if (LaurenAnswer(number, answer)) {
                return true;
            }

            else {
                return false;
            }
    }

    public static boolean Claire(int number) {
        Scanner input = new Scanner(System.in);
        if (number == 1) {
            String question = "What day was the Area 51 raid?";
            String choice1 = "A: September 20, 2019";
            String choice2 = "B: September 15, 2019";
            String choice3 = "C: September 18, 2019";
            String choice4 = "D: September 25, 2019";
            String questionSection = question + "\n" + choice1 + "\n" + choice2 + "\n" + choice3 + "\n" + choice4;
            System.out.println(questionSection);
        }
        if (number == 2) {
            String question = "What day is it my dudes?";
            String choice1 = "A: Monday";
            String choice2 = "B: Tuesday";
            String choice3 = "C: Wednesday";
            String choice4 = "D: Thursday";
            String questionSection = question + "\n" + choice1 + "\n" + choice2 + "\n" + choice3 + "\n" + choice4;
            System.out.println(questionSection);
        }
        if (number == 3) {
            String question = "What is the name of the Gorilla that died May 28, 2016?";
            String choice1 = "A: Harambe";
            String choice2 = "B: Harold";
            String choice3 = "C: Harry";
            String choice4 = "D: Harrison";
            String questionSection = question + "\n" + choice1 + "\n" + choice2 + "\n" + choice3 + "\n" + choice4;
            System.out.println(questionSection);
        }
        if (number == 4) {
            String question = "What does dat boi ride?";
            String choice1 = "A: Bicycle";
            String choice2 = "B: Tricycle";
            String choice3 = "C: Moped";
            String choice4 = "D: Unicycle";
            String questionSection = question + "\n" + choice1 + "\n" + choice2 + "\n" + choice3 + "\n" + choice4;
            System.out.println(questionSection);
        }
        if (number == 5) {
            String question = "...and they were ________";
            String choice1 = "A: Sisters";
            String choice2 = "B: Roommates";
            String choice3 = "C: Siblings";
            String choice4 = "D: Married";
            String questionSection = question + "\n" + choice1 + "\n" + choice2 + "\n" + choice3 + "\n" + choice4;
            System.out.println(questionSection);
        }
        if (number == 6) {
            String question = "Damn Daniel back at it again with the _________";
            String choice1 = "A: Red Pumas";
            String choice2 = "B: White Vans";
            String choice3 = "C: Black Nikes";
            String choice4 = "D: Blue Converse";
            String questionSection = question + "\n" + choice1 + "\n" + choice2 + "\n" + choice3 + "\n" + choice4;
            System.out.println(questionSection);
        }
        if (number == 7) {
            String question = "Who is making the fist?";
            String choice1 = "A: Arthur";
            String choice2 = "B: Bart Simpson";
            String choice3 = "C: Steven Universe";
            String choice4 = "D: Timmy Turne";
            String questionSection = question + "\n" + choice1 + "\n" + choice2 + "\n" + choice3 + "\n" + choice4;
            System.out.println(questionSection);
        }
        if (number == 8) {
            String question = "Is this a ______?";
            String choice1 = "A: Pidgeon";
            String choice2 = "B: Duck";
            String choice3 = "C: Butterfly";
            String choice4 = "D: Robin";
            String questionSection = question + "\n" + choice1 + "\n" + choice2 + "\n" + choice3 + "\n" + choice4;
            System.out.println(questionSection);
        }
        if (number == 9) {
            String question = "What emotion is this cat?";
            String choice1 = "A: Angry";
            String choice2 = "B: Mad";
            String choice3 = "C: Sad";
            String choice4 = "D: Grumpy";
            String questionSection = question + "\n" + choice1 + "\n" + choice2 + "\n" + choice3 + "\n" + choice4;
            System.out.println(questionSection);
        }
        if (number == 0) {
            String question = "Hurricane Katrina?  More like Hurricane ________";
            String choice1 = "A: Harambe";
            String choice2 = "B: Tortilla";
            String choice3 = "C: Hurricane";
            String choice4 = "D: Chicken";
            String questionSection = question + "\n" + choice1 + "\n" + choice2 + "\n" + choice3 + "\n" + choice4;
            System.out.println(questionSection);
        }

        String answer = input.nextLine();
        answer = answer.toUpperCase();

        if (ClaireAnswer(number, answer)) {
            return true;
        }

        else {
            return false;
        }
    }

    public static boolean Meagan(int number) {
        Scanner input = new Scanner(System.in);
        if (number == 1) {
            String question = "What is the name of the movie that Michael Scott makes in The Office?Wo is the founder of Off-White?";
            String choice1 = "A: Threat Level Midnight";
            String choice2 = "B: The Office: An American Workplace";
            String choice3 = "C: Battlestar Galactica";
            String choice4 = "D: The Dundies";
            String questionSection = question + "\n" + choice1 + "\n" + choice2 + "\n" + choice3 + "\n" + choice4;
            System.out.println(questionSection);
        }

        if (number == 2) {
            String question = "What was the name of Friends before it was called Friends?";
            String choice1 = "A: Central Perk";
            String choice2 = "B: Six of One";
            String choice3 = "C: The One";
            String choice4 = "D: None of the above, Friends was the only name for the show";
            String questionSection = question + "\n" + choice1 + "\n" + choice2 + "\n" + choice3 + "\n" + choice4;
            System.out.println(questionSection);
        }
        if (number == 3) {
            String question = "What kind of dog is Brian from Family Guy?";
            String choice1 = "A: Beagle";
            String choice2 = "B: Mutt";
            String choice3 = "C: Bulldog";
            String choice4 = "D: Labrador";
            String questionSection = question + "\n" + choice1 + "\n" + choice2 + "\n" + choice3 + "\n" + choice4;
            System.out.println(questionSection);
        }
        if (number == 4) {
            String question = "What is Rick’s “universe number” from Rick and Morty?";
            String choice1 = "A: C-133";
            String choice2 = "B: C-137";
            String choice3 = "C: C-139";
            String choice4 = "D: C-142";
            String questionSection = question + "\n" + choice1 + "\n" + choice2 + "\n" + choice3 + "\n" + choice4;
            System.out.println(questionSection);
        }
        if (number == 5) {
            String question = "In the season Freak Show of American Horror Story, what is the name of the killer clown??";
            String choice1 = "A: Pogo";
            String choice2 = "B: Rusty";
            String choice3 = "C: Twisty";
            String choice4 = "D: Bozo";
            String questionSection = question + "\n" + choice1 + "\n" + choice2 + "\n" + choice3 + "\n" + choice4;
            System.out.println(questionSection);
        }
        if (number == 6) {
            String question = "According to the episode, ‘Mrs. Puff, You’re Fired’, how many times has Spongebob failed the boating exam?";
            String choice1 = "A: 25";
            String choice2 = "B: 69";
            String choice3 = "C: 420";
            String choice4 = "D: 1,258,056";
            String questionSection = question + "\n" + choice1 + "\n" + choice2 + "\n" + choice3 + "\n" + choice4;
            System.out.println(questionSection);
        }
        if (number == 7) {
            String question = "WWhat is Leslie Knope’s favorite food in Parks and Recreation?";
            String choice1 = "A: Waffles";
            String choice2 = "B: Pancakes";
            String choice3 = "C: French toast";
            String choice4 = "D: Eggs";
            String questionSection = question + "\n" + choice1 + "\n" + choice2 + "\n" + choice3 + "\n" + choice4;
            System.out.println(questionSection);
        }
        if (number == 8) {
            String question = "Which of the following is the first Pokemon that Ash catches?";
            String choice1 = "A: Pidgie";
            String choice2 = "B: Squirtle";
            String choice3 = "C: Pikachu";
            String choice4 = "D: Caterpie";
            String questionSection = question + "\n" + choice1 + "\n" + choice2 + "\n" + choice3 + "\n" + choice4;
            System.out.println(questionSection);
        }
        if (number == 9) {
            String question = "How does Joyce communicate with her missing son, Will, in season one of Stranger Things?";
            String choice1 = "A: Christmas lights";
            String choice2 = "B: Oujia board";
            String choice3 = "C: Her phone";
            String choice4 = "D: A tree";
            String questionSection = question + "\n" + choice1 + "\n" + choice2 + "\n" + choice3 + "\n" + choice4;
            System.out.println(questionSection);
        }
        if (number == 0) {
            String question = "Who is Andrew’s hormone monster in Big Mouth?";
            String choice1 = "A: Rick";
            String choice2 = "B: Morty";
            String choice3 = "C: Maurice";
            String choice4 = "D: Steve";
            String questionSection = question + "\n" + choice1 + "\n" + choice2 + "\n" + choice3 + "\n" + choice4;
            System.out.println(questionSection);
        }

        String answer = input.nextLine();
        answer = answer.toUpperCase();

        if (MeaganAnswer(number, answer)) {
            return true;
        }

        else {
            return false;
        }
    }

    public static boolean Lenice(int number) {
        Scanner input = new Scanner(System.in);
        if (number == 1) {
            String question = "What is a tomato categorized as?";
            String choice1 = "A: Both";
            String choice2 = "B: Fruit";
            String choice3 = "C: Neither";
            String choice4 = "D: Vegetable";
            String questionSection = question + "\n" + choice1 + "\n" + choice2 + "\n" + choice3 + "\n" + choice4;
            System.out.println(questionSection);
        }
        if (number == 2) {
            String question = "What is the longest type of cell in the human body?";
            String choice1 = "A: Skin Cells";
            String choice2 = "B: Blood Cells";
            String choice3 = "C: Muscle Cells";
            String choice4 = "D: Nerve Cells";
            String questionSection = question + "\n" + choice1 + "\n" + choice2 + "\n" + choice3 + "\n" + choice4;
            System.out.println(questionSection);
        }
        if (number == 3) {
            String question = "What is the age of the earth?";
            String choice1 = "A: about 4.5 trillion years";
            String choice2 = "B: about 5.4 trillion years";
            String choice3 = "C: about 4.5 billion years";
            String choice4 = "D: about 5.4 billion years";
            String questionSection = question + "\n" + choice1 + "\n" + choice2 + "\n" + choice3 + "\n" + choice4;
            System.out.println(questionSection);
        }
        if (number == 4) {
            String question = "What is the fastest rotating planet?";
            String choice1 = "A: Mercury";
            String choice2 = "B: Venus";
            String choice3 = "C: Saturn";
            String choice4 = "D: Jupiter";
            String questionSection = question + "\n" + choice1 + "\n" + choice2 + "\n" + choice3 + "\n" + choice4;
            System.out.println(questionSection);
        }
        if (number == 5) {
            String question = "How many bones are in the adult human body?";
            String choice1 = "A: 198";
            String choice2 = "B: 206";
            String choice3 = "C: 243";
            String choice4 = "D: 300";
            String questionSection = question + "\n" + choice1 + "\n" + choice2 + "\n" + choice3 + "\n" + choice4;
            System.out.println(questionSection);
        }
        if (number == 6) {
            String question = "How many bones are in the infant human body?";
            String choice1 = "A: 198";
            String choice2 = "B: 206";
            String choice3 = "C: 243";
            String choice4 = "D: 300";
            String questionSection = question + "\n" + choice1 + "\n" + choice2 + "\n" + choice3 + "\n" + choice4;
            System.out.println(questionSection);
        }
        if (number == 7) {
            String question = "Which element can burn on the surface of water?";
            String choice1 = "A: Mercury";
            String choice2 = "B: Potassium";
            String choice3 = "C: Helium";
            String choice4 = "D: Krypton";
            String questionSection = question + "\n" + choice1 + "\n" + choice2 + "\n" + choice3 + "\n" + choice4;
            System.out.println(questionSection);
        }
        if (number == 8) {
            String question = "What is the world's largest ocean?";
            String choice1 = "A: Atlantic";
            String choice2 = "B: Pacific";
            String choice3 = "C: Indian";
            String choice4 = "D: Arctic";
            String questionSection = question + "\n" + choice1 + "\n" + choice2 + "\n" + choice3 + "\n" + choice4;
            System.out.println(questionSection);
        }
        if (number == 9) {
            String question = "What is the largest to have ever live?";
            String choice1 = "A: Whale Shark";
            String choice2 = "B: Hammerhead";
            String choice3 = "C: Great White";
            String choice4 = "D: Megalodan";
            String questionSection = question + "\n" + choice1 + "\n" + choice2 + "\n" + choice3 + "\n" + choice4;
            System.out.println(questionSection);
        }
        if (number == 0) {
            String question = "If you mix all the colors in the light spectrum together, what color do you get?";
            String choice1 = "A: None of the above";
            String choice2 = "B: Rainbow";
            String choice3 = "C: White";
            String choice4 = "D: Black";
            String questionSection = question + "\n" + choice1 + "\n" + choice2 + "\n" + choice3 + "\n" + choice4;
            System.out.println(questionSection);
        }

        String answer = input.nextLine();
        answer = answer.toUpperCase();

        if (LeniceAnswer(number, answer)) {
            return true;
        }

        else {
            return false;
        }
    }

    public static boolean LaurenAnswer(int number, String answer) {
        if (number == 1 && answer.equals("A")) {
            return true;
        }
        if (number == 2 && answer.equals("D")) {
            return true;
        }
        if (number == 3 && answer.equals("D")) {
            return true;
        }
        if (number == 4 && answer.equals("B")) {
            return true;
        }
        if (number == 5 && answer.equals("C")) {
            return true;
        }
        if (number == 6 && answer.equals("D")) {
            return true;
        }
        if (number == 7 && answer.equals("B")) {
            return true;
        }
        if (number == 8 && answer.equals("B")) {
            return true;
        }
        if (number == 9 && answer.equals("D")) {
            return true;
        }
        if (number == 0 && answer.equals("C")) {
            return true;
        }
        else {
            return false;
        }
    }

    public static boolean ClaireAnswer(int number, String answer) {
        if (number == 1 && answer.equals("A")) {
            return true;
        }
        if (number == 2 && answer.equals("C")) {
            return true;
        }
        if (number == 3 && answer.equals("A")) {
            return true;
        }
        if (number == 4 && answer.equals("D")) {
            return true;
        }
        if (number == 5 && answer.equals("B")) {
            return true;
        }
        if (number == 6 && answer.equals("B")) {
            return true;
        }
        if (number == 7 && answer.equals("A")) {
            return true;
        }
        if (number == 8 && answer.equals("B")) {
            return true;
        }
        if (number == 9 && answer.equals("D")) {
            return true;
        }
        if (number == 0 && answer.equals("B")) {
            return true;
        }
        else {
            return false;
        }
    }

    public static boolean MeaganAnswer(int number, String answer) {
        if (number == 1 && answer.equals("A")) {
            return true;
        }
        if (number == 2 && answer.equals("B")) {
            return true;
        }
        if (number == 3 && answer.equals("D")) {
            return true;
        }
        if (number == 4 && answer.equals("B")) {
            return true;
        }
        if (number == 5 && answer.equals("C")) {
            return true;
        }
        if (number == 6 && answer.equals("D")) {
            return true;
        }
        if (number == 7 && answer.equals("A")) {
            return true;
        }
        if (number == 8 && answer.equals("D")) {
            return true;
        }
        if (number == 9 && answer.equals("A")) {
            return true;
        }
        if (number == 0 && answer.equals("C")) {
            return true;
        }
        else {
            return false;
        }
    }

    public static boolean LeniceAnswer(int number, String answer) {
        if (number == 1 && answer.equals("B")) {
            return true;
        }
        if (number == 2 && answer.equals("D")) {
            return true;
        }
        if (number == 3 && answer.equals("C")) {
            return true;
        }
        if (number == 4 && answer.equals("D")) {
            return true;
        }
        if (number == 5 && answer.equals("B")) {
            return true;
        }
        if (number == 6 && answer.equals("D")) {
            return true;
        }
        if (number == 7 && answer.equals("B")) {
            return true;
        }
        if (number == 8 && answer.equals("B")) {
            return true;
        }
        if (number == 9 && answer.equals("D")) {
            return true;
        }
        if (number == 0 && answer.equals("C")) {
            return true;
        }
        else {
            return false;
        }
    }

    public static ArrayList<Integer> QuestionOrder() {
        ArrayList<Integer> questions = new ArrayList<Integer>();
        //int number = (int) (Math.random() * 10);
        for (int i = 0; i < 10; i++) {
            questions.add(i);
        }

        Collections.shuffle(questions);

        int number;
        for (int i = 0; i < 10; i++) {
            number = questions.get(i);
        }
        return questions;
    }
}
