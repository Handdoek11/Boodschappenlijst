package com.adadapted.android.sdk.core.view;

import J6.r;
import J6.s;
import com.adadapted.android.sdk.core.ad.Ad;
import com.adadapted.android.sdk.core.ad.AdContentPublisher;
import com.adadapted.android.sdk.core.concurrency.Timer;
import com.adadapted.android.sdk.core.event.EventClient;
import com.adadapted.android.sdk.core.log.AALogger;
import com.adadapted.android.sdk.core.session.Session;
import com.adadapted.android.sdk.core.session.SessionClient;
import com.adadapted.android.sdk.core.session.SessionListener;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.util.Date;
import x6.C6916E;

/* loaded from: classes.dex */
public final class AdZonePresenter implements SessionListener {
    public static final int $stable = 8;
    private boolean adCompleted;
    private boolean adStarted;
    private final AdViewHandler adViewHandler;
    private AdZonePresenterListener adZonePresenterListener;
    private boolean attached;
    private Ad currentAd;
    private Zone currentZone;
    private final EventClient eventClient;
    private boolean isZoneVisible;
    private int randomAdStartPosition;
    private final SessionClient sessionClient;
    private String sessionId;
    private Timer timer;
    private boolean timerRunning;
    private String zoneId;
    private boolean zoneLoaded;

    /* renamed from: com.adadapted.android.sdk.core.view.AdZonePresenter$startZoneTimer$1, reason: invalid class name */
    static final class AnonymousClass1 extends s implements I6.a {
        AnonymousClass1() {
            super(0);
        }

        @Override // I6.a
        public /* bridge */ /* synthetic */ Object invoke() {
            m20invoke();
            return C6916E.f44463a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m20invoke() {
            AdZonePresenter.this.setNextAd();
        }
    }

    public AdZonePresenter(AdViewHandler adViewHandler, SessionClient sessionClient) {
        r.e(adViewHandler, "adViewHandler");
        this.adViewHandler = adViewHandler;
        this.sessionClient = sessionClient;
        this.currentAd = new Ad(null, null, null, null, null, null, 0L, ModuleDescriptor.MODULE_VERSION, null);
        this.zoneId = "";
        this.isZoneVisible = true;
        this.eventClient = EventClient.INSTANCE;
        this.attached = false;
        this.zoneLoaded = false;
        this.currentZone = new Zone(null, null, 3, null);
        this.randomAdStartPosition = ((int) (new Date().getTime() / 1000)) % 10;
    }

    private final void completeCurrentAd() {
        if (this.currentAd.isEmpty() || !this.adStarted || this.adCompleted) {
            return;
        }
        if (!this.currentAd.impressionWasTracked() && !this.isZoneVisible) {
            this.eventClient.trackInvisibleImpression(this.currentAd);
        }
        this.currentAd.resetImpressionTracking();
        this.adCompleted = true;
    }

    private final void cycleToNextAdIfPossible() {
        if (this.currentZone.getAds().size() > 1) {
            restartTimer();
            setNextAd();
        }
    }

    private final void displayAd() {
        if (this.currentAd.isEmpty()) {
            notifyNoAdAvailable();
        } else {
            notifyAdAvailable(this.currentAd);
        }
    }

    private final void handleContentAction(Ad ad) {
        AdContentPublisher.INSTANCE.publishContent(ad.getZoneId(), ad.getContent());
    }

    private final void handleLinkAction(Ad ad) {
        this.adViewHandler.handleLink(ad);
        AdContentPublisher.INSTANCE.publishNonContentNotification(this.zoneId, ad.getId());
    }

    private final void handlePopupAction(Ad ad) {
        this.adViewHandler.handlePopup(ad);
        AdContentPublisher.INSTANCE.publishNonContentNotification(this.zoneId, ad.getId());
    }

    private final void notifyAdAvailable(Ad ad) {
        AdZonePresenterListener adZonePresenterListener = this.adZonePresenterListener;
        if (adZonePresenterListener != null) {
            adZonePresenterListener.onAdAvailable(ad);
        }
    }

    private final void notifyAdsRefreshed() {
        AdZonePresenterListener adZonePresenterListener = this.adZonePresenterListener;
        if (adZonePresenterListener != null) {
            adZonePresenterListener.onAdsRefreshed(this.currentZone);
        }
    }

    private final void notifyNoAdAvailable() {
        AALogger.INSTANCE.logInfo("No ad available");
        AdZonePresenterListener adZonePresenterListener = this.adZonePresenterListener;
        if (adZonePresenterListener != null) {
            adZonePresenterListener.onNoAdAvailable();
        }
    }

