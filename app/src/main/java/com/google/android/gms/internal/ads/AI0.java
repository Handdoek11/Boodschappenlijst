package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class AI0 {

    /* renamed from: a, reason: collision with root package name */
    public final C4614xm f13536a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f13537b;

    public AI0(C4614xm c4614xm, int[] iArr, int i8) {
        if (iArr.length == 0) {
            HL.d("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
        }
        this.f13536a = c4614xm;
        this.f13537b = iArr;
    }
}
