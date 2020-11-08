// Metric support added by Marlon Pascual Marrero Arancibia
// Confirmation added by Marlon Pascual Marrero Arancibia
import java.util.Scanner;
public class CharacterCreationTool
{
    public boolean customize()
    // Coded by Marlon Pascual Marrero Arancibia
    { 
        Scanner userResponse = new Scanner(System.in);
        CustomUtils CU= new CustomUtils();

        do {
            System.out.println("Do you want to customize your character? (Yes or No) \n" +
                    "If you choose not to, you'll have a default character assigned.");

            switch (CU.yesNoCheck(userResponse.next())) {
                case 0:
                    return true;
                case 1:
                    return false;
                case 2:
                    System.out.println("Try again");
            }

        } while (true);
    }
    
    public String nameCustomization()
    {
        String response, nameAnswer;
        Scanner userResponse = new Scanner(System.in);
        CustomUtils CU= new CustomUtils();

        System.out.println("Enter your name ::");
        nameAnswer = userResponse.next();

        return nameAnswer;
        /* We don't do a check here to make sure that the player is happy with the Name they chose because I want to do
         * one huge check at the end of the set up like this:
         * Is this correct?
         * Name: Placeholder
         * weight: 0
         * height: 0 ft, 0 inches or 0cm
         * etc.
         * ------------------------------------------------
         * Its Jonathan talking and you're an absolute genius.
         */
    }

    public static void characterSetting(String response)
    {
        if (!response.contains("."))
        {

        }
    }

    public static int imperialWeightCustomization()
    {
        int weight;

        Scanner userResponse = new Scanner(System.in);

        System.out.println("Please enter your weight (in pounds) ::");
        weight = userResponse.nextInt();


        return weight;
    }

    public int metricWeightCustomization()
    {
        int weight;

        Scanner userResponse = new Scanner(System.in);

        System.out.println("Please enter your weight (in kilos) ::");
        weight = userResponse.nextInt();

        return weight;
    }

    public static int imperialHeightCustomization()
    {
        Scanner userResponse = new Scanner(System.in);

        System.out.println("Please enter your height in inches::");
        return userResponse.nextInt();
    }

    public int metricHeightCustomization()
    {
        Scanner userResponse = new Scanner(System.in);

        System.out.println("Please enter your height in centimeters::");
        return userResponse.nextInt();
    }

    public static String hairStyleCustomization()
    {
        String userResponse = (""), hairstyleBlank = ("");
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please choose a hair style::"
        + "Hairstyle 1\n"
        + "Hairstyle 2\n"
        + "Hairstyle 3\n"
        + "Hairstyle 4\n"
        + "Hairstyle 5\n" );

        userResponse = keyboard.nextLine();

        if (userResponse.contains("YES"))
        {
            return "Hairstyle 1";
        }
        
        return userResponse;
    }

    public static String clothesCustomization()
    {
        return "Formal";
    }

    public static String skinColorCustomization()
    {
        return "White";
    }

    public boolean confirm(String playerName, int weight, int height, String hair, String clothes, String skin)
    // Coded by Marlon Pascual Marrero Arancibia
    // Formatted by Jonathan Fernandez
    {
        CustomUtils CU = new CustomUtils();
        do {
            System.out.println("Is this correct? \n" +
                    "Name is: " + playerName + "\n" +
                    "Weight is: " + weight + "\n" +
                    "Height is: " + height + "\n" +
                    "Hair is: " + hair + "\n" +
                    "Clothes is: " + clothes + "\n" +
                    "Skin is: " + skin);

            if (CU.confirm("the above")) {
                return true;
            }
            else {
                System.out.println("Try again.");
                weight = imperialWeightCustomization();
                height = imperialHeightCustomization();
                hair = hairStyleCustomization();
                clothes = clothesCustomization();
                skin = skinColorCustomization();
            }
        } while (true);
    }
}