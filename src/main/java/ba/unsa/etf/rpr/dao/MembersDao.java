package ba.unsa.etf.rpr.dao;

import ba.unsa.etf.rpr.domain.Members;

import java.sql.SQLException;

public interface MembersDao extends Dao<Members> {
    Members get(int id) throws SQLException;
}
