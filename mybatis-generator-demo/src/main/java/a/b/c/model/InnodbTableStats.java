package a.b.c.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "innodb_table_stats")
public class InnodbTableStats {
    @Id
    @Column(name = "database_name")
    private String databaseName;

    @Id
    @Column(name = "table_name")
    private String tableName;

    @Column(name = "last_update")
    private Date lastUpdate;

    @Column(name = "n_rows")
    private Long nRows;

    @Column(name = "clustered_index_size")
    private Long clusteredIndexSize;

    @Column(name = "sum_of_other_index_sizes")
    private Long sumOfOtherIndexSizes;

    /**
     * @return database_name
     */
    public String getDatabaseName() {
        return databaseName;
    }

    /**
     * @param databaseName
     */
    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
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
     * @return last_update
     */
    public Date getLastUpdate() {
        return lastUpdate;
    }

    /**
     * @param lastUpdate
     */
    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    /**
     * @return n_rows
     */
    public Long getnRows() {
        return nRows;
    }

    /**
     * @param nRows
     */
    public void setnRows(Long nRows) {
        this.nRows = nRows;
    }

    /**
     * @return clustered_index_size
     */
    public Long getClusteredIndexSize() {
        return clusteredIndexSize;
    }

    /**
     * @param clusteredIndexSize
     */
    public void setClusteredIndexSize(Long clusteredIndexSize) {
        this.clusteredIndexSize = clusteredIndexSize;
    }

    /**
     * @return sum_of_other_index_sizes
     */
    public Long getSumOfOtherIndexSizes() {
        return sumOfOtherIndexSizes;
    }

    /**
     * @param sumOfOtherIndexSizes
     */
    public void setSumOfOtherIndexSizes(Long sumOfOtherIndexSizes) {
        this.sumOfOtherIndexSizes = sumOfOtherIndexSizes;
    }
}