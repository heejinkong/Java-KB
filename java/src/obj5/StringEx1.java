package obj5;

public class StringEx1 {
    public static void main(String[] args) {
        String str1 = "Hello World";//  String은 불변
        String str2 = str1;
//        System.out.println(str1);
//        System.out.println(str2);
//        System.out.println(str1==str2);//true
//        str1+="Test";
//        System.out.println(str1==str2);//false
//        System.out.println(new String("abc")==new String("abc"));//false
//        System.out.println(new String("abc").hashCode()==new String("abc").hashCode());//false
        StringBuffer sb = new StringBuffer("abc");
        StringBuffer imsi = sb;
        sb.append("def");
        System.out.println(sb==imsi);//true

    }
}

