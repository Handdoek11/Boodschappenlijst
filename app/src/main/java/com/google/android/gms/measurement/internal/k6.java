package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.M1;
import com.google.android.gms.internal.measurement.O1;

/* loaded from: classes2.dex */
abstract /* synthetic */ class k6 {

    /* renamed from: a, reason: collision with root package name */
    static final /* synthetic */ int[] f31055a;

    /* renamed from: b, reason: collision with root package name */
    static final /* synthetic */ int[] f31056b;

    static {
        int[] iArr = new int[M1.b.values().length];
        f31056b = iArr;
        try {
            iArr[M1.b.LESS_THAN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f31056b[M1.b.GREATER_THAN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f31056b[M1.b.EQUAL.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f31056b[M1.b.BETWEEN.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        int[] iArr2 = new int[O1.b.values().length];
        f31055a = iArr2;
        try {
            iArr2[O1.b.REGEXP.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f31055a[O1.b.BEGINS_WITH.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            f31055a[O1.b.ENDS_WITH.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            f31055a[O1.b.PARTIAL.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            f31055a[O1.b.EXACT.ordinal()] = 5;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            f31055a[O1.b.IN_LIST.ordinal()] = 6;
        } catch (NoSuchFieldError unused10) {
        }
    }
}
