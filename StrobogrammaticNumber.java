import java.util.*;
import java.util.Scanner;

public class Strobogramatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//input:"69"
		//output:yes
		//180 deg rotate
		Scanner input =new Scanner(System.in);
		String str=input.next();
		if(isStrobomatic(str)) {
			System.out.println("yes");
		}else {
			System.out.println("No");
		}
	}

	private static boolean isStrobomatic(String str) {
		HashMap<Character, Character> map=new HashMap<Character,Character>();
		map.put('6', '9');
		map.put('9', '6');
		map.put('0', '0');
		map.put('1', '1');
		map.put('8','8');
		
		int l=0;
		int r=str.length()-1;
		
		while(l<=r) {
			if(!map.containsKey(str.charAt(l))) {
				return false;
			}
			if(map.get(str.charAt(l)) != str.charAt(r)) {
				return false;
			}
			l++;
			r--;
		}
		return true;
	}
}

