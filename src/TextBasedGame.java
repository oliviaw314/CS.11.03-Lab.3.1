import java.util.Scanner;
public class TextBasedGame {
    public static void main(String[] args) {
        System.out.println("This is a fun adventure game created by Olivia Wong. Please reply in lower case and in yes or no unless specified otherwise.");
        System.out.println("Please enter your age:");
        Scanner scanner = new Scanner(System.in);
        int age = Integer.parseInt(scanner.nextLine());
        if (age*3>=300) {
            System.out.println(woo(age));
            return;
        }
        else if (age>5) {
            System.out.println("Great let's continue!");
        }
        else if (age<=5) {
            System.out.println("I know you're not " +age+ "-years old. Enter your real age please");
            int another = Integer.parseInt(scanner.nextLine());
            if (another*3>=300) {
                System.out.println(woo(age));
                return;
            }
            else if (another>5) {
                System.out.println("Great let's continue!");
            }
            else if (another<=5) {
                System.out.println("Ok. You did it again. Goodbye.");
                return;
            }
        }
        System.out.println("It's a dark stormy night, and your phone starts ringing on your bedside. Do you pick it up?");
        perform();
    }
    public static String woo(int age){
        return "You're " + age+ "-years old? How are you even playing this game?\nSorry, you are too old for this. Bye!";
    }
    public static void perform() {
        Scanner scanner = new Scanner(System.in);
        String yesNo = scanner.nextLine();
        if (yesNo.contains("yes")) {
            System.out.println("You pick it up, and there's a voice on the other end telling you to meet in front of your house at 7:00 pm. You check your watch, that's in 5 minutes. Do you go?");
            String go = scanner.nextLine();
            if (go.contains("no")) {
                System.out.println("You reject the offer and hang up the phone. But all of a sudden, you hear banging outside of your window and you take a look.");
                System.out.println("It's a guy in a black hoodie gesturing for you to come down. You hesitantly get up from your bed and go to the front door.");
                encounter();
            }
            if (go.contains("yes")) {
                System.out.println("You walk down the stairs to your front door and open the door and see a guy in a black hoodie.");
                encounter();
            }
        }
        else if (yesNo.contains("no")) {
            notPerform();
        }
    }

    public static void notPerform() {
            System.out.println("You ignore the phone call and go back to work. But then you hear banging outside of your window and you take a look.");
            System.out.println("It's a guy in a black hoodie gesturing for you to come down. You hesitantly get up from your bed and go to the front door.");
            encounter();
        }

    public static void encounter() {
        System.out.println("You open the door and see the man standing ominously.");
        System.out.println("Do you yell at him to leave or do you politely say hi?");
        Scanner scanner = new Scanner(System.in);
            String greeting = scanner.nextLine();
        if (greeting.contains("yell") || greeting.contains("leave")) {
            System.out.println("'I don't know you, get away!' You yell at him. Before you slam the door on him.");
            proceed();
        }
        if (greeting.contains("polite") || greeting.contains("hi")) {
            System.out.println("'Hello. Who are you?' You politely say. 'That's not important.'");
            proceed();
    }
    }

    public static void proceed() {
        System.out.println("He says 'I know your past as a skilled thief.' You freeze, how does he know? You had buried that part of your past as deep as you could.");
        System.out.println("'Tonight the temple will be open for 5 minutes to allow a special guest to visit. There's 100 million dollars worth at treasure at the end. Join me, and we will get rich.' Do you close the door (1) or follow him (2)?");
        Scanner scanner = new Scanner(System.in);
        int follow = scanner.nextInt();
        if (follow==1){
        System.out.println("You reject the offer and return to your mundane, boring life; missing out on the chance to find the treasure.");
        return;
    }
        if (follow==2) {
            System.out.println("Your curiosity gets the better of you and you agree. He tells you to follow him and leads you to this grand temple.");
            System.out.println("Right when you guys enter the door, you hear footsteps coming. 'Quick! Hide!' He whisper-yells. Do you hide behind a huge pillar or behind a big statue?");
            scanner.nextLine();
            String hide = scanner.nextLine();
            if (hide.contains("pillar")) {
                System.out.println("The people walk past you and you hold your breath. Thankfully they don't notice you.");
                first();
            }
            else if (hide.contains("statue")) {
                System.out.println("You lean against the statue and hold your breath, but your phone starts ringing in your pocket. You thought for sure you will get busted. Thankfully the people walking past are deaf and cannot hear your phone at all.");
                first();
            }
        }
    }

    public static void first() {
        System.out.println("You walk through a hallway and come to a dim-lit room. There is a series of steps before you. Each step is marked with a number.");
        System.out.println("To safely cross, you must step only on the even-numbered steps or steps where subtracting 3 results in a number that is divisible by 5.");
        System.out.println("If you step on any other step, you will fall into a trap. What is any step that you can step on to safely cross?");
        Scanner scanner = new Scanner(System.in);
        int answer = scanner.nextInt();
        if (answer % 2 == 0 || (answer - 3) / 5 == 0) {
            System.out.println("You manage to cross safely and in front of you are three doors. You look around and there is no other way to get to the treasure.");
            System.out.println("Door 1: A fire the size of the entire room is raging. Enter 1.");
            System.out.println("Door 2: A gunman lurks with a pistol ready at hand. Enter 2.");
            System.out.println("Door 3: A hungry lion that hasn't eaten in 3 years. Enter 3.");
            door();
        } else {
            System.out.println("That was supposed to be easy, but you failed it. :( The trap opens and swallows you whole. You died.");
            return;
        }
    }

