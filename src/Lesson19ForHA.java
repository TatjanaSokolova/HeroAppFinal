import java.util.*;
import java.util.List;

public class Lesson19ForHA {

    public static void main(String[] args) {

        //Heroes
        Hero Hero1 = new Hero("Violet", "Stark", "VioletGirl", 1, Hero.HeroType.Hero, 55);
        Hero Hero2 = new Hero("Amy", "Potter", "CuteGirl", 2, Hero.HeroType.Hero, 25);
        Hero Hero3 = new Hero("Hermione", "Wise", "WiseGirl", 3, Hero.HeroType.Hero, 7);
        Hero Hero4 = new Hero("Emilia", "Wood", "WoodGirl", 4, Hero.HeroType.Hero, 19);
        Hero Hero5 = new Hero("Lisa", "Wilson", "CoolGirl", 5, Hero.HeroType.Hero, 29);
        Hero Hero6 = new Hero("Madison", "Evans", "ItGirl", 6, Hero.HeroType.Hero, 17);
        Hero Hero7 = new Hero("Lee", "Carter", "CarGirl", 7, Hero.HeroType.Hero, 44);

        //Villains
        Villain Villain1 = new Villain("Ed", "Nygma", "The Riddler", 8, Villain.HeroType.Villain, 55);
        Villain Villain2 = new Villain("Oswald", "Cobblepot", "Penguin", 9, Villain.HeroType.Villain, 56);
        Villain Villain3 = new Villain("Victor", "Zsasz", "'Zaaasz, baby!'", 10, Villain.HeroType.Villain, 100);

        //for lesson 22 stack popping
        Stack<String> stackForHeroes = new Stack<>();
        stackForHeroes.push(Hero1.getName());
        stackForHeroes.push(Hero2.getName());
        stackForHeroes.push(Hero3.getName());
        stackForHeroes.push(Hero4.getName());
        stackForHeroes.push(Hero5.getName());
        stackForHeroes.push(Hero6.getName());
        stackForHeroes.push(Hero7.getName());
        while (!stackForHeroes.isEmpty()) {
            System.out.println("Heroes in reverse order(made using stack): " + stackForHeroes.pop());
        }
        // for lesson 22 Create Queue
        // prints out hero names in alphabetical order

        Queue<String> queueForHeroes = new PriorityQueue<String>();
        queueForHeroes.offer(Hero1.getName());
        queueForHeroes.offer(Hero2.getName());
        queueForHeroes.offer(Hero3.getName());
        queueForHeroes.offer(Hero4.getName());
        queueForHeroes.offer(Hero5.getName());
        queueForHeroes.offer(Hero6.getName());
        queueForHeroes.offer(Hero7.getName());

        String heroesInQueue;
        while ((heroesInQueue = queueForHeroes.poll()) != null) {
            System.out.println("Heroes in alphabetycal order (made using queue): " + heroesInQueue);
        }

        //Arraylist for all heroes and villains
        ArrayList<Person> all = new ArrayList<Person>();
        all.add(Hero1);
        all.add(Hero2);
        all.add(Hero3);
        all.add(Hero4);
        all.add(Hero5);
        all.add(Hero6);
        all.add(Hero7);
        all.add(Villain1);
        all.add(Villain2);
        all.add(Villain3);
        //Arraylist for all heroes
        ArrayList<Hero> allHeroes = new ArrayList<Hero>();
        allHeroes.add(Hero1);
        allHeroes.add(Hero2);
        allHeroes.add(Hero3);
        allHeroes.add(Hero4);
        allHeroes.add(Hero5);
        allHeroes.add(Hero6);
        allHeroes.add(Hero7);
        //Arraylist for all villains
        ArrayList<Villain> allVillains = new ArrayList<Villain>();
        allVillains.add(Villain1);
        allVillains.add(Villain2);
        allVillains.add(Villain3);

        ArrayList<Person> personInTheDistrict1 = new ArrayList<Person>();
        District district1 = new District(" District1", "NY", 1, personInTheDistrict1);
        personInTheDistrict1.add(Hero1);
        personInTheDistrict1.add(Hero2);
        personInTheDistrict1.add(Hero3);
        personInTheDistrict1.add(Villain1);
        personInTheDistrict1.add(Villain2);

        ArrayList<Person> personInTheDistrict2 = new ArrayList<Person>();
        District district2 = new District(" District2", "Gotham", 2, personInTheDistrict2);
        personInTheDistrict2.add(Hero4);
        personInTheDistrict2.add(Hero5);
        personInTheDistrict2.add(Hero6);
        personInTheDistrict2.add(Villain3);

        System.out.println("These persons are working in district 1: ");
        System.out.println(district1.toString());
        System.out.println("These persons are working in district 2: ");
        System.out.println(district2.toString());


        // BUSINESS REQUIREMENTS FOR LESSON #12
        // 1. I would like to see a MENU to select different parts of superhero information card
        // 2. A list of superheroes
        // 3. Add new superhero
        // 4. show specific superhero information
        // 5. Delete the superhero from the list
        // 6. Print info about heroes
        // 0. Exit
        int menuEntry;
        Scanner scanner = new Scanner(System.in);
        do {
            // EXIT == 0
            System.out.println("Welcome!");
            System.out.println("Please select what to do:");
            System.out.println("1 - Show a list of superheroes");
            System.out.println("2 - Add a new superhero");
            System.out.println("3 - Show specific superhero information");
            System.out.println("4 - Delete the superhero");
            System.out.println("5 - Print info about heroes");
            System.out.println("6 - Print info about districts");
            System.out.println("7 - Print info about villains");
            System.out.println("0 - Exit");

            menuEntry = scanner.nextInt();

            switch (menuEntry) {
                case 1:

                    System.out.println("++++++++++ SUPERHERO LIST +++++++++");
                    for (Person person : all) {
                        System.out.println(person.getName());
                    }
                    System.out.println();
                    break;

                case 2:// csanners need to be fixed
                    Scanner myObj = new Scanner(System.in);
                    Scanner myObj2 = new Scanner(System.in);
                    Scanner myObj3 = new Scanner(System.in);
                    Scanner myObj4 = new Scanner(System.in);
                    System.out.println("Character's name:");
                    String choiceName = myObj.nextLine();
                    System.out.println("Character's surname:");
                    String choiceSurname = myObj2.nextLine();
                    System.out.println("Character's nickname:");
                    String choiceNickname = myObj3.nextLine();
                    System.out.println("Hero(1) or Villain(2)?");
                    int choice = scanner.nextInt();
                    if (choice == 1) {
                        System.out.println("HeroID: ");
                        int choiceHeroId = myObj4.nextInt();
                        System.out.println("DeedTime: ");
                        int choiceDeedTime = scanner.nextInt();
                        all.add(new Hero(choiceName, choiceSurname, choiceNickname, choiceHeroId, Hero.HeroType.Hero, choiceDeedTime));
                    } else if (choice == 2) {
                        System.out.println("VillainID: ");
                        int choiceVillainId = myObj4.nextInt();
                        System.out.println("DeedTime: ");
                        int choiceCrimeTime = scanner.nextInt();
                        all.add(new Hero(choiceName, choiceSurname, choiceNickname, choiceVillainId, Hero.HeroType.Villain, choiceCrimeTime));
                    } else {
                        System.out.println("Choose 1 or 2");
                    }
                    break;

                case 3:
                    System.out.println("To get info about hero press 1. ABout villain - press 2");
                    int c = scanner.nextInt();
                    if (c == 1) {
                        // Show different information, based on selected superhero!
                        System.out.println("Enter index of superhero (0 - 6: ");
                        int heroIndex = scanner.nextInt();
                        // Print out Hero information card
                        System.out.println("***************************");
                        System.out.println("*** HERO INFORMATION ***");
                        System.out.println("***************************");
                        System.out.println("Hero name: " + allHeroes.get(heroIndex));
                        System.out.println("This person's real name is " + allHeroes.get(heroIndex).getName());
                        System.out.println("His/Her surname is " + allHeroes.get(heroIndex).getSurname());
                        System.out.println("This person is also known as " + allHeroes.get(heroIndex).getNickname());
                        System.out.println("He/She is a real HERO! Hero ID # " + allHeroes.get(heroIndex).getHeroID());
                        System.out.println("and deedtime =  " + allHeroes.get(heroIndex).getDeedTime());
                            if (personInTheDistrict1.contains(allHeroes.get(heroIndex))){
                                System.out.println(allHeroes.get(heroIndex).getName() + " is working in district 1");
                            }
                            else if(personInTheDistrict2.contains(allHeroes.get(heroIndex))){
                                System.out.println( allHeroes.get(heroIndex).getName() + " is working in district 2");
                            }
                        System.out.println();
                    } else if (c == 2) {
                        // Show different information, based on selected villain!
                        System.out.println("Enter index of Villain (0-2): ");
                        int villainIndex = scanner.nextInt();
                        // Print out Villain information card
                        System.out.println("***************************");
                        System.out.println("*** VILLAIN INFORMATION ***");
                        System.out.println("***************************");
                        System.out.println("Hero name: " + allVillains.get(villainIndex));
                        System.out.println("This person's real name is " + allVillains.get(villainIndex).getName());
                        System.out.println("His/Her surname is " + allVillains.get(villainIndex).getSurname());
                        System.out.println("This person is also known as " + allVillains.get(villainIndex).getNickname());
                        System.out.println("He/She is a real VILLAIN! With His Villain ID # " + allVillains.get(villainIndex).getHeroID());
                        System.out.println("and Crime time =  " + allVillains.get(villainIndex).getCrimeTime());
                        if (personInTheDistrict1.contains(allVillains.get(villainIndex))){
                            System.out.println("This villain is working in district 1");
                        }
                        else if(personInTheDistrict2.contains(allVillains.get(villainIndex))){
                            System.out.println("This villain is working in district 2");
                        }
                        System.out.println();
                    }
//                    if (Hero.HeroType == Hero) {
//                        System.out.println(" Hero is a villain. he is stealing cookies!!!");
//                    } else {
//                        System.out.println("hero protects the city!");
//                    }
                    break;

                case 4:
                    System.out.println("please enter hero index to be removed");
                    int heroToRemove = scanner.nextInt();
                    all.remove(heroToRemove);
                    break;

                case 5:
                    for (Person q : all) {
                        if (q instanceof Hero) {
                            System.out.println("Info about all heroes:");
                            System.out.println(q);
                        }
                    }

                    break;
                case 6: {
                    System.out.println(district1.toString());
                    System.out.println(district2.toString());
                    //d.     Edit the method calculateAvgLevelInDistrict()
                    // that only all Heroes’ levels are summarized and divided
                    // by the amount of the Heroes (not Villains) in this District.


                    //counting average level of district 1
                    int herocounter = 0;
                    float counterlevel = 0;
                    for (Person person : personInTheDistrict1) {
                        if (person instanceof Hero) {
                            counterlevel += ((Hero) person).calculatedLevel();
                            herocounter++;
                        }
                    }
                    float AvgLevelInDistrict = counterlevel / herocounter;
                    System.out.println("Average level in district 1 is: " + Math.floor(AvgLevelInDistrict * 100) / 100);

                    //counting average level of district 2
                    int herocounter2 = 0;
                    float counterlevel2 = 0;
                    for (Person person : personInTheDistrict2) {
                        if (person instanceof Hero) {
                            counterlevel2 += ((Hero) person).calculatedLevel();
                            herocounter2++;
                        }
                    }
                    float AvgLevelInDistrict2 = counterlevel2 / herocounter2;
                    System.out.println("Average level in district 2 is: " + Math.floor(AvgLevelInDistrict2 * 100) / 100);
                }
                // e.      Create an arraylist for the Districts storage. Put both Districts in the arraylist.

                List<Person> personInTheBothDistricts = new ArrayList<>(personInTheDistrict1);
                personInTheBothDistricts.addAll(personInTheDistrict2);
                System.out.println("Persons from the bots districts: " + personInTheBothDistricts);
                System.out.println("Total persons in bots districts: " + personInTheBothDistricts.size());


                //f.      Find out which District is with the highest amount of Persons.

                if (personInTheDistrict1.size() > personInTheDistrict2.size()) {
                    System.out.println("District 1 has highest amount of person");
                } else if (personInTheDistrict2.size() > personInTheDistrict1.size()) {
                    System.out.println("District 2 has highest amount of person");
                } else {
                    System.out.println("Both districts has equal amount of person");
                }

                case 7:
                    //counting Total crime time of villains

                    int countCrimes = 0;
                    for (Person x : all) {
                        if (x instanceof Villain) {
                            countCrimes += ((Villain) x).getCrimeTime();
                        }
                    }
                    System.out.println("Total number (total time) of the crimes in which the Villains were involved: " + countCrimes);

                    //Find out which Villains is involved the most to crimes (max time spent).

                    int maxCounter = 0;
                    for (Person z : all) {
                        if (z instanceof Villain) {
                            if (maxCounter < ((Villain) z).getCrimeTime()) {
                                maxCounter = ((Villain) z).getCrimeTime();
                            }
                        }
                    }
                    System.out.println("Max crimes: " + maxCounter);
                default:
                    System.out.println("menu item does not exist");
            }
        }
        while (menuEntry != 0);
    }
}