/*
 * Mouner Dabjan 
 * 3/3/2020 
 * This program generates a random poem with an AAA or an ABA ryhming pattern 
 */
package triplets;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class Triplets {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> nouns = new ArrayList();
        nouns.add("cat");
        nouns.add("dog");
        nouns.add("horse");
        nouns.add("goat");
        nouns.add("eagle");
        nouns.add("lion");
        nouns.add("giraffe");

        ArrayList<String> verbs = new ArrayList();
        verbs.add("ate");
        verbs.add("slept");
        verbs.add("jumped");
        verbs.add("raced");
        verbs.add("ran");
        verbs.add("tripped");
        verbs.add("guessed");
        verbs.add("tapped");

        ArrayList<String> rhymingNouns = new ArrayList();
        rhymingNouns.add("mouse");
        rhymingNouns.add("blouse");
        rhymingNouns.add("grouse");
        rhymingNouns.add("house");
        rhymingNouns.add("spouse");
        rhymingNouns.add("doghouse");
        rhymingNouns.add("beachhouse");
        rhymingNouns.add("treehouse");

        ArrayList<String> rhymingNouns2 = new ArrayList();
        rhymingNouns2.add("brain");
        rhymingNouns2.add("chain");
        rhymingNouns2.add("pain");
        rhymingNouns2.add("stain");
        rhymingNouns2.add("again");
        rhymingNouns2.add("rain");
        rhymingNouns2.add("hurricane");
        rhymingNouns2.add("drain");

        String noun;
        String verb1, verb2, verb3;
        String rhymingNoun1, rhymingNoun2, rhymingNoun3, rhymingNounB;
        int randomNum;

        //get a random noun from the nouns array
        //use .size() to get the # of elements
        randomNum = (int) (Math.random() * nouns.size());
        noun = nouns.get(randomNum);

        //get the first random verb from the verbs array &
        // remove from ArrayList
        randomNum = (int) (Math.random() * verbs.size());
        verb1 = verbs.get(randomNum);
        verbs.remove(randomNum);

        //get the second random verb from verbs array and remove it
        randomNum = (int) (Math.random() * verbs.size());
        verb2 = verbs.get(randomNum);
        verbs.remove(randomNum);

        //get the third random verb from verbs array and remove it
        randomNum = (int) (Math.random() * verbs.size());
        verb3 = verbs.get(randomNum);
        verbs.remove(randomNum);

        //get the first rhyming noun and remove it
        randomNum = (int) (Math.random() * rhymingNouns.size());
        rhymingNoun1 = rhymingNouns.get(randomNum);
        rhymingNouns.remove(randomNum);

        //get the second rhyming noun and remove it
        randomNum = (int) (Math.random() * rhymingNouns.size());
        rhymingNoun2 = rhymingNouns.get(randomNum);
        rhymingNouns.remove(randomNum);

        //get the third rhyming noun and remove it
        randomNum = (int) (Math.random() * rhymingNouns.size());
        rhymingNoun3 = rhymingNouns.get(randomNum);
        rhymingNouns.remove(randomNum);

        //get the fourth rhyming noun which is the B and remove it
        randomNum = (int) (Math.random() * rhymingNouns2.size());
        rhymingNounB = rhymingNouns2.get(randomNum);
        rhymingNouns2.remove(randomNum);

        //deciding wether the poen is AAA or ABA rhyming scheme
        double rhymingChoice = (double) Math.random();
        if (rhymingChoice > 0.75) {
            System.out.println("The " + noun + " " + verb1 + " a "
                    + rhymingNoun1 + "\n" + "And then " + verb2
                    + " it in the " + rhymingNoun2 + "\n" + "Then the " + " " +  noun + " " + verb3 + " in the " + rhymingNoun3);
        } else {
            System.out.println("The " + noun + " " + verb1 + " a "
                    + rhymingNoun1 + "\n" + "And then " + verb2
                    + " it in the " + rhymingNounB + "\n" + "Then the " + " " + noun + " " + verb3 + " in the " + rhymingNoun3);
       }

    }

}
