package baseball;

public class Review03 {

    public static void main(String[] args) {
        //ヤクルトのインスタンスを生成(野球チーム名、試合数、勝利数、敗北数、引分数)
        BaseBallTeam team1 = new BaseBallTeam("東京ヤクルトスワローズ", 143, 80, 59, 4);
        //勝率を出力
        team1.report();
        
        //ベイスターズのインスタンスを生成
        BaseBallTeam team2 = new BaseBallTeam("横浜DeNAベイスターズ", 143, 73, 68, 2);
        //勝率を出力
        team2.report();
        
        //阪神タイガースのインスタンスを生成
        BaseBallTeam team3 = new BaseBallTeam("阪神タイガース", 143, 68, 71, 4);
        //勝率を出力
        team3.report();
        
        //読売ジャイアンツのインスタンスを生成
        BaseBallTeam team4 = new BaseBallTeam("読売ジャイアンツ", 143, 68, 72, 3);
        //勝率を出力
        team4.report();
        
        //広島東洋カープのインスタンスを生成
        BaseBallTeam team5 = new BaseBallTeam("広島東洋カープ", 143, 66, 74, 3);
        //勝率を出力
        team5.report();
        
        //中日ドラゴンズのインスタンスを生成
        BaseBallTeam team6 = new BaseBallTeam("中日ドラゴンズ", 143, 66, 75, 2);
        //勝率を出力
        team6.report();
    }
}
