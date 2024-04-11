package ex5_generic;

public class DataListExample {
	public static void main(String[] args) {
		DataList list = new DataList();
		
		// 정수 저장
		list.add(10);
		
		// 문자열 저장
		list.add("문자열");
		
		// 실수 저장
		list.add(10.33);
		
		// 데이터의 출력
		for(int i = 0; i < list.size(); i++) {
			Object data = list.get(i);
			
			if(data instanceof Integer) {
				System.out.println("정수 : " + ((int)data)+1);
			}
			else if(data instanceof Double) {
				System.out.println("실수 : " + data);
			}
			else if(data instanceof String) {
				System.out.println("문자열 : " + data);
			}
		}
		
		// Object는 최상위 클래스이기 때문에 모든 타입의 데이터가 들어올 수 있다.
		// 뭐가 들어오는지 모르는 경우가 있을 수 있다.
		// 형변환을 하는 과정을 거쳐야 하는데 잘못 형변환을 하게 되면 오류가 난다.
	}
}
