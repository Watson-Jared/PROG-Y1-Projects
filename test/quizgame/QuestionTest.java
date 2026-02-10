/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package quizgame;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author lab_services_student
 */
public class QuestionTest {
    
    public QuestionTest() {
    }

    @Test
    public void testQuestion_Correct() {
        Question q = new Question("Is Java platform independent?", "true");
        assertTrue(q.checkAnswer("true"));
        assertTrue(q.checkAnswer("TRUE")); 
    }

    @Test
    public void testQuestion_WrongAnswer() {
        Question q = new Question("Is Java platform independent?", "true");
        assertFalse(q.checkAnswer("false"));
    }

    @Test
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

    @Test
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

    @Test
    public void testTrueFalseQuestion() {
        TrueFalseQuestion tf = new TrueFalseQuestion(
                "Java supports multiple inheritance of classes.", 
                "false"
        );
        assertTrue(tf.checkAnswer("false"));
        assertTrue(tf.checkAnswer("FALSE"));
        assertTrue(tf.checkAnswer("f"));
        assertTrue(tf.checkAnswer("F"));
        assertFalse(tf.checkAnswer("t"));
    }
}
