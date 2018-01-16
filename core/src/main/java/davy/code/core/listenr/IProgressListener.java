package davy.code.core.listenr;

/**
 * author: wangyonghua
 * version: V1.0
 * date: 2018/1/16
 * time: 20:11
 */

public interface IProgressListener {
    long ERR_SIZE = -1;

    void onProgressChanged(long downloadedBytes, long totalBytes);
}
