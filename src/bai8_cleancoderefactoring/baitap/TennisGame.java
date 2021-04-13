package bai8_cleancoderefactoring.baitap;

public class TennisGame {
    public static String getNotification(String player1Name, String player2Name, int scoreOfPlayer1, int scoreOfPlayer2) {
        String score  = "";
        int tempScore = 0;
        boolean isEqualScore = scoreOfPlayer1 == scoreOfPlayer2;
        boolean checkScore = scoreOfPlayer1 >= 4 || scoreOfPlayer2 >= 4;
        if (isEqualScore) {
            switch (scoreOfPlayer1) {
                case 0:
                    score  = "Love-All";
                    break;
                case 1:
                    score  = "Fifteen-All";
                    break;
                case 2:
                    score  = "Thirty-All";
                    break;
                case 3:
                    score  = "Forty-All";
                    break;
                default:
                    score  = "Deuce";
                    break;

            }
        } else {
            if (checkScore) {
                int minusResult = scoreOfPlayer1 - scoreOfPlayer2;
                if (minusResult == 1) {
                    score  = "Advantage player1";
                } else if (minusResult == -1) {
                    score  = "Advantage player2";
                } else if (minusResult >= 2) {
                    score  = "Win for player1";
                } else {
                    score  = "Win for player2";
                }
            } else {
                for (int i = 1; i < 3; i++) {
                    if (i == 1) {
                        tempScore = scoreOfPlayer1;
                    } else {
                        score  += "-";
                        tempScore = scoreOfPlayer2;
                    }
                    switch (tempScore) {
                        case 0:
                            score  += "Love";
                            break;
                        case 1:
                            score  += "Fifteen";
                            break;
                        case 2:
                            score  += "Thirty";
                            break;
                        case 3:
                            score  += "Forty";
                            break;
                    }
                }
            }
        }
        return score ;
    }
}
