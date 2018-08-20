package test.design.adapter;

public class TestAdapter{

public static void main(String[] args){

	//Indian plug connected to Indian socket 
	IndiaPlug indiaPlug = new MyIndiaPlug();
	IndiaSocket indiaSocket = new IndiaSocket();	
	indiaSocket.plugIn(indiaPlug);
	
	//UK plug connected to UK socket
	UKPlug UKPlug = new MyUKPlug();
	UKSocket UKSocket = new UKSocket();
	UKSocket.plugIn(UKPlug);

	//Adapter pattern in action - UK plug connected to Indian socket via adapter
	UKPlug ukPlug1 = new MyUKPlug();
	IndiaSocket indiaSocket1 = new IndiaSocket();
	IndiaPlug adp = new UKToIndiaAdapter(ukPlug1);
	//India socket is in use, but it will print UK plug is consuming power
	//because adapter made it to compatible with Indian socket
	indiaSocket1.plugIn(adp);
	}
}