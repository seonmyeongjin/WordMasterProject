package com.word.project;
import java.util.Scanner;

public class WordManager {
    Scanner scanner = new Scanner(System.in);
    public static void start() {

        WordManager myword = new WordManager();
        WordCRUD mycrud = new WordCRUD();

        mycrud.loadFile();
        System.out.println("*** 영단어 마스터 *** \n");
        while (true) {
            int id = myword.selectMenu();

            switch (id) {
                case 1:
                    mycrud.lsitAll();
                    break;
                case 2:
                    mycrud.level();
                    break;
                case 3:
                    mycrud.select_word();
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
                    mycrud.saveFile();
                    break;
                case 0:
                    System.out.println("프로그램 종료! 다음에 만나요~");
                    System.exit(0);
                default:
                    System.out.println("올바른 메뉴 번호를 입력하세요.");
            }
        }
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
