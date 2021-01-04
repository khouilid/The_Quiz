package Controllers;

import java.util.ArrayList;
import java.util.HashMap;

public class Questions {

    private ArrayList<HashMap<String, String>> questions = new ArrayList<>();


    public Questions() {
        //question 1
        HashMap<String, String> question1 = new HashMap<>();
        question1.put("question", "JAVA est un langage  ?");
        question1.put("option_1", "Compilé ");
        question1.put("option_2", "Interprété");
        question1.put("option_3", "Compilé et interpreté");
        question1.put("Anwser", "Compilé");
        questions.add(question1);
        //question 2
        HashMap<String, String> question2 = new HashMap<>();
        question2.put("question", "Toutes les classes héritent de la classe ?");
        question2.put("option_1", "Main");
        question2.put("option_2", "Object");
        question2.put("option_3", "AWT");
        question2.put("Anwser", "Main");
        questions.add(question2);
        //question 3
        HashMap<String, String> question3 = new HashMap<>();
        question3.put("question", "Par convention une classe ?");
        question3.put("option_1", "est en minuscule");
        question3.put("option_2", "commence par une majuscule");
        question3.put("option_3", "est en majuscules");
        question3.put("Anwser", "commence par une majuscule");
        questions.add(question3);
        //question 4
        HashMap<String, String> question4 = new HashMap<>();
        question4.put("question", "Est-ce que on peut avoir plusieurs constructeurs pour la même classe ?");
        question4.put("option_1", "oui");
        question4.put("option_2", "non");
        question4.put("option_3", "");
        question4.put("Anwser", "oui");
        questions.add(question4);
        //question 5
        HashMap<String, String> question5 = new HashMap<>();
        question5.put("question", "Dans la ligne \"public class A implements B\", B est :\n ?");
        question5.put("option_1", "Interfacce");
        question5.put("option_2", "Classe parent");
        question5.put("option_3", "Package gfc");
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
