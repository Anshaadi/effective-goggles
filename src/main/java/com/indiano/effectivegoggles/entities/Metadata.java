package com.indiano.effectivegoggles.entities;

public class Metadata {

	@Override
	public String toString() {
		return "Metadata [superuser=" + superuser + ", serviceName=" + serviceName + "]";
	}

	String superuser = "Anshul Shrivastava";
	String serviceName = "Backend Microservice";

	public String getSuperuser() {
		return superuser;
	}

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

}
