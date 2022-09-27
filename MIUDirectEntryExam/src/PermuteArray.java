import java.util.ArrayList;
import java.util.List;

public class PermuteArray {

    public static void main(String[] args) {
        PermuteArray permuteArray = new PermuteArray();
        int[] arrayInt = {1, 5, 4, 2};
        List<List<Integer>> permute = permuteArray.permute(arrayInt);

        System.out.println("Permutations of array : {1, 5, 4, 2} are:");
        System.out.println("=========================================");
        for(List<Integer> perm:permute)
        {
            System.out.println(perm);
        }



    }

    private List<List<Integer>> permute(int[] arrayInt) {
        List<List<Integer>> list = new ArrayList<>();
        permuteHelper(list, new ArrayList<>(), arrayInt);
        return list;
    }

    private void permuteHelper(List<List<Integer>> list, List<Integer> resultList, int[] arrayInt) {
        if (resultList.size() == arrayInt.length) {
            list.add(new ArrayList<>(resultList));
        } else {
            for (int i=0; i < arrayInt.length; i++) {
                if (resultList.contains(arrayInt[i])) {
                    continue;
                }
                resultList.add(arrayInt[i]);
                permuteHelper(list, resultList, arrayInt);
                resultList.remove(resultList.size() -1);
            }
        }

    }
}



//public class DR4_RecursionHV {
//    void printArray(int[] a)
//    {
//        for (int i = 0;  i<a.length; i++)
//        {
//            System.out.print(a[i]+" ");
//        }
//        System.out.println("");
//    }
//    void permute(int []a,int k )
//    {
//        if(k==a.length)
//            printArray(a);
//        else
//            for (int i = k;  i<a.length; i++)
//            {
//                int temp=a[k];
//                a[k]=a[i];
//                a[i]=temp;
//                permute(a,k+1);
//                temp=a[k];
//                a[k]=a[i];
//                a[i]=temp;
//            }
//    }
//    public static void main(String[] args) {
//        DR4_RecursionHV  p=new DR4_RecursionHV ();
//        //int a[]={1,2,3,4,5,6};
//        int a[]={1,2,3,4};
//        p.permute(a, 0);
//    }
//
//}
