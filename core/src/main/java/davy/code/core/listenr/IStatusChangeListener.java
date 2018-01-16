package davy.code.core.listenr;

import davy.code.core.DownloadContext;
import davy.code.core.IDownloadState;

/**
 * author: wangyonghua
 * version: V1.0
 * date: 2018/1/16
 * time: 20:11
 */

public interface IStatusChangeListener {
    void onStatusChange(DownloadContext downloadContext, @IDownloadState.DownloadStatusCode int status);
}
