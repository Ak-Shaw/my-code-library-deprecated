import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws FileNotFoundException {

    ArrayList<String> movies = getMovies();

    String randomMovie = movies.get((int)(Math.random() * 25));

    String guessingString = getGuessingStringForMovie(randomMovie);

    StringBuilder guessingStringBuilder = new StringBuilder(guessingString);
    HashMap<Character, LinkedList<Integer>> characterIndexMap = getCharacterIndexMap(randomMovie);

    Scanner sc = new Scanner(System.in);

    int chances = 0;

    String wrongLetters = "";

    while (chances < 10 && characterIndexMap.size() > 0) {

      System.out.println("You are guessing: " + guessingStringBuilder);
      System.out.println("You have guessed (" + chances + ") wrong letters: " + wrongLetters);
      System.out.print("Guess a letter: ");

      char c = sc.next().charAt(0);

      if (characterIndexMap.containsKey(c)) {
        fillCharacterInDash(guessingStringBuilder, c, characterIndexMap.get(c));
        characterIndexMap.remove(c);
      } else {
        wrongLetters += c + " ";
        chances++;
      }
    }

    if (characterIndexMap.size() == 0) {
      System.out.println("You win!");
      System.out.println("You have guessed '" + randomMovie + "' correctly.");
    } else {
      System.out.println("You have guessed (" + chances + ") wrong letters: " + wrongLetters);
      System.out.println("GAME OVER!");
    }
  }

  public static void fillCharacterInDash(StringBuilder guessingStringBuilder, char c, LinkedList<Integer> indices) {

    for (int i : indices) {
      guessingStringBuilder.setCharAt(i, c);
    }
  }

  public static HashMap<Character, LinkedList<Integer>> getCharacterIndexMap(String s) {

    HashMap<Character, LinkedList<Integer>> characterIndexMap = new HashMap<>();

    int i = 0;
    for (char c : s.toCharArray()) {

      if (c == ' ') {
        i++;
        continue;
      }

      if (!characterIndexMap.containsKey(c)) {
        characterIndexMap.put(c, new LinkedList<>());
      }
      characterIndexMap.get(c).add(i);

      i++;
    }

    return characterIndexMap;
  }

  public static String getGuessingStringForMovie(String movie) {

    String guessingString = "";

    for (char c : movie.toCharArray()) {

      if (c == ' ') {
        guessingString += c;
      } else {
        guessingString += '_';
      }
    }

    return guessingString;
  }

  public static ArrayList<String> getMovies() throws FileNotFoundException {

    File file = new File("movies.txt");

    Scanner sc = new Scanner(file);

    ArrayList<String> movies = new ArrayList<>();

    while (sc.hasNextLine()) {
      movies.add(sc.nextLine());
    }

    return movies;
  }
}
