public class Test {
    public static void main(String[] args) {
        CycleLinkedList<Integer> CycleLinkedList = new CycleLinkedList<>();
        CycleLinkedList.add(7);
        CycleLinkedList.add(1);
        CycleLinkedList.add(2);
        CycleLinkedList.add(4);

        CycleLinkedList.insertAt(4, 5);

        CycleLinkedList.insertAt(0, 123);

        for(int i = 0; i < CycleLinkedList.size(); i++){
            System.out.print(CycleLinkedList.get(i) + " ");
        }
        System.out.println();

        System.out.print(CycleLinkedList.get(12));
        
    }
}
