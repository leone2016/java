package MUI.FPP_COURSE.lesson12;

public class HeapSize {
    public static void main(String[] args) {
        long heapSize = Runtime.getRuntime().totalMemory(); // current allocated
        long maxHeapSize = Runtime.getRuntime().maxMemory(); // max heap

        System.out.println("Current heap size: " + (heapSize / (1024 * 1024)) + " MB");
        System.out.println("Max heap size: " + (maxHeapSize / (1024 * 1024 * 1024)) + " GB");

    }
}
