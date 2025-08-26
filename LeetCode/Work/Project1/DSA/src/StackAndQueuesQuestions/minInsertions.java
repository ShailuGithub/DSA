/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StackAndQueuesQuestions;

/**
 *
 * @author SOFTWARE
 */
import java.util.Stack;

public class minInsertions {

    public int minInsertions(String s) {
        int insertions = 0;
        int neededClosings = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(') {
                // Each '(' needs two ')'
                neededClosings += 2;

                // If neededClosings is odd, insert one ')'
                if (neededClosings % 2 != 0) {
                    insertions++;      // Insert one ')'
                    neededClosings--;  // Adjust to even
                }
            } else { // Current character is ')'
                neededClosings--;

                if (neededClosings < 0) {
                    // We have more ')' than needed, so insert '('
                    insertions++;
                    // Reset neededClosings: now we assume we had a '(' before
                    neededClosings = 1;
                }
            }
        }

        return insertions + neededClosings;
    }
}
