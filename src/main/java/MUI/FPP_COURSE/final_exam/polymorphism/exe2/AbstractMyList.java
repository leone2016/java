package MUI.FPP_COURSE.final_exam.polymorphism.exe2;
/**
 * @author: Leonardo Medina
 * @param <T>
 */
public abstract class AbstractMyList<T> implements MyList<T> {
    protected int count = 0;

    @Override
    public int size() {return count;}


   // public abstract void printList();


    public abstract void add(T item);
    public abstract T get(int index);

}
