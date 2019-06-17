package a.b.c.model;

import javax.persistence.*;

@Table(name = "gtid_slave_pos")
public class GtidSlavePos {
    @Id
    @Column(name = "domain_id")
    private Integer domainId;

    @Id
    @Column(name = "sub_id")
    private Long subId;

    @Column(name = "server_id")
    private Integer serverId;

    @Column(name = "seq_no")
    private Long seqNo;

    /**
     * @return domain_id
     */
    public Integer getDomainId() {
        return domainId;
    }

    /**
     * @param domainId
     */
    public void setDomainId(Integer domainId) {
        this.domainId = domainId;
    }

    /**
     * @return sub_id
     */
    public Long getSubId() {
        return subId;
    }

    /**
     * @param subId
     */
    public void setSubId(Long subId) {
        this.subId = subId;
    }

    /**
     * @return server_id
     */
    public Integer getServerId() {
        return serverId;
    }

    /**
     * @param serverId
     */
    public void setServerId(Integer serverId) {
        this.serverId = serverId;
    }

    /**
     * @return seq_no
     */
    public Long getSeqNo() {
        return seqNo;
    }

    /**
     * @param seqNo
     */
    public void setSeqNo(Long seqNo) {
        this.seqNo = seqNo;
    }
}