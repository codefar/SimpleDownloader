package davy.code.core;

import android.support.annotation.IntDef;

import davy.code.core.exception.DownloadException;

/**
 * author: wangyonghua
 * version: V1.0
 * date: 2018/1/16
 * time: 12:10
 */

public interface IDownloadState {

    int STATUS_INIT = 0;
    int STATUS_PENDING = 1;
    int STATUS_RUNNING = 2;
    int STATUS_PAUSED = 3;
    int STATUS_FINISHED = 4;
    int STATUS_ERR_FINISHED = 5;

    @IntDef({STATUS_INIT, STATUS_PENDING, STATUS_RUNNING, STATUS_PAUSED, STATUS_FINISHED, STATUS_ERR_FINISHED})
    @interface DownloadStatusCode {
    }

    @DownloadStatusCode int getStatus();

    void handle(DownloadContext downloadContext) throws DownloadException;
}
