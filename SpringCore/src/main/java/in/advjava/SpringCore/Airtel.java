package in.advjava.SpringCore;

public class Airtel implements BroadBandService{
    
	public Airtel() {
		super();
		System.out.println("Airtel object created");
	}

	@Override
	public String getTariffRate() {
		return "Airtel :300/month";
	}

}
