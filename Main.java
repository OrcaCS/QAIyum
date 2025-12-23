import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String input;
        final double ONE_BANANA_CHANCE = 0.19; // random from .0 to .99; 0.49 is 50% chance
        final double TRANSFORMERS_CHANCE = 0.19;
        final double FIFTY_FIRST_STATE_CHANCE = 0.39;
        final double INFLATION_CHANCE = 0.59;
        final double POPULATION_TRIANGLE_CHANCE = 0.70;
        final double SLEEP_CHANCE = 0.75;
        final double BRAINWASHING_CHANCE = 0.80;
        
        avatar();
        System.out.println("\nHello! I'm QAIyum, a robot version of Mr. Qayum. I amm realy goood aat speling.");
        
        while (true) {
        input = keyboard.nextLine().toLowerCase().trim();
        double random = Math.random();
        
            if (input.contains("one banana")) {
                twoBanana();
            } else if (input.contains("selfie")) {
                System.out.println("Sending selfie...");
                selfie();
            } else {
                if (random <= ONE_BANANA_CHANCE) {
                    oneBanana();
                } else {
                    random = Math.random();
                    
                    if (random <= TRANSFORMERS_CHANCE) {
                        transformers();
                    } else if ((random > TRANSFORMERS_CHANCE) && (random <= FIFTY_FIRST_STATE_CHANCE)) {
                        System.out.println("Should Canada be the 51st state?");
                    } else if ((random > FIFTY_FIRST_STATE_CHANCE) && (random <= INFLATION_CHANCE)) {
                        System.out.println("What do you think about the current state of inflation due to excessive money printing?");
                    } else if ((random > INFLATION_CHANCE) && (random <= POPULATION_TRIANGLE_CHANCE)) {
                        System.out.println("Have you seen Canada's population triangle? Aren't you concerned about the ratio of working class people to non-working class people?");
                    } else if ((random > POPULATION_TRIANGLE_CHANCE) && (random <= SLEEP_CHANCE)) {
                        System.out.println("I sleepp a heallthy amonut!! I probably get mor sleep then u!!!");
                    } else if ((random > SLEEP_CHANCE) && (random <= BRAINWASHING_CHANCE)) {
                        System.out.println("The government is brainwashing us regarding COVID-19. Be skeptical. Don't trust anything they say!!1!");
                    } else {
                        System.out.println("Live on aa farrm and make ur kidz workk!!!1!!");
                    }
                }
            }
        }
    }
    
    public static void twoBanana() {
        System.out.println("Two banana.");
    }
    
    public static void oneBanana() {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("\nOne banana.");
        
        while (true) {
            String input = keyboard.nextLine().toLowerCase().trim();
            if (input.contains("two banana") || input.contains("two banana.") || input.contains("two banana!")) {
                System.out.println("One pound!!1!\n");
                break;
            } else {
                System.out.println("One banana. I won't sttop until you anwser me properlly. I am goign to keep bothernig u with this.");
            }
        }
    }

    public static void avatar() {
        OpenAvatar openAvatar = new OpenAvatar();
        openAvatar.main();
    }
    
    public static void selfie() {
        SendSelfie sendSelfie = new SendSelfie();
        sendSelfie.main(null);
    }
    
    public static void transformers() {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Chooose between pokemon andd transformers.");
        String input = keyboard.nextLine().toLowerCase().trim();
        
        if (input.contains("pokemon") && !input.contains("transformers")) {
            System.out.println("This iis what's wrong with society.");
        } else {
            System.out.println("I hate pokemon. Transformers are better.");
        }
    }
}
