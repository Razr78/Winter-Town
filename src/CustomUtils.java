// CustomUtils.java was written independently by Marlon Pascual Marrero Arancibia.

import java.util.Scanner;

public class CustomUtils {
    public byte yesNoCheck(String check)
    // This was originally going to be a boolean, but it doesn't work for Yes, No and "Wrong Input".
    {
        check = check.toUpperCase();
        if (check.contains("YES"))
        { return 0; }
        else if (check.contains("NO"))
        { return 1; }
        else
        {
            System.out.println("This is not a valid response");
            return 2;
        }
    }

    public boolean confirm(String confirm)
    {
        Scanner response = new Scanner(System.in);

        do {
            System.out.print("Are you sure you want to select " + confirm + "?");

            switch (yesNoCheck(response.next())) {
                case 0:
                    return true;
                case 1:
                    return false;
                case 2:
                    System.out.println("Try again");
            }
        } while (true);
        // We use while true because return statements will make the method stop running automatically regardless.
    }
}
/*for (int i = 0; i<confirm.length; i++) {
                System.out.print(" " + confirm[i]);
            }"?");

 */