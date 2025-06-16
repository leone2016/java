package MUI.FPP_COURSE.final_exam.polymorphism.exe2;
/**
 * @author: Leonardo Medina
 * @param <T>
 */
public class MyArrayList<T> extends AbstractMyList<T> {

    private Object[] data = new Object[10];

   @Override
    public void add(T item){
        if(count >= data.length){
            throw new IllegalStateException("MY ERROR: Array is full");
        }
        data[count++] = item;
   }

   @Override
    public T get(int index){
        if(index<0 || index >= count)
            throw new IndexOutOfBoundsException("MY ERROR: Index out of range");

        return (T) data[index];
    }
}
