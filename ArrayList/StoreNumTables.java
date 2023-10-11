package ArrayList;

import java.util.ArrayList;

public class StoreNumTables {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();

        // ArrayList<Integer> listOne = new ArrayList<>();
        // for (int i = 0; i < 5; i++) {
        //     listOne.add((i+1)*1);
        // }
        // mainList.add(listOne);

        // ArrayList<Integer> listTwo = new ArrayList<>();
        // for (int i = 0; i < 5; i++) {
        //     listTwo.add((i+1)*2);
        // }
        // mainList.add(listTwo);

        // ArrayList<Integer> listThree = new ArrayList<>();
        // for (int i = 0; i < 5; i++) {
        //     listThree.add((i+1)*3);
        // }
        // mainList.add(listThree);

        ArrayList<Integer> listOne = new ArrayList<>();
        ArrayList<Integer> listTwo = new ArrayList<>();
        ArrayList<Integer> listThree = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            listOne.add((i+1)*1);
            listTwo.add((i+1)*2);
            listThree.add((i+1)*3);
        }
        mainList.add(listOne);
        mainList.add(listTwo);
        mainList.add(listThree);

        System.out.println(mainList);
    }
}
