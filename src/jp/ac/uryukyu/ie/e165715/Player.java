package jp.ac.uryukyu.ie.e165715;

/**
 * Created by e165715 on 2016/12/06.
 */
import java.io.File; // ファイルやディレクトリの抽象表現
import java.io.FileNotFoundException; // 例外
import java.util.ArrayList; // Listの実装
import java.util.List; // いわゆる「リスト構造」のインターフェース（実装のないクラス。教科書19章）
import java.util.Scanner; // 標準入力読み込みの際に利用したクラス

public class Player extends Labyrinth{
    //getLabyrinthでリストを取り込む，
    //w,a,s,dそれぞれの場合，(0,1)(-1,0)(0,-1)(1,0)とする
    //move(x座標,y座標)とする
    //moveの中身としては，x座標の場合，stringクラスの　　　メソッドを，
    //                  y座標の場合リストの要素の何番目かを指定。
    public List<String> map = getLabyrinth();

    //public List<StringBuilder> map1 = (StringBuilder) map;




    public Player(String x){
        if (x == "w"){

        }else if(x == "a"){

        }else if(x == "s"){

        }else if(x == "d"){

        }else{
            System.out.println("w,a,s,dのうちどれか一文字だけ入力してください");
        }

    }







}
