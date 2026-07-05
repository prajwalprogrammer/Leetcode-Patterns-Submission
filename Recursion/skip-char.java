
public class Main
{
    private static void solve(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        
        if(ch == 'a'){
             solve(p, up.substring(1));
        }else{
             solve(p + ch, up.substring(1));
        }
    }
    private static String solve1(String up){
        if(up.isEmpty()){
            return "";
        }
        char ch = up.charAt(0);
        
        if(ch == 'a'){
            return solve1(up.substring(1));
        }else{
            return ch + solve1(up.substring(1));
        }
    }
	public static void main(String[] args) {
		System.out.println("Hello World");
		System.out.println(solve1("baccah"));
		
	}
}
