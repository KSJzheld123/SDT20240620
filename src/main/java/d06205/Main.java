package d06205;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        StringBuilder a = new StringBuilder();
        ArrayList<String> b = new ArrayList<>();
        b.add("안");
        b.add("녕");
        b.add("하");
        b.add("세");
        b.add("요");
        b.add(".");
        for(int i =0; i < b.size(); i++) {
            a.append(b.get(i));
        }
        System.out.println(a);
    }
}
