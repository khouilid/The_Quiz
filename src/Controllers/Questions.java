package Controllers;

import java.util.ArrayList;
import java.util.HashMap;

public class Questions {

    private ArrayList<HashMap<String, String>> questions = new ArrayList<>();


    public Questions() {
        //question 1
        HashMap<String, String> question1 = new HashMap<>();
        question1.put("question", "1 + 1?");
        question1.put("option_1", "3");
        question1.put("option_2", "4");
        question1.put("option_3", "2");
        question1.put("Anwser", "2");
        questions.add(question1);
        //question 2
        HashMap<String, String> question2 = new HashMap<>();
        question2.put("question", "2 + 2 * 4 ?");
        question2.put("option_1", "8");
        question2.put("option_2", "10");
        question2.put("option_3", "6");
        question2.put("Anwser", "10");
        questions.add(question2);
        //question 3
        HashMap<String, String> question3 = new HashMap<>();
        question3.put("question", "3 + 3 / 1 ?");
        question3.put("option_1", "6");
        question3.put("option_2", "9");
        question3.put("option_3", "3");
        question3.put("Anwser", "6");
        questions.add(question3);
        //question 4
        HashMap<String, String> question4 = new HashMap<>();
        question4.put("question", "4 + 2 ?");
        question4.put("option_1", "5");
        question4.put("option_2", "6");
        question4.put("option_3", "3");
        question4.put("Anwser", "6");
        questions.add(question4);
        //question 5
        HashMap<String, String> question5 = new HashMap<>();
        question5.put("question", "5 - 3 * 2 ?");
        question5.put("option_1", "-1");
        question5.put("option_2", "1");
        question5.put("option_3", "0");
        question5.put("Anwser", "-1");
        questions.add(question5);


    }

    public HashMap<String, String> getQuestions(int id) {
        return questions.get(id);
    }


    public boolean checkAnwser(String anwser, int id) {

        return questions.get(id).get("Anwser").equals(anwser);
    }


}
