package com.kiet;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Qualifier("square")
@Lazy
public class Square implements Shape {
	private int side;

	public Square() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("Square Object is Created ");
	}

	public Square(int side) {
		super();
		this.side = side;
		System.out.println("Square Object is Created ");
	}

	public int getSide() {
		return side;
	}

	public void setSide(int side) {
		this.side = side;
	}

	@Override
	public String toString() {
		return "Square [side=" + side + "]";
	}

}