    private final void notifyZoneAvailable() {
        AdZonePresenterListener adZonePresenterListener = this.adZonePresenterListener;
        if (adZonePresenterListener != null) {
            adZonePresenterListener.onZoneAvailable(this.currentZone);
        }
    }

    private final void restartTimer() {
        Timer timer = this.timer;
        if (timer != null) {
            if (timer == null) {
                r.p("timer");
                timer = null;
            }
            timer.cancelTimer();
            this.timerRunning = false;
            startZoneTimer();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setNextAd() {
        Ad ad;
        if (this.zoneLoaded) {
            SessionClient sessionClient = this.sessionClient;
            if (sessionClient == null || !sessionClient.hasStaleAds()) {
                completeCurrentAd();
                if (this.adZonePresenterListener == null || !this.currentZone.hasAds()) {
                    ad = new Ad(null, null, null, null, null, null, 0L, ModuleDescriptor.MODULE_VERSION, null);
                } else {
                    int size = this.randomAdStartPosition % this.currentZone.getAds().size();
                    this.randomAdStartPosition++;
                    ad = this.currentZone.getAds().get(size);
                }
                this.currentAd = ad;
                this.adStarted = false;
                this.adCompleted = false;
                displayAd();
            }
        }
    }

    private final void startZoneTimer() {
        if (!this.zoneLoaded || this.timerRunning) {
            return;
        }
        long refreshTime = this.currentAd.getRefreshTime() * 1000;
        this.timerRunning = true;
        this.timer = new Timer(new AnonymousClass1(), refreshTime, refreshTime);
    }

    private final void trackAdImpression(Ad ad, boolean z7) {
        if (!z7 || ad.impressionWasTracked() || ad.isEmpty()) {
            return;
        }
        ad.setImpressionTracked();
        this.eventClient.trackImpression(ad);
    }

    private final void updateCurrentZone(Zone zone) {
        this.zoneLoaded = true;
        this.currentZone = zone;
        restartTimer();
        setNextAd();
    }

    private final boolean updateSessionId(String str) {
        String str2 = this.sessionId;
        if (str2 != null && r.a(str2, str)) {
            return false;
        }
        this.sessionId = str;
        return true;
    }

    public final void clearZoneContext() {
        SessionClient sessionClient = this.sessionClient;
        if (sessionClient != null) {
            sessionClient.clearZoneContext();
        }
    }

    public final AdZonePresenterListener getAdZonePresenterListener() {
        return this.adZonePresenterListener;
    }

    public final void init(String str) {
        r.e(str, "zoneId");
        if (this.zoneId.length() == 0) {
            this.zoneId = str;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onAdClicked(com.adadapted.android.sdk.core.ad.Ad r5) {
        /*
            r4 = this;
            java.lang.String r0 = "ad"
            J6.r.e(r5, r0)
            java.lang.String r0 = r5.getActionType()
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.lang.String r2 = "ad_id"
            java.lang.String r3 = r5.getId()
            r1.put(r2, r3)
            int r2 = r0.hashCode()
            r3 = 99
            if (r2 == r3) goto L71
            r3 = 101(0x65, float:1.42E-43)
            if (r2 == r3) goto L5f
            r3 = 108(0x6c, float:1.51E-43)
            if (r2 == r3) goto L56
            r3 = 112(0x70, float:1.57E-43)
            if (r2 == r3) goto L44
            r3 = 3181(0xc6d, float:4.458E-42)
            if (r2 == r3) goto L30
            goto L79
        L30:
            java.lang.String r2 = "cp"
            boolean r2 = r0.equals(r2)
            if (r2 != 0) goto L39
            goto L79
        L39:
            com.adadapted.android.sdk.core.event.EventClient r0 = r4.eventClient
            java.lang.String r2 = "popup_ad_clicked"
            r0.trackSdkEvent(r2, r1)
            r4.handlePopupAction(r5)
            goto L9a
        L44:
            java.lang.String r1 = "p"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L4d
            goto L79
        L4d:
            com.adadapted.android.sdk.core.event.EventClient r0 = r4.eventClient
            r0.trackInteraction(r5)
            r4.handlePopupAction(r5)
            goto L9a
        L56:
            java.lang.String r1 = "l"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L68
            goto L79
        L5f:
            java.lang.String r1 = "e"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L68
            goto L79
        L68:
            com.adadapted.android.sdk.core.event.EventClient r0 = r4.eventClient
            r0.trackInteraction(r5)
            r4.handleLinkAction(r5)
            goto L9a
        L71:
            java.lang.String r2 = "c"
            boolean r2 = r0.equals(r2)
            if (r2 != 0) goto L90
        L79:
            com.adadapted.android.sdk.core.log.AALogger r5 = com.adadapted.android.sdk.core.log.AALogger.INSTANCE
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "AdZonePresenter Cannot handle Action type: "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r5.logError(r0)
            goto L9a
        L90:
            com.adadapted.android.sdk.core.event.EventClient r0 = r4.eventClient
            java.lang.String r2 = "atl_ad_clicked"
            r0.trackSdkEvent(r2, r1)
            r4.handleContentAction(r5)
        L9a:
            r4.cycleToNextAdIfPossible()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adadapted.android.sdk.core.view.AdZonePresenter.onAdClicked(com.adadapted.android.sdk.core.ad.Ad):void");
    }

    public final void onAdDisplayFailed() {
        startZoneTimer();
        this.adStarted = true;
        this.currentAd = new Ad(null, null, null, null, null, null, 0L, ModuleDescriptor.MODULE_VERSION, null);
    }

    public final void onAdDisplayed(Ad ad, boolean z7) {
        r.e(ad, "ad");
        this.isZoneVisible = z7;
        startZoneTimer();
        this.adStarted = true;
        trackAdImpression(ad, z7);
    }

    public final void onAdVisibilityChanged(boolean z7) {
        this.isZoneVisible = z7;
        AdZonePresenterListener adZonePresenterListener = this.adZonePresenterListener;
        if (adZonePresenterListener != null) {
            adZonePresenterListener.onAdVisibilityChanged(this.currentAd);
        }
        trackAdImpression(this.currentAd, z7);
    }

    @Override // com.adadapted.android.sdk.core.session.SessionListener
    public void onAdsAvailable(Session session) {
        r.e(session, "session");
        updateCurrentZone(session.getZone(this.zoneId));
        notifyAdsRefreshed();
    }

    public final void onAttach(AdZonePresenterListener adZonePresenterListener) {
        if (adZonePresenterListener == null) {
            AALogger.INSTANCE.logError("NULL Listener provided");
            return;
        }
        if (this.attached) {
            return;
        }
        this.attached = true;
        this.adZonePresenterListener = adZonePresenterListener;
        SessionClient sessionClient = this.sessionClient;
        if (sessionClient != null) {
            sessionClient.addPresenter(this);
        }
        setNextAd();
    }

    public final void onBlankDisplayed() {
        startZoneTimer();
        this.adStarted = true;
        this.currentAd = new Ad(null, null, null, null, null, null, 0L, ModuleDescriptor.MODULE_VERSION, null);
    }

    public final void onDetach() {
        if (this.attached) {
            this.attached = false;
            this.adZonePresenterListener = null;
            completeCurrentAd();
            SessionClient sessionClient = this.sessionClient;
            if (sessionClient != null) {
                sessionClient.removePresenter(this);
            }
        }
    }

    @Override // com.adadapted.android.sdk.core.session.SessionListener
    public void onPublishEvents() {
        SessionListener.DefaultImpls.onPublishEvents(this);
    }

    public final void onReportAdClicked(String str, String str2) {
        r.e(str, "adId");
        r.e(str2, "udid");
        this.adViewHandler.handleReportAd(str, str2);
    }

    @Override // com.adadapted.android.sdk.core.session.SessionListener
    public void onSessionAvailable(Session session) {
        r.e(session, "session");
        if (this.zoneId.length() == 0) {
            AALogger.INSTANCE.logError("AdZoneId is empty. Was onStop() called outside the host view's overriding function?");
        }
        updateCurrentZone(session.getZone(this.zoneId));
        if (updateSessionId(session.getId())) {
            notifyZoneAvailable();
        }
    }

    @Override // com.adadapted.android.sdk.core.session.SessionListener
    public void onSessionExpired() {
        SessionListener.DefaultImpls.onSessionExpired(this);
    }

    @Override // com.adadapted.android.sdk.core.session.SessionListener
    public void onSessionInitFailed() {
        updateCurrentZone(new Zone(null, null, 3, null));
    }

    public final void removeZoneContext() {
        SessionClient sessionClient = this.sessionClient;
        if (sessionClient != null) {
            sessionClient.removeZoneContext(this.zoneId);
        }
    }

    public final void setAdZonePresenterListener(AdZonePresenterListener adZonePresenterListener) {
        this.adZonePresenterListener = adZonePresenterListener;
    }

    public final void setZoneContext(String str) {
        r.e(str, "contextId");
        SessionClient sessionClient = this.sessionClient;
        if (sessionClient != null) {
            sessionClient.setZoneContext(new ZoneContext(this.zoneId, str));
        }
        this.eventClient.trackRecipeContextEvent(str, this.zoneId);
    }
}
