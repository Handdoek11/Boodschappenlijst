package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.s90, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC4008s90 implements Su0 {
    SCAR_REQUEST_TYPE_ADMOB(0),
    SCAR_REQUEST_TYPE_UNSPECIFIED(-1),
    SCAR_REQUEST_TYPE_INBOUND_MEDIATION(1),
    SCAR_REQUEST_TYPE_GBID(2),
    SCAR_REQUEST_TYPE_GOLDENEYE(3),
    SCAR_REQUEST_TYPE_YAVIN(4),
    SCAR_REQUEST_TYPE_UNITY(5),
    SCAR_REQUEST_TYPE_PAW(6),
    SCAR_REQUEST_TYPE_GUILDER(7),
    SCAR_REQUEST_TYPE_GAM_S2S(8),
    UNRECOGNIZED(-1);


    /* renamed from: o, reason: collision with root package name */
    private final int f26591o;

    EnumC4008s90(int i8) {
        this.f26591o = i8;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(zza());
    }

    public final int zza() {
        if (this != UNRECOGNIZED) {
            return this.f26591o;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
