package Chapter7;

public class ConcatList {
    public static int[] concatList(int[] list1, int[] list2) {
        int arrayList = list1.length;
        int arrayList1 = list2.length;

        int[] newList = {arrayList1 + arrayList};

        int[] result = new int[newList.length];
        int pos = 0;

        for (int numbers : list1) {
            result[pos]= numbers;
            pos++;
        }
        for (int numbers : list2) {
            result[pos] = numbers;
            pos++;
        }

         return result;
    }
}
