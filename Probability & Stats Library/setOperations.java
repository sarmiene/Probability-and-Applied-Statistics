import java.util.ArrayList;

public class setOperations {

	public static ArrayList<String> Union(ArrayList<String> listA, ArrayList<String> listB) { 
		ArrayList<String> unionList = new ArrayList<String>();
		
		unionList.addAll(listB);		
		unionList.removeAll(listA);
		unionList.addAll(listA);

		return unionList;
		
	}
	
	public static ArrayList<String> Intersect(ArrayList<String> listA, ArrayList<String> listB) {
		ArrayList<String> intersectList = new ArrayList<String>();
		
		intersectList.addAll(listA);
		intersectList.retainAll(listB);
		
		return intersectList;
		
	}
	public static ArrayList<String> Complement(ArrayList<String> listA, ArrayList<String> listB) {

		ArrayList<String> complementList = new ArrayList<String>();

		complementList.addAll(listB);
		complementList.removeAll(listA);

		
		return complementList;
		
	}
	public static void main(String[] args) {		
		ArrayList<String> listA = new ArrayList<String>();
		listA.add("Monday");		
		listA.add("Tuesday");
		listA.add("Wednesday");
		listA.add("Thursday");
		listA.add("Friday");

		ArrayList<String> listB = new ArrayList<String>();
		listB.add("Tuesday");
		listB.add("Friday");
		listB.add("Saturday");
		listB.add("Sunday");
		
		System.out.println("List A: " + listA);
		System.out.println("List B: " + listB);
		
		//union of ListA and ListB = Monday -Sunday
		System.out.println("\nUnion of List A and List B: " + Union(listA,listB));
		
		
		//intersection of ListA and ListB Results: Tuesday and Friday
		System.out.println("Intersection of List A and List B: " + Intersect(listA, listB));

		//Complement of ListA:
		System.out.println("Complement of List A: " + Complement(listA, listB));

	}
	
	
	
}