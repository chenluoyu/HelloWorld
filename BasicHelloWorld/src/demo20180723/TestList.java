package demo20180723;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2018/7/23.
 */
public class TestList {

    public static void main(String[] args) {

        Map<String, Object> map1 = new HashMap<>();
        map1.put("aba", "132");
        map1.put("abwqa", "sada");
        map1.put("abqfa", "asd");
        map1.put("abasfaa", "ewrw");
        map1.put("abaasf", "bfdb");
        map1.put("abadaa", "asdsd");
        map1.put("abzxca", "bdfb");
        map1.put("abzxca", "bdfdsd");
        Map<String, Object> map2 = new HashMap<>();
        map2.put("aba", "132");
        map2.put("abwqa", "sada");
        map2.put("abqfa", "asd");
        map2.put("abasfaa", "ewrw");
        map2.put("abaasf", "bfdb");
        map2.put("abadaa", "asdsd");
        map2.put("abzxca", "bdfb");
        map2.put("abzxca", "bdfdsd");
        Map<String, Object> map3 = new HashMap<>();
        map3.put("aba", "1321");
        map3.put("abwqa", "sadwqea");
        map3.put("abqfa", "5645");
        map3.put("abasfaa", "ew456rw");
        map3.put("abaasf", "bfd456b");
        map3.put("abadaa", "asd453sd");
        map3.put("abzxca", "4534");
        map3.put("abzxca", "453453");
        Map<String, Object> map4 = new HashMap<>();
        map4.put("aba", "1321");
        map4.put("abwqa", "sadwqea");
        map4.put("abqfa", "5645");
        map4.put("abasfaa", "ew456rw");
        map4.put("abaasf", "bfd456b");
        map4.put("abadaa", "asd453sd");
        map4.put("abzxca", "4534");
        map4.put("abzxca", "453453");
        Map<String, Object> map5 = new HashMap<>();
        List<Map<String, Object>> list1 = new ArrayList<>();
        list1.add(map1);
        list1.add(map2);
        list1.add(map3);
        list1.add(map4);

//        List<Map<String, Object>> list2 = new ArrayList<>();
//        list2.add(list1.get(0));
//        for (Map<String, Object> map11 : list1) {
//            for (Map<String, Object> map22 : list2) {
//                if (map11.get("abwqa").toString().trim().equals(map22.get("abwqa").toString().trim())
//                        && map11.get("abaasf").equals(map22.get("abaasf"))
//                        && map11.get("abzxca").equals(map22.get("abzxca"))) {
//                    int RK_SL = Integer.parseInt(map22.get("aba").toString());
//                    int ACTUALRUKU_QTY = Integer.parseInt(map11.get("aba").toString());
//                    map22.put("aba", RK_SL + ACTUALRUKU_QTY);
//                }
//            }
//        }

//        list1.stream().filter();
        list1.forEach(map -> {

        });

    }
}