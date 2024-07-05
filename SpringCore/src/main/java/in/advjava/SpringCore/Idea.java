package in.advjava.SpringCore;

public class Idea implements BroadBandService{

	public Idea() {
		super();
         System.out.println("Idea object created");
	}

	@Override
	public String getTariffRate() {
		return "Idea:400/month";
	}

}
