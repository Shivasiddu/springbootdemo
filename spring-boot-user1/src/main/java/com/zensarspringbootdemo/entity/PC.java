package com.zensarspringbootdemo.entity;

public class PC {

	private Details details;
	private Status status;
	private Address address;

	public PC(Details details, Status status, Address address) {
		super();
		this.details = details;
		this.status = status;
		this.address = address;
	}

	public PC() {
		super();
	}

	public Details getDetails() {
		return details;
	}

	public void setDetails(Details details) {
		this.details = details;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "PC [details=" + details + ", status=" + status + ", address=" + address + "]";
	}

}
