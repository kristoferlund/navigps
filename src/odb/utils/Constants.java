/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package odb.utils;

import org.neodatis.odb.ODB;

/**
 *
 * @author praise
 */
public class Constants {

    private static ODB dbConnection;

    /**
     * @return the dbConnection
     */
    public static ODB getDbConnection() {
        return dbConnection;
    }

    /**
     * @param aDbConnection the dbConnection to set
     */
    public static void setDbConnection(ODB aDbConnection) {
        dbConnection = aDbConnection;
    }

}
