package com.google.android.material.carousel;

import android.content.Context;
import android.view.View;

/* loaded from: classes2.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    private float f31610a;

    /* renamed from: b, reason: collision with root package name */
    private float f31611b;

    static int[] a(int[] iArr) {
        int length = iArr.length;
        int[] iArr2 = new int[length];
        for (int i8 = 0; i8 < length; i8++) {
            iArr2[i8] = iArr[i8] * 2;
        }
        return iArr2;
    }

    static float b(float f8, float f9, float f10) {
        return 1.0f - ((f8 - f10) / (f9 - f10));
    }

    public float c() {
        return this.f31611b;
    }

    public float d() {
        return this.f31610a;
    }

    void e(Context context) {
        float f8 = this.f31610a;
        if (f8 <= 0.0f) {
            f8 = e.h(context);
        }
        this.f31610a = f8;
        float f9 = this.f31611b;
        if (f9 <= 0.0f) {
            f9 = e.g(context);
        }
        this.f31611b = f9;
    }

    boolean f() {
        return true;
    }

    abstract f g(b bVar, View view);

    abstract boolean h(b bVar, int i8);
}
