package com.word.project;
import java.util.Scanner;

public class WordManager {
    Scanner scanner = new Scanner(System.in);
    public void start() {
        System.out.println("WordManager!!");

    }

    public int selectMenu() {
        System.out.println(
                "******************** \n" +
                "1. 모든 단어 보기\n" +
                "2. 수준별 단어 보기\n" +
                "3. 단어 검색\n" +
                "4. 단어 추가\n" +
                "5. 단어 수정\n" +
                "6. 단어 삭제\n" +
                "7. 파일 저장\n" +
                "0. 나가기\n" +
                "******************** \n" +
                "=> 원하는 메뉴는?");
        int num = scanner.nextInt();

        return num;
    }
}
