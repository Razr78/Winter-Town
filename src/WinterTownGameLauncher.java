import java.util.Scanner;
public class WinterTownGameLauncher
{
        private static String response;

        public void open() {
                System.out.println("Game launched");
                System.exit(69);
        }

        /*public static void setupSettings()
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
         */
}
