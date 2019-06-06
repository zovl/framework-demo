package a.b.c.model;

import java.util.Date;
import javax.persistence.*;

public class Proc {
    @Id
    private String db;

    @Id
    private String name;

    @Id
    private String type;

    @Column(name = "specific_name")
    private String specificName;

    private String language;

    @Column(name = "sql_data_access")
    private String sqlDataAccess;

    @Column(name = "is_deterministic")
    private String isDeterministic;

    @Column(name = "security_type")
    private String securityType;

    private String definer;

    private Date created;

    private Date modified;

    @Column(name = "sql_mode")
    private String sqlMode;

    @Column(name = "character_set_client")
    private String characterSetClient;

    @Column(name = "collation_connection")
    private String collationConnection;

    @Column(name = "db_collation")
    private String dbCollation;

    @Column(name = "param_list")
    private byte[] paramList;

    private byte[] returns;

    private byte[] body;

    private String comment;

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
     * @return type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return specific_name
     */
    public String getSpecificName() {
        return specificName;
    }

    /**
     * @param specificName
     */
    public void setSpecificName(String specificName) {
        this.specificName = specificName;
    }

    /**
     * @return language
     */
    public String getLanguage() {
        return language;
    }

    /**
     * @param language
     */
    public void setLanguage(String language) {
        this.language = language;
    }

    /**
     * @return sql_data_access
     */
    public String getSqlDataAccess() {
        return sqlDataAccess;
    }

    /**
     * @param sqlDataAccess
     */
    public void setSqlDataAccess(String sqlDataAccess) {
        this.sqlDataAccess = sqlDataAccess;
    }

    /**
     * @return is_deterministic
     */
    public String getIsDeterministic() {
        return isDeterministic;
    }

    /**
     * @param isDeterministic
     */
    public void setIsDeterministic(String isDeterministic) {
        this.isDeterministic = isDeterministic;
    }

    /**
     * @return security_type
     */
    public String getSecurityType() {
        return securityType;
    }

    /**
     * @param securityType
     */
    public void setSecurityType(String securityType) {
        this.securityType = securityType;
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
     * @return param_list
     */
    public byte[] getParamList() {
        return paramList;
    }

    /**
     * @param paramList
     */
    public void setParamList(byte[] paramList) {
        this.paramList = paramList;
    }

    /**
     * @return returns
     */
    public byte[] getReturns() {
        return returns;
    }

    /**
     * @param returns
     */
    public void setReturns(byte[] returns) {
        this.returns = returns;
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