package arrayshashing;

import java.util.*;

public class GroupAnagramsSolution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<List<Integer>, List<String>> anagrams = new HashMap<>();
        List<List<String>> res = new ArrayList<>();
        for (String s : strs){
            List<Integer> anagram = getAnagram(s);
            anagrams.computeIfAbsent(anagram, k -> new ArrayList<>()).add(s);
        }
        return new ArrayList<>(anagrams.values());
    }

    private List<Integer> getAnagram(String s) {
        List<Integer> anagram = new ArrayList<>(Collections.nCopies(26, 0));
        for (char c : s.toCharArray()) {
            int idx = c - 'a';
            anagram.set(idx, anagram.get(idx) + 1);
        }
        return anagram;
    }
}
