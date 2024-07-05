package in.advjava.SpringCore;

public class Network {
    private BroadBandService network;

	public Network(BroadBandService network) {
		super();
		this.network = network;
	}
    
	public String getTariff() {
		return this.network.getTariffRate();
		}
}
