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
        Scanner keyboard = new Scanner(System.in);
        CustomUtils CU= new CustomUtils();

        System.out.println("Enter your name ::");
        nameAnswer = keyboard.next();

        return nameAnswer;
        /* We don't do a check here to make sure that the player is happy with the Name they chose because I want to
         * one huge check at the end of the set up like this:
         * Is this correct?
         * Name: Placeholder
         * weight: 0
         * height: 0 ft, 0 inches or 0cm
         * etc.
         */
    }

    public static void characterSetting(String response)
    {
        if (!response.contains("."))
        {

        }
    }

    public static int weightCustomization()
    {
        int weight;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please enter your weight (in pounds) ::");
        weight = keyboard.nextInt();


        return weight;
    }

    public static int heightCustomization()
    {
        return 168;
    }

    public static String hairStyleCustomization()
    {
        return "Casual";
    }

    public static String clothesCustomization()
    {
        return "Formal";
    }

    public static String skinColorCustomization()
    {
        return "White";
    }

}
