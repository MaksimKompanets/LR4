public class Main {
    public static void main(String[] args) {
        String s1="Субота, 16 жовтня 2022";
        String s2="Субота, 16 жовтня 2000";
        System.out.println(s1);
        System.out.println(s2);
        System.out.println("Дата з першої строки відповідає поточному року. "+s1.contains("2022"));
        System.out.println("Дата з другої строки відповідає поточному року. "+s2.contains("2022"));

    }
}
