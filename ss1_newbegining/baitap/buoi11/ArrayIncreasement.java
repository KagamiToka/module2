package baitap.buoi11;

import java.util.*;

public class ArrayIncreasement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String n = sc.nextLine();

        Set<Character> set = new LinkedHashSet<>();

        for (char c : n.toCharArray()) {
            set.add(c);
        }

        List<Character> list = new ArrayList<>(set);
        Collections.sort(list);

        StringBuilder stringBuilder = new StringBuilder();
        for (Character c : list) {
            stringBuilder.append(c);
        }
        System.out.println("Chuỗi sau khi sắp xếp là: " + stringBuilder);
    }
}
