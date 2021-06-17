import java.util.*;
public class A2qno13 {
	public static List<Integer> matrixInSpiralOrder(List<List<Integer>> squareMatrix){
		List<Integer> spiralOrdering = new ArrayList <>();
		for (int offset=0;offset<Math.ceil(0.5*squareMatrix.size());++offset) {
			matrixLayerlnClockwise(squareMatrix , offset, spiralOrdering);
		}
		return spiralOrdering ;
	}
	private static void matrixLayerlnClockwise(List<List<Integer>> squareMatrix,int offset, List<Integer> spiralOrdering) {
		if (offset==squareMatrix.size()-offset-1){
			spiralOrdering.add(squareMatrix.get(offset).get(offset));
			return ;
		}
		for (int j=offset;j<squareMatrix.size()-offset-1;++j) {
			spiralOrdering.add(squareMatrix.get(offset).get(j));
		}
		for (int i=offset;i<squareMatrix.size()-offset-1;++i) {
			spiralOrdering.add(squareMatrix.get(i).get(squareMatrix.size()-offset-1));
		}
		for (int j=squareMatrix.size()-offset-1;j>offset;--j) {
			spiralOrdering.add(squareMatrix.get(squareMatrix.size() - offset - 1).get(j));
		}
		for (int i=squareMatrix.size()-offset-1;i>offset;--i) {
			spiralOrdering.add(squareMatrix.get(i).get(offset));
		}
	}
	public static void main(String[] args) {
		List<List<Integer>> squareMatrix = new ArrayList<List<Integer>>();
		squareMatrix.add(new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4)));
		squareMatrix.add(new ArrayList<Integer>(Arrays.asList(5, 6, 7, 8)));
		squareMatrix.add(new ArrayList<Integer>(Arrays.asList(9, 10, 11, 12)));
		squareMatrix.add(new ArrayList<Integer>(Arrays.asList(13, 14, 15, 16)));
		System.out.println("The Input Matrix : ");
		for (int i = 0; i <squareMatrix.size(); i++) {
			for (int j = 0; j <squareMatrix.get(i).size(); j++) {
				System.out.print(squareMatrix.get(i).get(j) + " ");
			}
			System.out.println();
		}
		List<Integer> spiralOrdering = new ArrayList <>();
		spiralOrdering = matrixInSpiralOrder(squareMatrix);
		System.out.println("The spiral ordering of elements in the givrn matrix");
		for(int num : spiralOrdering) {
			System.out.print(num + " ");
		}
	}
}