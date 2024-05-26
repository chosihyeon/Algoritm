package sort;

public class SelectionSort extends sort {
	
	@Override
	public void sort(int[] dataList) {
		setData(dataList); // 정렬할 데이터 설정
		
		for (int last = sortedData.length - 1; last >= 1; last--) {
			// 정렬되지 않은 부분에서 가장 큰 값을 찾아서 마지막 위치와 교환합니다.
			int maxIndex = selectMax(sortedData, last);
			if (maxIndex != last) // 가장 큰 값의 위치가 마지막 위치와 같지 않다면
				swap(sortedData, maxIndex, last); // 가장 큰 값과 마지막 위치를 교환합니다.
		}
	}
	
	int selectMax(int[] dataList, int last) {
		int max = dataList[0]; // 가장 큰 값을 저장하는 변수를 배열의 첫 번째 요소로 초기화합니다.
		int maxIndex = 0; // 가장 큰 값의 인덱스를 저장하는 변수를 0으로 초기화합니다.
		
		for (int i = 1; i <= last; i++) {
			// 배열의 첫 번째부터 정렬되지 않은 부분의 마지막 위치까지 반복하며
			// 가장 큰 값을 찾아 해당 값과 인덱스를 저장합니다.
			if (dataList[i] > max) {
				max = dataList[i];
				maxIndex = i;
			}
		}
		return maxIndex; // 가장 큰 값의 인덱스를 반환합니다.
	}

}