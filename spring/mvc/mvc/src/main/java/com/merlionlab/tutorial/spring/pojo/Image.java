package com.merlionlab.tutorial.spring.pojo;

public class Image {

	private byte[] blob = null;
	
	private String pathUri = null;
	
	private String mimeType = null;

	public byte[] getBlob() {
		return blob;
	}

	public void setBlob(byte[] blob) {
		this.blob = blob;
	}

	public String getPathUri() {
		return pathUri;
	}

	public void setPathUri(String pathUri) {
		this.pathUri = pathUri;
	}

	public String getMimeType() {
		return mimeType;
	}

	public void setMimeType(String mimeType) {
		this.mimeType = mimeType;
	}
}
