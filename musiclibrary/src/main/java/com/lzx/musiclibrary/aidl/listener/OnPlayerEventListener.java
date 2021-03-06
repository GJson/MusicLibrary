package com.lzx.musiclibrary.aidl.listener;

import com.lzx.musiclibrary.aidl.model.SongInfo;

/**
 * lzx
 * 2018/2/3
 */

public interface OnPlayerEventListener {
    void onMusicSwitch(SongInfo music);

    void onPlayerStart();

    void onPlayerPause();

    void onPlayCompletion(SongInfo songInfo);

    void onPlayerStop();

    void onError(String errorMsg);

    void onAsyncLoading(boolean isFinishLoading);
}
