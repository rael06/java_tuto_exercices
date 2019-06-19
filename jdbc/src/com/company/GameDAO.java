package com.company;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class GameDAO {
    private Connection conn;

    public GameDAO (Connection conn) {
        this.conn = conn;
    }

    public List getGameByTitle (String title) {
        List<Game> games = new ArrayList<>();

        try {
            String query = "SELECT id, Title FROM videogames where Title LIKE '%" + title + "%'";
            ResultSet result = conn.createStatement().executeQuery(query);
            while (result.next()) {
                games.add(new Game(result.getInt("id"), result.getString("Title")));
            }
        }
        catch (SQLException e) {
            e.printStackTrace();
        }

        return games;
    }
}
