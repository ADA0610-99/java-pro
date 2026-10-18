package ru.otus;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Integer[] a = {1, 2, 3};
        twoElementsReplacer(a, 0, 9);
        for (int n = 0; n < a.length; n++) {
            System.out.print(a[n]);
        }
        System.out.println();
        System.out.println(arrayToArrayList(a));
        String[] str = {"a", "b", "c", "b"};
        System.out.println(uniqueCounter(str));
    }

    public static <T extends Number> void twoElementsReplacer(T[] a, T i, T j) {
        a[0] = i;
        a[1] = j;

    }

    public static <T extends Number> List<T> arrayToArrayList(T[] a) {
        List<T> list = new ArrayList<>(List.of(a));
        return list;
    }

    public static HashMap<String, Integer> uniqueCounter(String[] arr) {
        HashMap<String, Integer> mapa = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            mapa.merge(arr[i], 1, Integer::sum);
        }
        return mapa;
    }
}
