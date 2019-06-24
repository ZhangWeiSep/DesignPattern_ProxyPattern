package com.example.demo;

/**
 * @pathName: GamePlayer
 * @author: ZhangWei
 */
public class GamePlayer implements IGamePlayer {

    /**
     * 名称
     */
    private String name = "";

    public GamePlayer(String name) {
        this.name = name;
    }

    /**
     * 登录
     *
     * @param user     ：    用户名
     * @param password ：密码
     */
    @Override
    public void login(String user, String password) {
        System.out.println("登录名为：" + name + "的用户" + this.name + "登录成功！");
    }

    /**
     * 击杀怪物
     */
    @Override
    public void killBoss() {
        System.out.println(this.name + "正在打怪");
    }

    /**
     * 升级
     */
    @Override
    public void upgrade() {
        System.out.println(this.name + "又升级了");
    }
}
