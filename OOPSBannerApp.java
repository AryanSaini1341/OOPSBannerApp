/**
 * OOPSBannerApp
 * Use Case 5 (UC5): Array Initialisation
 * 
 * @author Aryan Saini
 * @version 5.0
 */
public class OOPSBannerApp {

    public static void main(String[] args) {

        // Array Declaration and Initialization in a single statement
        String[] banner = {
            String.join("   ", "*****", "*****", "*****", "*****"),
            String.join("   ", "*   *", "*   *", "*   *", "*    "),
            String.join("   ", "*   *", "*   *", "*   *", "*    "),
            String.join("   ", "*   *", "*   *", "*****", "*****"),
            String.join("   ", "*   *", "*   *", "*    ", "    *"),
            String.join("   ", "*   *", "*   *", "*    ", "    *"),
            String.join("   ", "*****", "*****", "*    ", "*****")
        };

        // Enhanced for loop to print the banner
        for (String line : banner) {
            System.out.println(line);
        }
    }
}