    public static void door() {
        Scanner scanner = new Scanner(System.in);
                int doors = scanner.nextInt();
                if (doors==1) {
                    System.out.println("You open the door consumed with fire. The door slams shut behind you and the uncontrollable fire kills you. You died :(");
                    return;
                }
                if (doors==2) {
                    System.out.println("You open the door. The gunman raises up his pistol and kills you immediately.");
                    return;
                }
                if (doors==3) {
                    System.out.println("You survived! A lion that hasn't eaten in 3 years would be dead, so you walk over the lion's dead body and through the opposite door.");
                    guards();
                }
                }
public static void guards() {
    System.out.println("You reach a panel with carved greek words in there. Greek? Yes, greek.");
    System.out.println("Luckily, you remember taking Greek in High school and can still translate it vaguely to English. But a word on the panel is missing.\n");
    System.out.println("Turns out it's a riddle and you have to fill in the blank, it says: ");
    System.out.println("I can fly without wings. I can cry without eyes. Wherever I go, darkness follows me. What am I? ___________. What word do you type in the keyboard to fill in this blank? Remember! Try to answer in greek.");
    Scanner scanner = new Scanner(System.in);
    String riddle = scanner.nextLine();
    if (riddle.contains("wind")) {
        System.out.println("Why did you answer in English? Luckily, the keyboard automatically converts your words to Greek. You pass and continue on with your heist.");
        treasure();
    }
    if (riddle.contains("σύννεφο")||riddle.contains("νέφος")||riddle.contains("νεφέλη")) {
        System.out.println("Good Job! You answered in Greek and you answered correctly! You let out a sigh of relief and continue on with your heist.");
        treasure();
    }
    else {
        System.out.println("Unfortunately you entered the wrong word. Better luck next time.");
        return;
    }
}
public static void treasure() {
    System.out.println("You walk into a final room filled with flowers. One of the flowers opens a secret door that contains the treasure that you have been looking for!");
    System.out.println("The other flowers, however, kill you instantly with their poison.");
    System.out.println("You rack your brain trying to think of what it could be. Which flower is NOT poisonous in nature?: ");
    System.out.println("Daffodil (Press 1), Lily (Press 2), Tulip (Press 3), Orchid (Press 4)");
    Scanner scanner = new Scanner(System.in);
    int flower = scanner.nextInt();
    if (flower == 1) {
        System.out.println("You raise your hand to touch the Daffodil and it kills you immediately. As it turns out, the flower Daffodil is poisonous. Better luck next time.");
        return;
    }
    else if (flower == 2) {
        System.out.println("You raise your hand to touch the Lily and it kills you immediately. As it turns out, the flower Lily is poisonous. Better luck next time.");
        return;
    }
    else if (flower == 3) {
        System.out.println("You raise your hand to touch the Tulip and it kills you immediately. As it turns out, the flower Tulip is poisonous. Better luck next time.");
        return;
    }
    else if (flower == 4) {
        System.out.println("You raise your hand to touch the Orchid as you hold your breath and to your relief, the flower hums out a soothing tune and the door in front of you clicks open.");
        System.out.println("You and your partner reach for the treasure and open the box. The jewelry is luminous and shines so bright that it almost makes you go blind.");
        System.out.println("You smile, already thinking of all the things you can do with this money.");
        System.out.println("But wait.....It's not over just yet. Two guards come with a flashlight and is taken aback by you two. Guard 1 opens his mouth to yell...Quick! What do you do?");
        run();
    }
}
 public static void run() {
        System.out.println("Do you run the opposite direction (type 'od')? Or do you rush up to Guard 1 to cover his mouth with a handkerchief and tie both the guards' wrists behind their back (type 'tw')?");
                Scanner scanner = new Scanner(System.in);
        String quick = scanner.nextLine();
                if (quick.contains("od")) {
                    System.out.println("You run the opposite direction and he follows while he starts yelling in his radio to call for backup. This alerts the whole system and the lights start flashing.");
                    System.out.println("You see a nearby tunnel. Do you crawl in it (cr) or do you hide behind a statue and hope for them to pass (hi)?");
                    String decision = scanner.nextLine();
                    if (decision.contains("hi")) {
                        System.out.println("You hide behind the statue and the guards seem dumbfounded. They had completely lost you. But with the number of guards ever increasing, there is no other way to escape.");
                        System.out.println("Out of the corner of your eye you see a ventilation shaft. Do you stay put (1) or do you crawl in the shaft (2)?");
                        int ventilation = scanner.nextInt();
                        if (ventilation==1) {
                            System.out.println("You decide to stay hidden, waiting for the perfect opportunity to sneak past the guards.");
                            System.out.println("After what feels like an eternity, you and your partner notice the perfect chance to sneak out. You creep past the guards and into a back exit.");
                            System.out.println("With a sigh of relief, you step outside the museum, the stolen treasure safely in your possession.");
                            System.out.println("Now you are 50 million dollars richer! You and your partner share a satisfied smile.");
                            System.exit(0);
                        }
                        else if (ventilation==2) {
                            System.out.println(goodOrBad());
                            System.exit(0);
                        }
                    }
                    else if (decision.contains("cr")) {
                        System.out.println(goodOrBad());
                        System.exit(0);
                    }
                }
                    if (quick.contains("tw")) {
                        System.out.println("You quickly grab a hold of his arms and put his hands behind his back. Fortunately for you, you and your partner can easily overpower him and his struggles appear to be useless.");
                        System.out.println("While you tie him up, your partner says 'We don't have much time. The cops are coming.' Out of the corner of your eye you see blue and red flashing lights, the unmistakable sign of incoming cop cars.");
                        System.out.println("'What do we do?' Your partner asks. There's a wooden bar nearby that you can use to smash the window and escape (press 1) or you can steal the guards clothing and disguise yourselves as guards (press 2).");
                        System.out.println("What would be your decision?");
                        int escaping = scanner.nextInt();
                        if (escaping==1) {
                            System.out.println("Your partner smashes the window and you climb out of the window with little difficulty. You start running but become surrounded by cop cars.");
                            System.out.println("You thought you were going to get caught then and there but luckily you notice a ladder a few feet away and you and your partner start climbing it.");
                            System.out.println("The police starts chasing you on rooftops as you jump from one to the other. But all of a sudden the rooftops come to an end.");
                            System.out.println("In front of you is a pool of water (1) and a huge hole that seems to never end (2). Which one do you jump in?");
                            int ultimate = scanner.nextInt();
                            if (ultimate ==1) {
                                System.out.println("You land in the pool of water without any harm, but little did you know you landed in one of the world's deadliest shark-infested oceans.");
                                System.out.println("You and your partner in crime, along with the precious treasure gets torn away by sharks. Better luck next time. Or I guess... there's no next time.");
                                System.exit(0);
                            }
                            if (ultimate==2) {
                                System.out.println("You and your partner take a leap of faith into the huge hole that never seems to end. You brace yourself for impact against the hard ground....");
                                System.out.println("But it turns out there is a net at the bottom of the hole and you land with a thump. Your and your partner look at each other in surprise.");
                                System.out.println("You escape the net, into the streets and leave with your treasures.");
                                System.out.println("You split the treasure with your partner and it turns out you are now 50 million dollars richer! Now you can spend your money on anything you could ever dream of!");
                                System.out.println("Congratulations! Goodbye!");
                                System.exit(0);
                            }
                        }
                        else if (escaping==2) {
                            System.out.println("You steal the guards coat and hat and nonchalantly walk through the museum, leaving through a back door.");
                            System.out.println("Your partner grabs the walkie-talkie and says 'The thieves left through the front of the museum!', leading the guards to run the wrong way.");
                            System.out.println("You high five your partner with a satisfied smile and split the treasure.");
                            System.out.println("You are now 50 million dollars richer! Now you can spend your money on anything you could ever dream of!");
                            System.out.println("Congratulations! Goodbye!");
                            System.exit(0);
                        }
                    }
        }

