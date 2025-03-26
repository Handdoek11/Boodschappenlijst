package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.z, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract /* synthetic */ class AbstractC5458z {

    /* renamed from: a, reason: collision with root package name */
    static final /* synthetic */ int[] f31278a;

    static {
        int[] iArr = new int[w3.p.values().length];
        f31278a = iArr;
        try {
            iArr[w3.p.UNINITIALIZED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f31278a[w3.p.POLICY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f31278a[w3.p.DENIED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f31278a[w3.p.GRANTED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
    }
}
