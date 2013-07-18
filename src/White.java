public class White{
	public static void Woof(){
		println("Woof!");
		
		for(int i = 0; i < 4; i++){
			String string1 = new String("For 'i': ");
			String string2 = new String(Integer.toString(i));
			String string3 = string1.concat(string2);
			println(string3);
		}
		
		int i = 0;
		do{
			wait(200);
			println("While 'i': " + i);
			i += 1;
		}
		while(i < 4);
		
	}
	public static void println(String string){
		System.out.println(string);
	}
	public static void wait(int ms){
		try{
			Thread.sleep(ms);
		}
		catch(InterruptedException iex){
			return;
		}
	}
}
