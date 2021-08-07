package com.study.Practice;

import java.util.Date;

import lombok.Data;

@Data
public class UserDto {
	private int custno;
	private String custname;
	private String phone;
	private String address;
	public UserDto() {
		super();
	}
	public UserDto(int custno, String custname, String phone, String address, Date joindate, String grade,
			String city) {
		super();
		this.custno = custno;
		this.custname = custname;
		this.phone = phone;
		this.address = address;
		this.joindate = joindate;
		this.grade = grade;
		this.city = city;
	}
	private Date joindate;
	private String grade;
	private String city;
}
