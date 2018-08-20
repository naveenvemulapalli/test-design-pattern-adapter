package test.design.adapter;

public class UKToIndiaAdapter implements IndiaPlug {

    private UKPlug plug;

    public UKToIndiaAdapter(UKPlug plug) {
        this.plug = plug;       
    }

	@Override
	public void consumePower() {
		plug.consumePower();		
	}
}
