import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class PuzzleJava{
    public void sumAndGreaterThan10(int[] arr){
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        int sum = 0;
        for (int i = 0; i <arr.length; i++){
            sum += arr[i];
            if(arr[i] > 10){
                numbers.add(arr[i]);
            }
        }
        System.out.println(sum);
        System.out.println(numbers);
    }
    public void shuffleNames(String[] arr){
        ArrayList<String> names = new ArrayList<String>();
        ArrayList<String> names5 = new ArrayList<String>();

        for (int i = 0; i < arr.length; i++){
            if(arr[i].length() > 5){
                names5.add(arr[i]);
            }
            names.add(arr[i]);
        }
        Collections.shuffle(names);
        System.out.println(names);
        System.out.println(names5);
    }

    public void shuffleAlphabet(String[] arr){
        ArrayList<String> alphabetArr = new ArrayList<String>();
        for(char alphabet = 'A'; alphabet <= 'Z'; alphabet++){
            alphabetArr.add(Character.toString(alphabet));
        }
        System.out.println(alphabetArr);
        Collections.shuffle(alphabetArr);
        System.out.println(alphabetArr);

        System.out.println("First letter of shuffled alphabet array: " + alphabetArr.get(0));
        System.out.println("Last letter of shuffled alphabet array: " + alphabetArr.get(25));
        String sample = alphabetArr.get(0);

        if("AEIOU".indexOf(sample) > 0){
            System.out.println("AEIOU the beautiful sound of vowels");
        } 
    }

    public void randNumber(){
        ArrayList<Integer> randNums = new ArrayList<Integer>();
        for(int i = 0; i < 10; i++){
            int num = ThreadLocalRandom.current().nextInt(55, 101);
            randNums.add(num);
        }
        System.out.println(randNums);
    }

    public void randNumber1(){
        ArrayList<Integer> randNums = new ArrayList<Integer>();
        for(int i = 0; i < 10; i++){
            int num = ThreadLocalRandom.current().nextInt(55, 101);
            randNums.add(num);
        }
        System.out.println(randNums);
    }

    public void randNumber2(){
        ArrayList<Integer> randNums2 = new ArrayList<Integer>();
        int min = 101;
        int max = 55;
        for(int i = 0; i < 10; i++){
            int num2 = ThreadLocalRandom.current().nextInt(55, 101);
            randNums2.add(num2);
            if(num2 < min){
                min = num2;
            }
            if(num2 > max){
                max= num2;
            }
        }
        Collections.sort(randNums2);
        System.out.println(randNums2);
        System.out.println("Smallest randomized number is: " + min);
        System.out.println("Largest randomized number is: " + max);
    }

    public void randomString(){
        Random rand = new Random();
        StringBuilder randString = new StringBuilder();
        String alphaNumeric = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        for(int i = 0; i < 5; i++){
            randString.append(alphaNumeric.charAt(rand.nextInt(alphaNumeric.length())));
        }
        String finalString = randString.toString();
        System.out.println(finalString);
    }

    public void randomStringOfStrings(){
    Random rand = new Random();
    StringBuilder randString = new StringBuilder();
    ArrayList<String> randList = new ArrayList<String>();
    String alphaNumeric = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
    for(int i = 0; i <10; i++){
        for(int j = 0; j < 5; j++){
            randString.append(alphaNumeric.charAt(rand.nextInt(alphaNumeric.length())));
        }
        String finalString = randString.toString();
        randList.add(finalString);
        randString.setLength(0);
    }
    System.out.println(randList);       
    }
}

