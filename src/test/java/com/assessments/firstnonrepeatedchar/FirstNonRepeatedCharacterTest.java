package com.assessments.firstnonrepeatedchar;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FirstNonRepeatedCharacterTest {

    @Test
    void testFirstNonRepeatedChar() {
        assertEquals('a', FirstNonRepeatedCharacter.findFirstNonRepeatedChar("assessment"));
        assertNull(FirstNonRepeatedCharacter.findFirstNonRepeatedChar("aabbcc"));
    }

    @Test
    void testFirstNonRepeatedCharWithEmptyString() {
        assertNull(FirstNonRepeatedCharacter.findFirstNonRepeatedChar(""));
    }

    @Test
    void testFirstNonRepeatedCharWithNullString() {
        assertNull(FirstNonRepeatedCharacter.findFirstNonRepeatedChar(null));
    }
}

