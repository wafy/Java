import java.util.ArrayList;
import java.util.HashMap;

public class PokeBag {
    private final HashMap<String, ArrayList<Pokemon>> pokemons = new HashMap<>();


    public ArrayList<Pokemon> getPokemons(String name) {
        return pokemons.get(name);
    }

    public void add(Pokemon pokemon) {
        String name = pokemon.name;

        // 해당하는 ArrayList가 없으면 생성
        if (getPokemons(name) == null) {
            pokemons.put(name, new ArrayList<Pokemon>());
        }

        getPokemons(name).add(pokemon);

    }

    public Pokemon getStrongest(String name) {
        // name 이름의 포켓몬 목록.
        ArrayList<Pokemon> pokemonList = getPokemons(name);

        // name 이름의 포캣몬 목록이 비어있으면, null 리턴.
        if (pokemonList == null) {
            return null;
        }

        // return할 포켓몬(가장 센 포켓몬)을 담을 변수.
        Pokemon strongest = null;

        // 포캣몬 리스트 안에 있는, 모든 포캣몬의 cp를 비교.
        // strongest를 가장 센 포캣몬으로 교체
        // 코드를 작성하세요.

        for (Pokemon pokemon : getPokemons(name)) {
            if (strongest == null || pokemon.cp > strongest.cp) {
                strongest = pokemon;
            }
        }

        return strongest;

    }

    public Pokemon getStrongest() {
        // return할 포켓몬(가장 센 포켓몬)을 담을 변수.
        Pokemon strongest = null;

        // HashMap 전체를 탐색 (keySet을 통해 얻은 key로 탐색)
        for (String key : pokemons.keySet()) {
            // key에 해당하는 가장 센 포켓몬을 가져오기
            Pokemon p = getStrongest(key);

            // strongest를 가장 센 포켓몬으로 교체
            if (strongest == null || p.cp > strongest.cp) {
                strongest = p;
            }
        }

        return strongest;
    }
}
