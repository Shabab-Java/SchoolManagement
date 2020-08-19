package com.jdc.schoolMgntSystem.revision;

public class ShallowClone implements Cloneable {
	private String name; 
    private int income; 
    private City city; 
    
   
    public String getName() {
        return name;
    }
    public void setName(String firstName) {
        this.name = firstName;
    }
    public int getIncome() {
        return income;
    }
    public void setIncome(int income) {
        this.income = income;
    }
    public City getCity() {
        return city;
    }
    public void setCity(City city) {
        this.city = city;
    }
    public ShallowClone(String firstName, int income, City city) {
        super();
        this.name = firstName;
        this.income = income;
        this.city = city;
    }
    @Override
    public ShallowClone clone() throws CloneNotSupportedException {
        //return (ShallowClone) super.clone();  This is shallow cloning
    	
    	ShallowClone clonedObj = (ShallowClone) super.clone();      	// This is deep cloning
    	    clonedObj.city = this.city.clone();
    	    return clonedObj;
    }
    @Override
    public String toString() {
        return "Person [name=" + name + ", income=" + income + ", city=" + city + "]";
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((city == null) ? 0 : city.hashCode());
        result = prime * result + income;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        ShallowClone other = (ShallowClone) obj;
        if (city == null) {
            if (other.city != null)
                return false;
        } else if (!city.equals(other.city))
            return false;
        if (income != other.income)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }
    
    public static void main(String args[]) throws CloneNotSupportedException{
    	
    	City city = new City("Doon");
    	ShallowClone sc = new ShallowClone("Shabab",5000,city);
    	
    	ShallowClone sc2= (ShallowClone)sc.clone();
    	
    	System.out.println(sc.hashCode());
    	System.out.println(sc2.hashCode());
    	
    	if(sc == sc2){
    		System.out.println("sc and sc2 have same reference");
    	}
    	if(sc.equals(sc2)){
    		System.out.println("sc and sc2 have same value");
    	}
    	if (sc.getCity() == sc2.getCity()){
    		System.out.println("sc and sc2 have same city");
    	}
    	
    	city.setName ("Delhi");
        System.out.println(sc);
        city.setName("Noida");
        System.out.println(sc);
        System.out.println(sc2);
    }
    
    
}


