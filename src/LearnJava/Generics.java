package LearnJava;

public class Generics<T> {
    private T value;

    public void set(T value){
        this.value = value;
    }
}
class B extends Generics<String> {


}


