import java.time.LocalTime;
import java.util.Scanner;
import java.util.Base64;

@SuppressWarnings("BusyWait")
public class ShatGPT {

    private static ShatGPTFace face;

    public ShatGPT(ShatGPTFace face) {
        ShatGPT.face = face;
    }

    private final static String[] CLOSERS_ARRAY = {" yup.", " yeah."," pretty much."," thats about it."," like that yeah.", " (:", " uh huh.", " like yeah."," you understand yeah."};
    private final static String[] ANSWERS_ARRAY = {" yeah"," so"," basically uh,"," like"," uhm"," so what ur gonna need to do:"," is uh,"," well..."," its kinda hard to explain but,"," or something"," i mean its complicated but", " its kinda like..", " uh lemme think... ", " ur gonna want to,", " think about how,", " alright so", " you know?", " hmm,", " ummm,", " ermmmmmmm...", " right??", " oh wait yeah i remember,", " really", " to be honest,", " you see...", " image you had three apples..", " imagine you had one apple..", " imagine you had a goat.. actually nvm.", " think of it like on a scale from 1 to 10.."};
    private final static String[] OPENERS_ARRAY = {"its pretty straight forward,","pretty much like", "you gotta kinda","alright so,","what you gotta do","so its like","its simple"};
    private final static String[] LOADING_ARRAY = {"tinking","calcoolating", "accesing intornmet", "stealoing governmt docoments", "emailinmg the preseindt", "downloading malware", "asking ChatGPT", "drinking root beer", "analysing ur search history", "deleting system32", "downloadig steam and instalng bat rats", "hackng NSA", "consultng libary of babel", "rebooting", "starting over", "oops misclick, restartign", "clearing tabs", "reflecting internally", "simulating a goat", "DDOSing you wtih ShartNET", "refueling engine", "replacing wiper fluid", "pondering my orb", "aligning chakras", "looking at YOUR FACEEEE!!!!!", "posting on r/askreddit"};

    private final static String[][] VARIETY_ARRAY = {{"yeah", "yup", "yea he is", "i thought it was obvious"},  // row 0, length 4 - yes
            {"42", "42 obvs", "fourty-two"},                           // row 1, length 3 - 42
            {"I LOVE PSNGEOBOBE!!!!!", "SPOINGLEBONGLE IS MY FAVORITE!!!", "spongebob..,,., i luv spoingbob.....,", "did someone say spongebob, i luv sponglebob"}, // row 2, length 4 - Spongebob
            {"ur r kinda loud maine....,.","why are u yeling.... ude..", "why are u sor loud this is a publik plase...", "can ytou starp yeling please??"},         // row 3, length 4 -
            {"not a quesyion.... no quesion cark", "not areal qustion, you nerd a quesion mark..","ur need a quison stark,.."}, // row 4, length 3 - quesion cark
            {"hope dart helpd!!", "hope that answerd ur qusion!!", "ur welcum for hte anser!!", "lemmer nkow if you have an e mor quesions!!"}, // row 5, length 4 - bad words VARIETY_ARRAY
            {"no bard words.... rudeee..","hey man no bad wards...","yer bro chill out with the bad werds yeah?","no fowl language,... kids are listenign..,.,"}, // row 6, length 4 - bad words
            {"yeah i can answer that, one second..","okay yeah lemme think..","ok just gimme a segond...","i gotta think about that one...."}, // row 7, length 4 - thinking
            {"ur very annoying,, goodbye..", "three strikes bud... goobdye..", "ur not veyr smert are u.. goobdye..", "i dont feel like talkign 2 u anymore.. goodbye.."}, // row 8, length 4 - three strikes
            {"look outside????", "idk look out the windows maybe", "why would i know i cant see", "probably like raining acid or something idk"}}; // row 9, length 4 - weather

    public static void slowPrint(String output, int delay) {
        for (int i = 0; i < output.length(); i++) {
            char c = output.charAt(i);
            System.out.print(c);

            if(Math.random() >= 0.65)
                face.flipFace();

            try {
                Thread.sleep(delay);
            }
            catch (Exception e) {}
        }
        face.loadingFace();
    }
    
