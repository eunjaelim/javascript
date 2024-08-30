package quiz;

/*
 * 배열
 * 크기가 5인 배열에 10,5,1,30,15 를 저장한다
 * 그리고 가장 큰 값을 찾는다 (30)
 * */
public class Quiz9 {

	public static void main(String[] args) {	
		
		int arr[] = {10, 5, 1, 30, 15}; //arr은 정수 5개를 저장하기 위한 배열이다
		int max = arr[0]; //max는 배열의 가장 큰 값을 저장하기 위한 변수이다. 첫번째 값으로 초기화한다
		
		for(int i=1;i<5;i++) { //i는 반복문의 조건으로 사용하기 위한 변수이다. 코드를 4번 반복한다. (배열인덱스)
			if(max < arr[i]) { //배열값이 현재 max값보다 큰지 비교한다
				max = arr[i]; //max에 배열값을 저장한다
			}
		}
		
		System.out.println(max); //max을 출력한다
	}

}
