package test.design.adapter;

public class MyUKPlug implements UKPlug{

	@Override
	public void consumePower() {
		System.out.println("UK plug is consuming power");
		
	}	

}
