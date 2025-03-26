package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.google.android.gms.internal.ads.Os, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1638Os extends AbstractC2314ce0 {

    /* renamed from: e, reason: collision with root package name */
    private final Context f17955e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC1344Gh0 f17956f;

    /* renamed from: g, reason: collision with root package name */
    private final String f17957g;

    /* renamed from: h, reason: collision with root package name */
    private final int f17958h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f17959i;

    /* renamed from: j, reason: collision with root package name */
    private InputStream f17960j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f17961k;

    /* renamed from: l, reason: collision with root package name */
    private Uri f17962l;

    /* renamed from: m, reason: collision with root package name */
    private volatile C1476Kc f17963m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f17964n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f17965o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f17966p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f17967q;

    /* renamed from: r, reason: collision with root package name */
    private long f17968r;

    /* renamed from: s, reason: collision with root package name */
    private com.google.common.util.concurrent.d f17969s;

    /* renamed from: t, reason: collision with root package name */
    private final AtomicLong f17970t;

    /* renamed from: u, reason: collision with root package name */
    private final C2023Zs f17971u;

    public C1638Os(Context context, InterfaceC1344Gh0 interfaceC1344Gh0, String str, int i8, Wu0 wu0, C2023Zs c2023Zs) {
        super(false);
        this.f17955e = context;
        this.f17956f = interfaceC1344Gh0;
        this.f17971u = c2023Zs;
        this.f17957g = str;
        this.f17958h = i8;
        this.f17964n = false;
        this.f17965o = false;
        this.f17966p = false;
        this.f17967q = false;
        this.f17968r = 0L;
        this.f17970t = new AtomicLong(-1L);
        this.f17969s = null;
        this.f17959i = ((Boolean) D2.A.c().a(AbstractC3184kf.f23824Y1)).booleanValue();
        f(wu0);
    }

    private final boolean r() {
        if (!this.f17959i) {
            return false;
        }
        if (!((Boolean) D2.A.c().a(AbstractC3184kf.f24014t4)).booleanValue() || this.f17966p) {
            return ((Boolean) D2.A.c().a(AbstractC3184kf.f24022u4)).booleanValue() && !this.f17967q;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3684pA0
    public final int C(byte[] bArr, int i8, int i9) {
        if (!this.f17961k) {
            throw new IOException("Attempt to read closed GcacheDataSource.");
        }
        InputStream inputStream = this.f17960j;
        int read = inputStream != null ? inputStream.read(bArr, i8, i9) : this.f17956f.C(bArr, i8, i9);
        if (!this.f17959i || this.f17960j != null) {
            z(read);
        }
        return read;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1344Gh0
    public final Uri a() {
        return this.f17962l;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1344Gh0
    public final void d() {
        if (!this.f17961k) {
            throw new IOException("Attempt to close an already closed GcacheDataSource.");
        }
        this.f17961k = false;
        this.f17962l = null;
        boolean z7 = (this.f17959i && this.f17960j == null) ? false : true;
        InputStream inputStream = this.f17960j;
        if (inputStream != null) {
            f3.k.a(inputStream);
            this.f17960j = null;
        } else {
            this.f17956f.d();
        }
        if (z7) {
            g();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01eb  */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.StringBuilder] */
    @Override // com.google.android.gms.internal.ads.InterfaceC1344Gh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long e(com.google.android.gms.internal.ads.C4393vk0 r14) {
        /*
            Method dump skipped, instructions count: 525
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1638Os.e(com.google.android.gms.internal.ads.vk0):long");
    }

    public final long k() {
        return this.f17968r;
    }

    public final long l() {
        if (this.f17963m != null) {
            if (this.f17970t.get() != -1) {
                return this.f17970t.get();
            }
            synchronized (this) {
                try {
                    if (this.f17969s == null) {
                        this.f17969s = AbstractC1497Kq.f16644a.p0(new Callable() { // from class: com.google.android.gms.internal.ads.Ns
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                return this.f17653o.m();
                            }
                        });
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.f17969s.isDone()) {
                try {
                    this.f17970t.compareAndSet(-1L, ((Long) this.f17969s.get()).longValue());
                    return this.f17970t.get();
                } catch (InterruptedException | ExecutionException unused) {
                }
            }
        }
        return -1L;
    }

    final /* synthetic */ Long m() {
        return Long.valueOf(C2.v.f().a(this.f17963m));
    }

    public final boolean n() {
        return this.f17964n;
    }

    public final boolean o() {
        return this.f17967q;
    }

    public final boolean p() {
        return this.f17966p;
    }

    public final boolean q() {
        return this.f17965o;
    }
}
