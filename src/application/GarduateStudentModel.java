package application;

public class GarduateStudentModel {
	String studentnumber,fname,mname,lname,majid,minid;

	 
	GarduateStudentModel(String studentnumber,String fname,String mname,String lname,String majid,String minid){
	   this.studentnumber=studentnumber;
		 this.fname=fname;
		 this.mname=mname;
		 this.lname=lname;
		 this.majid=majid;
		 this.minid=minid;
	 }
	public String getStudentnumber() {
		return studentnumber;
	}

	public void setStudentnumber(String studentnumber) {
		this.studentnumber = studentnumber;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getMname() {
		return mname;
	}

	public void setMname(String mname) {
		this.mname = mname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getMajid() {
		return majid;
	}

	public void setMajid(String majid) {
		this.majid = majid;
	}

	public String getMinid() {
		return minid;
	}

	public void setMinid(String minid) {
		this.minid = minid;
	}
}
