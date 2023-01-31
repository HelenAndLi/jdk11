import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {

    public static void main(String[] args) throws ClassNotFoundException{
//        List<Integer> list = List.of(1, 2, 3, 4, 5);
//        System.out.println(list.stream().dropWhile(i->i != 3).collect(Collectors.toList()));  // [3, 4, 5]
//        System.out.println(list.stream().takeWhile(i->i != 3).collect(Collectors.toList()));  // [1, 2]
        Class<String> string = (Class<String>) Class.forName("java.lang.String");
        Class str = String.class;

        System.out.println(string);
        System.out.println(str);
    }
}
