package MUI.FPP_COURSE.final_exam.polymorphism.exe2;

public class Main {

    public static void main(String arg[]){
        MyList<String> arrayList = new MyArrayList<>();
        MyList<String> linkedList = new MyLinkedLIst<>();

        arrayList.add("Apple");
        arrayList.add("Orange");
        arrayList.add("Banana");


        linkedList.add("1");
        linkedList.add("32");
        linkedList.add("33");

        System.out.println(" :::::::: MY ARRAY LIST :::::::: ");
        printList(arrayList);
        System.out.println(" :::::::: MY LINKED LIST ::::::: ");
        printList(linkedList);

    }

    public static void printList(MyList<String> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Item " + i + ": " + list.get(i));
        }
    }





}
