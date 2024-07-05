package in.advjava.SpringCore;

public class JIO implements BroadBandService{

	
	public JIO() {
		super();
		System.out.println("JIO object created");
	}

	@Override
	public String getTariffRate() {
		return "JIO:200/month";
	}

}
