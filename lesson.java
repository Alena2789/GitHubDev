import java.util.Arrays;

public class lesson {
    public static void main(String[] args) {
        int [] arr = new int[0];
        arr = new int [50];
        for (int i = 0; i < 50; i++); {
            //arr [i] = (i + 1);
        }
        System.out.println (Arrays.toString (arr));
        for (int i = 0; i < 50; i++) {
            System.out.print (arr [i] + "");
        }
    }

    //Задание 1
    //[1,1,0,0,1,0,1,1,0,0]

    public static void changeZeroesAndOnes (int [] inputArray)
    {
        for (int i = 0; i < inputArray.length; i++)
        {
            if (inputArray [i] == 1)
            {
                inputArray [i] = 0;
            } else {
                inputArray [i] = 1;
            }
        }
    }
    //Задание 2
    // 1 2 3 4 5 6 7 8 ... 100;
    public static void fiilArrayWithSequence (int [] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            arr [i] = (i+1);
        }
    }
    //Задание 3
    // [1,5,3,2,11,4,5,2,4.8,9,1]
    static void doubleNumbersLessThanSixIn (int [] inputArray)
    {
        for (int i = 0; i < inputArray.length; i++)
        {
            inputArray[i] = (inputArray[i] < 6) ? (inputArray[i] * 2) : inputArray[i];
        }
        }
    //Задание 4
    // [0] [0], [1] [1], [2] [2], _, [n] [n];
    public static void fiilDiagoneLsWithOnes (int [] [] square)
    {
        for (int i = 0; i < square.length; i++)
        {
            square [i][i] = 1;
            square [i][square [i].length - 1 - i] = 1;
        }
    }
    }


