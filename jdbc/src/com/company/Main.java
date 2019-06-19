package com.company;

import java.sql.*;
import java.util.List;
import static com.company.Constants.SCAN;

public class Main {

    public static void main(String[] args) {

            Connection conn = Database.getInstance();

            GameDAO gameDAO = new GameDAO(conn);

            System.out.print("Quel est votre recherche ? ");
            String searched = SCAN.nextLine();

            List games = gameDAO.getGameByTitle(searched);

            for (int i = 0; i < games.size(); i++) {
                Game game = (Game) games.get(i);
                System.out.println(game.getId() + " : " + game.getTitle());
            }

    }
}
