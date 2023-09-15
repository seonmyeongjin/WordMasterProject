package com.word.project;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;
import java.util.ArrayList;
public class WordCRUD implements ICRUD{
    private static ArrayList<Word> voc = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    @Override
    public Object add() {
        // TODO Auto-generated method stub

        System.out.println("=> 난이도(1,2,3) & 새 단어 입력 : ");
        int level  = scanner.nextInt();
        String word = scanner.nextLine();
        System.out.println("뜻 입력 : ");
        String mean = scanner.nextLine();

        return new Word(0,level,word,mean);
    }

    public void addWord(){
        Word store = (Word)add();
        voc.add(store);
        System.out.println("새 단어가 단어장에 추가되었습니다 !!!");
    }
    @Override
    public int update(Object obj) {
        // TODO Auto-generated method stub
        return 0;
    }

    public void updateitem(){
        System.out.println("=> 수정할 번호 선택 : ");
        int num = scanner.nextInt();
        System.out.println("=> 뜻 입력 : ");
        String mean = scanner.next();
    }

    @Override
    public int delete(Object obj) {
        // TODO Auto-generated method stub
        return 0;
    }
    public int deleteitem() {
        System.out.println("=> 삭제할 번호 선택 : ");
        int num = scanner.nextInt();
        System.out.println("=> 정말로 삭제하실래요?(Y/n)");
        String answer = scanner.next();
        if(Objects.equals(answer, "Y")){
            voc.remove(num-1);
            System.out.println("단어가 삭제되었습니다.");
        }
        // TODO Auto-generated method stub
        return num;
    }

    @Override
    public void selectOne(int id) {
        // TODO Auto-generated method stub
    }

    public void lsitAll(){
        System.out.println("\n--------------------------------");
        for(int i=0;i<voc.size();i++){
            System.out.println((i+1)+" "+voc.get(i).toString());
        }
        System.out.println("--------------------------------\n");

    }
}
