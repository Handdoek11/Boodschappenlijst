package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.adadapted.android.sdk.core.ad.AdActionType;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.ads.r4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C3888r4 implements Y0 {

    /* renamed from: a, reason: collision with root package name */
    private final Y0 f26062a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3344m4 f26063b;

    /* renamed from: g, reason: collision with root package name */
    private InterfaceC3562o4 f26068g;

    /* renamed from: h, reason: collision with root package name */
    private D f26069h;

    /* renamed from: d, reason: collision with root package name */
    private int f26065d = 0;

    /* renamed from: e, reason: collision with root package name */
    private int f26066e = 0;

    /* renamed from: f, reason: collision with root package name */
    private byte[] f26067f = AbstractC2301cW.f21211f;

    /* renamed from: c, reason: collision with root package name */
    private final UQ f26064c = new UQ();

    public C3888r4(Y0 y02, InterfaceC3344m4 interfaceC3344m4) {
        this.f26062a = y02;
        this.f26063b = interfaceC3344m4;
    }

    private final void i(int i8) {
        int length = this.f26067f.length;
        int i9 = this.f26066e;
        if (length - i9 >= i8) {
            return;
        }
        int i10 = i9 - this.f26065d;
        int max = Math.max(i10 + i10, i8 + i10);
        byte[] bArr = this.f26067f;
        byte[] bArr2 = max <= bArr.length ? bArr : new byte[max];
        System.arraycopy(bArr, this.f26065d, bArr2, 0, i10);
        this.f26065d = 0;
        this.f26066e = i10;
        this.f26067f = bArr2;
    }

    @Override // com.google.android.gms.internal.ads.Y0
    public final /* synthetic */ void a(UQ uq, int i8) {
        W0.b(this, uq, i8);
    }

    @Override // com.google.android.gms.internal.ads.Y0
    public final void b(final long j8, final int i8, int i9, int i10, X0 x02) {
        if (this.f26068g == null) {
            this.f26062a.b(j8, i8, i9, i10, x02);
            return;
        }
        AbstractC3796qC.e(x02 == null, "DRM on subtitles is not supported");
        int i11 = (this.f26066e - i10) - i9;
        this.f26068g.a(this.f26067f, i11, i9, C3453n4.a(), new WE() { // from class: com.google.android.gms.internal.ads.q4
            @Override // com.google.android.gms.internal.ads.WE
            public final void a(Object obj) {
                this.f25708a.h(j8, i8, (C2692g4) obj);
            }
        });
        int i12 = i11 + i9;
        this.f26065d = i12;
        if (i12 == this.f26066e) {
            this.f26065d = 0;
            this.f26066e = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.Y0
    public final void c(D d8) {
        String str = d8.f14334o;
        str.getClass();
        AbstractC3796qC.d(AbstractC1650Pc.b(str) == 3);
        if (!d8.equals(this.f26069h)) {
            this.f26069h = d8;
            this.f26068g = this.f26063b.c(d8) ? this.f26063b.d(d8) : null;
        }
        if (this.f26068g == null) {
            this.f26062a.c(d8);
            return;
        }
        Y0 y02 = this.f26062a;
        C2723gJ0 b8 = d8.b();
        b8.B("application/x-media3-cues");
        b8.a(d8.f14334o);
        b8.F(Long.MAX_VALUE);
        b8.e(this.f26063b.b(d8));
        y02.c(b8.H());
    }

    @Override // com.google.android.gms.internal.ads.Y0
    public final /* synthetic */ void d(long j8) {
    }

    @Override // com.google.android.gms.internal.ads.Y0
    public final /* synthetic */ int e(InterfaceC3684pA0 interfaceC3684pA0, int i8, boolean z7) {
        return W0.a(this, interfaceC3684pA0, i8, z7);
    }

    @Override // com.google.android.gms.internal.ads.Y0
    public final int f(InterfaceC3684pA0 interfaceC3684pA0, int i8, boolean z7, int i9) {
        if (this.f26068g == null) {
            return this.f26062a.f(interfaceC3684pA0, i8, z7, 0);
        }
        i(i8);
        int C7 = interfaceC3684pA0.C(this.f26067f, this.f26066e, i8);
        if (C7 != -1) {
            this.f26066e += C7;
            return C7;
        }
        if (z7) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // com.google.android.gms.internal.ads.Y0
    public final void g(UQ uq, int i8, int i9) {
        if (this.f26068g == null) {
            this.f26062a.g(uq, i8, i9);
            return;
        }
        i(i8);
        uq.h(this.f26067f, this.f26066e, i8);
        this.f26066e += i8;
    }

    final /* synthetic */ void h(long j8, int i8, C2692g4 c2692g4) {
        AbstractC3796qC.b(this.f26069h);
        AbstractC4169th0 abstractC4169th0 = c2692g4.f22223a;
        long j9 = c2692g4.f22225c;
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(abstractC4169th0.size());
        Iterator<E> it = abstractC4169th0.iterator();
        while (it.hasNext()) {
            arrayList.add(((C3004iy) it.next()).a());
        }
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(AdActionType.CONTENT, arrayList);
        bundle.putLong("d", j9);
        Parcel obtain = Parcel.obtain();
        obtain.writeBundle(bundle);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        UQ uq = this.f26064c;
        int length = marshall.length;
        uq.j(marshall, length);
        this.f26062a.a(this.f26064c, length);
        long j10 = c2692g4.f22224b;
        if (j10 == -9223372036854775807L) {
            AbstractC3796qC.f(this.f26069h.f14339t == Long.MAX_VALUE);
        } else {
            long j11 = this.f26069h.f14339t;
            j8 = j11 == Long.MAX_VALUE ? j8 + j10 : j10 + j11;
        }
        this.f26062a.b(j8, i8, length, 0, null);
    }
}
