package sort;

import java.util.Arrays;

public abstract class sort {
	int[] orgData;
	int[] sortedData;
	//맴버변수 orgData는 원본데이터의 배열
	//sortedData 정렬된 데이터 배열
	//맴버변수 클래스 내부에 선언된 변수로서 해당 클래스의 인스턴스(객체)가 생성될때마다
	/*그 객체에 속하는 변수*/
	//이 클래스의 인스턴스를 생성하면, 해당 인스턴스마다 orgData와 sortedData라는 두 개의 배열이 생성되며,
	//이는 그 인스턴스의 속성으로 사용
	//클래스 내부에 선언된 변수 인스턴스(객체)가 생성될때마다 그 객체에 속하는 변수 
	public abstract void sort(int[] dataList);
	/* 추상메서드 이메서드는 정렬 알고리즘을 구현할때 하위클래스에서 반드시 재정의 되어야함*/
	/* 추상 클래스라서 직접 객체를 생성할 수 없다는 말은 뭔말인가?
	 *추상 클래스는 완전하지 않은 클래스 체를 직접적으로 생성할 수 없다.
	 *상속을통해 완전한 클래스가 만들어 짐 선언만 */
	 
	void swap(int[] dataList, int a, int b) {
		//두 요소의 위치를 바꾸는 매서드 
		if (a == b) return;
		int temp;
		temp = dataList[a];
		dataList[a] = dataList[b];
		dataList[b] = temp;
	}
	
	public void setData(int[] dataList) {
	//원본 데이터를 설정하고 이를 기반으로 정렬된 데이터 배열을 복제 
		this.orgData = dataList;
		this.sortedData = dataList.clone();
	}
	
	public String getOrgData() {
		//원본 데이터 배열을 문자열 형태로 반환 
		return Arrays.toString(orgData);
	}
	
	public String getSortedData() {
		//정렬된 데이터 배열을 문자열 형태로 반환 
		return Arrays.toString(sortedData);
	}

}
