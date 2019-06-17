package a.b.c.model;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "column_stats")
public class ColumnStats {
    @Id
    @Column(name = "db_name")
    private String dbName;

    @Id
    @Column(name = "table_name")
    private String tableName;

    @Id
    @Column(name = "column_name")
    private String columnName;

    @Column(name = "nulls_ratio")
    private BigDecimal nullsRatio;

    @Column(name = "avg_length")
    private BigDecimal avgLength;

    @Column(name = "avg_frequency")
    private BigDecimal avgFrequency;

    @Column(name = "hist_size")
    private Byte histSize;

    @Column(name = "hist_type")
    private String histType;

    @Column(name = "min_value")
    private byte[] minValue;

    @Column(name = "max_value")
    private byte[] maxValue;

    private byte[] histogram;

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
     * @return column_name
     */
    public String getColumnName() {
        return columnName;
    }

    /**
     * @param columnName
     */
    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    /**
     * @return nulls_ratio
     */
    public BigDecimal getNullsRatio() {
        return nullsRatio;
    }

    /**
     * @param nullsRatio
     */
    public void setNullsRatio(BigDecimal nullsRatio) {
        this.nullsRatio = nullsRatio;
    }

    /**
     * @return avg_length
     */
    public BigDecimal getAvgLength() {
        return avgLength;
    }

    /**
     * @param avgLength
     */
    public void setAvgLength(BigDecimal avgLength) {
        this.avgLength = avgLength;
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

    /**
     * @return hist_size
     */
    public Byte getHistSize() {
        return histSize;
    }

    /**
     * @param histSize
     */
    public void setHistSize(Byte histSize) {
        this.histSize = histSize;
    }

    /**
     * @return hist_type
     */
    public String getHistType() {
        return histType;
    }

    /**
     * @param histType
     */
    public void setHistType(String histType) {
        this.histType = histType;
    }

    /**
     * @return min_value
     */
    public byte[] getMinValue() {
        return minValue;
    }

    /**
     * @param minValue
     */
    public void setMinValue(byte[] minValue) {
        this.minValue = minValue;
    }

    /**
     * @return max_value
     */
    public byte[] getMaxValue() {
        return maxValue;
    }

    /**
     * @param maxValue
     */
    public void setMaxValue(byte[] maxValue) {
        this.maxValue = maxValue;
    }

    /**
     * @return histogram
     */
    public byte[] getHistogram() {
        return histogram;
    }

    /**
     * @param histogram
     */
    public void setHistogram(byte[] histogram) {
        this.histogram = histogram;
    }
}