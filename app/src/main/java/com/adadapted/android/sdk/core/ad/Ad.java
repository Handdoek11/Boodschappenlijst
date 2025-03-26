package com.adadapted.android.sdk.core.ad;

import H.AbstractC0626b;
import J6.AbstractC0650j;
import J6.r;
import S6.h;
import com.adadapted.android.sdk.constants.Config;
import com.adadapted.android.sdk.core.atl.AdditContent;
import com.adadapted.android.sdk.core.payload.Payload;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import g7.b;
import g7.g;
import java.util.List;
import k7.C0;
import y6.AbstractC6987o;

@g
/* loaded from: classes.dex */
public final class Ad {
    private final String actionPath;
    private final String actionType;
    private final String id;
    private final String impressionId;
    private boolean isImpressionTracked;
    private final Payload payload;
    private final long refreshTime;
    private final String url;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC0650j abstractC0650j) {
            this();
        }

        public final b serializer() {
            return Ad$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public Ad() {
        this(null, null, null, null, null, null, 0L, ModuleDescriptor.MODULE_VERSION, null);
    }

    public static /* synthetic */ void getActionPath$annotations() {
    }

    public static /* synthetic */ void getActionType$annotations() {
    }

    public static /* synthetic */ void getId$annotations() {
    }

    public static /* synthetic */ void getImpressionId$annotations() {
    }

    public static /* synthetic */ void getRefreshTime$annotations() {
    }

    public static /* synthetic */ void getUrl$annotations() {
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ void write$Self$advertising_sdk_release(com.adadapted.android.sdk.core.ad.Ad r13, j7.d r14, i7.f r15) {
        /*
            r0 = 0
            boolean r1 = r14.e(r15, r0)
            java.lang.String r2 = ""
            if (r1 == 0) goto La
            goto L12
        La:
            java.lang.String r1 = r13.id
            boolean r1 = J6.r.a(r1, r2)
            if (r1 != 0) goto L17
        L12:
            java.lang.String r1 = r13.id
            r14.g(r15, r0, r1)
        L17:
            r0 = 1
            boolean r1 = r14.e(r15, r0)
            if (r1 == 0) goto L1f
            goto L27
        L1f:
            java.lang.String r1 = r13.impressionId
            boolean r1 = J6.r.a(r1, r2)
            if (r1 != 0) goto L2c
        L27:
            java.lang.String r1 = r13.impressionId
            r14.g(r15, r0, r1)
        L2c:
            r0 = 2
            boolean r1 = r14.e(r15, r0)
            if (r1 == 0) goto L34
            goto L3c
        L34:
            java.lang.String r1 = r13.url
            boolean r1 = J6.r.a(r1, r2)
            if (r1 != 0) goto L41
        L3c:
            java.lang.String r1 = r13.url
            r14.g(r15, r0, r1)
        L41:
            r0 = 3
            boolean r1 = r14.e(r15, r0)
            if (r1 == 0) goto L49
            goto L51
        L49:
            java.lang.String r1 = r13.actionType
            boolean r1 = J6.r.a(r1, r2)
            if (r1 != 0) goto L56
        L51:
            java.lang.String r1 = r13.actionType
            r14.g(r15, r0, r1)
        L56:
            r0 = 4
            boolean r1 = r14.e(r15, r0)
            if (r1 == 0) goto L5e
            goto L66
        L5e:
            java.lang.String r1 = r13.actionPath
            boolean r1 = J6.r.a(r1, r2)
            if (r1 != 0) goto L6b
        L66:
            java.lang.String r1 = r13.actionPath
            r14.g(r15, r0, r1)
        L6b:
            r0 = 5
            boolean r1 = r14.e(r15, r0)
            if (r1 == 0) goto L73
            goto L8b
        L73:
            com.adadapted.android.sdk.core.payload.Payload r1 = r13.payload
            com.adadapted.android.sdk.core.payload.Payload r12 = new com.adadapted.android.sdk.core.payload.Payload
            r10 = 127(0x7f, float:1.78E-43)
            r11 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r2 = r12
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            boolean r1 = J6.r.a(r1, r12)
            if (r1 != 0) goto L92
        L8b:
            com.adadapted.android.sdk.core.payload.Payload$$serializer r1 = com.adadapted.android.sdk.core.payload.Payload$$serializer.INSTANCE
            com.adadapted.android.sdk.core.payload.Payload r2 = r13.payload
            r14.p(r15, r0, r1, r2)
        L92:
            r0 = 6
            boolean r1 = r14.e(r15, r0)
            if (r1 == 0) goto L9a
            goto La2
        L9a:
            long r1 = r13.refreshTime
            r3 = 6000(0x1770, double:2.9644E-320)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto La7
        La2:
            long r1 = r13.refreshTime
            r14.u(r15, r0, r1)
        La7:
            r0 = 7
            boolean r1 = r14.e(r15, r0)
            if (r1 == 0) goto Laf
            goto Lb3
        Laf:
            boolean r1 = r13.isImpressionTracked
            if (r1 == 0) goto Lb8
        Lb3:
            boolean r13 = r13.isImpressionTracked
            r14.A(r15, r0, r13)
        Lb8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adadapted.android.sdk.core.ad.Ad.write$Self$advertising_sdk_release(com.adadapted.android.sdk.core.ad.Ad, j7.d, i7.f):void");
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.impressionId;
    }

    public final String component3() {
        return this.url;
    }

    public final String component4() {
        return this.actionType;
    }

    public final String component5() {
        return this.actionPath;
    }

    public final Payload component6() {
        return this.payload;
    }

    public final long component7() {
        return this.refreshTime;
    }

    public final Ad copy(String str, String str2, String str3, String str4, String str5, Payload payload, long j8) {
        r.e(str, "id");
        r.e(str2, "impressionId");
        r.e(str3, "url");
        r.e(str4, "actionType");
        r.e(str5, "actionPath");
        r.e(payload, AdditContent.AdditSources.PAYLOAD);
        return new Ad(str, str2, str3, str4, str5, payload, j8);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Ad)) {
            return false;
        }
        Ad ad = (Ad) obj;
        return r.a(this.id, ad.id) && r.a(this.impressionId, ad.impressionId) && r.a(this.url, ad.url) && r.a(this.actionType, ad.actionType) && r.a(this.actionPath, ad.actionPath) && r.a(this.payload, ad.payload) && this.refreshTime == ad.refreshTime;
    }

    public final String getActionPath() {
        return this.actionPath;
    }

    public final String getActionType() {
        return this.actionType;
    }

    public final AdContent getContent() {
        return AdContent.Companion.createAddToListContent(this);
    }

    public final String getId() {
        return this.id;
    }

    public final String getImpressionId() {
        return this.impressionId;
    }

    public final Payload getPayload() {
        return this.payload;
    }

    public final long getRefreshTime() {
        return this.refreshTime;
    }

    public final String getUrl() {
        return this.url;
    }

    public final String getZoneId() {
        return (String) AbstractC6987o.B(h.l0(this.impressionId, new String[]{":"}, false, 0, 6, null));
    }

    public int hashCode() {
        return (((((((((((this.id.hashCode() * 31) + this.impressionId.hashCode()) * 31) + this.url.hashCode()) * 31) + this.actionType.hashCode()) * 31) + this.actionPath.hashCode()) * 31) + this.payload.hashCode()) * 31) + AbstractC0626b.a(this.refreshTime);
    }

    public final boolean impressionWasTracked() {
        return this.isImpressionTracked;
    }

    public final boolean isEmpty() {
        return this.id.length() == 0;
    }

    public final void resetImpressionTracking() {
        this.isImpressionTracked = false;
    }

    public final void setImpressionTracked() {
        this.isImpressionTracked = true;
    }

    public String toString() {
        return "Ad(id=" + this.id + ", impressionId=" + this.impressionId + ", url=" + this.url + ", actionType=" + this.actionType + ", actionPath=" + this.actionPath + ", payload=" + this.payload + ", refreshTime=" + this.refreshTime + ")";
    }

    public /* synthetic */ Ad(int i8, String str, String str2, String str3, String str4, String str5, Payload payload, long j8, boolean z7, C0 c02) {
        if ((i8 & 1) == 0) {
            this.id = "";
        } else {
            this.id = str;
        }
        if ((i8 & 2) == 0) {
            this.impressionId = "";
        } else {
            this.impressionId = str2;
        }
        if ((i8 & 4) == 0) {
            this.url = "";
        } else {
            this.url = str3;
        }
        if ((i8 & 8) == 0) {
            this.actionType = "";
        } else {
            this.actionType = str4;
        }
        if ((i8 & 16) == 0) {
            this.actionPath = "";
        } else {
            this.actionPath = str5;
        }
        this.payload = (i8 & 32) == 0 ? new Payload((String) null, (String) null, (String) null, (String) null, (String) null, 0, (List) null, ModuleDescriptor.MODULE_VERSION, (AbstractC0650j) null) : payload;
        this.refreshTime = (i8 & 64) == 0 ? Config.DEFAULT_AD_REFRESH : j8;
        this.isImpressionTracked = (i8 & 128) == 0 ? false : z7;
    }

    public Ad(String str, String str2, String str3, String str4, String str5, Payload payload, long j8) {
        r.e(str, "id");
        r.e(str2, "impressionId");
        r.e(str3, "url");
        r.e(str4, "actionType");
        r.e(str5, "actionPath");
        r.e(payload, AdditContent.AdditSources.PAYLOAD);
        this.id = str;
        this.impressionId = str2;
        this.url = str3;
        this.actionType = str4;
        this.actionPath = str5;
        this.payload = payload;
        this.refreshTime = j8;
    }

    public /* synthetic */ Ad(String str, String str2, String str3, String str4, String str5, Payload payload, long j8, int i8, AbstractC0650j abstractC0650j) {
        this((i8 & 1) != 0 ? "" : str, (i8 & 2) != 0 ? "" : str2, (i8 & 4) != 0 ? "" : str3, (i8 & 8) != 0 ? "" : str4, (i8 & 16) == 0 ? str5 : "", (i8 & 32) != 0 ? new Payload((String) null, (String) null, (String) null, (String) null, (String) null, 0, (List) null, ModuleDescriptor.MODULE_VERSION, (AbstractC0650j) null) : payload, (i8 & 64) != 0 ? Config.DEFAULT_AD_REFRESH : j8);
    }
}
