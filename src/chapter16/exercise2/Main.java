package chapter16.exercise2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Hero h1 = new Hero("斎藤");
        Hero h2 = new Hero("鈴木");

        ArrayList<Hero> heroes = new ArrayList<>();
        heroes.add(h1);
        heroes.add(h2);

        for (Hero h: heroes) {
            System.out.println(h.getName());
        }

        Map<Hero, Integer> numberOfKills = new HashMap<>();
        numberOfKills.put(h1, 3);
        numberOfKills.put(h2, 7);

        for (Hero key: numberOfKills.keySet()) {
            int values = numberOfKills.get(key);
            System.out.println(h1.getName() + "が倒した敵の数＝" + values);
        }
    }
}
