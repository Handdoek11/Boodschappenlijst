package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.C7;
import com.google.android.gms.internal.measurement.R1;

/* loaded from: classes2.dex */
abstract /* synthetic */ class O2 {

    /* renamed from: a, reason: collision with root package name */
    static final /* synthetic */ int[] f30628a;

    /* renamed from: b, reason: collision with root package name */
    static final /* synthetic */ int[] f30629b;

    /* renamed from: c, reason: collision with root package name */
    static final /* synthetic */ int[] f30630c;

    static {
        int[] iArr = new int[R1.d.values().length];
        f30630c = iArr;
        try {
            iArr[R1.d.DENIED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f30630c[R1.d.GRANTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        int[] iArr2 = new int[R1.e.values().length];
        f30629b = iArr2;
        try {
            iArr2[R1.e.AD_STORAGE.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f30629b[R1.e.ANALYTICS_STORAGE.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f30629b[R1.e.AD_USER_DATA.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f30629b[R1.e.AD_PERSONALIZATION.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
        int[] iArr3 = new int[C7.values().length];
        f30628a = iArr3;
        try {
            iArr3[C7.DEBUG.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            f30628a[C7.ERROR.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            f30628a[C7.WARN.ordinal()] = 3;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            f30628a[C7.VERBOSE.ordinal()] = 4;
        } catch (NoSuchFieldError unused10) {
        }
    }
}
