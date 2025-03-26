package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.EOFException;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.hG0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2826hG0 implements YG0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4425w0 f22525a;

    /* renamed from: b, reason: collision with root package name */
    private InterfaceC3880r0 f22526b;

    /* renamed from: c, reason: collision with root package name */
    private InterfaceC3989s0 f22527c;

    public C2826hG0(InterfaceC4425w0 interfaceC4425w0) {
        this.f22525a = interfaceC4425w0;
    }

    @Override // com.google.android.gms.internal.ads.YG0
    public final void a() {
        InterfaceC3880r0 interfaceC3880r0 = this.f22526b;
        if (interfaceC3880r0 != null && (interfaceC3880r0 instanceof Z2)) {
            ((Z2) interfaceC3880r0).b();
        }
    }

    @Override // com.google.android.gms.internal.ads.YG0
    public final void b() {
        if (this.f22526b != null) {
            this.f22526b = null;
        }
        this.f22527c = null;
    }

    @Override // com.google.android.gms.internal.ads.YG0
    public final void c(InterfaceC3684pA0 interfaceC3684pA0, Uri uri, Map map, long j8, long j9, InterfaceC4207u0 interfaceC4207u0) {
        C2684g0 c2684g0 = new C2684g0(interfaceC3684pA0, j8, j9);
        this.f22527c = c2684g0;
        if (this.f22526b != null) {
            return;
        }
        InterfaceC3880r0[] a8 = this.f22525a.a(uri, map);
        int length = a8.length;
        C3843qh0 q8 = AbstractC4169th0.q(length);
        if (length == 1) {
            this.f22526b = a8[0];
        } else {
            int i8 = 0;
            while (true) {
                if (i8 >= length) {
                    break;
                }
                InterfaceC3880r0 interfaceC3880r0 = a8[i8];
                try {
                } catch (EOFException unused) {
                    if (this.f22526b != null || c2684g0.c() == j8) {
                    }
                } catch (Throwable th) {
                    AbstractC3796qC.f(this.f22526b != null || c2684g0.c() == j8);
                    c2684g0.h();
                    throw th;
                }
                if (interfaceC3880r0.h(c2684g0)) {
                    this.f22526b = interfaceC3880r0;
                    AbstractC3796qC.f(true);
                    c2684g0.h();
                    break;
                } else {
                    q8.i(interfaceC3880r0.d());
                    boolean z7 = this.f22526b != null || c2684g0.c() == j8;
                    AbstractC3796qC.f(z7);
                    c2684g0.h();
                    i8++;
                }
            }
            if (this.f22526b == null) {
                Iterator it = AbstractC1487Kh0.b(AbstractC4169th0.v(a8), new InterfaceC1376Hf0() { // from class: com.google.android.gms.internal.ads.gG0
                    @Override // com.google.android.gms.internal.ads.InterfaceC1376Hf0
                    public final Object apply(Object obj) {
                        InterfaceC3880r0 interfaceC3880r02 = (InterfaceC3880r0) obj;
                        interfaceC3880r02.a();
                        return interfaceC3880r02.getClass().getSimpleName();
                    }
                }).iterator();
                StringBuilder sb = new StringBuilder();
                AbstractC1483Kf0.c(sb, it, ", ");
                throw new zzwk("None of the available extractors (" + sb.toString() + ") could read the stream.", uri, q8.j());
            }
        }
        this.f22526b.i(interfaceC4207u0);
    }

    @Override // com.google.android.gms.internal.ads.YG0
    public final int d(O0 o02) {
        InterfaceC3880r0 interfaceC3880r0 = this.f22526b;
        interfaceC3880r0.getClass();
        InterfaceC3989s0 interfaceC3989s0 = this.f22527c;
        interfaceC3989s0.getClass();
        return interfaceC3880r0.g(interfaceC3989s0, o02);
    }

    @Override // com.google.android.gms.internal.ads.YG0
    public final void f(long j8, long j9) {
        InterfaceC3880r0 interfaceC3880r0 = this.f22526b;
        interfaceC3880r0.getClass();
        interfaceC3880r0.f(j8, j9);
    }

    @Override // com.google.android.gms.internal.ads.YG0
    public final long zzb() {
        InterfaceC3989s0 interfaceC3989s0 = this.f22527c;
        if (interfaceC3989s0 != null) {
            return interfaceC3989s0.c();
        }
        return -1L;
    }
}
