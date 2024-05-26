package sort;

public class InsertionSort extends sort {
	//삽입 정렬 
	//정렬 안된 부분 원소를 하나씩 정렬된 부분에 적절한 위치에 삽입하여 정렬
	//이미 정렬된 파일의 뒷부분에 소량의 신규 데이터를 추가하여 정렬하는 경우 우수한 성능
	//입력크기가 작은 경우에도 매우 좋은 성능을 보임 
	//프로그램이 매우 간단 

	@Override
	public void sort(int[] dataList) {
		setData(dataList);//정렬할 데이터 설정  
		
		for (int i = 1; i < sortedData.length; i++) {
			//삽입 정렬 알고리즘 수행
		    //정렬된 부분에서 새로운 요소를 적절한 위치에 대입합니다.
			int loc = findLessFromLast(sortedData, sortedData[i], i-1);
			//sortedData 배열에서 sortedData[i] 보다 작은 값을 가지는 마지막 위치를 
			//찾습니다.
			// 이 위치는 새로운 요소sortedData[i]가 들어갈 위치 
			if (loc != i-1)
				insertData(sortedData, loc+1, i);
			//만약 찾은 위치가 이미 정렬된 부분의 마지막 위치(i-1)와 같지 않다면
			//insertData 메서드를 사용하여 요소를 삽입 
		}

	}

	private void insertData(int[] dataList, int target, int source) {
		//배열에 요소를 삽입하는 메서
		int temp = dataList[source];
		for (int i = source; i > target; i--) {//요소를 오른쪽으로 한칸씩 이
			dataList[i] = dataList[i-1];
		}
		dataList[target] = temp;//요소를 타켓 위치에 삽입 
	}

	private int findLessFromLast(int[] dataList, int data, int last) {
		//정렬된 부분에서 데이타보다 작은 값을 가지는 마지막 위치를 찾는 메서드 
		for (int i = last; i >= 0; i--) {
			if (dataList[i] <= data) return i;//마지막 위치 반 
		}
		return -1;//찾지 못한 경우 -1 반
	}
	
	 

}