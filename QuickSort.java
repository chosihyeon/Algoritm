package sort;
//데이터를 기준값보다 작은 값 영역과 큰 값 영역으로 분 
// QuickSort 클래스는 퀵 정렬 알고리즘을 사용하여 배열을 정렬합니다.
public class QuickSort extends sort {

    // sort 메소드는 입력 배열을 받아 퀵 정렬을 수행합니다.
    @Override
    public void sort(int[] dataList) {
        setData(dataList); // 데이터를 클래스 내부 변수에 설정합니다.
        quickSort(sortedData, 0, sortedData.length - 1); // 퀵 정렬을 시작합니다.
    }

    // quickSort 메소드는 재귀적으로 배열을 나누어 정렬합니다.
    void quickSort(int[] dataList, int start, int end) {
        // 배열이 하나의 원소로 구성되었거나(start == end), 더 이상 나눌 수 없는 경우 반환합니다.
        if (start >= end) return;

        // 배열을 분할하고 피벗의 최종 위치를 반환받습니다.
        int p = partition(dataList, start, end);

        // 피벗의 왼쪽 부분 배열을 정렬하기 위해 quickSort를 재귀적으로 호출합니다.
        quickSort(dataList, start, p - 1);

        // 피벗의 오른쪽 부분 배열을 정렬하기 위해 quickSort를 재귀적으로 호출합니다.
        quickSort(dataList, p + 1, end);
    }

    // partition 메소드는 배열을 피벗을 기준으로 두 부분으로 나누고 피벗의 최종 위치를 반환합니다.
    int partition(int[] dataList, int start, int end) {
        // 피벗을 배열의 마지막 요소로 설정합니다.
        int pivot = dataList[end];

        // 왼쪽 부분 배열의 마지막 요소의 인덱스를 초기화합니다.
        int leftEnd = start - 1;

        // 배열의 각 요소를 피벗과 비교하여 분할합니다.
        for (int i = start; i <= end - 1; i++) {
            if (dataList[i] < pivot) {
                // 현재 요소가 피벗보다 작으면 왼쪽 부분 배열에 추가하고, leftEnd를 증가시킵니다.
                swap(dataList, ++leftEnd, i);
            }
        }

        // 피벗을 왼쪽 부분 배열의 끝과 교체하여 피벗을 올바른 위치에 놓습니다.
        swap(dataList, leftEnd + 1, end);

        // 피벗의 최종 위치를 반환합니다.
        return leftEnd + 1;
    }

    // swap 메소드는 배열의 두 요소를 교체합니다.
    void swap(int[] dataList, int i, int j) {
        int temp = dataList[i];
        dataList[i] = dataList[j];
        dataList[j] = temp;
    }
}