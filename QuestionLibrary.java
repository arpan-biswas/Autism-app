package com.example.shuvo.autismtherapy;

/**
 * Created by Tanzim on 8/13/2017.
 */

public class QuestionLibrary {

    /**Questions to determine autism
     * All the questions are in this string array*/
    private String mQuestions[] = {
            "1. I prefer to do things with others rather than on my own",
            "2. I prefer to do things the same way over and over again.",
            "3. If I try to imagine something, I find it very easy to create a picture in my mind.",
            "4. I frequently get so strongly absorbed in one thing that I lose sight of other things.",
            "5. I often notice small sounds when others do not.",
            "6. I usually notice car number plates or similar strings of information.",
            "7. Other people frequently tell me that what I’ve said is impolite, even though I think it is polite.",
            "8. When I’m reading a story, I can easily imagine what the characters might look like.",
            "9. I am fascinated by dates.",
            "10. In a social group, I can easily keep track of several different people’s conversations.",
            "11. I find social situations easy.",
            "12. I tend to notice details that others do not.",
            "13. I would rather go to a library than to a party.",
            "14. I find making up stories easy.",
            "15. I find myself drawn more strongly to people than to things."
    };

    /**Choices of the question*/
    private String mChoices[] = {
            "Definitely agree", "Slightly agree", "Slightly disagree", "Definitely disagree"
    };

    private int mAnswerPoints[][] = {
            {1,2,6,10},/**Question1*/
            {10,8,5,0},/**Question2*/
            {0,3,5,8}, /**Question3*/
            {10,8,4,1},/**Question4*/
            {10,7,4,1},/**Question5*/
            {9,5,3,1},/**Question6*/
            {10,8,3,0},/**Question7*/
            {8,7,5,4},/**Question8*/
            {10,8,4,0},/**Question9*/
            {8,5,4,8},/**Question10*/
            {0,2,8,10},/**Question11*/
            {10,8,2,1},/**Question12*/
            {10,7,4,1},/**Question13*/
            {0,3,5,6},/**Question14*/
            {0,2,7,10},/**Question15*/
            /**
             * A Total Score of 139
             * */


    };

    public String getQuestion(int a){
        String question = mQuestions[a];
        return question;
    }

    public int getPoints(int a, int b){
        return mAnswerPoints[a][b];
    }

    public String getChoice (int a){
        return mChoices[a];
    }
}
