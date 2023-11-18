package baseball;

public class BaseBallTeam {
    //変数の宣言
    private String name;
    private int win;
    private int lose;
    private int draw;

    //デフォルトコンストラクタ
    public BaseBallTeam() {
    }

    //変数を初期化（コンストラクタ）
    public BaseBallTeam(String name, int numberOfMatches, int win, int lose, int draw) {
        this.name = name;
        this.win = win;
        this.lose = lose;
        this.draw = draw;
    }

    //カプセル化
    //name変数
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    //win変数
    public int getWin() {
        return win;
    }
    public void setWin(int win) {
        this.win = win;
    }

    //lose変数
    public int getLose() {
        return lose;
    }
    public void setLose(int lose) {
        this.lose = lose;
    }

    //draw変数
    public int getDraw() {
        return draw;
    }
    public void setDraw(int draw) {
        this.draw = draw;
    }
    
    
    //勝率を小数点にして計算
    public double getRate() {
        return (double)win/(win + lose);
    }
    
    //勝率を出力
    public void report() {
        System.out.println(getName() + " の2022年の成績は " + getWin() + "勝 " + getLose() + "敗 " + getDraw() + "分、勝率は " + getRate() + "です。");
    }
    
}
