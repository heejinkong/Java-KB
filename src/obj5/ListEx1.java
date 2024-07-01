package obj5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListEx1 { //순서가 존재, 중복 허용
    public List<String> getCollection() {
        return new LinkedList<String>();
    }
    public static void main(String[] args) {
       List<String> list = new ArrayList<>();
         list.add("abc");
         list.add("def");
         list.add("ghi");
         list.add("jkl");
         list.add("abd");
//        System.out.println(list.get(4));
//        for(String a: list) {
////            System.out.println(list.get(list.indexOf(a)));
//            System.out.println(a);
//        }

        Iterator<String> it = list.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }

    }
}
