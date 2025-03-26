package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
abstract /* synthetic */ class Lo0 {

    /* renamed from: a, reason: collision with root package name */
    static final /* synthetic */ int[] f16887a;

    /* renamed from: b, reason: collision with root package name */
    static final /* synthetic */ int[] f16888b;

    static {
        int[] iArr = new int[EnumC3429ms0.values().length];
        f16888b = iArr;
        try {
            iArr[EnumC3429ms0.SYMMETRIC.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f16888b[EnumC3429ms0.ASYMMETRIC_PRIVATE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        int[] iArr2 = new int[Ts0.values().length];
        f16887a = iArr2;
        try {
            iArr2[Ts0.TINK.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f16887a[Ts0.LEGACY.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f16887a[Ts0.RAW.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f16887a[Ts0.CRUNCHY.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
    }
}
