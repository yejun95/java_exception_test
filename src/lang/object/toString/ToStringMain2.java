package lang.object.toString;

public class ToStringMain2 {
    public static void main(String[] args) {
        Car car = new Car("g70");
        Dog dog1 = new Dog("멍멍1", 1);
        Dog dog2 = new Dog("멍멍2", 2);

        System.out.println(car);
        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println();

        ObjectPrinter.print(car); // toString을 Override하지 않아 참조값이 출력
        ObjectPrinter.print(dog1); // Override된 toString으로 인해 객체 정보가 문자열로 출력됨
        ObjectPrinter.print(dog2);
    }
}
