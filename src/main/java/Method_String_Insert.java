public class Method_String_Insert {
    public static void main(String[] args) {
        insert("ABCD", " 1234 ",3);
    }
    static String insert(String str1, String str2, int n) {
        String res = str1.substring(0,n) + str2 + str1.substring(n);
        System.out.println(res);
        return  res;
    }
}



