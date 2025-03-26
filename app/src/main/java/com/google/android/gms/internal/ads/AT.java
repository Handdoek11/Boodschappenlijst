package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
final class AT implements InterfaceC2068aI {

    /* renamed from: b, reason: collision with root package name */
    private static final List f13560b = new ArrayList(50);

    /* renamed from: a, reason: collision with root package name */
    private final Handler f13561a;

    public AT(Handler handler) {
        this.f13561a = handler;
    }

    static /* bridge */ /* synthetic */ void a(C4691yS c4691yS) {
        List list = f13560b;
        synchronized (list) {
            try {
                if (list.size() < 50) {
                    list.add(c4691yS);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static C4691yS c() {
        C4691yS c4691yS;
        List list = f13560b;
        synchronized (list) {
            try {
                c4691yS = list.isEmpty() ? new C4691yS(null) : (C4691yS) list.remove(list.size() - 1);
            } catch (Throwable th) {
                throw th;
            }
        }
        return c4691yS;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2068aI
    public final AH A(int i8) {
        Handler handler = this.f13561a;
        C4691yS c8 = c();
        c8.a(handler.obtainMessage(i8), this);
        return c8;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2068aI
    public final boolean K(int i8) {
        return this.f13561a.sendEmptyMessage(i8);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2068aI
    public final void b(Object obj) {
        this.f13561a.removeCallbacksAndMessages(null);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2068aI
    public final void g(int i8) {
        this.f13561a.removeMessages(i8);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2068aI
    public final AH h(int i8, Object obj) {
        Handler handler = this.f13561a;
        C4691yS c8 = c();
        c8.a(handler.obtainMessage(i8, obj), this);
        return c8;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2068aI
    public final boolean i(int i8, long j8) {
        return this.f13561a.sendEmptyMessageAtTime(2, j8);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2068aI
    public final boolean j(Runnable runnable) {
        return this.f13561a.post(runnable);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2068aI
    public final AH k(int i8, int i9, int i10) {
        Handler handler = this.f13561a;
        C4691yS c8 = c();
        c8.a(handler.obtainMessage(1, i9, i10), this);
        return c8;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2068aI
    public final boolean l(AH ah) {
        return ((C4691yS) ah).b(this.f13561a);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2068aI
    public final boolean z(int i8) {
        return this.f13561a.hasMessages(1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2068aI
    public final Looper zza() {
        return this.f13561a.getLooper();
    }
}
