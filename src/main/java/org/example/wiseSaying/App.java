package org.example.wiseSaying;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    private final Scanner sc;
    private final List<WiseSaying> wiseSayingList;

    private long cnt;

    public App(Scanner sc) {
        cnt = 0;
        wiseSayingList = new ArrayList<>();
        this.sc = sc;
    }

    public void run() {
        System.out.println("== 명언 앱 ==");

        while (true) {
            System.out.print("명령) ");

            String cmd = sc.nextLine().trim();

            if (cmd.isEmpty()) continue;

            switch (cmd) {
                case "종료":
                    System.out.println("명언 앱이 종료되었습니다.");
                    return;
                case "등록":
                    long id = cnt + 1;
                    System.out.print("명언 : ");
                    String content = sc.nextLine().trim();
                    System.out.print("작가 : ");
                    String author = sc.nextLine().trim();
                    WiseSaying wiseSaying = new WiseSaying(id, content, author);
                    wiseSayingList.add(wiseSaying);

                    System.out.printf("%d번 명언이 등록되었습니다.\n", id);
                    cnt = id;
                    break;
                case "목록":
                    System.out.println("번호 / 명언 / 작가");
                    System.out.println("-----------------------------");
                    for (int i = wiseSayingList.size() - 1; i >= 0; i--){
                        WiseSaying wiseSayings = wiseSayingList.get(i);
                        System.out.println(wiseSayings);
                    }
                    break;
                default:
                    System.out.printf("`%s`(은)는 올바르지 않은 명령입니다.\n", cmd);
                    break;
            }
        }
    }
}