 public static String goodOrBad() {
         System.out.println("You enter the small hole but inside of it is a dog blocking the path. You interrupted his sleep. Luckily, he says that if you solve his simple questions, he will let you pass.");
         System.out.println("He asks you: What is a number that when 5 is added to it, equals 10.' Fortunately it seems that he only knows basic math. You answer confidently:");
         Scanner scanner = new Scanner(System.in);
         int ten = scanner.nextInt();
         if (ten + 5 == 10) {
             System.out.println("You were correct! The dog moves to let you and your partner pass through the hole and into the open, leaving the museum with treasure in hand.");
             System.out.println("You exit into the wide open and let out a breath you have been holding in for quite some time.");
             System.out.println("You carefully count your jewels and split the treasure with your partner.");
             System.out.println("You are now 50 million dollars richer! Now you can spend your money on anything you could ever dream of!");
             return "Congratulations! Goodbye!";
         } else {
             System.out.println("Your partner looks at you, dumbfounded. How could you mess up such a simple mathematics equation. The dog chuckles and kicks you out of the tunnel.");
             System.out.println("Once you're outside of the tunnel, you carefully observe your surroundings but unfortunately, there's no way out.");
             System.out.println("In less than a second, the guards catch up to you and handcuff your hand behind your back. You fight and try to wriggle your way out of the handcuffs but he tells you to shut it and save it for the jury.");
             System.out.println("In court you try to prove your innocence, but no one believes you since there were many witnesses that say they saw you steal the treasure.");
             return "So you spend the rest of your days rotting in jail. Tough luck.";
         }
         }
}
