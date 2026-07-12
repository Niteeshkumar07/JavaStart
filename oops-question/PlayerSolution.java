import java.util.*;

class Player {
    private int playerId;
    private String playerName;
    private int runs;
    private String playerType;
    private String matchType;

    public Player(int playerId, String playerName, int runs, String playerType, String matchType) {
        this.playerId = playerId;
        this.playerName = playerName;
        this.runs = runs;
        this.playerType = playerType;
        this.matchType = matchType;
    }

    public int getPlayerId() {
        return playerId;
    }

    public String getPlayerName() {
        return playerName;
    }

    public int getRuns() {
        return runs;
    }

    public String getPlayerType() {
        return playerType;
    }

    public String getMatchType() {
        return matchType;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public void setRuns(int runs) {
        this.runs = runs;
    }

    public void setPlayerType(String playerType) {
        this.playerType = playerType;
    }

    public void setMatchType(String matchType) {
        this.matchType = matchType;
    }
}

public class PlayerSolution {

    public static int findPlayerWithLowestRuns(Player[] players, String type) {
        int min = Integer.MAX_VALUE;

        for (Player p : players) {
            if (p.getPlayerType().equalsIgnoreCase(type)) {
                if (p.getRuns() < min) {
                    min = p.getRuns();
                }
            }
        }

        if (min == Integer.MAX_VALUE) {
            return 0;
        }

        return min;
    }

    public static Player[] findPlayerByMatchType(Player[] players, String match) {

        Player[] temp = new Player[players.length];
        int count = 0;

        for (Player p : players) {
            if (p.getMatchType().equalsIgnoreCase(match)) {
                temp[count] = p;
                count++;
            }
        }

        if (count == 0) {
            return null;
        }

        // Sort in descending order of playerId
        for (int i = 0; i < count - 1; i++) {
            for (int j = i + 1; j < count; j++) {
                if (temp[i].getPlayerId() < temp[j].getPlayerId()) {
                    Player t = temp[i];
                    temp[i] = temp[j];
                    temp[j] = t;
                }
            }
        }

        Player[] result = new Player[count];
        for (int i = 0; i < count; i++) {
            result[i] = temp[i];
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Player[] players = new Player[4];

        for (int i = 0; i < 4; i++) {
            int id = Integer.parseInt(sc.nextLine());
            String name = sc.nextLine();
            int runs = Integer.parseInt(sc.nextLine());
            String type = sc.nextLine();
            String match = sc.nextLine();

            players[i] = new Player(id, name, runs, type, match);
        }

        String playerType = sc.nextLine();
        String matchType = sc.nextLine();

        int ans = findPlayerWithLowestRuns(players, playerType);

        if (ans > 0) {
            System.out.println(ans);
        } else {
            System.out.println("No such player");
        }

        Player[] res = findPlayerByMatchType(players, matchType);

        if (res == null) {
            System.out.println("No Player with given matchType");
        } else {
            for (Player p : res) {
                System.out.println(p.getPlayerId());
            }
        }
        sc.close();
    }
}