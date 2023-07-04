package practice05.prob6;
//그림판 구현
import java.util.ArrayList;
import java.util.List;

public class ShapeTest {

	public static void main(String[] args) {
		List<Shape> list = new ArrayList<Shape>();
		
		list.add( new Rectangle(5, 6) );
		list.add( new RectTriangle( 6, 2) );
		
		for( Shape shape : list ) {
			System.out.println( "area:" + shape.getArea() );
			System.out.println( "perimeter:" + shape.getPerimeter() );
			
			if( shape instanceof Resizable ) { //Resizable, shape, resize, 다 추가 구현.
				Resizable resizable = (Resizable) shape; //oop 마지막 단계
				resizable.resize( 0.5 );				//jdbc web하고 또 주차장 애기나오고 그럴 예정임
				System.out.println( "new area:" + shape.getArea() );// 근데 그 사이 시간은 아무것도 모르고 지나가겠지
				System.out.println( "new perimeter:" + shape.getPerimeter() );	//oop를 7일만에 끝내니까 이러지
			}															//좀 더 web하기 전에 강도를 땡겨서 oop를 끝내고 올것, 해볼법하기도 하지 않나
		}
	}
}