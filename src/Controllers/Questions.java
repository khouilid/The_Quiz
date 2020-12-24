package Controllers;

import java.util.ArrayList;
import java.util.HashMap;

public class Questions {

    private ArrayList<HashMap<String, String>> questions = new ArrayList<>();


    public Questions() {
        //question 1
        HashMap<String, String> question1 = new HashMap<>();
        question1.put("question", "1 ?");
        question1.put("option_1", "blajdhs");
        question1.put("option_2", "blajdhsdfds");
        question1.put("option_3", "blajdhskfjg");
        question1.put("Anwser", "blajdhs");
        questions.add(question1);
        //question 2
        HashMap<String, String> question2 = new HashMap<>();
        question2.put("question", "2 ?");
        question2.put("option_1", "blajdhs");
        question2.put("option_2", "blajdhsdfds");
        question2.put("option_3", "blajdhskfjg");
        question2.put("Anwser", "blajdhs");
        questions.add(question2);
        //question 3
        HashMap<String, String> question3 = new HashMap<>();
        question3.put("question", "3?");
        question3.put("option_1", "blajdhs");
        question3.put("option_2", "blajdhsdfds");
        question3.put("option_3", "blajdhskfjg");
        question3.put("Anwser", "blajdhs");
        questions.add(question3);
        //question 4
        HashMap<String, String> question4 = new HashMap<>();
        question4.put("question", "4 ?");
        question4.put("option_1", "blajdhs");
        question4.put("option_2", "blajdhsdfds");
        question4.put("option_3", "blajdhskfjg");
        question4.put("Anwser", "blajdhs");
        questions.add(question4);
        //question 5
        HashMap<String, String> question5 = new HashMap<>();
        question5.put("question", "5 ?");
        question5.put("option_1", "blajdhs");
        question5.put("option_2", "blajdhsdfds");
        question5.put("option_3", "blajdhskfjg");
        question5.put("Anwser", "blajdhs");
        questions.add(question5);


    }

    public HashMap<String, String> getQuestions(int id) {
        return questions.get(id);
    }


    public boolean checkAnwser(String anwser, int id) {

        if (questions.get(id).get("Anwser").equals(anwser)) {
            return true;
        }
        return false;
    }


}
