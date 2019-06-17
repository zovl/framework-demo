package a.b.c.model;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "index_stats")
public class IndexStats {
    @Id
    @Column(name = "db_name")
    private String dbName;

    @Id
    @Column(name = "table_name")
    private String tableName;

    @Id
    @Column(name = "index_name")
    private String indexName;

    @Id
    @Column(name = "prefix_arity")
    private Integer prefixArity;

    @Column(name = "avg_frequency")
    private BigDecimal avgFrequency;

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
     * @return index_name
     */
    public String getIndexName() {
        return indexName;
    }

    /**
     * @param indexName
     */
    public void setIndexName(String indexName) {
        this.indexName = indexName;
    }

    /**
     * @return prefix_arity
     */
    public Integer getPrefixArity() {
        return prefixArity;
    }

    /**
     * @param prefixArity
     */
    public void setPrefixArity(Integer prefixArity) {
        this.prefixArity = prefixArity;
    }

    /**
     * @return avg_frequency
     */
    public BigDecimal getAvgFrequency() {
        return avgFrequency;
    }

    /**
     * @param avgFrequency
     */
    public void setAvgFrequency(BigDecimal avgFrequency) {
        this.avgFrequency = avgFrequency;
    }
}