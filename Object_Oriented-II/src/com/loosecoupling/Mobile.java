package com.loosecoupling;

public class Mobile {
   private Network network;

public Mobile(Network network) {
	this.network = network;//new Vodafone
}
   public String getServices(){
	   return this.network.getNetwork();
   }
}
