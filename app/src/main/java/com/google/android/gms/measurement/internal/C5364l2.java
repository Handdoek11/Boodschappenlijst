package com.google.android.gms.measurement.internal;

import A3.InterfaceC0372f;
import Z2.AbstractC0783w;
import Z2.C0776o;
import Z2.C0782v;
import Z2.C0785y;
import Z2.InterfaceC0784x;
import android.content.Context;
import j$.time.Duration;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.google.android.gms.measurement.internal.l2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5364l2 {

    /* renamed from: d, reason: collision with root package name */
    private static C5364l2 f31060d;

    /* renamed from: e, reason: collision with root package name */
    private static final Duration f31061e = Duration.ofMinutes(30);

    /* renamed from: a, reason: collision with root package name */
    private final S2 f31062a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC0784x f31063b;

    /* renamed from: c, reason: collision with root package name */
    private final AtomicLong f31064c = new AtomicLong(-1);

    private C5364l2(Context context, S2 s22) {
        this.f31063b = AbstractC0783w.b(context, C0785y.a().b("measurement:api").a());
        this.f31062a = s22;
    }

    static C5364l2 a(S2 s22) {
        if (f31060d == null) {
            f31060d = new C5364l2(s22.zza(), s22);
        }
        return f31060d;
    }

    public final synchronized void b(int i8, int i9, long j8, long j9, int i10) {
        final long b8 = this.f31062a.zzb().b();
        if (this.f31064c.get() != -1 && b8 - this.f31064c.get() <= f31061e.toMillis()) {
            return;
        }
        this.f31063b.c(new C0782v(0, Arrays.asList(new C0776o(36301, i9, 0, j8, j9, null, null, 0, i10)))).e(new InterfaceC0372f() { // from class: com.google.android.gms.measurement.internal.k2
            @Override // A3.InterfaceC0372f
            public final void e(Exception exc) {
                this.f31044a.c(b8, exc);
            }
        });
    }

    final /* synthetic */ void c(long j8, Exception exc) {
        this.f31064c.set(j8);
    }
}
