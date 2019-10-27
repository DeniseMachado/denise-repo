package org.academiadecodigo.stringrays.unique_word;

import java.util.*;

public class UniqueWord implements Iterable<String> {

    private Set<String> words = new HashSet<String>();

    public UniqueWord(String s) {

        Collections.addAll(words, s.split(" "));
    }

    @Override
    public Iterator<String> iterator() {
        return words.iterator();
    }


}
