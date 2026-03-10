#include <iostream>
#include <string>
#include <vector>

/**
 * OOPSBannerApp
 * Use Case 5 (UC5): Array Initialisation using join
 * 
 * @author Aryan Saini
 * @version 5.0
 */

// Helper function to simulate Java's String.join()
std::string join(const std::string& delimiter, const std::vector<std::string>& strings) {
    std::string result;
    for (size_t i = 0; i < strings.size(); ++i) {
        result += strings[i];
        if (i < strings.size() - 1) {
            result += delimiter;
        }
    }
    return result;
}

int main() {
    // Array Declaration and Initialization in a single statement
    std::string bannerLines[] = {
        join("  ", {"  ***  ", "  ***  ", " ****  ", "  **** "}),
        join("  ", {" *   * ", " *   * ", " *   * ", " *     "}),
        join("  ", {" *   * ", " *   * ", " *   * ", " *     "}),
        join("  ", {" *   * ", " *   * ", " ****  ", "  ***  "}),
        join("  ", {" *   * ", " *   * ", " *     ", "     * "}),
        join("  ", {" *   * ", " *   * ", " *     ", "     * "}),
        join("  ", {"  ***  ", "  ***  ", " *     ", " ****  "})
    };

    // Enhanced for loop to print the banner
    for (const std::string& line : bannerLines) {
        std::cout << line << std::endl;
    }

    return 0;
}
