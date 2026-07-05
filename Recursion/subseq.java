
import java.util.*;
public class Main
{
    private static void solve(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        
        char ch = up.charAt(0);
        solve(p + ch, up.substring(1));
        solve(p, up.substring(1));
        
    }
    
    private static ArrayList<String> solve1(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> left = solve1(p + ch, up.substring(1));
        ArrayList<String> right = solve1(p, up.substring(1));
        
        left.addAll(right);
        return left;
        
    }
	public static void main(String[] args) {
		System.out.println("Hello World");
		solve("", "abc");
		System.out.println(solve1("", "abc"));
		
	}
}
