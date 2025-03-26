package com.google.android.gms.measurement.internal;

/* loaded from: classes2.dex */
abstract /* synthetic */ class N5 {

    /* renamed from: a, reason: collision with root package name */
    static final /* synthetic */ int[] f30627a;

    static {
        int[] iArr = new int[w3.p.values().length];
        f30627a = iArr;
        try {
            iArr[w3.p.POLICY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f30627a[w3.p.GRANTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f30627a[w3.p.DENIED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f30627a[w3.p.UNINITIALIZED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
    }
}
