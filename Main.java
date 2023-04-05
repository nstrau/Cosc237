
public class Main {
    public static void main(String[] args) {

        SortedNameList name_list = new SortedNameList();

        if (name_list.isEmpty())
            System.out.println("list is empty");
        else
            name_list.print();

        name_list.add("Allen");
        name_list.add("Baker");
        name_list.add("Davis");
        name_list.add("Edwards");
       
        if (name_list.isEmpty())
        System.out.println("list is empty");
    else
        name_list.print();

        System.out.println();
        name_list.add("Charles");
         name_list.print();

        System.out.println();
        name_list.delete("Baker");
        name_list.print();

    }
}