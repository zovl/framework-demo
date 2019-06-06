package a.b.c.model;

import java.util.Date;
import javax.persistence.*;

public class Event {
    @Id
    private String db;

    @Id
    private String name;

    private String definer;

    @Column(name = "execute_at")
    private Date executeAt;

    @Column(name = "interval_value")
    private Integer intervalValue;

    @Column(name = "interval_field")
    private String intervalField;

    private Date created;

    private Date modified;

    @Column(name = "last_executed")
    private Date lastExecuted;

    private Date starts;

    private Date ends;

    private String status;

    @Column(name = "on_completion")
    private String onCompletion;

    @Column(name = "sql_mode")
    private String sqlMode;

    private String comment;

    private Integer originator;

    @Column(name = "time_zone")
    private String timeZone;

    @Column(name = "character_set_client")
    private String characterSetClient;

    @Column(name = "collation_connection")
    private String collationConnection;

    @Column(name = "db_collation")
    private String dbCollation;

    private byte[] body;

    @Column(name = "body_utf8")
    private byte[] bodyUtf8;

    /**
     * @return db
     */
    public String getDb() {
        return db;
    }

    /**
     * @param db
     */
    public void setDb(String db) {
        this.db = db;
    }

    /**
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return definer
     */
    public String getDefiner() {
        return definer;
    }

    /**
     * @param definer
     */
    public void setDefiner(String definer) {
        this.definer = definer;
    }

    /**
     * @return execute_at
     */
    public Date getExecuteAt() {
        return executeAt;
    }

    /**
     * @param executeAt
     */
    public void setExecuteAt(Date executeAt) {
        this.executeAt = executeAt;
    }

    /**
     * @return interval_value
     */
    public Integer getIntervalValue() {
        return intervalValue;
    }

    /**
     * @param intervalValue
     */
    public void setIntervalValue(Integer intervalValue) {
        this.intervalValue = intervalValue;
    }

    /**
     * @return interval_field
     */
    public String getIntervalField() {
        return intervalField;
    }

    /**
     * @param intervalField
     */
    public void setIntervalField(String intervalField) {
        this.intervalField = intervalField;
    }

    /**
     * @return created
     */
    public Date getCreated() {
        return created;
    }

    /**
     * @param created
     */
    public void setCreated(Date created) {
        this.created = created;
    }

    /**
     * @return modified
     */
    public Date getModified() {
        return modified;
    }

    /**
     * @param modified
     */
    public void setModified(Date modified) {
        this.modified = modified;
    }

    /**
     * @return last_executed
     */
    public Date getLastExecuted() {
        return lastExecuted;
    }

    /**
     * @param lastExecuted
     */
    public void setLastExecuted(Date lastExecuted) {
        this.lastExecuted = lastExecuted;
    }

    /**
     * @return starts
     */
    public Date getStarts() {
        return starts;
    }

    /**
     * @param starts
     */
    public void setStarts(Date starts) {
        this.starts = starts;
    }

    /**
     * @return ends
     */
    public Date getEnds() {
        return ends;
    }

    /**
     * @param ends
     */
    public void setEnds(Date ends) {
        this.ends = ends;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return on_completion
     */
    public String getOnCompletion() {
        return onCompletion;
    }

    /**
     * @param onCompletion
     */
    public void setOnCompletion(String onCompletion) {
        this.onCompletion = onCompletion;
    }

    /**
     * @return sql_mode
     */
    public String getSqlMode() {
        return sqlMode;
    }

    /**
     * @param sqlMode
     */
    public void setSqlMode(String sqlMode) {
        this.sqlMode = sqlMode;
    }

    /**
     * @return comment
     */
    public String getComment() {
        return comment;
    }

    /**
     * @param comment
     */
    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     * @return originator
     */
    public Integer getOriginator() {
        return originator;
    }

    /**
     * @param originator
     */
    public void setOriginator(Integer originator) {
        this.originator = originator;
    }

    /**
     * @return time_zone
     */
    public String getTimeZone() {
        return timeZone;
    }

    /**
     * @param timeZone
     */
    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    /**
     * @return character_set_client
     */
    public String getCharacterSetClient() {
        return characterSetClient;
    }

    /**
     * @param characterSetClient
     */
    public void setCharacterSetClient(String characterSetClient) {
        this.characterSetClient = characterSetClient;
    }

    /**
     * @return collation_connection
     */
    public String getCollationConnection() {
        return collationConnection;
    }

    /**
     * @param collationConnection
     */
    public void setCollationConnection(String collationConnection) {
        this.collationConnection = collationConnection;
    }

    /**
     * @return db_collation
     */
    public String getDbCollation() {
        return dbCollation;
    }

    /**
     * @param dbCollation
     */
    public void setDbCollation(String dbCollation) {
        this.dbCollation = dbCollation;
    }

    /**
     * @return body
     */
    public byte[] getBody() {
        return body;
    }

    /**
     * @param body
     */
    public void setBody(byte[] body) {
        this.body = body;
    }

    /**
     * @return body_utf8
     */
    public byte[] getBodyUtf8() {
        return bodyUtf8;
    }

    /**
     * @param bodyUtf8
     */
    public void setBodyUtf8(byte[] bodyUtf8) {
        this.bodyUtf8 = bodyUtf8;
    }
}