package d06204;



class Bus extends Car {
    int fee;

    public Bus(String name, int number, int fee) {
        // super를 이용해서 Car클래스의 생성자를 이용하세요.
        super(name, number);

        this.fee = fee;
    }

}

class Car {

    String name;
    int number;

    Car(String name, int number) {
    }
}
