package javaProgramming;

import java.util.Scanner;

public class ch_17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요 >> ");

		int k = sc.nextInt();
		int arr[] = new int[k + 1]; // k=5일때 6개의 배열 생성
		for (int i = 0; i < k; i++) { // 5번 반복
			System.out.println((i+1)+"번째 숫자 입력: ");
			arr[i] = sc.nextInt(); // 0부터 5까지 저장
		}
		arr[k] = 0; // 마지막 배열에 0 저장

		for (int i = 0; i < k; i++) {

			if (arr[i]>arr[k]) {
				arr[k]=arr[i];
			} else {
				break;
			}

		}
		System.out.print("다음 배열들 중 [" );

		for (int i = 0; i < k; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("] 가장 큰 숫자는 "+arr[5]+"입니다.");
		sc.close();
	}
}
