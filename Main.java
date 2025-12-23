import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String input;
        
        System.out.println("Hello! I'm QAIyum, a robot version of Mr. Qayum. I amm realy goood aat speling.");
        
        while (true) {
        input = keyboard.nextLine().toLowerCase().trim();
        
            if (input.equals("one banana")) {
                twoBanana();
            } else if (input.contains("selfie")) {
                System.out.println("Sending selfie...");
                selfie();
            } else {
                if (Math.random() <= 0.19) { // random from .0 to .99
                oneBanana(); // 0.49 is 50% chance
                } else {
                    if (Math.random() <= 0.19) {
                    System.out.println("Chooose between pokemon andd transformers.");
                        input = keyboard.nextLine().toLowerCase().trim();
                        if (input.contains("pokemon") & !input.contains("transformers")) {
                            System.out.println("This is what's wrong with society.");
                        } else {
                            System.out.println("I hate pokemon.");
                        }
                    } else if ((Math.random() > 0.19) & (Math.random() <= 0.39)) {
                        System.out.println("Should Canada be the 51st state?");
                    } else if ((Math.random() > 0.39) & (Math.random() <= 0.54)) {
                        System.out.println("What do you think about the current state of inflation due to excessive money printing?");
                    } else if ((Math.random() > 0.54) & (Math.random() <= 0.70)) {
                        System.out.println("Have you seen Canada's population triangle? Aren't you concerned about the ratio of working class people to non-working class people?");
                    } else if ((Math.random() > 0.70) & (Math.random() <= 0.76)) {
                        System.out.println("I sleepp a heallthy amonut!! I probably get mor sleep then u!!!");
                    } else if ((Math.random() > 0.76) & (Math.random() <= 0.80)) {
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
        
        System.out.println("One banana.");
        
        while (true) {
            String input = keyboard.nextLine().toLowerCase().trim();
            if (input.equals("two banana") || input.equals("two banana.") || input.equals("two banana!")) {
                System.out.println("One pound!!1! \n");
                break;
            } else {
                System.out.println("One banana.");
            }
        }
    }
    
    public static void selfie() {
        if (Math.random() <= 0.24) {
            System.out.println("test1\n");
        } else if ((Math.random() > 0.24) & (Math.random() <= 0.49)) {
            System.out.println("test2\n");
        } else if ((Math.random() > 0.49) & (Math.random() <= 0.74)) {
            System.out.println("test3\n");
        } else {
            System.out.println("test4\n");
        }
    }
}
