package org.tiny;

import java.util.HashMap;

/**
 * ユーザー認証クラスの機能定義
 * @author DTMOyaji
 */
public interface IAuthClient {

    /**
     * ユーザー認証を行う
     * @param userid ユーザーID
     * @param password パスワード
     * @return 
     */
    public boolean auth(String userid, String password);

    /**
     * ユーザー情報を取得する
     * @param userid ユーザーID
     * @return ユーザー情報をKey,value形式で返す。
     */
    public HashMap<String, String> getUserInfo(String userid);
    
    public String getProperty(String key);

    public void setProperty(String key, String value);

}
