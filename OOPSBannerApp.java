/**
 * OOPSBannerApp
 * Use Case 6 (UC6): Static Functions
 * 
 * @author Aryan Saini
 * @version 6.0
 */
public class OOPSBannerApp {

    /**
     * Helper method to generate letter O
     */
    public static String[] getO() {
        return new String[] {
            "*****",
            "*   *",
            "*   *",
            "*   *",
            "*   *",
            "*   *",
            "*****"
        };
    }

    /**
     * Helper method to generate letter P
     */
    public static String[] getP() {
        return new String[] {
            "*****",
            "*   *",
            "*   *",
            "*****",
            "*    ",
            "*    ",
            "*    "
        };
    }

    /**
     * Helper method to generate letter S
     */
    public static String[] getS() {
        return new String[] {
            "*****",
            "*    ",
            "*    ",
            "*****",
            "    *",
            "    *",
            "*****"
        };
    }

    public static void main(String[] args) {

        String[] charO1 = getO();
        String[] charO2 = getO();
        String[] charP = getP();
        String[] charS = getS();

        String[] bannerLines = new String[7];
        
        // Loop-based rendering logic
        for (int i = 0; i < 7; i++) {
            bannerLines[i] = String.join("   ", charO1[i], charO2[i], charP[i], charS[i]);
        }

        // Enhanced for loop to print the banner
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}