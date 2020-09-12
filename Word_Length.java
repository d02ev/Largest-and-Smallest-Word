import java.util.Arrays;
import java.util.Scanner;

public class Word_Length {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        String sentence = userInput.nextLine();

        // splitting the sentence into a string array
        String[] word = sentence.split(" ");

        // creating an array to store lengths of all the words of the sentence
        int[] wordlength = new int[word.length];

        // algorithm to fill in the wordLength array with the length of each word
        for(int i = 0; i < word.length; i++) {

            wordlength[i] = word[i].length();
        
        }

        // sorting the array from smallest to largest
        Arrays.sort(wordlength);

        // printing out the lengths of the word from the sorted array
        System.out.println("Length of smallest word is: " + wordlength[0]);
        System.out.println("Length of the largest word is: " + wordlength[word.length - 1]);


    }
    
}
