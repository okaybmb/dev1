import java.util.StringTokenizer;

public class StringToken {
    public StringToken() {
    }

    public static void main(String[] var0) {
        String var1 = "<script><embed>sadsadas<object><iframe>";
        String var2 = "form,iframe,script,embed,object";
        if (var2.length() != 0) {
            StringTokenizer var3 = new StringTokenizer(var2, ",");

            while(var3.hasMoreTokens()) {
                String var4 = "<" + var3.nextToken().trim();
                if (var1.contains(var4)) {
                    System.out.println("val : " + var4);
                }
            }
        }

    }
}
