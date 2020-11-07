public class WinterTownMain
{
    public static void main (String[] args)
    {
        String playerName, hair, clothes, skin;
        int weight, height;

        WinterTownGameSettings WTGS = new WinterTownGameSettings();
        //WinterTownGameLauncher WTGL = new WinterTownGameLauncher();
        CharacterCreationTool CCT = new CharacterCreationTool();

        boolean customize = CCT.customize();
        if (customize) {
            playerName = CCT.nameCustomization();
            weight = CCT.weightCustomization(); // Lines 14 - 18 added by Marlon
            height = CCT.heightCustomization();
            hair = CCT.hairStyleCustomization();
            clothes = CCT.clothesCustomization();
            skin = CCT.skinColorCustomization();
        } else { playerName = "Placeholder"; }

        //WTG.setupSettings();

        System.out.println("~~ WELCOME TO WINTER TOWN " + playerName.toUpperCase() + " ~~");
    }
}