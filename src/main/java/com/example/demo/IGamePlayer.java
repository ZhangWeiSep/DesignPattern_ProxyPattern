package com.example.demo;

/**
 * @pathName: IGamePlayer
 * @author: ZhangWei
 */
public interface IGamePlayer {

    /**
     * 登录
     * @param user ：    用户名
     * @param password ：密码
     */
    void login(String user, String password);

    /**
     * 击杀怪物
     */
    void killBoss();

    /**
     * 升级
     */
    void upgrade();

}
