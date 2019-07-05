package test.codility.utils;



import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class Utils {
	
	 private static Utils instance;
	 

	 private Utils() {};
	 
	 public static Utils getInstance() {
		 if(instance==null) {
			 instance = new Utils();
		 }
		return instance;
	 }
	 

	 public int factorialValue(int numofFactotrial) {
		 
		 int factorialVAlue =1;
		 int num = numofFactotrial;
		 
		 while(num>1) {
			 factorialVAlue *= num;
			 num -=1;
		 }
		 
		 return factorialVAlue;
	 }
	
	 public Set<String> getUniqueValue(List list) {
		 Set<String> hashsetlist = new HashSet<String>(list);
		 return hashsetlist;
	 }
	 
}
