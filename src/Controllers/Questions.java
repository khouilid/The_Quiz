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
        question2.put("option_1", "Public.Main");
        question2.put("option_2", "Object");
        question2.put("option_3", "AWT");
        question2.put("Anwser", "Public.Main");
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

          //question 6
            HashMap<String, String> question6 = new HashMap<>();
            question5.put("question", "Après la compilation, un programme écrit en\n" +
                    "JAVA, il se transforme en programme en bytecode\n" +
                    "Quelle est l’extension du programme en\n" +
                    "bytecode ? ?");
            question5.put("option_1", "a) aucun des choix");
            question5.put("option_2", "b) .JAVA");
            question5.put("option_3", "c) .Class");
            question5.put("Anwser", "aucun des choix");

            questions.add(question6);
            //question 7

            HashMap<String, String> question7= new HashMap<>();
            question7.put("question","Class Test{\n" +
                    "Public Test () {\n" +
                    "System.out.println(”Bonjour”);}\n" +
                    "public Test (int i) {\n" +
                    "this();\n" +
                    "System.out.println(”Nous sommes en ”+i+ ” !”);};\n" +
                    "}\n" +
                    "qu’affichera l’instruction suivante?\n" +
                    "Test t1=new Test (2018);");
            question7.put("option_1","a) aucun des choix");
            question5.put("option_2", "b) Bonjour Nous sommes en 2018 !");
            question5.put("option_3", "c) Nous sommes en 2018 !");
            question5.put("Anwser", "c) Nous sommes en 2018 !");
            questions.add(question7);

            //question 8
            HashMap<String, String> question8= new HashMap<>();
            question7.put("question","Voici un constructeur de la classe Employee, y-at'il un problème ?\n" +
                    "Public void Employe(String n){\n" +
                    "Nom=n;}\n");
            question7.put("option_1","a) vrai");
            question5.put("option_2", "b)faux");
            question5.put("option_3", "");
            question5.put("Anwser", "vrai");


            //question 9
            HashMap<String, String> question9= new HashMap<>();
            question7.put("question","Pour spécifier que la variable ne pourra plus être\n" +
                    "modifiée et doit être initialisée dès sa déclaration,\n" +
                    "on la déclare comme une constante avec le mot\n" +
                    "réservé\n");
            question7.put("option_1","a) aucun des choix");
            question5.put("option_2", "b) final");
            question5.put("option_3", "c) const");
            question5.put("Anwser", "b) final");
            questions.add(question9);

            //question 10
            HashMap<String, String> question10= new HashMap<>();
            question7.put("question","Dans une classe, on accède à ses variables grâce au\n" +
                    "mot clé");
            question7.put("option_1","a) aucun des choix");
            question5.put("option_2", "b) this");
            question5.put("option_3", "c) super ");
            question5.put("Anwser", "b) this");
            questions.add(question10);

            //question 11
            HashMap<String, String> question11= new HashMap<>();
            question7.put("question","calculerSalaire(int)\n" +
                    "calculerSalaire(int, double)\n" +
                    "La méthode calculerSalaire est :");
            question7.put("option_1","a) aucun des choix");
            question5.put("option_2", "b) surchargée");
            question5.put("option_3", "c) redéfinie ");
            question5.put("Anwser", "c) redéfinie");
            questions.add(question11);

            //question 12
            HashMap<String, String> question12= new HashMap<>();
            question7.put("question","Une classe qui contient au moins une méthode\n" +
                    "abstraite doit être déclarée abstraite.");
            question7.put("option_1","a) vrai");
            question5.put("option_2", "b) faux");
            question5.put("option_3", " ");
            question5.put("Anwser", "b) faux");
            questions.add(question12);


            //question 13
            HashMap<String, String> question13= new HashMap<>();
            question7.put("question","Est-ce qu’une classe peut implémenter plusieurs\n" +
                    "interfaces ?\n");
            question7.put("option_1","a) vrai");
            question5.put("option_2", "b) faux");
            question5.put("option_3", " ");
            question5.put("Anwser", "b) faux");
            questions.add(question13);

            //question 14
            HashMap<String, String> question14= new HashMap<>();
            question7.put("question","La déclaration d'une méthode suivante :\n" +
                    "public void traitement() throws IOException\n" +
                    "précise que la méthode propage une exception\n" +
                    "contrôlée");
            question7.put("option_1","<html>a) vrai</html>");
            question5.put("option_2", "b) faux");
            question5.put("option_3", " ");
            question5.put("Anwser", "b) faux");
            questions.add(question14);

            //question 15
            HashMap<String, String> question15= new HashMap<>();
            question7.put("question","class Test{\n" +
                    "public static void main (String[] args) {\n" +
                    "try {\n" +
                    "int a =10;\n" +
                    "System.out.println (\"a = \" + a );\n" +
                    "int b = 0 / a;\n" +
                    "System.out.println (\"b = \" + b);\n" +
                    "}\n" +
                    "catch(ArithmeticException e)\n" +
                    "{System.out.println (\"diviser par 0!\"); }\n" +
                    "finally\n" +
                    "{System.out.println (\"je suis à l’intérieur de\n" +
                    "finally\");}}}\n");
            question7.put("option_1","a) aucun des choix");
            question5.put("option_2", "b) a=10 b=0 Je suis à  l’intérieur de finally");
            question5.put("option_3", "c) a=10 b=0 diviser par 0! je suis à l’intérieur de finally ");
            question5.put("Anwser", "b) a=10 b=0 Je suis à  l’intérieur de finally");
            questions.add(question15);

    }

    public HashMap<String, String> getQuestions(int id) {
        return questions.get(id);
    }


    public boolean checkAnwser(String anwser, int id) {

        return questions.get(id).get("Anwser").equals(anwser);
    }


}
