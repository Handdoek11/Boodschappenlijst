package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ms0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC3429ms0 implements Su0 {
    UNKNOWN_KEYMATERIAL(0),
    SYMMETRIC(1),
    ASYMMETRIC_PRIVATE(2),
    ASYMMETRIC_PUBLIC(3),
    REMOTE(4),
    UNRECOGNIZED(-1);


    /* renamed from: o, reason: collision with root package name */
    private final int f24604o;

    EnumC3429ms0(int i8) {
        this.f24604o = i8;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(zza());
    }

    public final int zza() {
        if (this != UNRECOGNIZED) {
            return this.f24604o;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
