package a.b.c.model;

import javax.persistence.*;

@Table(name = "table_stats")
public class TableStats {
    @Id
    @Column(name = "db_name")
    private String dbName;

    @Id
    @Column(name = "table_name")
    private String tableName;

    private Long cardinality;

    /**
     * @return db_name
     */
    public String getDbName() {
        return dbName;
    }

    /**
     * @param dbName
     */
    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    /**
     * @return table_name
     */
    public String getTableName() {
        return tableName;
    }

    /**
     * @param tableName
     */
    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    /**
     * @return cardinality
     */
    public Long getCardinality() {
        return cardinality;
    }

    /**
     * @param cardinality
     */
    public void setCardinality(Long cardinality) {
        this.cardinality = cardinality;
    }
}