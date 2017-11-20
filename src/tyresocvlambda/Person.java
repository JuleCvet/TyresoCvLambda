
package tyresocvlambda;

public class Person {

    private String name;
    private String adress;
    private String telefon;
    private String majl;
    
	public Person(String name, String adress, String telefon, String majl) {
		this.name = name;
		this.adress = adress;
		this.telefon = telefon;
		this.majl = majl;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getTelefon() {
		return telefon;
	}

	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}

	public String getMajl() {
		return majl;
	}

	public void setMajl(String majl) {
		this.majl = majl;
	}

	@Override
	public String toString() {
		return name + ", adress=" + adress + ", telefon=" + telefon + ", majl=" + majl;
    }
}
