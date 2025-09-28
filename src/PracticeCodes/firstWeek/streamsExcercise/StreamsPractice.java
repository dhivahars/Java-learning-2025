package PracticeCodes.firstWeek.streamsExcercise;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class StreamsPractice {
    public static void main(String[] args) {
        ArrayList<Integer> l=new ArrayList<>();
        for(int i=1;i<=10;i++){
            l.add(i);
        }
//        l= (ArrayList<Integer>) l.stream()
//                .filter(a->a%2!=0)
//                .collect(Collectors.toList());
        l= (ArrayList<Integer>) l.stream()
                .map(a->a*2)
                .collect(Collectors.toList());

        System.out.println(l);
    }
}
