package org.unbiquitous.example.areaseriscos;

public class Ponto {
	private float coordX, coordY;
	
	//deixei a cor como valores RGB enquanto nao sei usar a cor da engine
	private int[][][] rgb;
	
	//get e set da coordX
	private float getCoordX() {
		return coordX;
	}
	private void setCoordX(float x) {
		coordX = x;
	}
	
	//get e set da coordY
	private float getCoordY() {
		return coordY;
	}
	private void setCoordY(float y) {
		coordY = y;
	}
	
	//get e set das cores RGB
	private int[][][] getRGB(){
		return rgb;
	}
	private void setRGB(int[][][] rgb){
		this.rgb = rgb;
	}
	
	
}
