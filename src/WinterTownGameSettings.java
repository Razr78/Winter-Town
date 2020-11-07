//Fully coded by Marlon Pascual Marrero Arancibia

import java.util.Scanner;

public class WinterTownGameSettings
{
    public byte Units()
    {
        Scanner userResponse = new Scanner(System.in);

        while (true)
        {
            System.out.println("Unit type? \n 0: Imperial Measurements \n 1: Metric Units");
            switch (userResponse.nextInt())
            {
                case 0:
                    return 0;
                case 1:
                    return 1;
                default:
                    System.out.println("Try again");
            }
        }
    }
}
