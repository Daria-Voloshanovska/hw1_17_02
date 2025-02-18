public class Main {
    public static void main(String[] args) {

MyList myList = new MyLinkedList();
myList.add(new Person("Helen",34));
myList.add(new Person("Jack",25));
myList.add(new Person("John",18));
myList.add(new Person("Kate",45));
myList.add(new Person("Bob",29));


        System.out.println(myList.size());
        System.out.println(myList.get(0));

        myList.print();
        System.out.println("-----------------");

        Person removedPerson = myList.remove(1);
        if (removedPerson != null){
            System.out.println("\nRemoved person: " + removedPerson);
        }else{
            System.out.println("\nInvalid index. No person removed.");
        }

        System.out.println("\nAfter removal:");
        myList.print();

    }
}