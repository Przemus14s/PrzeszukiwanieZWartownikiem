import java.util.Scanner;

public class Main {
    public static final int SIZE_ARRAY = 50;

    public static void main(String[] args) {


        System.out.println("Podaj liczbę szukaną");
        Scanner scanner = new Scanner(System.in);
        int lockedForNumber = scanner.nextInt();

        int result = findNumberInArraySentry(lockedForNumber, fillArray());

        if(result == SIZE_ARRAY){
            System.out.println("Podanej liczby nie ma w tablicy");
        }else{
            System.out.println("Podana liczba jest w tablicy pod indexem " + result);
        }


    }

    public static int[] fillArray() {
        int[] arrayOfNumbers = new int[SIZE_ARRAY];
        for (int i = 0; i < SIZE_ARRAY; i++) {
            if (i % 10 == 0) System.out.println();
            arrayOfNumbers[i] = (int)(Math.random() * 100);
            System.out.printf(arrayOfNumbers[i] + ", ");

        }
        return arrayOfNumbers;
    }

    public static int findNumberInArraySentry(int searchedNumber, int[] arrayNumbers) {
        int[] arrayNumberWithSentry = new int[SIZE_ARRAY + 1];
        for (int i = 0; i < SIZE_ARRAY; i++) {
            arrayNumberWithSentry[i] = arrayNumbers[i];
        }
        arrayNumberWithSentry[SIZE_ARRAY] = searchedNumber;
        int indexNumber = 0;
        for (int i = 0; i <= SIZE_ARRAY; i++) {
            if (arrayNumberWithSentry[i] == searchedNumber) {
                indexNumber = i;
                break;
            }
        }
        return indexNumber;

    }
}
