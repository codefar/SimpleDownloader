package davy.code.core.exception;

/**
 * author: wangyonghua
 * version: V1.0
 * date: 2018/1/16
 * time: 12:11
 */

public class DownloadException extends Exception {

    public DownloadException(String message) {
        super(message);
    }

    public DownloadException(String message, Throwable cause) {
        super(message, cause);
    }

    public DownloadException(Throwable cause) {
        super(cause);
    }
}
