package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.concurrent.Callable;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class X90 {

    /* renamed from: a, reason: collision with root package name */
    private final H2.x f19997a;

    /* renamed from: b, reason: collision with root package name */
    private final H2.u f19998b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceScheduledExecutorServiceC3631ok0 f19999c;

    /* renamed from: d, reason: collision with root package name */
    private final Y90 f20000d;

    public X90(H2.x xVar, H2.u uVar, InterfaceScheduledExecutorServiceC3631ok0 interfaceScheduledExecutorServiceC3631ok0, Y90 y90) {
        this.f19997a = xVar;
        this.f19998b = uVar;
        this.f19999c = interfaceScheduledExecutorServiceC3631ok0;
        this.f20000d = y90;
    }

    private final com.google.common.util.concurrent.d e(final String str, final long j8, final int i8) {
        final String str2;
        H2.x xVar = this.f19997a;
        if (i8 > xVar.c()) {
            Y90 y90 = this.f20000d;
            if (y90 == null || !xVar.d()) {
                return AbstractC2326ck0.h(H2.t.RETRIABLE_FAILURE);
            }
            y90.a(str, "", 2);
            return AbstractC2326ck0.h(H2.t.BUFFERED);
        }
        if (((Boolean) D2.A.c().a(AbstractC3184kf.w8)).booleanValue()) {
            Uri parse = Uri.parse(str);
            String encodedQuery = parse.getEncodedQuery();
            Uri.Builder clearQuery = parse.buildUpon().clearQuery();
            clearQuery.appendQueryParameter("pa", Integer.toString(i8));
            str2 = String.valueOf(clearQuery.build()) + "&" + encodedQuery;
        } else {
            str2 = str;
        }
        InterfaceC1420Ij0 interfaceC1420Ij0 = new InterfaceC1420Ij0() { // from class: com.google.android.gms.internal.ads.W90
            @Override // com.google.android.gms.internal.ads.InterfaceC1420Ij0
            public final com.google.common.util.concurrent.d a(Object obj) {
                return this.f19728a.c(i8, j8, str, (H2.t) obj);
            }
        };
        return j8 == 0 ? AbstractC2326ck0.n(this.f19999c.p0(new Callable() { // from class: com.google.android.gms.internal.ads.V90
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f19559o.a(str2);
            }
        }), interfaceC1420Ij0, this.f19999c) : AbstractC2326ck0.n(this.f19999c.schedule(new Callable() { // from class: com.google.android.gms.internal.ads.U90
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f19313o.b(str2);
            }
        }, j8, TimeUnit.MILLISECONDS), interfaceC1420Ij0, this.f19999c);
    }

    final /* synthetic */ H2.t a(String str) {
        return this.f19998b.n(str);
    }

    final /* synthetic */ H2.t b(String str) {
        return this.f19998b.n(str);
    }

    final /* synthetic */ com.google.common.util.concurrent.d c(int i8, long j8, String str, H2.t tVar) {
        if (tVar != H2.t.RETRIABLE_FAILURE) {
            return AbstractC2326ck0.h(tVar);
        }
        H2.x xVar = this.f19997a;
        long b8 = xVar.b();
        if (i8 != 1) {
            b8 = (long) (xVar.a() * j8);
        }
        return e(str, b8, i8 + 1);
    }

    public final com.google.common.util.concurrent.d d(String str) {
        try {
            return e(str, 0L, 1);
        } catch (NullPointerException | RejectedExecutionException unused) {
            return AbstractC2326ck0.h(H2.t.PERMANENT_FAILURE);
        }
    }
}
