package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import i3.BinderC5853b;

/* loaded from: classes.dex */
public final class BO implements InterfaceC3053jO {

    /* renamed from: a, reason: collision with root package name */
    private final long f13792a;

    /* renamed from: b, reason: collision with root package name */
    private final C3816qO f13793b;

    /* renamed from: c, reason: collision with root package name */
    private final BinderC2806h60 f13794c;

    BO(long j8, Context context, C3816qO c3816qO, AbstractC4630xu abstractC4630xu, String str) {
        this.f13792a = j8;
        this.f13793b = c3816qO;
        InterfaceC3022j60 C7 = abstractC4630xu.C();
        C7.b(context);
        C7.n(str);
        this.f13794c = C7.a().zza();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3053jO
    public final void a() {
        try {
            this.f13794c.G3(new AO(this));
            this.f13794c.t5(BinderC5853b.p2(null));
        } catch (RemoteException e8) {
            H2.p.i("#007 Could not call remote method.", e8);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3053jO
    public final void b(D2.X1 x12) {
        try {
            this.f13794c.n2(x12, new BinderC4796zO(this));
        } catch (RemoteException e8) {
            H2.p.i("#007 Could not call remote method.", e8);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3053jO
    public final void zza() {
    }
}
