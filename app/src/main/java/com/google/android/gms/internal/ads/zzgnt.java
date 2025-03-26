package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzgnt extends RuntimeException {
    public zzgnt(String str) {
        super(str);
    }

    public static Object a(Vp0 vp0) {
        try {
            return vp0.zza();
        } catch (Exception e8) {
            throw new zzgnt(e8);
        }
    }

    public zzgnt(String str, Throwable th) {
        super(str, th);
    }

    public zzgnt(Throwable th) {
        super(th);
    }
}
