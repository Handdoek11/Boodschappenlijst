package org.chromium.support_lib_boundary;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public interface WebSettingsBoundaryInterface {

    @Retention(RetentionPolicy.SOURCE)
    public @interface AttributionBehavior {
        public static final int APP_SOURCE_AND_APP_TRIGGER = 3;
        public static final int APP_SOURCE_AND_WEB_TRIGGER = 1;
        public static final int DISABLED = 0;
        public static final int WEB_SOURCE_AND_WEB_TRIGGER = 2;
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface ForceDarkBehavior {
        public static final int FORCE_DARK_ONLY = 0;
        public static final int MEDIA_QUERY_ONLY = 1;
        public static final int PREFER_MEDIA_QUERY_OVER_FORCE_DARK = 2;
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface WebAuthnSupport {
        public static final int APP = 1;
        public static final int BROWSER = 2;
        public static final int NONE = 0;
    }

    @Target({ElementType.TYPE_USE})
    @Retention(RetentionPolicy.SOURCE)
    public @interface WebViewMediaIntegrityApiStatus {
        public static final int DISABLED = 0;
        public static final int ENABLED = 2;
        public static final int ENABLED_WITHOUT_APP_IDENTITY = 1;
    }

    int getAttributionBehavior();

    int getDisabledActionModeMenuItems();

    boolean getEnterpriseAuthenticationAppLinkPolicyEnabled();

    int getForceDark();

    int getForceDarkBehavior();

    boolean getOffscreenPreRaster();

    Set<String> getRequestedWithHeaderOriginAllowList();

    boolean getSafeBrowsingEnabled();

    Map<String, Object> getUserAgentMetadataMap();

    int getWebAuthnSupport();

    int getWebViewMediaIntegrityApiDefaultStatus();

    Map<String, Integer> getWebViewMediaIntegrityApiOverrideRules();

    boolean getWillSuppressErrorPage();

    boolean isAlgorithmicDarkeningAllowed();

    void setAlgorithmicDarkeningAllowed(boolean z7);

    void setAttributionBehavior(int i8);

    void setDisabledActionModeMenuItems(int i8);

    void setEnterpriseAuthenticationAppLinkPolicyEnabled(boolean z7);

    void setForceDark(int i8);

    void setForceDarkBehavior(int i8);

    void setOffscreenPreRaster(boolean z7);

    void setRequestedWithHeaderOriginAllowList(Set<String> set);

    void setSafeBrowsingEnabled(boolean z7);

    void setUserAgentMetadataFromMap(Map<String, Object> map);

    void setWebAuthnSupport(int i8);

    void setWebViewMediaIntegrityApiStatus(int i8, Map<String, Integer> map);

    void setWillSuppressErrorPage(boolean z7);
}
