package zzseven;

public enum corn {
	
	sabbir("passionate","22"),
	safiq("kid","7"),
	sabina("mom","42");
	
	
	private final String desc;
	private final String year;

	corn (String descriotion, String age){
		
		desc=descriotion;
		year=age;
	}
	
	public String getDesc(){
		
		return desc;
	}
	public String getYear(){
		
		return year;
	}
}
