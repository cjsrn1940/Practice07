package com.javaex.ex01;

public class Ractangle extends Shape{
	
	private int width;
	private int height;
	
	public Ractangle(String fillColor, int width, int height){
		super(fillColor);
		this.width=width;
		this.height=height;
	}
	
	public int getWidth() {
		return width;
	}

	public void draw(){ //자식 클래스는 추상 메소드를 반드시 구현해야 한다 (showInfo -> draw)
		System.out.println("[사각형]#면색:" +super.fillColor
				+ " #가로:" + width 
				+" #세로:" + height + "그렸습니다.");                                                                        
	}

}


