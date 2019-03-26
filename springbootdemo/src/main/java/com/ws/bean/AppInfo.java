package com.ws.bean;

import javax.persistence.*;

@Table(name = "app_info")
public class AppInfo {
    @Id
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    @Column(name = "app_name")
    private String appName;

    @Column(name = "app_img")
    private String appImg;

    @Column(name = "app_download_path")
    private String appDownloadPath;

    @Column(name = "app_is_beta")
    private Integer appIsBeta;

    @Column(name = "app_isPorT")
    private Integer appIsport;

    @Column(name = "app_uploadTime")
    private String appUploadtime;

    @Column(name = "app_version_code")
    private String appVersionCode;

    @Column(name = "app_version_name")
    private String appVersionName;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return app_name
     */
    public String getAppName() {
        return appName;
    }

    /**
     * @param appName
     */
    public void setAppName(String appName) {
        this.appName = appName;
    }

    /**
     * @return app_img
     */
    public String getAppImg() {
        return appImg;
    }

    /**
     * @param appImg
     */
    public void setAppImg(String appImg) {
        this.appImg = appImg;
    }

    /**
     * @return app_download_path
     */
    public String getAppDownloadPath() {
        return appDownloadPath;
    }

    /**
     * @param appDownloadPath
     */
    public void setAppDownloadPath(String appDownloadPath) {
        this.appDownloadPath = appDownloadPath;
    }

    /**
     * @return app_is_beta
     */
    public Integer getAppIsBeta() {
        return appIsBeta;
    }

    /**
     * @param appIsBeta
     */
    public void setAppIsBeta(Integer appIsBeta) {
        this.appIsBeta = appIsBeta;
    }

    /**
     * @return app_isPorT
     */
    public Integer getAppIsport() {
        return appIsport;
    }

    /**
     * @param appIsport
     */
    public void setAppIsport(Integer appIsport) {
        this.appIsport = appIsport;
    }

    /**
     * @return app_uploadTime
     */
    public String getAppUploadtime() {
        return appUploadtime;
    }

    /**
     * @param appUploadtime
     */
    public void setAppUploadtime(String appUploadtime) {
        this.appUploadtime = appUploadtime;
    }

    /**
     * @return app_version_code
     */
    public String getAppVersionCode() {
        return appVersionCode;
    }

    /**
     * @param appVersionCode
     */
    public void setAppVersionCode(String appVersionCode) {
        this.appVersionCode = appVersionCode;
    }

    /**
     * @return app_version_name
     */
    public String getAppVersionName() {
        return appVersionName;
    }

    /**
     * @param appVersionName
     */
    public void setAppVersionName(String appVersionName) {
        this.appVersionName = appVersionName;
    }
}