import java.util.List;

public class VarDemo {

//    var name;  // Cannot resolve symbol 'var'，也不能用在成员变量上，这样也是不允许的

    public static void main(String[] args){
        var x = 10;
        var y = 11;
//        var z;  // Cannot infer type: 'var' on variable without initializer，必须初始化
//        x = "123";  //Required type:int , Provided: String，定义变量时，编译器已经推断为int，现在再尝试设置String类型就会失败

        y = 12;

        var l1 = List.of(1, 2, 3);
        var l2 = List.of("day", "month", "year");
        var list = List.of(l1, l2);
        for(var l : list){
            System.out.println(l);
        }
    }
}
