package com.google.android.gms.internal.ads;

import android.net.Uri;
import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.vk0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4393vk0 {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f27330h = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Uri f27331a;

    /* renamed from: b, reason: collision with root package name */
    public final int f27332b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f27333c;

    /* renamed from: d, reason: collision with root package name */
    public final Map f27334d;

    /* renamed from: e, reason: collision with root package name */
    public final long f27335e;

    /* renamed from: f, reason: collision with root package name */
    public final long f27336f;

    /* renamed from: g, reason: collision with root package name */
    public final int f27337g;

    static {
        AbstractC2591f8.b("media3.datasource");
    }

    public final C4173tj0 a() {
        return new C4173tj0(this, null);
    }

    public final boolean b(int i8) {
        return (this.f27337g & i8) == i8;
    }

    public final String toString() {
        return "DataSpec[GET " + this.f27331a.toString() + ", " + this.f27335e + ", " + this.f27336f + ", null, " + this.f27337g + "]";
    }

    private C4393vk0(Uri uri, long j8, int i8, byte[] bArr, Map map, long j9, long j10, String str, int i9, Object obj) {
        boolean z7 = false;
        boolean z8 = j9 >= 0;
        AbstractC3796qC.d(z8);
        AbstractC3796qC.d(z8);
        if (j10 > 0) {
            z7 = true;
        } else if (j10 == -1) {
            j10 = -1;
            z7 = true;
        }
        AbstractC3796qC.d(z7);
        uri.getClass();
        this.f27331a = uri;
        this.f27332b = 1;
        this.f27333c = null;
        this.f27334d = DesugarCollections.unmodifiableMap(new HashMap(map));
        this.f27335e = j9;
        this.f27336f = j10;
        this.f27337g = i9;
    }

    public C4393vk0(Uri uri, long j8, long j9, String str) {
        this(uri, 0L, 1, null, Collections.emptyMap(), j8, j9, null, 0, null);
    }
}
