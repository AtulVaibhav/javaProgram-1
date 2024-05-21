package com.tightcoupling;

public class Mobile {
    private JIO network;
    Mobile(JIO network){
    	this.network= network;
    }
    
    public String getServiceName(){
    	return this.network.getNetworkName();
    }
}
