package common.model;

import androidx.annotation.Keep;

/**
 * 分享四要素
 */
@Keep
public class ShareInfo {
    public String shareH5, shareImageUrl, shareBrief, shareTitle, platform;

    public static ShareInfo getInstance(String shareH5, String shareImageUrl, String shareBrief, String shareTitle, String platform) {
        return new ShareInfo(shareH5, shareImageUrl, shareBrief, shareTitle, platform);
    }

    public ShareInfo(String shareH5, String shareImageUrl, String shareBrief, String shareTitle, String platform) {
        this.shareH5 = shareH5;
        this.shareImageUrl = shareImageUrl;
        this.shareBrief = shareBrief;
        this.shareTitle = shareTitle;
        this.platform = platform;
    }

    public ShareInfo(String shareH5, String shareImageUrl, String shareBrief, String shareTitle) {
        this.shareH5 = shareH5;
        this.shareImageUrl = shareImageUrl;
        this.shareBrief = shareBrief;
        this.shareTitle = shareTitle;
    }
}
