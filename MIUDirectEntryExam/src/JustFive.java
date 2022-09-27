public class JustFive {
    private String name;
    private int number;

    public JustFive(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }
}

//public class DR5_FiveTime {
//    public static void main(String args[])
//    {
//        System.out.println("Fiveton Sample...");
//        for( int i=0; i<6; i++)
//        {
//            FiveTon ft = FiveTon.getInstance( );
//            System.out.println("Fiveton : "+ft+" Size is "+ft.getSize());
//        }
//    }
//}
//
//class FiveTon
//{
//    private static List<FiveTon> list = Collections.synchronizedList(new LinkedList<FiveTon>());
//    private static String var;
//    private static int index = 0;
//
//    private FiveTon()
//    {
//    }
//
//    public static FiveTon getInstance( )
//    {
//        if( list.size() <5 )
//        {
//            synchronized( list)
//            {
//                FiveTon newObj = new FiveTon();
//                list.add( newObj);
//                return newObj;
//            }
//        }
//        else
//        {
//            synchronized( list)
//            {
//                FiveTon head = list.get(index);
//                index = (index + 1) % list.size();
//                return head;
//            }
//        }
//    }
//
//    public int getSize()
//    {
//        return list.size();
//    }
//}
