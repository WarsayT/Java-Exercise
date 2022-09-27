import java.util.List;

public class Main {
    public static void main(String[] args) {

//        List<String > list1 = new ArrayList<>();
//        String[] strArray = {"good", "better", "best", "best", "first", "last", "last", "last", "good"};
//        for (int i = 0; i< strArray.length; i++) {
//            list1.add(strArray[i]);
//        }
//
//        System.out.println("===================");
//        for (int i = 0; i< list1.size(); i++) {
//            System.out.println(list1.get(i));
//        }
//        System.out.println("=======================");
//        removeDuplicates(list1);

        JustFive data1 = new JustFive("Warsay", 30);
        JustFive data2 = new JustFive("HabenT", 23);
        JustFive data3 = new JustFive("Haben", 342);
        JustFive data4 = new JustFive("Natu", 34);
        JustFive data5 = new JustFive("Siem", 54);

        System.out.println(data1.getName());





    }

    public static void removeDuplicates(List<String > list) {
        for (int i = 0; i < list.size(); i++) {
            String temp = list.get(i);
            System.out.println("to be tested: " + temp);
            for (int j=i+1; j< list.size(); j++) {
                if (list.get(j).equals(temp)) {
                    list.remove(j);
                    j--;
                }
            }
        }
        System.out.println("=====================");
        for (int i = 0; i < list.size(); i++) {
            System.out.println("New element " + i+ ": " + list.get(i));
        }

    }


}