package Iterator;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

class LocalInnerClassExample {

    public static List<Character> convertStringToCharList(String str) {
        List<Character> chars = str
                .chars()
                .mapToObj(e -> (char)e)
                .collect(Collectors.toList());
        return chars;
    }


    public static void main(String[] args) {
        List<Character> list = convertStringToCharList("I love mommy and daddy");
        Iterator seq = list.iterator();
        while (seq.hasNext()) {
            Character next = (Character) seq.next();
//            System.out.println(next);

            if(next.equals(' ')){
                seq.remove();
//                System.out.println("A character has been removed");
            }
        }
        String result = "";
        for (Character s : list) {
            result += s;
        }
        System.out.println(result);

    }

//    static Iterator suffixes(final String s) {
//        class SuffixIterator implements Iterator {
//            int startindex = 0;
//
//            @Override
//            public boolean hasNext() {
//                return startindex < s.length();
//            }
//
//            @Override
//            public Object next() {
//                return s.substring(startindex++);
//            }
//        }
//        return new SuffixIterator();
//    }
}