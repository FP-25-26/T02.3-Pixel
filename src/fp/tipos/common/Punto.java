package fp.tipos.common;

public interface Punto {
	
	Double getX();
	Double getY();
	void setX(Double nuevaX);
	void setY(Double nuevaY);
	Double getDistancia(Punto p);
}
