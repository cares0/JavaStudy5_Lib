package com.cares.s3.ex1.student;

public class StudentDTO {
	
	private String id;
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int total;
	private double avg;

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getTotal() {
		this.total = this.kor + this.eng + this.math;
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public double getAvg() {
		this.avg = this.total / 3.0;
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	
	
	
}
