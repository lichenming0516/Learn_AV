package com.lcm.ffmpeg.audio;

/**
 * ****************************************************************
 * Author: LiChenMing.Chaman
 * Date: 2019/3/12 2:37 PM
 * Desc:
 * *****************************************************************
 */
public enum  RecordEncode {
    instance;



    static {
        System.loadLibrary("avcodec");
        System.loadLibrary("avdevice");
        System.loadLibrary("avfilter");
        System.loadLibrary("avformat");
        System.loadLibrary("avutil");
        System.loadLibrary("swresample");
        System.loadLibrary("swscale");
        System.loadLibrary("cmffmpeg");
    }


    public native int initAudio(String outPath);


    public native int encodeAudio(byte[] buffer);


    public native int close();
}
