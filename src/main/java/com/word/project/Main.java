package com.word.project;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        WordManager myword = new WordManager();
        WordCRUD mycrud = new WordCRUD();

        System.out.println("*** 영단어 마스터 *** \n");
        while (true) {
            int id = myword.selectMenu();

            switch (id) {
                case 1:
                    mycrud.lsitAll();
                    break;
                case 2:
                    // 수준별 단어 보기 메서드 호출
                    break;
                case 3:
                    // 단어 검색 메서드 호출
                    break;
                case 4:
                    mycrud.addWord();
                    break;
                case 5:
                    mycrud.updateitem();
                    break;
                case 6:
                    mycrud.deleteitem();
                    break;
                case 7:
                    // 파일 저장 메서드 호출
                    break;
                case 0:
                    System.out.println("프로그램 종료! 다음에 만나요~");
                    System.exit(0);
                default:
                    System.out.println("올바른 메뉴 번호를 입력하세요.");
            }
        }
    }
}
