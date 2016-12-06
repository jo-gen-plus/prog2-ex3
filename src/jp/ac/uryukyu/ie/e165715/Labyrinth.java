package jp.ac.uryukyu.ie.e165715;

/**
 * Created by e165703 on 2016/12/06.
 */
import java.io.File; // ファイルやディレクトリの抽象表現
import java.io.FileNotFoundException; // 例外
import java.util.ArrayList; // Listの実装
import java.util.List; // いわゆる「リスト構造」のインターフェース（実装のないクラス。教科書19章）
import java.util.Scanner; // 標準入力読み込みの際に利用したクラス

/**
 * Scannerクラスを用いたファイル読み込みの例。
 * ・1行ずつ読み込み、String型のリストとして保存する。
 * ・ファイルオープン時に例外が発生する可能性があるため、例外に対応するコード例も含む。
 */
public class Labyrinth {
    List<String> labyrinth = new ArrayList<>();
    String filename = "./src/main/jp/ac/uryukyu/ie/e165715/map.txt";
    public Labyrinth(String[] args) {
        Scanner scanner;
        try {
            scanner = new Scanner(new File(filename));
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                labyrinth.add(line);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
            System.exit(1); //終了ステータス。ここでは取り敢えず0(=正常)以外にした。
        }
    }
    public void printf(){
        for(String str: labyrinth){
            System.out.println(str);
        }
    }
    public List<String> getLabyrinth(){return labyrinth;}
    public void setLabylinth(List<String> labyrinth){this.labyrinth = labyrinth;}
}