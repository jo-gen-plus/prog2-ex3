package jp.ac.uryukyu.ie.e165715;

import java.io.File; // ファイルやディレクトリの抽象表現
import java.io.FileNotFoundException; // 例外
import java.util.ArrayList; // Listの実装
import java.util.List; // いわゆる「リスト構造」のインターフェース（実装のないクラス。教科書19章）
import java.util.Scanner; // 標準入力読み込みの際に利用したクラス

/**
 * Created by e165715 on 2016/11/29.
 *
 */
public class ExMain {
    public static void main(String[] args) {
        Labyrinth labyrinth = new labyrinth();



        String input;
        labyrinth.printf();
        System.out.println("上方向に進むキー：w");
        System.out.println("下方向に進むキー：s");
        System.out.println("右方向に進むキー：d");
        System.out.println("左方向に進むキー：a");
        for (i=0;i<10;i++) {
            System.out.println("進む方向を入力してください：");
            Scanner in = new Scanner(System.in);
            input = in.nextLine();

            Player player = new player(input);
            player.move();
            labyrinth.printf();

        }



        System.out.println(input);


    }
}
