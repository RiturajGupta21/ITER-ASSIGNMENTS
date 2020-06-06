class StopWatch {
	private long startTime, endTime;
StopWatch() { 
	startTime = System.currentTimeMillis();
	}
public void start() {
	startTime = System.currentTimeMillis();
	} 
public void stop() { 
	endTime = System.currentTimeMillis();
	}
public long getElapsedTime() { 
	return getEndTime() - getStratTime();
	}
public long getStratTime() {
	return startTime;
}
public long getEndTime() { 
	return endTime;
	}
} 
public class A9qno6 {
	public static void main(String[] args) {
		StopWatch stopWatch = new StopWatch();
int[] randomArray = getArray();
stopWatch.start();
bubbleSort(randomArray);
stopWatch.stop();
System.out.println("The execution time of sorting 100,000 " + "numbers using bubble sort: " + stopWatch.getElapsedTime() + " milliseconds");
} 
	public static int[] getArray() { 
		int[] array = new int[100000]; 
		for (int i = 0; i < array.length; i++) {
			array[i] = (int)(Math.random() * 100000);
			}
		return array;
			} 
	public static void bubbleSort(int[] array) {
				int n = array.length;
				int temp =0; 
				for (int i = 0; i < n; i++) { 
				for (int j = 1; j < n-i ; j++) {
				if (array[j-1] < array[j]) {
				temp = array[j-1]; array[j-1] = array[j]; array[j] = temp;
				}
			}
		}
		for (int i = 0; i < n; i++) {
			System.out.print (array[i] +" ");
			}
		}
		}