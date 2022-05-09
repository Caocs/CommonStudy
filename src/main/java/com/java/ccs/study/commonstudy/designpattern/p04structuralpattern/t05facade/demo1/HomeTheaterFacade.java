package com.java.ccs.study.commonstudy.designpattern.p04structuralpattern.t05facade.demo1;

/**
 * @Author: Cao.cs
 * @Date: Created in 22:42 2022/5/9
 * 外观模式：【家庭影院 Facade】
 */
public class HomeTheaterFacade {
    private Popcorn popcorn;
    private Screen screen;
    private Stereo stereo;
    private TheaterLights lights;
    private Projector projector;
    private DVDPlayer player;

    public HomeTheaterFacade() {
        this.popcorn = Popcorn.getInstance();
        this.screen = Screen.getInstance();
        this.stereo = Stereo.getInstance();
        this.lights = TheaterLights.getInstance();
        this.projector = Projector.getInstance();
        this.player = DVDPlayer.getInstance();
    }

    public void ready() {
        lights.on(); // 打开灯光
        popcorn.on(); // 开爆米花机
        screen.down(); // 放下屏幕
        projector.on(); // 开投影仪
        projector.focus();
        projector.zoom();
        stereo.on(); // 开音响，设置音量
        stereo.setVolume(8);
        player.on(); // 开DVD，选dvd
        player.setDvd("坦塔尼克号");
        popcorn.pop(); // 去拿爆米花，关闭机器
        popcorn.off();
        lights.dim(); // 调暗灯光
    }

    public void play() {
        player.play();
    }

    public void pause() {
        player.pause();
    }

    public void end() {
        player.off();
        projector.off();
        stereo.off();
        lights.bright();
        screen.up();
    }
}
