/**
 * OOPSBannerApp
 * Use Case 7 (UC7): Store Character Pattern in a Class
 * 
 * @author Aryan Saini
 * @version 7.0
 */
public class OOPSBannerApp {

    /**
     * Static inner class to map characters to their ASCII art patterns.
     */
    public static class CharacterPatternMap {
        private char character;
        private String[] pattern;

        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

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

        // Initialize array of maps
        CharacterPatternMap[] mapArray = new CharacterPatternMap[] {
            new CharacterPatternMap('O', patternO),
            new CharacterPatternMap('P', patternP),
            new CharacterPatternMap('S', patternS)
        };

        String word = "OOPS";
        String[] bannerLines = new String[7];

        // Initialize banner lines with empty strings
        for (int i = 0; i < 7; i++) {
            bannerLines[i] = "";
        }

        // Loop through the word and map characters to patterns
        for (char ch : word.toCharArray()) {
            String[] charPattern = null;
            // Linear search for mapping
            for (CharacterPatternMap map : mapArray) {
                if (map.getCharacter() == ch) {
                    charPattern = map.getPattern();
                    break;
                }
            }

            // Append patterns using StringBuilder logic indirectly through concatenation
            if (charPattern != null) {
                for (int i = 0; i < 7; i++) {
                    // Using StringBuilder specifically as required
                    StringBuilder sb = new StringBuilder(bannerLines[i]);
                    if (sb.length() > 0) {
                        sb.append("   "); // Add spacing between letters
                    }
                    sb.append(charPattern[i]);
                    bannerLines[i] = sb.toString();
                }
            }
        }

        // Print the banner
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}