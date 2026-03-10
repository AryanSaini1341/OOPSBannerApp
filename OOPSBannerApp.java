import java.util.HashMap;
import java.util.Map;

/**
 * OOPSBannerApp
 * Use Case 8 (UC8): Use Map for Character Patterns and Render via Function
 * 
 * @author Aryan Saini
 * @version 8.0
 */
public class OOPSBannerApp {

    public static void main(String[] args) {
        // Define Character Patterns
        String[] patternO = {
            "*****",
            "*   *",
            "*   *",
            "*   *",
            "*   *",
            "*   *",
            "*****"
        };
        
        String[] patternP = {
            "*****",
            "*   *",
            "*   *",
            "*****",
            "*    ",
            "*    ",
            "*    "
        };
        
        String[] patternS = {
            "*****",
            "*    ",
            "*    ",
            "*****",
            "    *",
            "    *",
            "*****"
        };

        // Initialize Map
        Map<Character, String[]> patternMap = new HashMap<>();
        patternMap.put('O', patternO);
        patternMap.put('P', patternP);
        patternMap.put('S', patternS);

        String word = "OOPS";
        String[] bannerLines = new String[7];

        for (int i = 0; i < 7; i++) {
            StringBuilder sb = new StringBuilder();
            
            // Render specific line horizontally for each character
            for (int charIndex = 0; charIndex < word.length(); charIndex++) {
                char ch = word.charAt(charIndex);
                String[] charPattern = patternMap.get(ch);
                
                if (charPattern != null) {
                    if (charIndex > 0) {
                        sb.append("   "); // Add spacing between letters
                    }
                    sb.append(charPattern[i]); // Append corresponding pattern line
                }
            }
            bannerLines[i] = sb.toString();
        }

        // Print the banner
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}