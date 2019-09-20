import java.util.HashMap;

public class HashMapPt {
    public static void main(String[] args) {
        HashMap<String, Pokemon> pokedex = new HashMap<>();

        pokedex.put("피카츄", new Pokemon("번개"));
        pokedex.put("갸라도스", new Pokemon("물"));

        System.out.println(pokedex.get("피카츄"));
        System.out.println(pokedex.get("갸라도스"));

        for (String key: pokedex.keySet()) {
            System.out.println(key);
        }

    }
}
