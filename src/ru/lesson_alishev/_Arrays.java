package ru.lesson_alishev;

public class _Arrays {
    public static void main(String[] args) {
//        int numbers[] = new int[5];
//        for (int i = 0; i<numbers.length; i++){
//            numbers[i] = i * 10;
//        }
//        for (int i = 0; i<numbers.length; i++)
//            System.out.println(numbers[i]);

        int numbers2[][] = new int[3][5];
        for (int i = 0; i<3; i++) {
            int j;
            for (j = 0; j < 4; j++)
                numbers2[i][j] = i * 10;
            System.out.println(numbers2[i][j]); //thswrtjsr
        }


    }
}
