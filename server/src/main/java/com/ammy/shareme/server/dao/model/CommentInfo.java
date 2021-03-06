package com.ammy.shareme.server.dao.model;

import java.io.Serializable;
import java.util.Date;

public class CommentInfo implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comment_info.comment_id
     *
     * @mbggenerated Sat Jul 06 22:29:42 CST 2019
     */
    private Integer commentId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comment_info.moment_id
     *
     * @mbggenerated Sat Jul 06 22:29:42 CST 2019
     */
    private Integer momentId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comment_info.owner_id
     *
     * @mbggenerated Sat Jul 06 22:29:42 CST 2019
     */
    private Integer ownerId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comment_info.user_id
     *
     * @mbggenerated Sat Jul 06 22:29:42 CST 2019
     */
    private Integer userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comment_info.comments
     *
     * @mbggenerated Sat Jul 06 22:29:42 CST 2019
     */
    private Integer comments;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comment_info.create_time
     *
     * @mbggenerated Sat Jul 06 22:29:42 CST 2019
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comment_info.modify_time
     *
     * @mbggenerated Sat Jul 06 22:29:42 CST 2019
     */
    private Date modifyTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comment_info.delete_flag
     *
     * @mbggenerated Sat Jul 06 22:29:42 CST 2019
     */
    private Integer deleteFlag;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table comment_info
     *
     * @mbggenerated Sat Jul 06 22:29:42 CST 2019
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comment_info.comment_id
     *
     * @return the value of comment_info.comment_id
     *
     * @mbggenerated Sat Jul 06 22:29:42 CST 2019
     */
    public Integer getCommentId() {
        return commentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comment_info.comment_id
     *
     * @param commentId the value for comment_info.comment_id
     *
     * @mbggenerated Sat Jul 06 22:29:42 CST 2019
     */
    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comment_info.moment_id
     *
     * @return the value of comment_info.moment_id
     *
     * @mbggenerated Sat Jul 06 22:29:42 CST 2019
     */
    public Integer getMomentId() {
        return momentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comment_info.moment_id
     *
     * @param momentId the value for comment_info.moment_id
     *
     * @mbggenerated Sat Jul 06 22:29:42 CST 2019
     */
    public void setMomentId(Integer momentId) {
        this.momentId = momentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comment_info.owner_id
     *
     * @return the value of comment_info.owner_id
     *
     * @mbggenerated Sat Jul 06 22:29:42 CST 2019
     */
    public Integer getOwnerId() {
        return ownerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comment_info.owner_id
     *
     * @param ownerId the value for comment_info.owner_id
     *
     * @mbggenerated Sat Jul 06 22:29:42 CST 2019
     */
    public void setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comment_info.user_id
     *
     * @return the value of comment_info.user_id
     *
     * @mbggenerated Sat Jul 06 22:29:42 CST 2019
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comment_info.user_id
     *
     * @param userId the value for comment_info.user_id
     *
     * @mbggenerated Sat Jul 06 22:29:42 CST 2019
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comment_info.comments
     *
     * @return the value of comment_info.comments
     *
     * @mbggenerated Sat Jul 06 22:29:42 CST 2019
     */
    public Integer getComments() {
        return comments;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comment_info.comments
     *
     * @param comments the value for comment_info.comments
     *
     * @mbggenerated Sat Jul 06 22:29:42 CST 2019
     */
    public void setComments(Integer comments) {
        this.comments = comments;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comment_info.create_time
     *
     * @return the value of comment_info.create_time
     *
     * @mbggenerated Sat Jul 06 22:29:42 CST 2019
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comment_info.create_time
     *
     * @param createTime the value for comment_info.create_time
     *
     * @mbggenerated Sat Jul 06 22:29:42 CST 2019
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comment_info.modify_time
     *
     * @return the value of comment_info.modify_time
     *
     * @mbggenerated Sat Jul 06 22:29:42 CST 2019
     */
    public Date getModifyTime() {
        return modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comment_info.modify_time
     *
     * @param modifyTime the value for comment_info.modify_time
     *
     * @mbggenerated Sat Jul 06 22:29:42 CST 2019
     */
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comment_info.delete_flag
     *
     * @return the value of comment_info.delete_flag
     *
     * @mbggenerated Sat Jul 06 22:29:42 CST 2019
     */
    public Integer getDeleteFlag() {
        return deleteFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comment_info.delete_flag
     *
     * @param deleteFlag the value for comment_info.delete_flag
     *
     * @mbggenerated Sat Jul 06 22:29:42 CST 2019
     */
    public void setDeleteFlag(Integer deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comment_info
     *
     * @mbggenerated Sat Jul 06 22:29:42 CST 2019
     */
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
        CommentInfo other = (CommentInfo) that;
        return (this.getCommentId() == null ? other.getCommentId() == null : this.getCommentId().equals(other.getCommentId()))
            && (this.getMomentId() == null ? other.getMomentId() == null : this.getMomentId().equals(other.getMomentId()))
            && (this.getOwnerId() == null ? other.getOwnerId() == null : this.getOwnerId().equals(other.getOwnerId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getComments() == null ? other.getComments() == null : this.getComments().equals(other.getComments()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getModifyTime() == null ? other.getModifyTime() == null : this.getModifyTime().equals(other.getModifyTime()))
            && (this.getDeleteFlag() == null ? other.getDeleteFlag() == null : this.getDeleteFlag().equals(other.getDeleteFlag()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comment_info
     *
     * @mbggenerated Sat Jul 06 22:29:42 CST 2019
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCommentId() == null) ? 0 : getCommentId().hashCode());
        result = prime * result + ((getMomentId() == null) ? 0 : getMomentId().hashCode());
        result = prime * result + ((getOwnerId() == null) ? 0 : getOwnerId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getComments() == null) ? 0 : getComments().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getModifyTime() == null) ? 0 : getModifyTime().hashCode());
        result = prime * result + ((getDeleteFlag() == null) ? 0 : getDeleteFlag().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comment_info
     *
     * @mbggenerated Sat Jul 06 22:29:42 CST 2019
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", commentId=").append(commentId);
        sb.append(", momentId=").append(momentId);
        sb.append(", ownerId=").append(ownerId);
        sb.append(", userId=").append(userId);
        sb.append(", comments=").append(comments);
        sb.append(", createTime=").append(createTime);
        sb.append(", modifyTime=").append(modifyTime);
        sb.append(", deleteFlag=").append(deleteFlag);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}