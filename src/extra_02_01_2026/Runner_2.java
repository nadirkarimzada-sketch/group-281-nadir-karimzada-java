package extra_02_01_2026;

public class Runner_2 {

	public static void main(String[] args) {
		
		// применая это корбка назания коробки  b ано может хранить внутри только bite а 100 это значенья  

		byte b = 127; 
		
		// wraper это родитель применой bite
		Byte a = 3;
		System.out.println("min: "+ a.MIN_VALUE);
		System.out.println("max: "+ a.MAX_VALUE);
		
		
		//short
		
		short d = 3;
		
		//Short = wraper 
		
		Short f = 67; 
		System.out.println("min: "+ f.MIN_VALUE);
		System.out.println("max: "+ f.MAX_VALUE);
		
		// long
		
		long k = 500l;
		
		// Long = wraper 
		
		Long l = 5000000l;
		
		System.out.println("min: "+ l.MIN_VALUE);
		System.out.println("max: "+ l.MAX_VALUE);
		
		//int 
		
		int o = 8000000;
		
		//Int = wraper 
		
		Integer i = 999999999;
		System.out.println("min: "+ i.MIN_VALUE);
		System.out.println("max: "+ i.MAX_VALUE);


				
		
		
		
	}

}
