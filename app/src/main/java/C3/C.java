package C3;

import Z2.AbstractC0777p;
import a3.AbstractC0813a;
import a3.AbstractC0814b;
import android.os.Parcel;
import android.os.Parcelable;
import j$.time.Instant;
import java.util.List;

/* loaded from: classes2.dex */
public final class C extends AbstractC0813a {
    public static final Parcelable.Creator<C> CREATOR = new D();

    /* renamed from: o, reason: collision with root package name */
    public final int f850o;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f851s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f852t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f853u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f854v;

    /* renamed from: w, reason: collision with root package name */
    public final List f855w;

    /* renamed from: x, reason: collision with root package name */
    public final String f856x;

    /* renamed from: y, reason: collision with root package name */
    public final Long f857y;

    public C(int i8, boolean z7, boolean z8, boolean z9, boolean z10, List list, String str, Long l8) {
        this.f850o = i8;
        this.f851s = z7;
        this.f852t = z8;
        this.f853u = z9;
        this.f854v = z10;
        this.f855w = list;
        this.f856x = str;
        this.f857y = l8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C)) {
            return false;
        }
        C c8 = (C) obj;
        if (this.f850o == c8.f850o && this.f851s == c8.f851s && this.f852t == c8.f852t && this.f853u == c8.f853u && this.f854v == c8.f854v) {
            List list = c8.f855w;
            List list2 = this.f855w;
            if (list2 == null || list == null ? list2 == list : !(!list2.containsAll(list) || this.f855w.size() != list.size())) {
                if (AbstractC0777p.a(this.f856x, c8.f856x) && AbstractC0777p.a(this.f857y, c8.f857y)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC0777p.b(Integer.valueOf(this.f850o), Boolean.valueOf(this.f851s), Boolean.valueOf(this.f852t), Boolean.valueOf(this.f853u), Boolean.valueOf(this.f854v), this.f855w, this.f856x, this.f857y);
    }

    public final String toString() {
        Long l8 = this.f857y;
        String valueOf = String.valueOf(this.f855w);
        Instant ofEpochMilli = l8 != null ? Instant.ofEpochMilli(l8.longValue()) : null;
        String str = this.f856x;
        boolean z7 = this.f854v;
        boolean z8 = this.f853u;
        boolean z9 = this.f852t;
        boolean z10 = this.f851s;
        return "ConsentResponse {statusCode =" + this.f850o + ", hasTosConsent =" + z10 + ", hasLoggingConsent =" + z9 + ", hasCloudSyncConsent =" + z8 + ", hasLocationConsent =" + z7 + ", accountConsentRecords =" + valueOf + ", nodeId =" + str + ", lastUpdateRequestedTime =" + String.valueOf(ofEpochMilli) + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int i9 = this.f850o;
        int a8 = AbstractC0814b.a(parcel);
        AbstractC0814b.m(parcel, 1, i9);
        AbstractC0814b.c(parcel, 2, this.f851s);
        AbstractC0814b.c(parcel, 3, this.f852t);
        AbstractC0814b.c(parcel, 4, this.f853u);
        AbstractC0814b.c(parcel, 5, this.f854v);
        AbstractC0814b.w(parcel, 6, this.f855w, false);
        AbstractC0814b.s(parcel, 7, this.f856x, false);
        AbstractC0814b.q(parcel, 8, this.f857y, false);
        AbstractC0814b.b(parcel, a8);
    }
}
