package udemy.lambdas_functional_programming;

public interface  _9_functional_interface {
    public void add();
    default String sayHi(){
        return "Hi!";
    }

    static boolean isTrue(){
        return true;
    }

}
