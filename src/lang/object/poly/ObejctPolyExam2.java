package lang.object.poly;

public class ObejctPolyExam2 {

    public static void main(String[] args) {
        Car car = new Car();
        Dog dog = new Dog();
        Object object = new Object();

        Object[] objects = {car, dog, object};

        size(objects);

    }

    private static void size(Object[] objects) {
        System.out.println("전달된 객체의 수 = " + objects.length);
    }
}
