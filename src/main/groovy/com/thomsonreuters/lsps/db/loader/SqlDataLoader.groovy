package com.thomsonreuters.lsps.db.loader

import com.thomsonreuters.lsps.db.sql.SqlMethods
import groovy.sql.Sql
/**
 * Created by bondarev on 4/21/14.
 */
class SqlDataLoader extends DataLoader {
    Sql sql

    long withBatch(Closure block) {
        SqlMethods.insertRecords(sql, tableName, columnNames, block)
    }
}
