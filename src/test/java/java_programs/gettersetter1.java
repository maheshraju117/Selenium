package java_programs;

class gettersetter1 {
	
	private int height;
	private int width;
	private int length;

	
	public int setHeight(int h) {
		if(h>10) {
			height=h;
		}else {
			System.out.println("please enter h value above 10");
		}
		
		return height;
	}
	
	public int setWidth(int w) {
		width=w;
		return width;
	}
	
	public int setLength(int l) {
		length=l;
		return length;
	}
	
	public int getHeight() {
		return height;
	}
	
	public int getWidth() {
		return width;
	}

	public int getLength() {
		return length;
	}
	
	public void setget(int h,int w,int l) {
		System.out.println("the values for setget methos is "+h+" "+w+" "+l);
	}
	 
	 
 
}
