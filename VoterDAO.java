import java.sql.*;

public class VoterDAO {
    public boolean registerVoter(Voter voter) {
        String sql = "INSERT INTO voter(name, email, password) VALUES (?, ?, ?)";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, voter.getName());
            stmt.setString(2, voter.getEmail());
            stmt.setString(3, voter.getPassword());
            return stmt.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