    public static void respond() {
        Scanner scan = new Scanner(System.in);
        String question;

        int strikes = 0;

        while(true) {
            face.bounceStart();
            if(strikes == 3) {
                face.angryFace();
                slowPrint("ShatGPT:\n  " + VARIETY_ARRAY[8][(int) (Math.random() * 4)] + "\n\n", 40);
                System.exit(0);
                break;
            }
            question = scan.nextLine();
            face.bounceStop();
            System.out.println();

            question:
            if (question.contains("?")) {
                if (question.toLowerCase().contains(new String(Base64.getDecoder().decode("ZnVjaw=="))) ||
                        question.toLowerCase().contains(new String(Base64.getDecoder().decode("Yml0Y2g="))) ||
                        question.toLowerCase().contains(new String(Base64.getDecoder().decode("c2hpdA=="))) ||
                        question.toLowerCase().contains(new String(Base64.getDecoder().decode("YXNz")))) {
                    face.angryFace();
                    slowPrint("ShatGPT:\n  " + VARIETY_ARRAY[6][(int) (Math.random() * 4)] + "\n\n", 40);
                    strikes++;
                    face.addStrike();
                    face.angryFace();
                    break question;
                }
                if (question.toLowerCase().contains("is") && question.toLowerCase().contains("gay")) {
                    slowPrint("ShatGPT:\n  " + VARIETY_ARRAY[0][(int) (Math.random() * 4)] + "\n\n", 40);
                    break question;
                }
                if (question.toLowerCase().contains("life")) {
                    slowPrint("ShatGPT:\n  " + VARIETY_ARRAY[1][(int) (Math.random() * 3)] + "\n\n", 40);
                    break question;
                }
                if (question.toLowerCase().contains("spongebob")) {
                    slowPrint("ShatGPT:\n  " + VARIETY_ARRAY[2][(int) (Math.random() * 4)] + "\n\n", 40);
                    break question;
                }
                if (question.toLowerCase().contains("date") || question.toLowerCase().contains("time")) {
                    String[] months = {"january", "february", "march", "april", "may", "june", "july", "august", "september", "october", "november", "december"};
                    String time = LocalTime.now().getHour() + ":" + LocalTime.now().getMinute();
                    slowPrint("ShatGPT:\n  the time is " + time + " and the date is like " + months[(int) (Math.random() * 11)] + " " + (int) (Math.random() * 30) + " " + (int) ((Math.random() * (2099 - 1776 + 1)) + 1776) + " or something idk man\n\n", 40);
                    break question;
                }
                if (question.toLowerCase().contains("weather")) {
                    slowPrint("ShatGPT:\n  " + VARIETY_ARRAY[9][(int) (Math.random() * 4)] + "\n\n", 40);
                    break question;
                }
                if (question.contains("!")) {
                    face.addStrike();
                    strikes++;
                    slowPrint("ShatGPT:\n  " + VARIETY_ARRAY[3][((int) (Math.random() * 4))] + "\n\n", 40);
                    break question;
                }

                slowPrint("ShatGPT:\n  you asked.... " + question + " " + VARIETY_ARRAY[7][(int) (Math.random() * 4)] + "\n", 40);
                face.thinkingFace();
                generateLoading();
                face.thinkingFace();
                respondDefault();

            } else if (question.isEmpty()) {
            } else if (question.toLowerCase().contains("exit") || question.toLowerCase().contains("goodbye")) {
                slowPrint("ShatGPT:\n  goodbye!!\n\n", 40);
                System.exit(0);
                break;
            } else if (question.toLowerCase().contains(new String(Base64.getDecoder().decode("ZnVjaw=="))) ||
                    question.toLowerCase().contains(new String(Base64.getDecoder().decode("Yml0Y2g="))) ||
                    question.toLowerCase().contains(new String(Base64.getDecoder().decode("c2hpdA=="))) ||
                    question.toLowerCase().contains(new String(Base64.getDecoder().decode("YXNz")))) {
                face.angryFace();
                slowPrint("ShatGPT:\n  " + VARIETY_ARRAY[6][(int) (Math.random() * 4)] + "\n\n", 40);
                face.addStrike();
                strikes++;
                face.angryFace();
            } else if (question.contains("!")) {
                face.addStrike();
                strikes++;
                slowPrint("ShatGPT:\n  " + VARIETY_ARRAY[3][((int)(Math.random() * 4))] + "\n\n", 40);
            } else {
                face.addStrike();
                strikes++;
                face.angryFace();
                slowPrint("ShatGPT:\n  " + VARIETY_ARRAY[4][((int)(Math.random() * 3))] + "\n\n", 40);
                face.angryFace();
            }

        }

    }

    public static void generateLoading() {
        for (int i = 0; i < (Math.random() * 3) + 2; i++) {                     // Loading
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
            slowPrint("\n" + LOADING_ARRAY[(int) (Math.random() * 25)] + "...", 50);
        }
    }

    public static void respondDefault() {
        String response;

        try {
            Thread.sleep(1000);
        } catch (Exception e) {}
        response = OPENERS_ARRAY[(int) (Math.random() * OPENERS_ARRAY.length)];   // Opener

        int ite = (int)((Math.random() * 40) + 10);                             // Middle part
        StringBuilder responseBuilder = new StringBuilder(response);
        for (int i = 0; i < ite; i++) {
            responseBuilder.append(ANSWERS_ARRAY[(int) (Math.random() * ANSWERS_ARRAY.length)]);
        }
        response = responseBuilder.toString();
        response += CLOSERS_ARRAY[(int) (Math.random() * CLOSERS_ARRAY.length)];  // Closer

        slowPrint("\n\nShatGPT:\n  " + response, 40);                  // Print response

        try {                                                                   //Goodbye
            Thread.sleep(2000);
        } catch (Exception e) {}
        slowPrint("\n\nShatGPT:\n    " + VARIETY_ARRAY[5][((int) (Math.random() * 3)) + 1] + "\n\n", 50);
    }

}
