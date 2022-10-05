package com.qap1SDAT;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WordFinderTest {

    WordFinder wordFinder = new WordFinder();

    @Test

    public void findNoun(){
        Assertions.assertTrue(wordFinder.findWordInSentence("Teacher", "The Teacher is helping us learn Java."));
        Assertions.assertFalse(wordFinder.findWordInSentence("Professor", "The Teacher is helping us learn Java."));
    }

    @Test

    public void findVerb(){
        Assertions.assertTrue(wordFinder.findWordInSentence("helping", "The Teacher is helping us learn Java."));
    }

    @Test

    public void findAdj(){
        Assertions.assertTrue(wordFinder.findWordInSentence("learn", "The Teacher is helping us learn Java."));

    }

}
