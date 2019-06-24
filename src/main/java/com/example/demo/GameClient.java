package com.example.demo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * @pathName: GameClient
 * @author: ZhangWei
 */
public class GameClient {

//    public static void main(String[] args) {
//        //创建一个玩家
//        IGamePlayer gamePlayer = new GamePlayer("烟花");
//        //开始游戏
//        System.out.println("开始时间是：" + LocalDateTime.now());
//        //登录游戏
//        gamePlayer.login("烟花", "password");
//        //打怪
//        gamePlayer.killBoss();
//        //升级
//        gamePlayer.upgrade();
//        //结束游戏
//        System.out.println("结束时间是：" + LocalDateTime.now());
//
//
//    }

    public static void main(String[] args) {
        //创建一个玩家
        IGamePlayer gamePlayer = new GamePlayer("烟花");
        //定义一个代练
        IGamePlayer player =  new GamePlayerProxy(gamePlayer);
        //开始游戏
        System.out.println("开始时间是：" + LocalDateTime.now());
        //登录游戏
        player.login("烟花", "password");
        //打怪
        player.killBoss();
        //升级
        player.upgrade();
        //结束游戏
        System.out.println("结束时间是：" + LocalDateTime.now());


    }


}
