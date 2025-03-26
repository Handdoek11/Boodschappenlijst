package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.yt, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4737yt {

    /* renamed from: e, reason: collision with root package name */
    public static final C4737yt f28216e = new C4737yt(-1, -1, -1);

    /* renamed from: a, reason: collision with root package name */
    public final int f28217a;

    /* renamed from: b, reason: collision with root package name */
    public final int f28218b;

    /* renamed from: c, reason: collision with root package name */
    public final int f28219c;

    /* renamed from: d, reason: collision with root package name */
    public final int f28220d;

    public C4737yt(int i8, int i9, int i10) {
        this.f28217a = i8;
        this.f28218b = i9;
        this.f28219c = i10;
        this.f28220d = AbstractC2301cW.j(i10) ? AbstractC2301cW.C(i10) * i9 : -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4737yt)) {
            return false;
        }
        C4737yt c4737yt = (C4737yt) obj;
        return this.f28217a == c4737yt.f28217a && this.f28218b == c4737yt.f28218b && this.f28219c == c4737yt.f28219c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f28217a), Integer.valueOf(this.f28218b), Integer.valueOf(this.f28219c)});
    }

    public final String toString() {
        return "AudioFormat[sampleRate=" + this.f28217a + ", channelCount=" + this.f28218b + ", encoding=" + this.f28219c + "]";
    }
}
