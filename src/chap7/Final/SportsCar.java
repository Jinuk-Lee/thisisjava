package chap7.Final;

public class SportsCar {
    @Override
    public void speedUp() {
        speed += 10;
    }

    //오버라이딩 할 수 없음
    @Override
    public void stop() {
        System.out.println("스포츠가를 멈춤");
        speed = 0;
    }
}