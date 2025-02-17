public class Main {
    public static void main(String[] args) {

MyList myList = new MyLinkedList();
myList.add(new Person("Helen",34));
myList.add(new Person("Jack",25));
myList.add(new Person("John",18));


        System.out.println(myList.size());
        System.out.println(myList.get(0));

        myList.print();

    }
}