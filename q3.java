public class q3{
    public static void main(String[] args) {

        StringBuffer myStr = new StringBuffer("Java is my favorite Programming Language"); 
        System.out.println("Original String: "+myStr);

        myStr.append(" till now");
        System.out.println("After Appending: "+myStr);

        myStr.insert(4," and C++");
        System.out.println("After Inserting: "+myStr);

        myStr.delete(0,9);
        System.out.println("After Deleting: "+myStr);

        System.out.println("Current Capacity: "+myStr.capacity());
        myStr.ensureCapacity(120);
        System.out.println("After Ensure Capacity: "+myStr.capacity());

        myStr.reverse();  
        System.out.println("After Reverse: "+myStr);
    }
}