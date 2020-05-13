package com.javaex.practice;

public class TS_Ex01 {

	public static void main(String[] args) {

//		Ex01. 아래의 코드를 실행하면 출력 결과에 오류가 발생한다.
//					 해당 오류를 수정 후 출력결과를 예상하여 코드를 작성해 보세요.
//		
//		int[ ] intArray = new int[5];
//		intArray[0] = 3;
//		intArray[1] = 7;
//		intArray[2] = 12;
//		
//		int result = 0;
//		
//		for(int i = 0; i<=intArray.length; i++) {
//			result = result + intArray[i];
//		}
//		System.out.println(result);
//					 
		
		int[ ] intArray = new int[5];
		intArray[0] = 3;
		intArray[1] = 7;
		intArray[2] = 12;
		
		int result = 0;
		
		for(int i = 0; i<intArray.length; i++) {
			result = result + intArray[i];
		}
		System.out.println(result);
		
//		30번째 줄의 for(int i = 0; i<=intArray.length; i++)에서
//		i는 0부터 출발을 하며,  여기서 i는 intArray.length
//		즉, 23째 줄의 new int[5]에서 선언한대로 5개의 방을 가지고 있다.
//		하지만 i는 0에서 출발을 하기에 0, 1, 2, 3, 4, 5의 6개의 방을 필요로 하기 때문에 오류가 발생한다.
//		따라서 오류를 삭제하기 위해서는 for문의 <=를 <로 수정하는 방법과 혹은
//		int[ ] intArray = new int[5];에서 6개의 방으로 늘려주는 방안이 있다.
		
	}

}
