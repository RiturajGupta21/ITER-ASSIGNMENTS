import java.util.*;
public class A2qno15 {
	public static List<List<Integer>> generate(int numRows) {
	    int count = 2;
	    List<List<Integer>> result = new ArrayList<>();
	    result.add(Arrays.asList(1));
	    List<Integer> newTempList, currentList;
	    while (count <= numRows) {
	        currentList=result.get(result.size() - 1);
	        newTempList=new ArrayList<>();
	        newTempList.add(1);
	        for (int i = 0; i < currentList.size() - 1; i++) {
	            newTempList.add(currentList.get(i) + currentList.get(i + 1));
	        }
	        newTempList.add(1);
	        result.add(newTempList);
	        count++;
	    }
	    return result;
	}
	public static void main(String[] args) {
		List<List<Integer>> res = generate(3);
		 String result = "";
	        for(int i = 0; i < res.size(); i++){
	            for(int j = 0; j < res.get(i).size(); j++){
	                result += res.get(i).get(j)+" ";
	            }
	            result += "\n";
	        }
	        System.out.println(result);
	}

}
