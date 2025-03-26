package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public enum Ts0 implements Su0 {
    UNKNOWN_PREFIX(0),
    TINK(1),
    LEGACY(2),
    RAW(3),
    CRUNCHY(4),
    UNRECOGNIZED(-1);


    /* renamed from: o, reason: collision with root package name */
    private final int f19192o;

    Ts0(int i8) {
        this.f19192o = i8;
    }

    public static Ts0 a(int i8) {
        if (i8 == 0) {
            return UNKNOWN_PREFIX;
        }
        if (i8 == 1) {
            return TINK;
        }
        if (i8 == 2) {
            return LEGACY;
        }
        if (i8 == 3) {
            return RAW;
        }
        if (i8 != 4) {
            return null;
        }
        return CRUNCHY;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(zza());
    }

    public final int zza() {
        if (this != UNRECOGNIZED) {
            return this.f19192o;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
