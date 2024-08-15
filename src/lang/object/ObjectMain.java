package lang.object;

public class ObjectMain {

    public static void main(String[] args) {
        Child child = new Child();
        child.childMethod();
        child.parentmethod();
        // toString이 가능한 이유는 parent가 Object 클래스를 상속받기 때문
        // child > parent > Object
        String string = child.toString();

        System.out.println(string);
    }
}
