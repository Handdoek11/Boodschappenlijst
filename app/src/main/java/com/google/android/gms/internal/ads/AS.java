package com.google.android.gms.internal.ads;

import android.app.Activity;

/* loaded from: classes.dex */
final class AS extends WS {

    /* renamed from: a, reason: collision with root package name */
    private final Activity f13556a;

    /* renamed from: b, reason: collision with root package name */
    private final F2.x f13557b;

    /* renamed from: c, reason: collision with root package name */
    private final String f13558c;

    /* renamed from: d, reason: collision with root package name */
    private final String f13559d;

    /* synthetic */ AS(Activity activity, F2.x xVar, String str, String str2, AbstractC4800zS abstractC4800zS) {
        this.f13556a = activity;
        this.f13557b = xVar;
        this.f13558c = str;
        this.f13559d = str2;
    }

    @Override // com.google.android.gms.internal.ads.WS
    public final Activity a() {
        return this.f13556a;
    }

    @Override // com.google.android.gms.internal.ads.WS
    public final F2.x b() {
        return this.f13557b;
    }

    @Override // com.google.android.gms.internal.ads.WS
    public final String c() {
        return this.f13558c;
    }

    @Override // com.google.android.gms.internal.ads.WS
    public final String d() {
        return this.f13559d;
    }

    public final boolean equals(Object obj) {
        F2.x xVar;
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof WS) {
            WS ws = (WS) obj;
            if (this.f13556a.equals(ws.a()) && ((xVar = this.f13557b) != null ? xVar.equals(ws.b()) : ws.b() == null) && ((str = this.f13558c) != null ? str.equals(ws.c()) : ws.c() == null) && ((str2 = this.f13559d) != null ? str2.equals(ws.d()) : ws.d() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f13556a.hashCode() ^ 1000003;
        F2.x xVar = this.f13557b;
        int hashCode2 = ((hashCode * 1000003) ^ (xVar == null ? 0 : xVar.hashCode())) * 1000003;
        String str = this.f13558c;
        int hashCode3 = (hashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f13559d;
        return hashCode3 ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        F2.x xVar = this.f13557b;
        return "OfflineUtilsParams{activity=" + this.f13556a.toString() + ", adOverlay=" + String.valueOf(xVar) + ", gwsQueryId=" + this.f13558c + ", uri=" + this.f13559d + "}";
    }
}
