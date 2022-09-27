//public class OurLinkedList<T> {
//    private OurLinkedList<T> list = new OurLinkedList<>();
//
//    public void add(T ob) {
//        list.add(ob);
//
//    }
//
//    public boolean find(T ob) {
//        if (ob.equals(list.find(ob))) {
//            return true;
//        }
//
//        return false;
//
//    }
//
////    public String toString() {
////
////    }
//public class DR3_LinkedList<T> {
//    private Node<T> hd;
//    private Node<T> tl;
//    public static void main(String[] args) {
//        // TODO Auto-generated method stub
//        DR3_LinkedList<String> dsl = new DR3_LinkedList<String>();
//        dsl.addTail("Strait");
//        dsl.addTail("Bent");
//        dsl.addTail("Equals");
//        dsl.addTail("Well");
//        dsl.addTail("Storm");
//        dsl.printList();
//        System.out.println(dsl.toString());
//        System.out.println(dsl.Search("Well"));
//        System.out.println(dsl.Search("Strength"));
//
//    }
//    public void addTail( T value)
//    {
//        Node<T> nd=new Node<T>();
//        nd.setValue(value);
//        System.out.println("Added Node in tail with value: " + value);
//        if (hd==null)
//        {
//            hd=nd;
//            tl=hd;
//        }
//        else
//        {
//            //tail la nut cuoi cung moi them vao
//            tl.setNextRef(nd);
//            tl=nd;
//        }
//    }
//    public String toString()
//    {
//        Node<T> nd = new Node<T>();
//        String str="";
//        if(hd!=null)
//        {
//            nd=hd;
//            str+="[";
//            while(nd!=null)
//            {
//                if (nd.getNextRef()==null)
//                    str+=nd.getValue();
//                else
//                    str+=nd.getValue()+", ";
//                nd = nd.getNextRef();
//            }
//            str+="]";
//        }
//        else
//            str="List is empty!";
//        return str;
//        //System.out.println();
//    }
//    public void printList()
//    {
//        Node<T> nd = new Node<T>();
//        if(hd!=null)
//        {
//            nd=hd;
//            while(nd!=null)
//            {
//                System.out.print(" " + nd.getValue());
//                nd = nd.getNextRef();
//            }
//        }
//        else
//            System.out.println("List is empty!");
//        System.out.println();
//    }
//
//    public boolean Search(T value)
//    {
//        Node<T> nd=new Node<T>();
//        boolean flag=false;
//        nd=hd;
//        while(nd!=null)
//        {
//            if (nd.compareTo(value)!=0)
//                nd=nd.getNextRef();
//            else
//            {
//                flag =true;
//                break;
//            }
//        }
//        return flag;
//    }
//
//
//}
//    class Node<T> implements Comparable<T>
//    {
//        private T value;
//        private Node<T> nextRef;
//        public T getValue()
//        {
//            return value;
//        }
//        public void setValue(T value)
//        {
//            this.value=value;
//        }
//        public Node<T> getNextRef()
//        {
//            return nextRef;
//        }
//        public void setNextRef(Node<T> nextRef)
//        {
//            this.nextRef=nextRef;
//        }
//        public int compareTo(T value)
//        {
//            if(this.value==value)
//                return 0;
//            else
//                return 1;
//        }
//    }
// }
