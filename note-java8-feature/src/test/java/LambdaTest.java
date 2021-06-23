import org.junit.Test;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * @author mumu
 * @date 2021-6-23 16:30
 */
public class LambdaTest {


    /**
     * 不使用 lambda
     */
    @Test
    public void TestSort0() {
        List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");

        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return a.compareTo(b);
            }
        });

        System.out.println(names);

    }

    /**
     * 使用 lambda
     */
    @Test
    public void TestSort1() {
        List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");

        Collections.sort(names, (a, b) -> a.compareTo(b));

        System.out.println(names);

    }

    /**
     * 方法引用
     */
    @Test
    public void TestSort2() {
        List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");

        Collections.sort(names, String::compareTo);

        System.out.println(names);

    }


    /**
     * 接口默认实现方法
     */
    @Test
    public void TestSort3() {
        List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");

        names.sort(String::compareTo);
        names.sort(Comparator.reverseOrder());

        System.out.println(names);

    }

    /**
     * 接口静态方法
     */
    @Test
    public void TestSort4() {
        List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");

        names.sort(Comparator.naturalOrder());

        System.out.println(names);

    }

    /**
     * Predicate 断言
     * 验证传入的数据是否满足条件，返回 boolean 结果
     * 可以嵌套使用
     * -  negate  否定
     * -  and       与
     * -  or         或
     * - isEqual 是否相等
     */
    @Test
    public void testPredicate() {
        Predicate<String> predicate = (s) -> s.length() > 0;

        boolean foo0 = predicate.test("foo");
        System.out.println("foo0 = " + foo0);// true
        boolean foo1 = predicate.negate().test("foo");
        System.out.println("foo1 = " + foo1);// negate否定相当于!true

        Predicate<Boolean> nonNull = Objects::nonNull;
        Predicate<Boolean> isNull = Objects::isNull;


        Predicate<String> isEmpty = String::isEmpty;
        Predicate<String> isNotEmpty = isEmpty.negate();

        String a = "f";
        System.out.println(predicate.and(isEmpty).negate().test(a));
        System.out.println(predicate.and(String::isEmpty).negate().test(a));

    }

    /**
     * Functions
     * 给定一个值，返回一个值
     * 可嵌套使用
     * - compose 先执行传入函数，在执行调用函数
     * - andThen 后执行传入函数，在执行调用函数
     * - identity 返回自己
     */
    @Test
    public void testFunction() {
        Function<String, Integer> toInteger = Integer::valueOf;                                         //转Integer
        Function<String, String> backToString = toInteger.andThen(String::valueOf);                     //转String
        String apply = backToString.apply("123");// "123"
        System.out.println(apply);
    }

    /**
     * Supplier
     * 返回一个结果，类似于生产者，无入参
     */
    @Test
    public void testSupplier() {
        Supplier<ArrayList<Objects>> personSupplier0 = ArrayList::new;
        System.out.println("personSupplier0.get() = " + personSupplier0.get());
        Supplier<String> personSupplier1 = String::new;
        System.out.println("personSupplier1.get() = " + personSupplier1.get());
    }

    /**
     * consumer
     * 给定一个参数，进行处理，无返回值
     */
    @Test
    public void testConsumer() {
        Consumer<String> greeter01 = new Consumer<String>() {
            @Override
            public void accept(String p) {
                System.out.println("Hello, " + p);
            }
        };

        Consumer<String> greeter02 = (p) -> System.out.println("Hello, " + p);
        greeter01.accept("greeter01");
        greeter02.accept("greeter02");
    }


}
