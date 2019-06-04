package a.b.c.mybatisgeneratordemo.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "app_attachment")
public class AppAttachment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long version;

    /**
     * 文件类型
     */
    @Column(name = "content_type")
    private String contentType;

    /**
     * 文件路径
     */
    @Column(name = "file_path")
    private String filePath;

    /**
     * 文件名字
     */
    @Column(name = "file_name")
    private String fileName;

    /**
     * 文件尺寸
     */
    @Column(name = "file_size")
    private Long fileSize;

    /**
     * 是否为图片
     */
    @Column(name = "is_image")
    private Boolean isImage;

    /**
     * 小图路径
     */
    @Column(name = "small_image_path")
    private String smallImagePath;

    /**
     * 小图宽度
     */
    @Column(name = "small_image_width")
    private Long smallImageWidth;

    /**
     * 小图高度
     */
    @Column(name = "small_image_height")
    private Long smallImageHeight;

    /**
     * 中图路径
     */
    @Column(name = "medium_image_path")
    private String mediumImagePath;

    /**
     * 中图宽度
     */
    @Column(name = "medium_image_width")
    private Long mediumImageWidth;

    /**
     * 中图高度
     */
    @Column(name = "medium_image_height")
    private Long mediumImageHeight;

    /**
     * 大图路径
     */
    @Column(name = "large_image_path")
    private String largeImagePath;

    /**
     * 大图宽度
     */
    @Column(name = "large_image_width")
    private Long largeImageWidth;

    /**
     * 大图高度
     */
    @Column(name = "large_image_height")
    private Long largeImageHeight;

    /**
     * 原图宽度
     */
    @Column(name = "image_width")
    private Long imageWidth;

    /**
     * 原图高度
     */
    @Column(name = "image_height")
    private Long imageHeight;

    @Column(name = "created_date")
    private Date createdDate;

    @Column(name = "last_modified_date")
    private Date lastModifiedDate;

    @Column(name = "is_del")
    private Boolean isDel;

    /**
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return version
     */
    public Long getVersion() {
        return version;
    }

    /**
     * @param version
     */
    public void setVersion(Long version) {
        this.version = version;
    }

    /**
     * 获取文件类型
     *
     * @return content_type - 文件类型
     */
    public String getContentType() {
        return contentType;
    }

    /**
     * 设置文件类型
     *
     * @param contentType 文件类型
     */
    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    /**
     * 获取文件路径
     *
     * @return file_path - 文件路径
     */
    public String getFilePath() {
        return filePath;
    }

    /**
     * 设置文件路径
     *
     * @param filePath 文件路径
     */
    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    /**
     * 获取文件名字
     *
     * @return file_name - 文件名字
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * 设置文件名字
     *
     * @param fileName 文件名字
     */
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    /**
     * 获取文件尺寸
     *
     * @return file_size - 文件尺寸
     */
    public Long getFileSize() {
        return fileSize;
    }

    /**
     * 设置文件尺寸
     *
     * @param fileSize 文件尺寸
     */
    public void setFileSize(Long fileSize) {
        this.fileSize = fileSize;
    }

    /**
     * 获取是否为图片
     *
     * @return is_image - 是否为图片
     */
    public Boolean getIsImage() {
        return isImage;
    }

    /**
     * 设置是否为图片
     *
     * @param isImage 是否为图片
     */
    public void setIsImage(Boolean isImage) {
        this.isImage = isImage;
    }

    /**
     * 获取小图路径
     *
     * @return small_image_path - 小图路径
     */
    public String getSmallImagePath() {
        return smallImagePath;
    }

    /**
     * 设置小图路径
     *
     * @param smallImagePath 小图路径
     */
    public void setSmallImagePath(String smallImagePath) {
        this.smallImagePath = smallImagePath;
    }

    /**
     * 获取小图宽度
     *
     * @return small_image_width - 小图宽度
     */
    public Long getSmallImageWidth() {
        return smallImageWidth;
    }

    /**
     * 设置小图宽度
     *
     * @param smallImageWidth 小图宽度
     */
    public void setSmallImageWidth(Long smallImageWidth) {
        this.smallImageWidth = smallImageWidth;
    }

    /**
     * 获取小图高度
     *
     * @return small_image_height - 小图高度
     */
    public Long getSmallImageHeight() {
        return smallImageHeight;
    }

    /**
     * 设置小图高度
     *
     * @param smallImageHeight 小图高度
     */
    public void setSmallImageHeight(Long smallImageHeight) {
        this.smallImageHeight = smallImageHeight;
    }

    /**
     * 获取中图路径
     *
     * @return medium_image_path - 中图路径
     */
    public String getMediumImagePath() {
        return mediumImagePath;
    }

    /**
     * 设置中图路径
     *
     * @param mediumImagePath 中图路径
     */
    public void setMediumImagePath(String mediumImagePath) {
        this.mediumImagePath = mediumImagePath;
    }

    /**
     * 获取中图宽度
     *
     * @return medium_image_width - 中图宽度
     */
    public Long getMediumImageWidth() {
        return mediumImageWidth;
    }

    /**
     * 设置中图宽度
     *
     * @param mediumImageWidth 中图宽度
     */
    public void setMediumImageWidth(Long mediumImageWidth) {
        this.mediumImageWidth = mediumImageWidth;
    }

    /**
     * 获取中图高度
     *
     * @return medium_image_height - 中图高度
     */
    public Long getMediumImageHeight() {
        return mediumImageHeight;
    }

    /**
     * 设置中图高度
     *
     * @param mediumImageHeight 中图高度
     */
    public void setMediumImageHeight(Long mediumImageHeight) {
        this.mediumImageHeight = mediumImageHeight;
    }

    /**
     * 获取大图路径
     *
     * @return large_image_path - 大图路径
     */
    public String getLargeImagePath() {
        return largeImagePath;
    }

    /**
     * 设置大图路径
     *
     * @param largeImagePath 大图路径
     */
    public void setLargeImagePath(String largeImagePath) {
        this.largeImagePath = largeImagePath;
    }

    /**
     * 获取大图宽度
     *
     * @return large_image_width - 大图宽度
     */
    public Long getLargeImageWidth() {
        return largeImageWidth;
    }

    /**
     * 设置大图宽度
     *
     * @param largeImageWidth 大图宽度
     */
    public void setLargeImageWidth(Long largeImageWidth) {
        this.largeImageWidth = largeImageWidth;
    }

    /**
     * 获取大图高度
     *
     * @return large_image_height - 大图高度
     */
    public Long getLargeImageHeight() {
        return largeImageHeight;
    }

    /**
     * 设置大图高度
     *
     * @param largeImageHeight 大图高度
     */
    public void setLargeImageHeight(Long largeImageHeight) {
        this.largeImageHeight = largeImageHeight;
    }

    /**
     * 获取原图宽度
     *
     * @return image_width - 原图宽度
     */
    public Long getImageWidth() {
        return imageWidth;
    }

    /**
     * 设置原图宽度
     *
     * @param imageWidth 原图宽度
     */
    public void setImageWidth(Long imageWidth) {
        this.imageWidth = imageWidth;
    }

    /**
     * 获取原图高度
     *
     * @return image_height - 原图高度
     */
    public Long getImageHeight() {
        return imageHeight;
    }

    /**
     * 设置原图高度
     *
     * @param imageHeight 原图高度
     */
    public void setImageHeight(Long imageHeight) {
        this.imageHeight = imageHeight;
    }

    /**
     * @return created_date
     */
    public Date getCreatedDate() {
        return createdDate;
    }

    /**
     * @param createdDate
     */
    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    /**
     * @return last_modified_date
     */
    public Date getLastModifiedDate() {
        return lastModifiedDate;
    }

    /**
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    /**
     * @return is_del
     */
    public Boolean getIsDel() {
        return isDel;
    }

    /**
     * @param isDel
     */
    public void setIsDel(Boolean isDel) {
        this.isDel = isDel;
    }
}