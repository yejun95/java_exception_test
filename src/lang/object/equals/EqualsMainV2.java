package lang.object.equals;

public class EqualsMainV2 {

    public static void main(String[] args) {
        UserV2 userV1 = new UserV2("aa");
        UserV2 userV2 = new UserV2("aa");

        System.out.println(userV1.equals(userV2));
    }
}
