package sort;

public class BubbleSort extends sort {
//Bubblesort 클래스는 sort 클래스를 상속받습니다.
/*버블정렬*/
/*정렬되지 않은 부분에서 두개의 인접한 데이터의 크기를 비교
 * swap 연산을 수하여 최대값을 가장 오른쪽 배치 */ 
	
    @Override
    public void sort(int[] dataList) {
    	//sort 클래스의 sort 매서드를 오버라이드 (재정의)합니다.
    	//이 메서드는 정수형 배열을 받아와서 정렬
        setData(dataList);
        //받아온 배열을 setdata 메서드를 통해 설정 
        boolean swapped;
        //swapped라는 이름의 불린 변수를 선언 변수는 스왑여부를 나타냄 
        for (int last = sortedData.length - 1; last >= 1; last--) {
        	//last라는 이름의 정수형 변수를 선언하고,sortedData 배열의 길이 -1 값을 초기
        //값으로 지정
        /*배열을 역순으로 탐색*/
            swapped = false;
       /*swap 변수를 false로 초기
        *i가 last-1보다 작거나 같을때까지 반복
        *이 반복문은 버블 정렬의 핵심부  */
            for (int i = 0; i <= last - 1; i++) {
            	// 만약 sortedData 배열의 i번째 요소가 그 다음 요소보다 크면
                if (sortedData[i] > sortedData[i + 1]) {/*두요소 스왑*/
                    swap(sortedData, i, i + 1);
                    swapped = true;//스왑이 발생하므로 true 설
                }
            }
            // If no swaps were made in this pass, the array is already sorted
            if (!swapped) {//배열은 이미 정렬상
                break;//반복문 종
            }
        }
    }

	public void setData(int[] dataList) {
		// TODO Auto-generated method stub
		
	}
}