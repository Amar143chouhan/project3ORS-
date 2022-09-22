package com.rays.pro4.Bean;

/**
 * Marksheet JavaBean encapsulates Marksheet attributes.
 * 
 * @author Rohan Jaiswal
 *
 */
public class MarksheetBean extends BaseBean{

	private String rollNo;
	private long studentld;
	private String name;
	private Integer physics;
	private Integer chemistry;
	private Integer maths;
	private Integer total;
	private String result;
	private String tcheck;
	
	
	public String getTcheck() {
		return tcheck;
	}
	public void setTcheck(String tcheck) {
		this.tcheck = tcheck;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public Integer getTotal() {
		return total;
	}
	public void setTotal(Integer total) {
		this.total = total;
	}
	public String getRollNo() {
		return rollNo;
	}
	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}
	public long getStudentld() {
		return studentld;
	}
	public void setStudentld(long studentld) {
		this.studentld = studentld;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getPhysics() {
		return physics;
	}
	public void setPhysics(Integer physics) {
		this.physics = physics;
	}
	public Integer getChemistry() {
		return chemistry;
	}
	public void setChemistry(Integer chemistry) {
		this.chemistry = chemistry;
	}
	public Integer getMaths() {
		return maths;
	}
	public void setMaths(Integer maths) {
		this.maths = maths;
	}
	public String getkey() {
		// TODO Auto-generated method stub
		return id+"";
	}
	public String getValue() {
		// TODO Auto-generated method stub
		return rollNo;
	}
	
	
}
