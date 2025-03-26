package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;

/* renamed from: com.google.android.gms.internal.ads.qS, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3820qS implements T80 {

    /* renamed from: o, reason: collision with root package name */
    private final C2514eS f25923o;

    /* renamed from: s, reason: collision with root package name */
    private final C2950iS f25924s;

    C3820qS(C2514eS c2514eS, C2950iS c2950iS) {
        this.f25923o = c2514eS;
        this.f25924s = c2950iS;
    }

    @Override // com.google.android.gms.internal.ads.T80
    public final void g(M80 m80, String str, Throwable th) {
        if (((Boolean) D2.A.c().a(AbstractC3184kf.f23854b6)).booleanValue() && M80.RENDERER == m80 && this.f25923o.c() != 0) {
            this.f25923o.f(C2.v.c().b() - this.f25923o.c());
        }
    }

    @Override // com.google.android.gms.internal.ads.T80
    public final void m(M80 m80, String str) {
    }

    @Override // com.google.android.gms.internal.ads.T80
    public final void t(M80 m80, String str) {
        if (((Boolean) D2.A.c().a(AbstractC3184kf.f23854b6)).booleanValue() && M80.RENDERER == m80 && this.f25923o.c() != 0) {
            this.f25923o.f(C2.v.c().b() - this.f25923o.c());
        }
    }

    @Override // com.google.android.gms.internal.ads.T80
    public final void w(M80 m80, String str) {
        if (((Boolean) D2.A.c().a(AbstractC3184kf.f23854b6)).booleanValue()) {
            if (M80.RENDERER == m80) {
                this.f25923o.g(C2.v.c().b());
                return;
            }
            if (M80.PRELOADED_LOADER == m80 || M80.SERVER_TRANSACTION == m80) {
                this.f25923o.h(C2.v.c().b());
                final C2950iS c2950iS = this.f25924s;
                final long d8 = this.f25923o.d();
                c2950iS.f24959b.a(new InterfaceC4333v80() { // from class: com.google.android.gms.internal.ads.hS
                    @Override // com.google.android.gms.internal.ads.InterfaceC4333v80
                    public final Object a(Object obj) {
                        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                        if (c2950iS.a()) {
                            return null;
                        }
                        long j8 = d8;
                        C4160td E02 = C4051sd.E0();
                        E02.M(j8);
                        byte[] m8 = ((C4051sd) E02.x()).m();
                        AbstractC3711pS.f(sQLiteDatabase, false, false);
                        AbstractC3711pS.c(sQLiteDatabase, j8, m8);
                        return null;
                    }
                });
            }
        }
    }
}
