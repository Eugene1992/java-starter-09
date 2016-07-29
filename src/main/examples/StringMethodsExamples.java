import java.nio.charset.Charset;

public class StringMethodsExamples {
    public static void main(String[] args) {
        String s1 = "Hello world!";
        String s2 = "Alpha!";
        String s3 = "alpHa!";
        String s4 = "";

        System.out.println(s1.charAt(6));

        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareToIgnoreCase(s2));

        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s3));
        System.out.println(s2.equalsIgnoreCase(s3));

        System.out.println(s2.concat(" World!"));

        System.out.println(s1.contains("Hello "));
        System.out.println(s1.contains("Hello!"));

        System.out.println(s1.endsWith("!"));
        System.out.println(s1.endsWith("!!"));

        byte[] bytes = s1.getBytes();

        for (int i = 0; i < bytes.length; i++) {
            System.out.print(bytes[i] + " ");
        }
        System.out.println();

        char[] chars = s1.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i] + " ");
        }
        System.out.println();

        System.out.println(s1.indexOf('l'));
        System.out.println(s1.indexOf('l', 5));
        System.out.println(s1.indexOf("world"));
        System.out.println(s1.indexOf("world", 7));

        System.out.println(s1.length());

        System.out.println(s1.isEmpty());
        System.out.println(s4.isEmpty());

        System.out.println(s1.toLowerCase());
        System.out.println(s1.toUpperCase());

        System.out.println(s1.replace('l', 'L'));
        System.out.println(s1.replace("world", "Earth"));

        String s5 = "  some String                ";
        System.out.println(s5);
        System.out.println(s5.trim());

        String s6 = "London is a capital of Great Britain!";
        String[] strings = s6.split(" ");
        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }

        System.out.println(s1.substring(2, 6));
        System.out.println(s1.substring(2));
    }
}
