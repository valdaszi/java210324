package lt.bit.java.p27;

public class LambdaDemo {

    public static void main(String[] args) {
        Function<Integer, String> integer2String = integer -> integer == null ? "0" : String.valueOf(integer);

        System.out.println("null = " + integer2String.apply(null));
        System.out.println("123456789 = " + integer2String.apply(123456789));

        integer2String = integer -> integer == null ? "n/a" : String.valueOf(integer);

        System.out.println("null = " + integer2String.apply(null));
        System.out.println("123456789 = " + integer2String.apply(123456789));

        final int x = 10;

        integer2String = new Function<Integer, String>() {
            @Override
            public String apply(Integer integer) {
                return integer == null ? "n/a" : String.valueOf(integer + this.a() + x);
            }
        };
        System.out.println("1 = " + integer2String.apply(1));

        Function<String, Integer> string2Integer = s -> {
            try {
                return s == null ? 0 : Integer.parseInt(s);
            } catch (NumberFormatException e) {
                return 0;
            }
        };
        System.out.println("null = " + string2Integer.apply(null));
        System.out.println("\"\" = " + string2Integer.apply(""));
        System.out.println("\"123\" = " + string2Integer.apply("123"));

//        x++; System.out.println(x);
    }
}


@FunctionalInterface
interface Function<P, R> {

    R apply(P p);

    default int a() {
        return 10;
    }

}


//class Integer2String implements Function<Integer, String> {
//
//    @Override
//    public String apply(Integer integer) {
//        return integer == null ? "0" : String.valueOf(integer);
//    }
//}
//
//class Integer2StringNA implements Function<Integer, String> {
//
//    @Override
//    public String apply(Integer integer) {
//        return integer == null ? "n/a" : String.valueOf(integer);
//    }
//}
//
//class String2Integer implements Function<String, Integer> {
//
//    @Override
//    public Integer apply(String s) {
//        try {
//            return s == null ? 0 : Integer.parseInt(s);
//        } catch (NumberFormatException e) {
//            return 0;
//        }
//    }
//}