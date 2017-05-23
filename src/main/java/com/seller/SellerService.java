package com.seller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Component;

@Component
public class SellerService {
	private final AtomicLong counter = AtomicLong();
	
	public Seller getSeller(String Name,String serName){
		return new Seller(counter.incrementAndGet(),Name,serName);
	}
}
