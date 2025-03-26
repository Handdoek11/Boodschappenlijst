package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.nativead.NativeAd;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.in, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2983in extends NativeAd {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC1800Th f23060a;

    /* renamed from: c, reason: collision with root package name */
    private final C2875hn f23062c;

    /* renamed from: d, reason: collision with root package name */
    private final NativeAd.a f23063d;

    /* renamed from: b, reason: collision with root package name */
    private final List f23061b = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    private final List f23064e = new ArrayList();

    public C2983in(InterfaceC1800Th interfaceC1800Th) {
        InterfaceC1938Xg i8;
        this.f23060a = interfaceC1800Th;
        C2766gn c2766gn = null;
        try {
            List x7 = interfaceC1800Th.x();
            if (x7 != null) {
                for (Object obj : x7) {
                    InterfaceC1938Xg t7 = obj instanceof IBinder ? AbstractBinderC1903Wg.t7((IBinder) obj) : null;
                    if (t7 != null) {
                        this.f23061b.add(new C2875hn(t7));
                    }
                }
            }
        } catch (RemoteException e8) {
            H2.p.e("", e8);
        }
        try {
            List u7 = this.f23060a.u();
            if (u7 != null) {
                for (Object obj2 : u7) {
                    D2.D0 t72 = obj2 instanceof IBinder ? D2.C0.t7((IBinder) obj2) : null;
                    if (t72 != null) {
                        this.f23064e.add(new D2.E0(t72));
                    }
                }
            }
        } catch (RemoteException e9) {
            H2.p.e("", e9);
        }
        try {
            i8 = this.f23060a.i();
        } catch (RemoteException e10) {
            H2.p.e("", e10);
        }
        C2875hn c2875hn = i8 != null ? new C2875hn(i8) : null;
        this.f23062c = c2875hn;
        try {
            if (this.f23060a.f() != null) {
                c2766gn = new C2766gn(this.f23060a.f());
            }
        } catch (RemoteException e11) {
            H2.p.e("", e11);
        }
        this.f23063d = c2766gn;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final String a() {
        try {
            return this.f23060a.o();
        } catch (RemoteException e8) {
            H2.p.e("", e8);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final String b() {
        try {
            return this.f23060a.q();
        } catch (RemoteException e8) {
            H2.p.e("", e8);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final w2.u c() {
        D2.U0 u02;
        try {
            u02 = this.f23060a.g();
        } catch (RemoteException e8) {
            H2.p.e("", e8);
            u02 = null;
        }
        return w2.u.d(u02);
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    protected final /* bridge */ /* synthetic */ Object d() {
        try {
            return this.f23060a.k();
        } catch (RemoteException e8) {
            H2.p.e("", e8);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    protected final void recordEvent(Bundle bundle) {
        try {
            this.f23060a.m3(bundle);
        } catch (RemoteException e8) {
            H2.p.e("Failed to record native event", e8);
        }
    }
}
