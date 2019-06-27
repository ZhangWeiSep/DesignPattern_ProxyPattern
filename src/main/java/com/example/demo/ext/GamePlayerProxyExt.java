package com.example.demo.ext;

import com.example.demo.GamePlayer;
import com.example.demo.IGamePlayer;

/**
 * @pathName: GamePlayerProxyExt
 * @author: ZhangWei
 */
public class GamePlayerProxyExt implements IGamePlayer {

    private IGamePlayer iGamePlayer;

    public GamePlayerProxyExt(String name) throws Exception {
        this.iGamePlayer = new GamePlayerExt(this, name);
    }

    /**
     * 登录
     *
     * @param user     ：    用户名
     * @param password ：密码
     */
    @Override
    public void login(String user, String password) {
        this.iGamePlayer.login(user, password);
    }

    /**
     * 击杀怪物
     */
    @Override
    public void killBoss() {
        this.iGamePlayer.killBoss();
    }

    /**
     * 升级
     */
    @Override
    public void upgrade() {
        this.iGamePlayer.upgrade();
    }
}
