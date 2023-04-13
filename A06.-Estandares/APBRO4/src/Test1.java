public class Test1 {
    //-------------------------------------------------------------------------------------------
    //https://www.delftstack.com/es/howto/java/empty-array-in-java/
    public static void main(String[] args) {
        try {
            int[] arr = null;
            System.out.println(arr[0]); // null pointer exception
        }catch(Exception e) {
            System.out.println("Array is Null");
        }

    }

    @Override
    public String toString() {
        return "Test1{}";
    }
}
