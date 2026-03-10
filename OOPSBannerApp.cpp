#include <iostream>
#include <string>
#include <vector>

/**
 * OOPSBannerApp
 * Use Case 6 (UC6): Static Functions
 * 
 * @author Aryan Saini
 * @version 6.0
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

// Static helper functions to generate character patterns
std::vector<std::string> getO() {
    return {
        "  ***  ",
        " *   * ",
        " *   * ",
        " *   * ",
        " *   * ",
        " *   * ",
        "  ***  "
    };
}

std::vector<std::string> getP() {
    return {
        " ****  ",
        " *   * ",
        " *   * ",
        " ****  ",
        " *     ",
        " *     ",
        " *     "
    };
}

std::vector<std::string> getS() {
    return {
        "  **** ",
        " *     ",
        " *     ",
        "  ***  ",
        "     * ",
        "     * ",
        " ****  "
    };
}

int main() {
    // Generate arrays for each character
    std::vector<std::string> charO1 = getO();
    std::vector<std::string> charO2 = getO();
    std::vector<std::string> charP = getP();
    std::vector<std::string> charS = getS();

    // Array Declaration and Initialization using join
    std::string bannerLines[7];
    for (int i = 0; i < 7; ++i) {
        bannerLines[i] = join("  ", {charO1[i], charO2[i], charP[i], charS[i]});
    }

    // Enhanced for loop to print the banner
    for (const std::string& line : bannerLines) {
        std::cout << line << std::endl;
    }

    return 0;
}
