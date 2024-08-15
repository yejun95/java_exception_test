package lang.object.poly;

public class ObjectPolyExam {

    public static void main(String[] args) {
        Car car = new Car();
        Dog dog = new Dog();

        car.move();
        dog.sound();

        action(car);
        action(dog);
    }

    // Object 타입으로 자식 객체를 담아도 메서드는 사용할 수 없다.
    // 참조를 Object 객체 자체를 바라 보고 있기 때문
    // 사용하려면 다운캐스팅을 통해 타입을 바꿔줘야한다.
    private static void action(Object obj) {
        // 다운 캐스팅 방법 - 1
//        Dog dog = (Dog) obj;
//        dog.sound();

        // 다운 캐스팅 방법 -2
        if(obj instanceof Dog dog) {
            dog.sound();
        }
        if(obj instanceof Car car) {
            car.move();
        }
    }
}
