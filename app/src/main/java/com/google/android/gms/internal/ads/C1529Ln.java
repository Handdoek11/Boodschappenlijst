package com.google.android.gms.internal.ads;

import D2.C0501f1;
import D2.C0555y;
import android.content.Context;
import android.os.RemoteException;
import i3.BinderC5853b;
import i3.InterfaceC5852a;
import w2.EnumC6877c;

/* renamed from: com.google.android.gms.internal.ads.Ln, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1529Ln {

    /* renamed from: e, reason: collision with root package name */
    private static InterfaceC3097jq f16882e;

    /* renamed from: a, reason: collision with root package name */
    private final Context f16883a;

    /* renamed from: b, reason: collision with root package name */
    private final EnumC6877c f16884b;

    /* renamed from: c, reason: collision with root package name */
    private final C0501f1 f16885c;

    /* renamed from: d, reason: collision with root package name */
    private final String f16886d;

    public C1529Ln(Context context, EnumC6877c enumC6877c, C0501f1 c0501f1, String str) {
        this.f16883a = context;
        this.f16884b = enumC6877c;
        this.f16885c = c0501f1;
        this.f16886d = str;
    }

    public static InterfaceC3097jq a(Context context) {
        InterfaceC3097jq interfaceC3097jq;
        synchronized (C1529Ln.class) {
            try {
                if (f16882e == null) {
                    f16882e = C0555y.a().o(context, new BinderC4830zl());
                }
                interfaceC3097jq = f16882e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC3097jq;
    }

    public final void b(O2.b bVar) {
        D2.X1 a8;
        long currentTimeMillis = System.currentTimeMillis();
        InterfaceC3097jq a9 = a(this.f16883a);
        if (a9 == null) {
            bVar.a("Internal Error, query info generator is null.");
            return;
        }
        Context context = this.f16883a;
        C0501f1 c0501f1 = this.f16885c;
        InterfaceC5852a p22 = BinderC5853b.p2(context);
        if (c0501f1 == null) {
            D2.Y1 y12 = new D2.Y1();
            y12.g(currentTimeMillis);
            a8 = y12.a();
        } else {
            c0501f1.o(currentTimeMillis);
            a8 = D2.b2.f1210a.a(this.f16883a, this.f16885c);
        }
        try {
            a9.u2(p22, new C3533nq(this.f16886d, this.f16884b.name(), null, a8, 0, null), new BinderC1494Kn(this, bVar));
        } catch (RemoteException unused) {
            bVar.a("Internal Error.");
        }
    }
}
