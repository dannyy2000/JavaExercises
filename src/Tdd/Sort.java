package Tdd;

public class Sort {
    public static int[] sortAscMethod(int[] list) {
        int index1 = 0;
        int index2 = 0;
        int temp = 0;

        for (index1 = 0; index1 < list.length ; index1++) {

            for (index2 = 0; index2 < list.length - 1 - index1; index2++) {

                if (list[index2] > list[index2 + 1]) {
                    temp = list[index2];
                    list[index2] = list[index2 + 1];
                    list[index2 + 1] = temp;
                }
            }
        }
        return list;
    }

    public static int[] sortDescMethod(int[] list) {
        int index1 = 0;
        int index2 = 0;
        int temp = 0;

        for (index1 = 0; index1 < list.length ; index1++) {

            for (index2 = 0; index2 < list.length - 1 - index1; index2++) {

                if (list[index2] < list[index2 + 1]) {
                    temp = list[index2];
                    list[index2] = list[index2 + 1];
                    list[index2 + 1] = temp;
                }
            }
        }
        return list;
    }
}

