import java.util.List;
import java.util.Map;
import java.util.Set;

public class CopyOfDemo {

    public static void main(String[] args){
        List<String> list = List.of("a", "b", "c");
        var list1 = List.copyOf(list);

        Set<Integer> set = Set.of(1, 2, 3, 4, 3);
        var set1 = Set.copyOf(set);

        Map<Integer, String> map = Map.of(1, "hi", 2, "bye");
        var map1 = Map.copyOf(map);
    }
}
