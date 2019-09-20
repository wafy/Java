import java.util.HashMap;

public class WordDictionary {

    HashMap<String, String> voca = new HashMap<>();


    public void addWord(String eng, String kor) {
        voca.put(eng, kor);
//        System.out.println(voca);
    }

    public String find(String eng) {

        for (String key : voca.keySet()) {
            if (key.toLowerCase().equals(eng.toLowerCase())) {
                return voca.get(key);
            }

        }
        return null;
    }


}