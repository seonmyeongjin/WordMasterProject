package com.word.project;
import java.io.*;
import java.util.Objects;
import java.util.Scanner;
import java.util.ArrayList;
public class WordCRUD implements ICRUD{
    private static ArrayList<Word> voc = new ArrayList<>();
    private static final String FILE_NAME = "Dictionary.txt";
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
        scanner.nextLine();
        System.out.println("=> 뜻 입력 : ");
        String mean = scanner.nextLine();
        voc.get(num-1).setMeaning(mean);
        System.out.println("단어 수정이 성공적으로 되었습니다!!");
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
        else{
            System.out.println("취소되었습니다.");
        }
        // TODO Auto-generated method stub
        return num;
    }

    @Override
    public void selectOne(int id) {
    }

    public void select_word(){
        System.out.println("=> 검색할 단어 입력 : ");
        String word = scanner.next();
        word_listAll(word);
    }

    public ArrayList<Integer> word_listAll(String keyword){
        ArrayList<Integer> spell = new ArrayList<>();
        System.out.println("\n--------------------------------");
        for(int i=0;i<voc.size();i++) {
            String selcet = voc.get(i).getWord();
            if (!selcet.contains((keyword))){
                continue;
            }
            System.out.println((i + 1) + " " + voc.get(i).toString());
        }
        System.out.println("--------------------------------\n");
        return spell;

    }

    public void loadFile(){
        try {
            BufferedReader read = new BufferedReader(new FileReader(FILE_NAME));
            String line;

            int count =0;

            while(true){
                line = read.readLine();
                if(line==null){
                    break;
                }
                String words[]=line.split("\\|");
                int level = Integer.parseInt(words[0]);
                String word = words[1];
                String meaning = words[2];
                voc.add(new Word(0, level, word, meaning));
                count++;
            }

            read.close();
            System.out.println("==> " + count+ "개 로딩 완료!!!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void saveFile(){
        try {
            PrintWriter save = new PrintWriter(new FileWriter(FILE_NAME));
            for(Word element : voc){
                save.write(element.toFileString() + "\n");
            }
            save.close();
            System.out.println("모든 단어 파일 저장 완료 !!!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void lsitAll(){
        System.out.println("\n--------------------------------");
        for(int i=0;i<voc.size();i++){
            System.out.println((i+1)+" "+voc.get(i).toString());
        }
        System.out.println("--------------------------------\n");

    }

    public void level(){
        System.out.println("=> 레벨(1:초급, 2:중급, 3:고급) 선택 : ");
        int level = scanner.nextInt();
        level_listAll(level);
    }

    public void level_listAll(int level){
        System.out.println("\n--------------------------------");
        for(int i=0;i<voc.size();i++) {
            int lev = voc.get(i).getLevel();
            if (lev != level) {
                continue;
            }
            System.out.println((i + 1) + " " + voc.get(i).toString());
        }
        System.out.println("--------------------------------\n");

    }
}
