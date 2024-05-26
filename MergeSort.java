package sort;
//병합정렬 2/1
public class MergeSort extends sort {
	//mergesort 클래스 병합 정렬 알고리즘을 사용하여 배열을 정렬 
	//sort메소드는 입력 배열을 받아 병합 정렬을 수행 

	@Override
	public void sort(int[] dataList) {
		setData(dataList);//데이터를 클래스 내부 변수에 설정 
		mergeSort(sortedData, 0, sortedData.length-1);//병합 정렬을 호출 
	}
	
	void mergeSort(int[] dataList, int start, int end) {
		//mergeSort 매서드 재귀적으로 배열을 반으로 나누어 정렬 
		if (start >= end) return;//base case 나눌 수 없는 상태 ,배열이 하나의 원소로 구성되어 있거나(start == end),
		
		// 배열을 반으로 나누기 위한 중간 인덱스를 계산 
		int mid = (start + end) / 2;
		//왼쪽 부분 배열을 정렬하기 위한 재귀적으로 호출 
		mergeSort(dataList, start, mid);
		//오른쪽 부분 배열을 정렬하기 위한 재귀적으로 호출 
		mergeSort(dataList, mid+1, end);
	//두 정렬된 부분 배열을 병합 
		merge(dataList, start, mid, end);
	}
	//두개의 정렬된 부분 배열 병합 
	void merge(int[] dataList, int start, int mid, int end) {
		//병합된 결과를 저장할 임시 배열을 생성, 크기는 end-start+1
		int[] tempList = new int[end-start + 1];
		int i = start, j = mid + 1, k = 0;//왼쪽 부분 배열의 시작 인덱스
		//오른쪽 부분 배열의 시작 인덱스 
		//임시 배열의 인덱스 왜mid+1인지 모르겠음 
		while (i <= mid && j <= end) {
			//왼쪽과 오른쪽 부분 배열의요소를 비교하여 임시 배열에 병합 
			if (dataList[i] <= dataList[j])
				//왼쪽 배열의 현재요소가 작거나 같으면 임시 배열에 추가하고 인덱스 증가 
				tempList[k++] = dataList[i++];
			else//오른쪽 배열의 현재 요소가 작으면 임시배열에 추가하고 인덱스 증가 
				tempList[k++] = dataList[j++];
			//tempList는 어떤것을 뜻하는지 모르겠음 ㅎ 
		}
		//왼쪽 부분 배열에 남아 있는 요소들을 임시배열에 추가 
		while (i <= mid) tempList[k++] = dataList[i++];
		//오른쪽 부분 배열에 남아 있는 요소들을 임시 배열에 추가 
		while (j <= end) tempList[k++] = dataList[j++];
		
		// 임시 배열의 내용을 원본 배열의 해당 위치에 복사합니다.
        // System.arraycopy 메소드는 tempList의 모든 요소를 dataList의 시작 위치(start)부터 복사합니다
		//for (i = start, k = 0; k < tempList.length; i++, k++)
		//	dataList[i] = tempList[k];
		
		System.arraycopy(tempList, 0, dataList, start, end-start+1);
	}

}