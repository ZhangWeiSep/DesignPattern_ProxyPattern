package com.example.demo;

/**
 * @pathName: GamePlayerProxy
 * @author: ZhangWei
 * 代理
 */
public class GamePlayerProxy implements IGamePlayer {

    private IGamePlayer gamePlayer;


    public GamePlayerProxy(IGamePlayer gamePlayer) {
        this.gamePlayer = gamePlayer;
    }

    /**
     * 代练登录
     *
     * @param user     ：    用户名
     * @param password ：密码
     */
    @Override
    public void login(String user, String password) {
        this.gamePlayer.login(user, password);
    }

    /**
     * 代练击杀怪物
     */
    @Override
    public void killBoss() {
        this.gamePlayer.killBoss();
    }

    /**
     * 代练升级
     */
    @Override
    public void upgrade() {
        this.gamePlayer.upgrade();
    }
}
