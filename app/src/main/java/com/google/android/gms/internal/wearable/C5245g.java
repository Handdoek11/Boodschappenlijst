package com.google.android.gms.internal.wearable;

/* renamed from: com.google.android.gms.internal.wearable.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5245g extends AbstractC5258m0 implements J0 {
    private static final C5245g zzb;
    private int zzd;
    private C5243f zzf;
    private byte zzg = 2;
    private String zze = "";

    static {
        C5245g c5245g = new C5245g();
        zzb = c5245g;
        AbstractC5258m0.u(C5245g.class, c5245g);
    }

    private C5245g() {
    }

    public static D1 C() {
        return (D1) zzb.g();
    }

    static /* synthetic */ void G(C5245g c5245g, String str) {
        str.getClass();
        c5245g.zzd |= 1;
        c5245g.zze = str;
    }

    static /* synthetic */ void H(C5245g c5245g, C5243f c5243f) {
        c5243f.getClass();
        c5245g.zzf = c5243f;
        c5245g.zzd |= 2;
    }

    public final C5243f D() {
        C5243f c5243f = this.zzf;
        return c5243f == null ? C5243f.F() : c5243f;
    }

    public final String F() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.wearable.AbstractC5258m0
    protected final Object e(int i8, Object obj, Object obj2) {
        int i9 = i8 - 1;
        if (i9 == 0) {
            return Byte.valueOf(this.zzg);
        }
        if (i9 == 2) {
            return AbstractC5258m0.q(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔈ\u0000\u0002ᔉ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i9 == 3) {
            return new C5245g();
        }
        AbstractC5247h abstractC5247h = null;
        if (i9 == 4) {
            return new D1(abstractC5247h);
        }
        if (i9 == 5) {
            return zzb;
        }
        this.zzg = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
