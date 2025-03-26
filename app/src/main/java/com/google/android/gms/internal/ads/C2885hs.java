package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.google.android.gms.internal.ads.hs, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2885hs implements InterfaceC1344Gh0 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f22631a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC1344Gh0 f22632b;

    /* renamed from: c, reason: collision with root package name */
    private final String f22633c;

    /* renamed from: d, reason: collision with root package name */
    private final int f22634d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f22635e;

    /* renamed from: f, reason: collision with root package name */
    private InputStream f22636f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f22637g;

    /* renamed from: h, reason: collision with root package name */
    private Uri f22638h;

    /* renamed from: i, reason: collision with root package name */
    private volatile C1476Kc f22639i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f22640j = false;

    /* renamed from: k, reason: collision with root package name */
    private boolean f22641k = false;

    /* renamed from: l, reason: collision with root package name */
    private C4393vk0 f22642l;

    public C2885hs(Context context, InterfaceC1344Gh0 interfaceC1344Gh0, String str, int i8, Wu0 wu0, InterfaceC2776gs interfaceC2776gs) {
        this.f22631a = context;
        this.f22632b = interfaceC1344Gh0;
        this.f22633c = str;
        this.f22634d = i8;
        new AtomicLong(-1L);
        this.f22635e = ((Boolean) D2.A.c().a(AbstractC3184kf.f23824Y1)).booleanValue();
    }

    private final boolean g() {
        if (!this.f22635e) {
            return false;
        }
        if (!((Boolean) D2.A.c().a(AbstractC3184kf.f24014t4)).booleanValue() || this.f22640j) {
            return ((Boolean) D2.A.c().a(AbstractC3184kf.f24022u4)).booleanValue() && !this.f22641k;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3684pA0
    public final int C(byte[] bArr, int i8, int i9) {
        if (!this.f22637g) {
            throw new IOException("Attempt to read closed CacheDataSource.");
        }
        InputStream inputStream = this.f22636f;
        return inputStream != null ? inputStream.read(bArr, i8, i9) : this.f22632b.C(bArr, i8, i9);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1344Gh0
    public final Uri a() {
        return this.f22638h;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1344Gh0, com.google.android.gms.internal.ads.Ds0
    public final /* synthetic */ Map b() {
        return Collections.emptyMap();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1344Gh0
    public final void d() {
        if (!this.f22637g) {
            throw new IOException("Attempt to close an already closed CacheDataSource.");
        }
        this.f22637g = false;
        this.f22638h = null;
        InputStream inputStream = this.f22636f;
        if (inputStream == null) {
            this.f22632b.d();
        } else {
            f3.k.a(inputStream);
            this.f22636f = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1344Gh0
    public final long e(C4393vk0 c4393vk0) {
        Long l8;
        if (this.f22637g) {
            throw new IOException("Attempt to open an already open CacheDataSource.");
        }
        this.f22637g = true;
        Uri uri = c4393vk0.f27331a;
        this.f22638h = uri;
        this.f22642l = c4393vk0;
        this.f22639i = C1476Kc.A0(uri);
        C1369Hc c1369Hc = null;
        if (!((Boolean) D2.A.c().a(AbstractC3184kf.f23987q4)).booleanValue()) {
            if (this.f22639i != null) {
                this.f22639i.f16609y = c4393vk0.f27335e;
                this.f22639i.f16610z = AbstractC3187kg0.c(this.f22633c);
                this.f22639i.f16601A = this.f22634d;
                c1369Hc = C2.v.f().b(this.f22639i);
            }
            if (c1369Hc != null && c1369Hc.E0()) {
                this.f22640j = c1369Hc.G0();
                this.f22641k = c1369Hc.F0();
                if (!g()) {
                    this.f22636f = c1369Hc.C0();
                    return -1L;
                }
            }
        } else if (this.f22639i != null) {
            this.f22639i.f16609y = c4393vk0.f27335e;
            this.f22639i.f16610z = AbstractC3187kg0.c(this.f22633c);
            this.f22639i.f16601A = this.f22634d;
            if (this.f22639i.f16608x) {
                l8 = (Long) D2.A.c().a(AbstractC3184kf.f24005s4);
            } else {
                l8 = (Long) D2.A.c().a(AbstractC3184kf.f23996r4);
            }
            long longValue = l8.longValue();
            C2.v.c().b();
            C2.v.g();
            Future a8 = C1895Wc.a(this.f22631a, this.f22639i);
            try {
                try {
                    C1930Xc c1930Xc = (C1930Xc) a8.get(longValue, TimeUnit.MILLISECONDS);
                    c1930Xc.d();
                    this.f22640j = c1930Xc.f();
                    this.f22641k = c1930Xc.e();
                    c1930Xc.a();
                    if (!g()) {
                        this.f22636f = c1930Xc.c();
                    }
                } catch (InterruptedException unused) {
                    a8.cancel(false);
                    Thread.currentThread().interrupt();
                } catch (ExecutionException | TimeoutException unused2) {
                    a8.cancel(false);
                }
            } catch (Throwable unused3) {
            }
            C2.v.c().b();
            throw null;
        }
        if (this.f22639i != null) {
            C4173tj0 a9 = c4393vk0.a();
            a9.d(Uri.parse(this.f22639i.f16602o));
            this.f22642l = a9.e();
        }
        return this.f22632b.e(this.f22642l);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1344Gh0
    public final void f(Wu0 wu0) {
    }
}
