import java.util.*;
public class A3qno25 {
    public static int permutation(char arr[]) {
        int i = arr.length-1;
        while (i>0&&arr[i-1]>=arr[i])
            i--;
        if (i<=0)
            return 0;
        int j = arr.length-1;
        while (arr[j]<=arr[i-1])
            j--;
        char c = arr[i-1];
        arr[i - 1] = arr[j];
        arr[j] = c;
        j = arr.length-1;
        while (i<j) {
            c = arr[i];
            arr[i] = arr[j];
            arr[j] = c;
            i++;
            j--;
        }
        return 1;
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str=sc.nextLine();
		int c=1;
		char arr[] = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
        while (true) {
            int x = permutation(arr);
            if (x == 0)
                break;
            for (int i = 0; i < arr.length; i++)
                System.out.print(arr[i]);
            System.out.println();
            c++;
	}
        System.out.println(c);
}
}
