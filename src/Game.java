
public class Game  {
	public static final int MAX_X = 20;
	public static final int MAX_Y = 10;//final 상수 선언
	
	private char[][] map = new char[MAX_Y][MAX_X];// 행의크기:0~9 ,열의 크기: 0~19
	private GameObject [] m = new GameObject [2];
	int state;// 0:게임중  
	
	
	{
		System.out.println("====================");
		System.out.println("=    GAME START    =");
		System.out.println("====================");
		}

	public Game() {
	for(int i =0;i<map.length;i++) {
		for(int j=0;j<map[i].length;j++) {
			map[i][j] = '-';
			}
		}

	m[0] = new Bear(1,0,0);//(distance,x,y)를 나타낸거
	m[1] = new Fish(2,5,5);
	state = 0;
}
	public void run() {//게임시작 메소드
		System.out.println("bear의 fish 먹기게임을 시작합니다.");
		update();//배열에 '곰(B)' 과 '물고기(F)' 를 x,y를 이용해서 넣어주는 역활
		draw();
		while(!doesEnd()) {
			clear();
			for(int i=0;i<m.length;i++) {
				m[i].move();
			}
			update();
			draw();
			
		}
		System.out.println("====================");
		System.out.println("=    GAME OVER     =");
		System.out.println("====================");
	}
	
	private void update() {
		for(int i=m.length-1;i>=0;i--) {
			map[m[i].getY()][m[i].getX()] = m[i].getShape();
		}
//		map[m[1].getX()][m[1].getY()] = m[1].getShape();//물고기 위치
//	    map[m[0].getX()][m[0].getY()] = m[0].getShape();//곰 위치	
	}
	
	private void clear() {
		for(int i=0;i<m.length;i++) {
			map[m[i].getY()][m[i].getX()] = '-';
		}
	} 
	
	private void draw() {
		System.out.println();
		for(int i =0;i<map.length;i++) {
			for(int j=0;j<map[i].length;j++) {
				System.out.print(map[i][j]);
			}
			System.out.println();
			}
	}
	
	
	
	private boolean doesEnd() {
		if(m[0].collide(m[1])) {
			return true;
		}else {
			return false;
		}
	}
	
	
	
}