package com.adadapted.android.sdk.core.session;

import J6.r;

/* loaded from: classes.dex */
public interface SessionListener {

    public static final class DefaultImpls {
        public static void onAdsAvailable(SessionListener sessionListener, Session session) {
            r.e(session, "session");
        }

        public static void onPublishEvents(SessionListener sessionListener) {
        }

        public static void onSessionAvailable(SessionListener sessionListener, Session session) {
            r.e(session, "session");
        }

        public static void onSessionExpired(SessionListener sessionListener) {
        }

        public static void onSessionInitFailed(SessionListener sessionListener) {
        }
    }

    void onAdsAvailable(Session session);

    void onPublishEvents();

    void onSessionAvailable(Session session);

    void onSessionExpired();

    void onSessionInitFailed();
}
