package com.itsocoo.multidatasource.jdbc.starter.properties;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author wanghaibo
 * @version V1.0
 * @desc
 * @date 2018/8/7 16:28
 */
@ConditionalOnProperty(name = MyDatasourceEnableProperties.PROFILE_TYPE, matchIfMissing = true)
@ConfigurationProperties(prefix = MyDatasourceEnableProperties.PREFIX)
public class MyDatasourceEnableProperties {
    static final String PREFIX = "itsocoo.multi.datasources.enable";
    static final String PROFILE_TYPE = "itsocoo.multi.datasources.enable.profile-type";

    private String profileType;
    private String[] platform;

    public String getProfileType() {
        return profileType;
    }

    public void setProfileType(String profileType) {
        this.profileType = profileType;
    }

    public String[] getPlatform() {
        return platform;
    }

    public void setPlatform(String[] platform) {
        this.platform = platform;
    }
}
