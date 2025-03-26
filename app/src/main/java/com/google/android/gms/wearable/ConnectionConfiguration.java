package com.google.android.gms.wearable;

import B3.I;
import B3.K;
import Z2.AbstractC0777p;
import a3.AbstractC0813a;
import a3.AbstractC0814b;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.List;

/* loaded from: classes2.dex */
public class ConnectionConfiguration extends AbstractC0813a implements ReflectedParcelable {
    public static final Parcelable.Creator<ConnectionConfiguration> CREATOR = new b();

    /* renamed from: A, reason: collision with root package name */
    private final String f31324A;

    /* renamed from: B, reason: collision with root package name */
    private final int f31325B;

    /* renamed from: C, reason: collision with root package name */
    private final List f31326C;

    /* renamed from: D, reason: collision with root package name */
    private final boolean f31327D;

    /* renamed from: E, reason: collision with root package name */
    private final boolean f31328E;

    /* renamed from: F, reason: collision with root package name */
    private final K f31329F;

    /* renamed from: G, reason: collision with root package name */
    private final boolean f31330G;

    /* renamed from: H, reason: collision with root package name */
    private final I f31331H;

    /* renamed from: I, reason: collision with root package name */
    private final int f31332I;

    /* renamed from: o, reason: collision with root package name */
    private final String f31333o;

    /* renamed from: s, reason: collision with root package name */
    private final String f31334s;

    /* renamed from: t, reason: collision with root package name */
    private final int f31335t;

    /* renamed from: u, reason: collision with root package name */
    private final int f31336u;

    /* renamed from: v, reason: collision with root package name */
    private final boolean f31337v;

    /* renamed from: w, reason: collision with root package name */
    private final boolean f31338w;

    /* renamed from: x, reason: collision with root package name */
    private volatile String f31339x;

    /* renamed from: y, reason: collision with root package name */
    private final boolean f31340y;

    /* renamed from: z, reason: collision with root package name */
    private final String f31341z;

    ConnectionConfiguration(String str, String str2, int i8, int i9, boolean z7, boolean z8, String str3, boolean z9, String str4, String str5, int i10, List list, boolean z10, boolean z11, K k8, boolean z12, I i11, int i12) {
        this.f31333o = str;
        this.f31334s = str2;
        this.f31335t = i8;
        this.f31336u = i9;
        this.f31337v = z7;
        this.f31338w = z8;
        this.f31339x = str3;
        this.f31340y = z9;
        this.f31341z = str4;
        this.f31324A = str5;
        this.f31325B = i10;
        this.f31326C = list;
        this.f31327D = z10;
        this.f31328E = z11;
        this.f31329F = k8;
        this.f31330G = z12;
        this.f31331H = i11;
        this.f31332I = i12;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ConnectionConfiguration)) {
            return false;
        }
        ConnectionConfiguration connectionConfiguration = (ConnectionConfiguration) obj;
        return AbstractC0777p.a(this.f31333o, connectionConfiguration.f31333o) && AbstractC0777p.a(this.f31334s, connectionConfiguration.f31334s) && AbstractC0777p.a(Integer.valueOf(this.f31335t), Integer.valueOf(connectionConfiguration.f31335t)) && AbstractC0777p.a(Integer.valueOf(this.f31336u), Integer.valueOf(connectionConfiguration.f31336u)) && AbstractC0777p.a(Boolean.valueOf(this.f31337v), Boolean.valueOf(connectionConfiguration.f31337v)) && AbstractC0777p.a(Boolean.valueOf(this.f31340y), Boolean.valueOf(connectionConfiguration.f31340y)) && AbstractC0777p.a(Boolean.valueOf(this.f31327D), Boolean.valueOf(connectionConfiguration.f31327D)) && AbstractC0777p.a(Boolean.valueOf(this.f31328E), Boolean.valueOf(connectionConfiguration.f31328E));
    }

    public final int hashCode() {
        return AbstractC0777p.b(this.f31333o, this.f31334s, Integer.valueOf(this.f31335t), Integer.valueOf(this.f31336u), Boolean.valueOf(this.f31337v), Boolean.valueOf(this.f31340y), Boolean.valueOf(this.f31327D), Boolean.valueOf(this.f31328E));
    }

    public final String toString() {
        return "ConnectionConfiguration[ Name=" + this.f31333o + ", Address=" + this.f31334s + ", Type=" + this.f31335t + ", Role=" + this.f31336u + ", Enabled=" + this.f31337v + ", IsConnected=" + this.f31338w + ", PeerNodeId=" + this.f31339x + ", BtlePriority=" + this.f31340y + ", NodeId=" + this.f31341z + ", PackageName=" + this.f31324A + ", ConnectionRetryStrategy=" + this.f31325B + ", allowedConfigPackages=" + this.f31326C + ", Migrating=" + this.f31327D + ", DataItemSyncEnabled=" + this.f31328E + ", ConnectionRestrictions=" + this.f31329F + ", removeConnectionWhenBondRemovedByUser=" + this.f31330G + ", maxSupportedRemoteAndroidSdkVersion=" + this.f31332I + "]";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        String str = this.f31333o;
        int a8 = AbstractC0814b.a(parcel);
        AbstractC0814b.s(parcel, 2, str, false);
        AbstractC0814b.s(parcel, 3, this.f31334s, false);
        AbstractC0814b.m(parcel, 4, this.f31335t);
        AbstractC0814b.m(parcel, 5, this.f31336u);
        AbstractC0814b.c(parcel, 6, this.f31337v);
        AbstractC0814b.c(parcel, 7, this.f31338w);
        AbstractC0814b.s(parcel, 8, this.f31339x, false);
        AbstractC0814b.c(parcel, 9, this.f31340y);
        AbstractC0814b.s(parcel, 10, this.f31341z, false);
        AbstractC0814b.s(parcel, 11, this.f31324A, false);
        AbstractC0814b.m(parcel, 12, this.f31325B);
        AbstractC0814b.u(parcel, 13, this.f31326C, false);
        AbstractC0814b.c(parcel, 14, this.f31327D);
        AbstractC0814b.c(parcel, 15, this.f31328E);
        AbstractC0814b.r(parcel, 16, this.f31329F, i8, false);
        AbstractC0814b.c(parcel, 17, this.f31330G);
        AbstractC0814b.r(parcel, 18, this.f31331H, i8, false);
        AbstractC0814b.m(parcel, 19, this.f31332I);
        AbstractC0814b.b(parcel, a8);
    }
}
