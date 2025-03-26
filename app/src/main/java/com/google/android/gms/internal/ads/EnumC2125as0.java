package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.as0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC2125as0 implements Su0 {
    UNKNOWN_HASH(0),
    SHA1(1),
    SHA384(2),
    SHA256(3),
    SHA512(4),
    SHA224(5),
    UNRECOGNIZED(-1);


    /* renamed from: o, reason: collision with root package name */
    private final int f20775o;

    EnumC2125as0(int i8) {
        this.f20775o = i8;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(zza());
    }

    public final int zza() {
        if (this != UNRECOGNIZED) {
            return this.f20775o;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
