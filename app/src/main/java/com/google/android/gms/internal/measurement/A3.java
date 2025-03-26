package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.D2;

/* loaded from: classes.dex */
abstract /* synthetic */ class A3 {

    /* renamed from: a, reason: collision with root package name */
    static final /* synthetic */ int[] f28797a;

    static {
        int[] iArr = new int[D2.a.values().length];
        f28797a = iArr;
        try {
            iArr[D2.a.STRING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f28797a[D2.a.NUMBER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f28797a[D2.a.BOOLEAN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f28797a[D2.a.STATEMENT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f28797a[D2.a.UNKNOWN.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
    }
}
