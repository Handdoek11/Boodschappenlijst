package com.google.android.gms.internal.play_billing;

/* loaded from: classes2.dex */
public final class V3 extends M2 implements InterfaceC5129i3 {
    private static final V3 zzb;
    private int zzd;
    private int zze;
    private int zzg;
    private String zzf = "";
    private String zzh = "";

    static {
        V3 v32 = new V3();
        zzb = v32;
        M2.x(V3.class, v32);
    }

    private V3() {
    }

    static /* synthetic */ void B(V3 v32, String str) {
        v32.zzd |= 8;
        v32.zzh = str;
    }

    static /* synthetic */ void C(V3 v32, String str) {
        str.getClass();
        v32.zzd |= 2;
        v32.zzf = str;
    }

    static /* synthetic */ void D(V3 v32, int i8) {
        v32.zzd |= 1;
        v32.zze = i8;
    }

    static /* synthetic */ void E(V3 v32, int i8) {
        v32.zzg = i8 - 1;
        v32.zzd |= 4;
    }

    public static R3 G() {
        return (R3) zzb.m();
    }

    @Override // com.google.android.gms.internal.play_billing.M2
    protected final Object k(int i8, Object obj, Object obj2) {
        int i9 = i8 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return M2.u(zzb, "\u0004\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0004᠌\u0002\u0005ဈ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", S3.f29828a, "zzh"});
        }
        if (i9 == 3) {
            return new V3();
        }
        U3 u32 = null;
        if (i9 == 4) {
            return new R3(u32);
        }
        if (i9 != 5) {
            return null;
        }
        return zzb;
    }
}
