package p1;

public class Book 
{
	private int bid;
	 private String bname;
	 private Publisher pub;
	public Publisher getPub() {
		return pub;
	}
	public void setPub(Publisher pub) {
		this.pub = pub;
	}
	public int getBid() {
		return bid;
	}
	public String getBname() {
		return bname;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
}
