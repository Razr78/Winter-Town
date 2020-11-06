import java.util.Scanner;
public class WinterTownGameLauncher
{
        private static String response;
        public static String setupName ()
        {

                String StringName;

                Scanner keyboard = new Scanner(System.in);

                do {
                        System.out.println("Sate your name ::");
                        StringName = keyboard.next();

                        System.out.println("Are you sure you want to be called " + StringName + "?");

                        System.out.println("YES or NO ::");
                        response = keyboard.next();
                        response = response.toUpperCase();

                        if (response.contains("YES"))
                        {
                                return StringName;
                        } else if (response.contains("NO")) {System.out.println("Sorry, try again then");}
                        else {System.out.println("Unrecognized response, try again");}

                } while (!response.contains("YES"));

                return "";
        }
        public static void setupSettings()
        {
                Scanner keyboard = new Scanner(System.in);

                CharacterCreationTool CCT = new CharacterCreationTool();

                System.out.println("Would you like to customize your character further?");
                System.out.println("YES or NO ::");
                response =  keyboard.next();
                response = response.toUpperCase();

                if (response.contains("YES"))
                {
                      CCT.characterSetting("");
                } else {CCT.characterSetting(".");}
        }
}
