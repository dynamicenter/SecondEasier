package com.seller;


public class Seller {

	 private final long id;
	    
	    private final String Name;
	    
	    private final String serName;

	    public Seller(long id, String Name, String serName) {
	        this.id = id;
	        this.Name = Name;
	        this.serName = serName;
	    }

	    public long getId() {
	        return id;
	    }

	    public String getFirstName() {
	        return Name;
	    }

	    public String getLastName() {
	        return serName;
	    }
	}

