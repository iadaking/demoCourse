package com.company;

import com.sun.javafx.binding.StringFormatter;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {


    /**
     * ´òÓ¡¶ÔÏó
     *
     * @param index
     * @param obj
     */
    public static void print(int index, Object obj) {
        System.out.println(String.format("{%d},%s", index, obj.toString()));
    }

    public static void demoOperation() {
        print(1, 5 + 2);
        print(1, 5 - 2);
        print(1, 5 * 2);
        print(1, 5 / 2.0);
        print(1, 5 >> 2);
        print(1, 5 << 2);
        print(1, 5 & 2);
        print(1, 5 | 2);
        print(1, 5 ^ 2);
        print(1, 5 == 2);
        print(1, 5 != 2);

    }

    public static void demoControleFlow() {
        int score = 60;
        if (score > 80) {
            print(1, "A");
        } else if (score > 60) {
            print(2, "B");
        } else {
            print(3, "C");
        }

        String str = "hello word";
        for (char c : str.toCharArray()) {
            print(3, c);
        }
    }

    public static void demoString() {
        String str = "hello nowcoder";
        print(1, str.indexOf('e'));
        print(2, str.charAt(6));
        print(3, str.codePointAt(1));
        print(4, str.compareTo("hello mowcoder"));
        print(5, str.compareTo("hello powcoder"));
        print(6, str.concat("!!"));
        print(7, str.contains("hello"));

    }

    public static void demoList() {
        List<String> strList = new ArrayList<>();
        for (int i = 0; i < 4; ++i) {
            strList.add(String.valueOf(i));
        }
        print(1, strList);

        List<String> strListB = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            strListB.add(String.valueOf(i));
        }

        strList.addAll(strListB);
        print(2, strList);

        strList.remove(0);
        print(3, strList);
        strList.remove(String.valueOf(1));
        print(4, strList);
        Collections.sort(strList);
        print(5, strList);

        Collections.sort(strList, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });
        print(6, strList);
        Collections.reverse(strList);
        print(7, strList);

    }

    public static void demoSet() {
        Set<String> strSet = new HashSet<>();
        for (int i = 0; i < 5; i++) {
            strSet.add(String.valueOf(i));
            strSet.add(String.valueOf(i));
            strSet.add(String.valueOf(i));
        }

        print(1, strSet);
        strSet.remove("1");
        print(2, strSet);
        strSet.contains("4");
        print(3, strSet);
        print(4, strSet.contains("5"));
        strSet.addAll(Arrays.asList(new String[]{"A", "B", "C"}));
        print(5, strSet);

        for (String value : strSet) {
            print(6, value);
        }

        print(7, strSet.isEmpty());
        print(8, strSet.size());

    }

    public static void demoKeyValue() {
        Map<String, String> map = new HashMap<>();
        for (int i = 0; i < 4; i++) {
            map.put(String.valueOf(i), String.valueOf(i * i));
        }
        print(1, map);

        for (Map.Entry<String, String> entry : map.entrySet()) {
            print(2, entry.getKey() + ":" + entry.getValue());
        }

        print(3, map.keySet());
        print(4, map.values());
        print(5, map.get("2"));
        map.replace("1", "AAA");
        print(6, map);
    }

    public static void demoException() {
        try {
            print(1, "hello");
            String a = null;
            a.indexOf('a');

        } catch (NullPointerException npe) {
            print(2, "npe");

        } catch (Exception e) {

        } finally {
            print(3, "finally");

        }
    }

    public static void demoCommon() {
        Random random = new Random();
        random.setSeed(1);
        for (int i = 0; i < 5; i++) {
            print(1, random.nextInt(100));
        }
        List<Integer> array = Arrays.asList(new Integer[]{1, 2, 3, 4, 5});
        print(2, array);
        Collections.shuffle(array);
        print(3, array);

        Date date = new Date();
        print(4, date);
        print(5, date.getTime());
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        print(5, df.format(date));
        print(5, DateFormat.getTimeInstance(DateFormat.FULL).format(date));
        print(5, UUID.randomUUID());
        print(6, Math.max(1, 2));
        print(7, Math.ceil(2.2));
        print(8, Math.floor(2.5));

    }

    public static void demoClass() {
        Animal animal = new Animal("jim", 1);
        animal.say();
        animal = new Human("lei", 18, "cn");
        animal.say();
        
    }
    public static void main(String[] args) {
        // write your code here
//        System.out.println("hello nowcoder");
//        print(1, "hello nowcoder");
//        demoOperation();
//        demoControleFlow();
//        demoString();
//        demoList();
//        demoSet();
//        demoKeyValue();
//        demoException();
//        demoCommon();
        demoClass();
    }
}
