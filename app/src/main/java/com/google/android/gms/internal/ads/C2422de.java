package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.de, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2422de extends Qu0 implements InterfaceC3979rv0 {
    public static final int zza = 1;
    private static final C2422de zzb;
    private static volatile InterfaceC4633xv0 zzc;
    private Zu0 zzd = Qu0.v();

    static {
        C2422de c2422de = new C2422de();
        zzb = c2422de;
        Qu0.F(C2422de.class, c2422de);
    }

    private C2422de() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b0(C1862Vd c1862Vd) {
        c1862Vd.getClass();
        c0();
        this.zzd.add(c1862Vd);
    }

    private void c0() {
        Zu0 zu0 = this.zzd;
        if (zu0.a()) {
            return;
        }
        this.zzd = Qu0.w(zu0);
    }

    public static C1897Wd d0() {
        return (C1897Wd) zzb.q();
    }

    @Override // com.google.android.gms.internal.ads.Qu0
    protected final Object W(Pu0 pu0, Object obj, Object obj2) {
        int ordinal = pu0.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return Qu0.A(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", C1862Vd.class});
        }
        if (ordinal == 3) {
            return new C2422de();
        }
        AbstractC1689Qe abstractC1689Qe = null;
        if (ordinal == 4) {
            return new C1897Wd();
        }
        if (ordinal == 5) {
            return zzb;
        }
        if (ordinal != 6) {
            throw null;
        }
        InterfaceC4633xv0 interfaceC4633xv0 = zzc;
        if (interfaceC4633xv0 == null) {
            synchronized (C2422de.class) {
                try {
                    interfaceC4633xv0 = zzc;
                    if (interfaceC4633xv0 == null) {
                        interfaceC4633xv0 = new Nu0(zzb);
                        zzc = interfaceC4633xv0;
                    }
                } finally {
                }
            }
        }
        return interfaceC4633xv0;
    }
}
