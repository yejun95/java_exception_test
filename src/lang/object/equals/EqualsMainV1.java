package lang.object.equals;

public class EqualsMainV1 {

    public static void main(String[] args) {
        UserV1 userV1 = new UserV1("aa");
        UserV1 userV2 = new UserV1("aa");

        System.out.println(userV1 == userV2);
        System.out.println(userV1.equals(userV2));
    }
}
