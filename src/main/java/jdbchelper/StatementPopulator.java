package jdbchelper;

import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Author: Erdinc YILMAZEL
 * Date: Dec 30, 2008
 * Time: 4:44:02 PM
 */
public interface StatementPopulator {
   public void populateStatement(PreparedStatement stmt) throws SQLException;
}
