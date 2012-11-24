import java.util.List;
import java.util.ArrayList;

public class BinList {
	private List<Integer> list;
	private Object[] array;
		
	public BinList() {
		list = new ArrayList<Integer>();
	}
	
	public void add(int index, int element) {
		list.add(index, element);
	}	
	
	public boolean contains(int element) { 
		if (isEmpty()) {
			return false;
		}
		int lowerIndex = 0;
		int upperIndex = list.size() - 1;
		return binarySearch(element, lowerIndex,upperIndex);
	}	
	
	public boolean binarySearch(int element, int lowerIndex, int upperIndex) {
		if (upperIndex == 0) {
			if (element == list.get(upperIndex)) {
				System.out.println("**The item was found at index: " + upperIndex);
				return true;
			}
			return false;
		}
		if (lowerIndex > upperIndex) {
			return false;
		}
		int midPoint = getMidIndex(lowerIndex, upperIndex);
		System.out.println("Searching index: " + midPoint);
		System.out.println("Item contained in index: " + list.get(midPoint));
		if (element == list.get(midPoint)) { //this is an object, not an int!! Auto-unwrapping.
			System.out.println("The item was found at index: " + midPoint);
			return true;
		}
		if (element < list.get(midPoint)) {
			upperIndex = midPoint - 1;
			return binarySearch(element, lowerIndex, upperIndex);
		}
		if (element > list.get(midPoint)) {
			lowerIndex = midPoint + 1;
			return binarySearch(element, lowerIndex, upperIndex);
		}
		return false;
	}		
	
	public int getMidIndex(int lowerIndex, int upperIndex) {	
		int midPoint = (upperIndex + lowerIndex)/2;
		return midPoint;
	}
	
	public Object[] convertToArray(List<Integer> list) {
		array = list.toArray();
		return array;
	}	
	
	public void print() {
		Object[] array = convertToArray(list);
		int i;
		for (i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}	
			
		
	public boolean isEmpty() {
		return list.isEmpty();
	}
	
	public static void main(String[] args) {
		BinList bsList = new BinList();
		bsList.launch();
	}
	
	private void launch() {
		System.out.println("Please enter the size of the list you would like to create: ");
		int listSize = Integer.parseInt(System.console().readLine());
		for (int i = 0; i < listSize; i++) {
			int intToAdd = i + 1;
			add(i, intToAdd);
		}
				
		print();
		
		boolean isContained = contains(0);
		if (!isContained) {
			System.out.println("Item not found.");
		}
		
	}
	
}
	
	