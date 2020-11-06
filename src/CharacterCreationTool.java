import java.util.Scanner;
public class CharacterCreationTool
{
        public static void characterSetting(String response)
        {
            if (!response.contains(".")) {
                Scanner keyboard = new Scanner(System.in);

                BodyCustomization BC = new BodyCustomization();

                System.out.println("Welcome to the Character Customization Menu");
                System.out.println(" ");
                System.out.println("Would you like to change your body type?");
                System.out.println("YES or NO ::");
                response = keyboard.next();
                response = response.toUpperCase();

                if (response.contains("YES"))
                {
                    BC.weightCustomization();
                }
            }
        }

        public static class BodyCustomization
        {
            public String nameCustomization()
            {
                String response;

                Scanner keyboard = new Scanner(System.in);

                do {
                    System.out.println("Sate your name ::");
                    response = keyboard.next();

                    System.out.println("Are you sure you want to be called " + response + "?");

                    System.out.println("YES or NO ::");
                    userInput = keyboard.next();
                    userInput = userInput.toUpperCase();

                    if (userInput.contains("YES"))
                    {
                        return response;
                    } else if (userInput.contains("NO")) {System.out.println("Sorry, try again then");}
                    else {System.out.println("Unrecognized userInput, try again");}

                } while (!userInput.contains("YES"));

                return "";
            }
            
            public int weightCustomization()
            {
                int weight;

                Scanner keyboard = new Scanner(System.in);

                System.out.println("Please select your weight (in pounds) ::");
                weight = keyboard.nextInt();


                return weight;
            }

            public static void hairStyleCustomization() 
            {

            }

            public static void clothesCustomization() 
            {

            }

            public static void skinColorCustomization() 
            {

            }
        }
}
