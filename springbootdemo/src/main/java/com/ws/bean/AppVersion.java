package com.ws.bean;

import lombok.Data;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Data
@Table(name="app_info")
public class AppVersion {
    //主键  自增长
    @Id
    @KeySql(useGeneratedKeys = true)
    private int id;
    private String app_name;
    private String app_img;
    private String app_download_path;
    private int app_is_beta;
    private int app_isPorT;
    //private String app_uploadTime;
    private String app_version_code;
    //不作为数据库字段  @Transient
    private String app_version_name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getApp_name() {
        return app_name;
    }

    public void setApp_name(String app_name) {
        this.app_name = app_name;
    }

    public String getApp_img() {
        return app_img;
    }

    public void setApp_img(String app_img) {
        this.app_img = app_img;
    }

    public String getApp_download_path() {
        return app_download_path;
    }

    public void setApp_download_path(String app_download_path) {
        this.app_download_path = app_download_path;
    }

    public int getApp_is_beta() {
        return app_is_beta;
    }

    public void setApp_is_beta(int app_is_beta) {
        this.app_is_beta = app_is_beta;
    }

    public int getApp_isPorT() {
        return app_isPorT;
    }

    public void setApp_isPorT(int app_isPorT) {
        this.app_isPorT = app_isPorT;
    }

    public String getApp_version_code() {
        return app_version_code;
    }

    public void setApp_version_code(String app_version_code) {
        this.app_version_code = app_version_code;
    }

    public String getApp_version_name() {
        return app_version_name;
    }

    public void setApp_version_name(String app_version_name) {
        this.app_version_name = app_version_name;
    }
}
