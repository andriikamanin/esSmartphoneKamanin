package bean;

public class Smartphone {
	private String brand;
	private String model;
	private double launchPrice;
	private double numberOfInches;
	private double ram;
	
	public Smartphone() {
		
	}
	
	public Smartphone(String brand, String model, double launchPrice, double numberOfInches, double ram) {
		this.brand = brand;
		this.model = model;
		this.launchPrice = launchPrice;
		this.numberOfInches = numberOfInches;
		this.ram = ram;
		
		
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getLaunchPrice() {
		return launchPrice;
	}

	public void setLaunchPrice(double launchPrice) {
		this.launchPrice = launchPrice;
	}

	public double getNumberOfInches () {
		return numberOfInches;
	}

	public void setNumberOfInches(double numberOfInches) {
		this.numberOfInches = numberOfInches;
	}

	public double getRam() {
		return ram;
	}

	public void setRam(double ram) {
		this.ram = ram;
	}
	
	
	public String ottieniFasciaDiPrezzo() {
		if(launchPrice > 500){
			return "fascia ALTA";
		}
		else if(  launchPrice <= 500 && launchPrice <= 200) {
			return "fascia MEDIA";
		}else {
			return "fascia BASSA";
		}
	}
	
	public String ottieniTipologiaSmartphone() {
		if(numberOfInches < 5) {
			return "Mini";
		}else if(numberOfInches>=5 && numberOfInches <=7){
			return "Normal";
		}else {
			return "Maxi";
		}
	}
	
	
	public String toString () {
		return "Informazioni sullo smartphone: { " + "Marca: " + getBrand() + 
				", Modello: " + getModel() + ", Prezzo di lancio: " + getLaunchPrice() + 
				", Numero di pollici: " + getNumberOfInches() + ", RAM: " + getRam() + 
				", Fascia di prezzo: " + ottieniFasciaDiPrezzo() + "Tipologia di smartphone: " + ottieniTipologiaSmartphone();
        
        
        
      
        
       
	}
	
}
