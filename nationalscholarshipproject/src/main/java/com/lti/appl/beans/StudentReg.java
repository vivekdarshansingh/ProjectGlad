package com.lti.appl.beans;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="STUDENT_REG")
public class StudentReg {
	
	@Id
	@Column(name="STUD_ID")
	private String studId;
	
	@Column(name="STUD_NAME")
	private String studName;
	
	
	@Column(name="STUD_DOB")
	private String studDOB;
	
	@Column(name="STUD_GENDER")
	private String studGender;
	
	@Column(name="STUD_MOB_NO")
	private String studMobNo;
	
	@Column(name="STUD_EMAIL_ID")
	private String studEmailId;
	
	@Column(name="STUD_PWD")
	private String studPWD;

	@Column(name="STUD_STATE_OF_DOMICILE")
	private String studSOD;
	
	@Column(name="STUD_DISTRICT")
	private String studDistrict;
	
	@Column(name="STUD_BANK_ACC_NO")
	private String studBankAcc;
	
	@Column(name="STUD_BANK_IFSC")
	private String ifsc;

	
	@ManyToOne(cascade = CascadeType.ALL, optional = false)
	@JoinColumn(name = "inst_code")
	private Institute institute;
	
	
	public StudentReg() {
		super();
	}

	public StudentReg(String studId, String studName, String studDOB, String studGender, String studMobNo,
			String studEmailId, String studPWD, String studSOD, String studDistrict, String studBankAcc, String ifsc) {
		super();
		this.studId = studId;
		this.studName = studName;
		this.studDOB = studDOB;
		this.studGender = studGender;
		this.studMobNo = studMobNo;
		this.studEmailId = studEmailId;
		this.studPWD = studPWD;
		this.studSOD = studSOD;
		this.studDistrict = studDistrict;
		this.studBankAcc = studBankAcc;
		this.ifsc = ifsc;
	}

	public String getStudId() {
		return studId;
	}

	public void setStudId(String studId) {
		this.studId = studId;
	}

	public String getStudName() {
		return studName;
	}

	public void setStudName(String studName) {
		this.studName = studName;
	}

	public String getStudDOB() {
		return studDOB;
	}

	public void setStudDOB(String studDOB) {
		this.studDOB = studDOB;
	}

	public String getStudGender() {
		return studGender;
	}

	public void setStudGender(String studGender) {
		this.studGender = studGender;
	}

	public String getStudMobNo() {
		return studMobNo;
	}

	public void setStudMobNo(String studMobNo) {
		this.studMobNo = studMobNo;
	}

	public String getStudEmailId() {
		return studEmailId;
	}

	public void setStudEmailId(String studEmailId) {
		this.studEmailId = studEmailId;
	}

	public String getStudPWD() {
		return studPWD;
	}

	public void setStudPWD(String studPWD) {
		this.studPWD = studPWD;
	}

	public String getStudSOD() {
		return studSOD;
	}

	public void setStudSOD(String studSOD) {
		this.studSOD = studSOD;
	}

	public String getStudDistrict() {
		return studDistrict;
	}

	public void setStudDistrict(String studDistrict) {
		this.studDistrict = studDistrict;
	}

	public String getStudBankAcc() {
		return studBankAcc;
	}

	public void setStudBankAcc(String studBankAcc) {
		this.studBankAcc = studBankAcc;
	}

	public String getIfsc() {
		return ifsc;
	}

	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}

	@Override
	public String toString() {
		return "StudentReg [studId=" + studId + ", studName=" + studName + ", studDOB=" + studDOB + ", studGender="
				+ studGender + ", studMobNo=" + studMobNo + ", studEmailId=" + studEmailId + ", studPWD=" + studPWD
				+ ", studSOD=" + studSOD + ", studDistrict=" + studDistrict + ", studBankAcc=" + studBankAcc + ", ifsc="
				+ ifsc + "]";
	}
	

}