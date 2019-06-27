package com.example.demo.ext;

import com.example.demo.IGamePlayer;

import java.time.LocalDateTime;

/**
 * @pathName: ClientExt
 * @author: ZhangWei
 */
public class ClientExt {

    public static void main(String[] args) throws Exception {
        IGamePlayer iGamePlayer = new GamePlayerProxyExt("张三");

        System.out.println("开始时间：" + LocalDateTime.now());

        iGamePlayer.login("ZhangSan", "password");

        iGamePlayer.killBoss();

        iGamePlayer.upgrade();

        System.out.println("结束时间：" + LocalDateTime.now());


    }

}
