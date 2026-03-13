package fp.tipos.common;

import java.util.Objects;

public class PuntoImpl implements Punto{

	private Double x;
	private Double y;
	
	public Double getX() {
		return x;
	}
	public void setX(Double x) {
		this.x = x;
	}
	public Double getY() {
		return y;
	}
	public void setY(Double y) {
		this.y = y;
	}

	@Override
	public Double getDistancia(Punto p) {
	
		Double difX = getX()-p.getX();
		Double difY = getY()-p.getY();
		return Math.sqrt(difX*difX+difY*difY);
	}
	@Override
	public String toString() {
		return "(" + getX() + ", getY()=" + getY() + ")";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(x, y);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PuntoImpl other = (PuntoImpl) obj;
		return Objects.equals(x, other.x) && Objects.equals(y, other.y);
	}
	
	
	
}
