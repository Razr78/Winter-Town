public class WinterTownMain
{
    public static void main (String[] args)
    {
        WinterTownGameLauncher WTG = new WinterTownGameLauncher();

        String PlayerName = WTG.setupName();

        WTG.setupSettings();

        System.out.println("~~ WELCOME TO WINTER TOWN " + PlayerName.toUpperCase() + " ~~");
    }
}