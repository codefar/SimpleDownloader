package davy.code.core.stateme;

import davy.code.core.DownloadContext;
import davy.code.core.exception.DownloadException;
import davy.code.core.IDownloadState;

/**
 * author: wangyonghua
 * version: V1.0
 * date: 2018/1/16
 * time: 20:03
 */

public class InitDownloadStatus implements IDownloadState {

    public InitDownloadStatus() {
    }

    @Override
    public int getStatus() {
        return STATUS_INIT;
    }

    @Override
    public void handle(DownloadContext downloadContext) throws DownloadException {

    }
}
