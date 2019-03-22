package com.ws.domain;

public class AppVersion {
    int id;
    String app_name;
    String app_img;
    String app_download;
    int app_is_beta;
    int app_isPort;
    String app_uploadTime;
    String app_version_code;
    String app_version_name;

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

    public String getApp_download() {
        return app_download;
    }

    public void setApp_download(String app_download) {
        this.app_download = app_download;
    }

    public int getApp_is_beta() {
        return app_is_beta;
    }

    public void setApp_is_beta(int app_is_beta) {
        this.app_is_beta = app_is_beta;
    }

    public int getApp_isPort() {
        return app_isPort;
    }

    public void setApp_isPort(int app_isPort) {
        this.app_isPort = app_isPort;
    }

    public String getApp_uploadTime() {
        return app_uploadTime;
    }

    public void setApp_uploadTime(String app_uploadTime) {
        this.app_uploadTime = app_uploadTime;
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

    @Override
    public String toString() {
        return "AppVersion{" +
                "id=" + id +
                ", app_name='" + app_name + '\'' +
                ", app_img='" + app_img + '\'' +
                ", app_download='" + app_download + '\'' +
                ", app_is_beta=" + app_is_beta +
                ", app_isPort=" + app_isPort +
                ", app_uploadTime='" + app_uploadTime + '\'' +
                ", app_version_code='" + app_version_code + '\'' +
                ", app_version_name='" + app_version_name + '\'' +
                '}';
    }
}
