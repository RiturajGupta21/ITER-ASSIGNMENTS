import java.util.*;
public class A3qno9 {
	public static List<String> validip(String s) {
        List<String> res = new ArrayList<>();
        addchar(s, 0, new ArrayList<String>(), res);
        return res;
    }
    public static void addchar(String s,int n,List<String> precom,List<String> res) {
        if (n==s.length()&&precom.size()==4) {
            res.add(build(precom));
            return;
        }
        for (int j=n+1;j<=s.length()&&j-n<=3;j++) {
            String sub=s.substring(n,j);
            if (isValidPart(sub)&&precom.size()<=3) {
                precom.add(sub);
                addchar(s, j, precom, res);
                precom.remove(sub);
            }
        }
    }
    private static String build(List<String> partList) {
        StringBuffer ip=new StringBuffer();
        for (int i=0;i<4;i++) {
            ip.append(partList.get(i));
            if (i!=3)
                ip.append(".");
        }
        return ip.toString();
    }

    private static boolean isValidPart(String s) {
        if (s.length()>3)
            return false;
        if (s.startsWith("0")&&s.length()>0)
            return false;
        int subval=Integer.parseInt(s);
        return subval<=255&&subval>=0;
    }
	public static void main(String[] args) {
		System.out.println(validip("19216811"));
	}
}
