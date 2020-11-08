public class WinterTownMain
{
    public static void main (String[] args)
    {
        String playerName, hair, clothes, skin;
        int weight, height;

        WinterTownGameSettings WTGS = new WinterTownGameSettings();
        WinterTownGameLauncher WTGL = new WinterTownGameLauncher();
        CharacterCreationTool CCT = new CharacterCreationTool();

        boolean customize = CCT.customize();
        boolean launch;

        while ( true )
        {
            if (customize)
            {
                playerName = CCT.nameCustomization();
                if (WTGS.Units() == 0)
                    {
                        weight = CCT.imperialWeightCustomization();
                        height = CCT.imperialHeightCustomization();

                    } else {
                        weight = CCT.metricWeightCustomization();
                        height = CCT.metricHeightCustomization();
                    }
                    hair = CCT.hairStyleCustomization();
                    clothes = CCT.clothesCustomization();
                    skin = CCT.skinColorCustomization();

            } else
            {
                playerName = "Placeholder";
                weight = 150;
                height = 72;
                hair = "Black";
                clothes = "Formal";
                skin = "Caucasian";
            }
                launch = CCT.confirm(playerName, weight, height, hair, clothes, skin);

                if (launch) {
                    WTGL.open();
                }
        }
    }
}