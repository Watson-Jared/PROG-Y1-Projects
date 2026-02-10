/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package quizgame;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author lab_services_student
 */
public class MultipleChoiceQuestionTest {
    
    public MultipleChoiceQuestionTest() {
    }

     @org.junit.Test
    public void testMultipleChoice_ByText() {
        String[] options = {"Encapsulation", "Polymorphism", "Abstraction", "Decoration"};
        MultipleChoiceQuestion mcq = new MultipleChoiceQuestion(
                "Which is NOT an OOP concept?",
                options,
                "Decoration"
        );
        assertTrue(mcq.checkAnswer("Decoration"));
        assertFalse(mcq.checkAnswer("Encapsulation"));
    }

    @org.junit.Test
    public void testMultipleChoice_ByNumber() {
        String[] options = {"Encapsulation", "Polymorphism", "Abstraction", "Decoration"};
        MultipleChoiceQuestion mcq = new MultipleChoiceQuestion(
                "Which is NOT an OOP concept?",
                options,
                "Decoration"
        );
        assertTrue(mcq.checkAnswer("4")); 
        assertFalse(mcq.checkAnswer("1")); 
    }
    
}
