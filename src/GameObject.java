import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public abstract class GameObject {
	
	protected int distance;//이동거리를 나타내는 변수
	protected int x,y;//현재 위치 (앱상의 위치)
	
	public boolean collide(GameObject p) {//곰이 물고기와 같은위치일 때 충돌=끝이나는 코드)
		if(this.x==p.getX()&& this.y ==p.getY()) {
			return true;
		}else {
			return false;
		}
	}

	protected abstract void move();
	protected abstract char getShape();
	
	
	
	
	
	
	
}
