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
public class TrueFalseQuestionTest {
    
    public TrueFalseQuestionTest() {
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
