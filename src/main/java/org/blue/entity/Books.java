package org.blue.entity;

import java.io.Serializable;

/**
 * 
 * @TableName books
 */
public class Books implements Serializable {
    /**
     * 书id
     */
    private Integer bookId;

    /**
     * 书名
     */
    private String bookName;

    /**
     * 数量
     */
    private Integer bookCounts;

    /**
     * 描述
     */
    private String detail;

    private static final long serialVersionUID = 1L;

    /**
     * 书id
     */
    public Integer getBookId() {
        return bookId;
    }

    /**
     * 书id
     */
    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    /**
     * 书名
     */
    public String getBookName() {
        return bookName;
    }

    /**
     * 书名
     */
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    /**
     * 数量
     */
    public Integer getBookCounts() {
        return bookCounts;
    }

    /**
     * 数量
     */
    public void setBookCounts(Integer bookCounts) {
        this.bookCounts = bookCounts;
    }

    /**
     * 描述
     */
    public String getDetail() {
        return detail;
    }

    /**
     * 描述
     */
    public void setDetail(String detail) {
        this.detail = detail;
    }

    public Books() {
    }

    public Books(Integer bookId, String bookName, Integer bookCounts, String detail) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.bookCounts = bookCounts;
        this.detail = detail;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Books other = (Books) that;
        return (this.getBookId() == null ? other.getBookId() == null : this.getBookId().equals(other.getBookId()))
            && (this.getBookName() == null ? other.getBookName() == null : this.getBookName().equals(other.getBookName()))
            && (this.getBookCounts() == null ? other.getBookCounts() == null : this.getBookCounts().equals(other.getBookCounts()))
            && (this.getDetail() == null ? other.getDetail() == null : this.getDetail().equals(other.getDetail()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getBookId() == null) ? 0 : getBookId().hashCode());
        result = prime * result + ((getBookName() == null) ? 0 : getBookName().hashCode());
        result = prime * result + ((getBookCounts() == null) ? 0 : getBookCounts().hashCode());
        result = prime * result + ((getDetail() == null) ? 0 : getDetail().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", bookId=").append(bookId);
        sb.append(", bookName=").append(bookName);
        sb.append(", bookCounts=").append(bookCounts);
        sb.append(", detail=").append(detail);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}