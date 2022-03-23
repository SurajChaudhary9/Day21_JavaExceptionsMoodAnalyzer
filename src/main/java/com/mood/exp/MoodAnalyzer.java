/**
 *@PROBLEM_STATEMENT : UC1:happy or sad
 *@author Suraj Chaudhary
 *@Date 23-Mar-2022
 */
package com.mood.exp;

/**
 * Hello world!
 */
public class MoodAnalyzer {
	public static String message;

	public MoodAnalyser() {
    }

	public MoodAnalyser(String message) {
        this.message = message;
        analyseMood();

    }

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public static String analyseMood() {
        try {
            if (message.toLowerCase().contains("sad")) {
                return "Sad";
            } else {
                return "Happy";
            }

        } catch (NullPointerException e) {
            return "Exception Handled";
        }
    }