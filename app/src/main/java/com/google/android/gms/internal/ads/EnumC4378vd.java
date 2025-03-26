package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.vd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC4378vd implements Su0 {
    UNSPECIFIED(0),
    CONNECTING(1),
    CONNECTED(2),
    DISCONNECTING(3),
    DISCONNECTED(4),
    SUSPENDED(5);


    /* renamed from: y, reason: collision with root package name */
    private static final Tu0 f27311y = new Tu0() { // from class: com.google.android.gms.internal.ads.vd.a
    };

    /* renamed from: o, reason: collision with root package name */
    private final int f27313o;

    EnumC4378vd(int i8) {
        this.f27313o = i8;
    }

    public static EnumC4378vd a(int i8) {
        if (i8 == 0) {
            return UNSPECIFIED;
        }
        if (i8 == 1) {
            return CONNECTING;
        }
        if (i8 == 2) {
            return CONNECTED;
        }
        if (i8 == 3) {
            return DISCONNECTING;
        }
        if (i8 == 4) {
            return DISCONNECTED;
        }
        if (i8 != 5) {
            return null;
        }
        return SUSPENDED;
    }

    public static Uu0 c() {
        return C4487wd.f27512a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(zza());
    }

    public final int zza() {
        return this.f27313o;
    }
}
