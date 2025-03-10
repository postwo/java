package 제네릭;

public class Generic {

    // object: Object 타입은 Java에서 모든 클래스의 최상위 조상 클래스입니다.
    // 이는 모든 객체를 나타낼 수 있는 일반적인 타입으로, 특정 타입을 알 수 없거나 다양한 타입의 객체를 처리할 필요가 있을 때 사용
    private Object item;

    public Generic (Object item){
        this.item = item;
    }

    public Object getItem() {
        return item;
    }
}
