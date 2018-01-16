package davy.code.core;

import davy.code.core.listenr.IProgressListener;
import davy.code.core.listenr.IStatusChangeListener;
import davy.code.core.stateme.InitDownloadStatus;

/**
 * author: wangyonghua
 * version: V1.0
 * date: 2018/1/16
 * time: 12:10
 */

public class DownloadContext {

    public IDownloadState currentStatus;
    public IStatusChangeListener mStatusChangeListener;
    public IProgressListener progressListener;
    public INetWordPolicy netWordPolicy;

    public DownloadContext() {
        changeStatus(IDownloadState.STATUS_INIT);
    }

    public void changeStatus(@IDownloadState.DownloadStatusCode int status) {
        if (currentStatus == null) {
            this.currentStatus = new InitDownloadStatus();
            notifyStatusChange();
        }

        if (currentStatus.getStatus() != status) {
            currentStatus = createDownloadStatus();
            notifyStatusChange();
        }
    }

    private IDownloadState createDownloadStatus() {
        return null;
    }

    private void notifyStatusChange() {
        if (mStatusChangeListener != null) {
            mStatusChangeListener.onStatusChange(this, currentStatus.getStatus());
        }
    }
}
