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
}
