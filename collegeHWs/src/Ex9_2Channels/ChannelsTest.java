package Ex9_2Channels;

import java.util.ArrayList;



public class ChannelsTest {
	public static void main(String[] args) {
		
		
		//sRatanable ch1=new NewsChannel("disney", Method.NTSC, "", new Date(), 3, 2);
	
		//ChildernChannel ch2=new ChildernChannel("disney", Method.PAL, "", new Date(), "", "");
		
		//Ratanable ch3=new SportsChannel("cnn", Method.SECAM, "", new Date(), 20,4);
		
		Ratanable broadC1 =new SportBroadcaster("shadran1", 50, 20);
		Ratanable broadC2 =new SportBroadcaster("shadran2", 50, 20);
		Ratanable broadC3=new SportBroadcaster("shadran3", 50, 20);
		
		ArrayList<Ratanable> arr=new ArrayList<Ratanable>();
		arr.add(broadC1);
		arr.add(broadC2);
		arr.add(broadC3);
		
		for (Ratanable ratanable : arr) {
			if (ratanable instanceof SportBroadcaster) {
				System.out.println(ratanable);
				System.out.println(ratanable.rating());
				
				
			}
			
		}
		
		
		
	}

}
