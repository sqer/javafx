package javafx.table;

import java.time.LocalDate;

public class Language {

	private String name;
	private LocalDate lastUpdateDate;
	private String version;

	public Language(String name, LocalDate lastUpdateDate, String version) {
		this.name = name;
		this.lastUpdateDate = lastUpdateDate;
		this.version = version;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getLastUpdateDate() {
		return lastUpdateDate;
	}

	public void setLastUpdateDate(LocalDate lastUpdateDate) {
		this.lastUpdateDate = lastUpdateDate;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	@Override
	public String toString() {
		return "Language [name=" + name + ", lastUpdateDate=" + lastUpdateDate + ", version=" + version + ", getName()="
				+ getName() + ", getLastUpdateDate()=" + getLastUpdateDate() + ", getVersion()=" + getVersion()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

	
}
