package org.example.wiseSaying;

import java.util.Scanner;

public class App {
    private final Scanner sc;

    private long cnt;

    public App(Scanner sc) {
        cnt = 0;
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
                    System.out.print("명언 : ");
                    String content = sc.nextLine().trim();
                    System.out.print("작가 : ");
                    String author = sc.nextLine().trim();

                    long id = cnt + 1;

                    System.out.printf("%d번 명언이 등록되었습니다.\n", id);
                    cnt = id;
                    break;
                default:
                    System.out.printf("`%s`(은)는 올바르지 않은 명령입니다.\n", cmd);
                    break;
            }
        }
    }
}
