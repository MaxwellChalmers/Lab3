//Maxwell Chalmers

/*
1. Write a function that takes in a list of integers as an argument
and returns true if it contains two integers that are the same, false
otherwise.
*/ 
// definitly should have just used the list  would have been so much simpler to do it that way
// I didn't change to that approach, because once I dealt with some sytax errors my code worked 


import java.util.*;

public class OneLoop{ 


public static int[] listToIntArray(List<Integer> numlist){
    
	int[] r = new int[numlist.size()];
	for(int i = 0; i < numlist.size(); i++){
		r[i] = numlist.get(i).intValue();
	}

	return r;

}


// i didn't read the the spec fully at first and I guess the filename lead me to this implementation  
// so I kept it, also I feel like using sorting algo is the fastest way to do this task somehow
// but I forget the details 

public static boolean twoOfAKind(List<Integer> numbers){

int nums[] = listToIntArray(numbers); 

Arrays.parallelSort(nums);

for(int i = 0; i < nums.length - 1; i++){
	if(nums[i] == nums[i + 1]){
		return true;
	}
}
return false;

}

// the function for checking if there are any dupluates of numbers that 
// uses nesting loops arcording to spec
public static boolean twoOfAKindNested(List<Integer> numbers){

	int nums[] = listToIntArray(numbers);

	for(int i = 0; i < nums.length; i++){
		for(int j = 0; j < nums.length; j++){
			if (j != i && nums[i] == nums[j]){
				return true;
			}
		}
	}
	return false;
}



public static void main(String[] args){
	

	Integer[] t1 = {1,1,1,1,2,4,3};
	Integer[] t2 = {1,2,4,5,6,7,8,9,135};
        Integer[] t3 = {0}; 
	
	System.out.println(Arrays.toString(t1));
	System.out.println(twoOfAKindNested(Arrays.asList(t1)));
	System.out.println(Arrays.toString(t2));
	System.out.println(twoOfAKindNested(Arrays.asList(t2)));
	System.out.println(Arrays.toString(t3));
	System.out.println(twoOfAKindNested(Arrays.asList(t3)));
	
	System.out.println(Arrays.toString(t1));
	System.out.println(twoOfAKind(Arrays.asList(t1)));
	System.out.println(Arrays.toString(t2));
	System.out.println(twoOfAKind(Arrays.asList(t2)));
	System.out.println(Arrays.toString(t3));
	System.out.println(twoOfAKind(Arrays.asList(t3)));
	
}

}
