package tv;

public class WatchTv {

	public static void main(String[] args) {
		TV tv = new TV( 7, 20, false); 

		tv.status(); //7, 20, off

		tv.power( true ); 	
		tv.volume( 120 ); 	
		tv.status();		// 7, 100, on

		tv.volume( false );	
		tv.status();		// 7, 99, on
		
		tv.channel( 0 );	
		tv.status();		//255, 99, on

		tv.channel( true );	 
		tv.channel( true );	
		tv.channel( true );	
		tv.status();		// 3, 99, on

		tv.power( false );	
		tv.status();		// 3, 99, off
	}

}
