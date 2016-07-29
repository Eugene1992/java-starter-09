
public class StringExample {
    public static void main(String[] args) {
//        1. Путем присвоения строкового литерала переменной типа String.
        String s1 = "Hello world!";

//        2. Путем непосредственного вызова конструктора String().
        String s2 = new String("Hello world!");

//        3. С помощью оператора сцепления строк (+) для создания одной строки из любой
//        комбинации экземпляров класса String и строковых литералов.
        String s3 = s1 + s2 + "!!!";

//        4. Путем извлечения свойства или вызова метода, который возвращает строку.
        String s4 = getSomeString();

//        5. Путем вызова метода форматирования для преобразования значения или
//        объекта в строковое представление.
        String s5 = new Integer(10).toString();

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);
    }

    static String getSomeString(){
        return "String from method";
    }
}
