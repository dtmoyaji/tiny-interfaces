package org.tiny;

import java.util.HashMap;

/**
 * ユーザー認証クラスの機能定義
 * @author DTMOyaji
 */
public interface IAuthClient {

    /**
     * ユーザー認証を行う
     */
    public boolean auth(String userid, String password);

    /**
     * ユーザー情報を取得する
     */
    public HashMap<String, String> getUserInfo(String userid);

    public String getProperty(String key);

    public void setProperty(String key, String value);

}
