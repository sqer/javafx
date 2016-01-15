package javafx.properties;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Company {

	private StringProperty name = new SimpleStringProperty(this, "name", "No name");
	private StringProperty industry = new SimpleStringProperty(this, "industry", "");
	private StringProperty co = new SimpleStringProperty(this, "co", "");

	// Returns not value but object
	public StringProperty nameProperty() {
		return name;
	}

	// Sets the value
	public void setName(String name) {
		this.name.set(name);
	}

	// Returns the value
	public String getName() {
		return this.name.get();
	}

	// Returns not value but object
	public StringProperty industryProperty() {
		return industry;
	}

	// Sets the value
	public void setIndustry(String industry) {
		this.industry.set(industry);
	}

	// Returns the value
	public String getIndustry() {
		return this.industry.get();
	}

	// Returns not value but object
	public StringProperty coProperty() {
		return co;
	}

	// Sets the value
	public void setCo(String co) {
		this.co.set(co);
	}

	// Returns the value
	public String getCo() {
		return this.co.get();
	}

}
