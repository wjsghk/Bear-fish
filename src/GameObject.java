import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public abstract class GameObject {
	
	protected int distance;//�̵��Ÿ��� ��Ÿ���� ����
	protected int x,y;//���� ��ġ (�ۻ��� ��ġ)
	
	public boolean collide(GameObject p) {//���� ������ ������ġ�� �� �浹=���̳��� �ڵ�)
		if(this.x==p.getX()&& this.y ==p.getY()) {
			return true;
		}else {
			return false;
		}
	}

	protected abstract void move();
	protected abstract char getShape();
	
	
	
	
	
	
	
}
