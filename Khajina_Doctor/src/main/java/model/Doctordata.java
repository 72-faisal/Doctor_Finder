package model;

public class Doctordata {
	private int did;
	private String image,dname,demail,dpassword,dhaddress,dcaddress,dspeciality;
	private long dcontact;
	
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getDspeciality() {
		return dspeciality;
	}
	public void setDspeciality(String dspeciality) {
		this.dspeciality = dspeciality;
	}

	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getDemail() {
		return demail;
	}
	public void setDemail(String demail) {
		this.demail = demail;
	}
	public String getDpassword() {
		return dpassword;
	}
	public void setDpassword(String dpassword) {
		this.dpassword = dpassword;
	}
	public String getDhaddress() {
		return dhaddress;
	}
	public void setDhaddress(String dhaddress) {
		this.dhaddress = dhaddress;
	}
	public String getDcaddress() {
		return dcaddress;
	}
	public void setDcaddress(String dcaddress) {
		this.dcaddress = dcaddress;
	}
	public long getDContact() {
		return dcontact;
	}
	public void setDContact(long contact) {
		this.dcontact = contact;
	}
	@Override
	public String toString() {
		return "Doctordata [did=" + did + ", image=" + image + ", dname=" + dname + ", demail=" + demail
				+ ", dpassword=" + dpassword + ", dhaddress=" + dhaddress + ", dcaddress=" + dcaddress
				+ ", dspeciality=" + dspeciality + ", dcontact=" + dcontact + "]";
	}
}
