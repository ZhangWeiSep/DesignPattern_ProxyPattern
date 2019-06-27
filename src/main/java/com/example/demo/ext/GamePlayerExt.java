package com.example.demo.ext;

import com.example.demo.IGamePlayer;

/**
 * @pathName: GamePlayerExt
 * @author: ZhangWei
 */
public class GamePlayerExt implements IGamePlayer {

    private String name;

    public GamePlayerExt(IGamePlayer iGamePlayer, String name) throws Exception {
        if (iGamePlayer == null) {
            throw new Exception("不能创建角色");
         } else {
            this.name = name;
        }
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
