import java.util.*;
public class A2qno12 {
	public static boolean isValidSudoku(List<List<Integer>> partialAssignment){
		for (int i=0;i<partialAssignment.size();++i) {
			if (hasDuplicate(partialAssignment,i,i+1,0,partialAssignment.size())){
				return false;
			}
		}
		for (int j=0;j<partialAssignment.size();++j) {
			if (hasDuplicate(partialAssignment,0,partialAssignment.size(),j,j+1)) {
				return false;
			}
		}
		int regionSize=(int)Math.sqrt(partialAssignment.size());
		for (int I=0;I<regionSize;++I) {
			for (int J=0;J<regionSize;++J) {
				if (hasDuplicate(partialAssignment,regionSize*I,regionSize*(I+1),regionSize*J,regionSize*(J+1))){
					return false;
				}
			}
		}
		return true ;
	}
	private static boolean hasDuplicate (List <List<Integer>> partialAssignment,int startRow,int endRow,int startCol,int endCol ) {
		List<Boolean> isPresent=new ArrayList<>(Collections.nCopies (partialAssignment.size()+1,false));
		for (int i=startRow;i<endRow; ++i) {
			for (int j=startCol;j<endCol;++j) {
				if (partialAssignment.get(i).get(j)!=0&&isPresent.get(partialAssignment.get(i).get (j))) {
					return true ;
				}
				isPresent.set(partialAssignment.get(i).get(j), true);
			}
		}
		return false;
	}
	public static void main(String[] args) {
		List<List<Integer>> l = new ArrayList<List<Integer>>();
		l.add(new ArrayList<Integer>(Arrays.asList(5, 3, 0, 0, 7, 0, 0, 0, 0)));
		l.add(new ArrayList<Integer>(Arrays.asList(6, 0, 0, 1, 9, 5, 0, 0, 0)));
		l.add(new ArrayList<Integer>(Arrays.asList(0, 9, 8, 0, 0, 0, 0, 6, 0)));
		l.add(new ArrayList<Integer>(Arrays.asList(8, 0, 0, 0, 6, 0, 0, 0, 3)));
		l.add(new ArrayList<Integer>(Arrays.asList(4, 0, 0, 8, 0, 3, 0, 0, 1)));
		l.add(new ArrayList<Integer>(Arrays.asList(7, 0, 0, 0, 2, 0, 0, 0, 6)));
		l.add(new ArrayList<Integer>(Arrays.asList(0, 6, 0, 0, 0, 0, 2, 8, 0)));
		l.add(new ArrayList<Integer>(Arrays.asList(0, 0, 0, 4, 1, 9, 0, 0, 5)));
		l.add(new ArrayList<Integer>(Arrays.asList(0, 0, 0, 0, 8, 0, 0, 7, 9)));
		System.out.println("Partial Sudoku configurations : ");
		for (int i = 0; i <l.size(); i++) {
			for (int j = 0; j <l.get(i).size(); j++) {
				System.out.print(l.get(i).get(j) + " ");
			}
			System.out.println();
		}
		boolean result = isValidSudoku(l);
		if(result){
			System.out.println("The board is valid.");
		}
		else{
			System.out.println("The board is invalid.");
		}	
	}
}
