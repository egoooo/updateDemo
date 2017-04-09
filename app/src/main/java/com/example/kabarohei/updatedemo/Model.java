package com.example.kabarohei.updatedemo;

/**
 * Created by kabarohei on 17/4/8.
 */

public class Model {
    //app名字
    private String appname="kankan";
    //服务器版本
    private String serverVersion="2";
    //服务器标志
    private String serverFlag="1";
    //强制升级
    private String lastForce="1";
    //app最新版本地址
    private String updateurl="http://p.gdown.baidu.com/7d0ed40e3c58f91ba109b763f4aa7075f166419139cbd777f9341c155aab1608940278f3a84f83370eb9eec76b2ef090ff2bea63b57843d851b755de84a55188c58f29b5df2eeb115aff3e91dd529997c5c2c7e3bd2679e4048ab3e54a62dfd3c72ec79b42d5859bc2e6d7bfd1e4ecd7661765d115103906b02d27e6fe13dee327fbd12f60e9b29a2855c582d1f8b6e7b8420f96f1a4d67c";
    //升级信息
    private String upgradeinfo="V1.1版本更新，你想不想要试一下哈！！！";

    public String getAppname() {
        return appname;
    }

    public void setAppname(String appname) {
        this.appname = appname;
    }

    public String getServerVersion() {
        return serverVersion;
    }

    public void setServerVersion(String serverVersion) {
        this.serverVersion = serverVersion;
    }

    public String getServerFlag() {
        return serverFlag;
    }

    public void setServerFlag(String serverFlag) {
        this.serverFlag = serverFlag;
    }

    public String getLastForce() {
        return lastForce;
    }

    public void setLastForce(String lastForce) {
        this.lastForce = lastForce;
    }

    public String getUpdateurl() {
        return updateurl;
    }

    public void setUpdateurl(String updateurl) {
        this.updateurl = updateurl;
    }

    public String getUpgradeinfo() {
        return upgradeinfo;
    }

    public void setUpgradeinfo(String upgradeinfo) {
        this.upgradeinfo = upgradeinfo;
    }
}
