public class White{
	public static void Woof(){
		println("Woof!");
		for(int i = 0; i > 2; i++){
			String string1 = new String("Integer 'i': ");
			String string2 = new String(Integer.toString(i));
			String string3 = string1.concat(string2);
			println(string3);
		}
	}
	public static void println(String string){
		System.out.println(string);
	}
}
