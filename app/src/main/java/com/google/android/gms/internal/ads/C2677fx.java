package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.text.Layout;

/* renamed from: com.google.android.gms.internal.ads.fx, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2677fx {

    /* renamed from: a, reason: collision with root package name */
    private CharSequence f22164a;

    /* renamed from: b, reason: collision with root package name */
    private Bitmap f22165b;

    /* renamed from: c, reason: collision with root package name */
    private Layout.Alignment f22166c;

    /* renamed from: d, reason: collision with root package name */
    private Layout.Alignment f22167d;

    /* renamed from: e, reason: collision with root package name */
    private float f22168e;

    /* renamed from: f, reason: collision with root package name */
    private int f22169f;

    /* renamed from: g, reason: collision with root package name */
    private int f22170g;

    /* renamed from: h, reason: collision with root package name */
    private float f22171h;

    /* renamed from: i, reason: collision with root package name */
    private int f22172i;

    /* renamed from: j, reason: collision with root package name */
    private int f22173j;

    /* renamed from: k, reason: collision with root package name */
    private float f22174k;

    /* renamed from: l, reason: collision with root package name */
    private float f22175l;

    /* renamed from: m, reason: collision with root package name */
    private float f22176m;

    /* renamed from: n, reason: collision with root package name */
    private int f22177n;

    /* renamed from: o, reason: collision with root package name */
    private float f22178o;

    public C2677fx() {
        this.f22164a = null;
        this.f22165b = null;
        this.f22166c = null;
        this.f22167d = null;
        this.f22168e = -3.4028235E38f;
        this.f22169f = Integer.MIN_VALUE;
        this.f22170g = Integer.MIN_VALUE;
        this.f22171h = -3.4028235E38f;
        this.f22172i = Integer.MIN_VALUE;
        this.f22173j = Integer.MIN_VALUE;
        this.f22174k = -3.4028235E38f;
        this.f22175l = -3.4028235E38f;
        this.f22176m = -3.4028235E38f;
        this.f22177n = Integer.MIN_VALUE;
    }

    public final int a() {
        return this.f22170g;
    }

    public final int b() {
        return this.f22172i;
    }

    public final C2677fx c(Bitmap bitmap) {
        this.f22165b = bitmap;
        return this;
    }

    public final C2677fx d(float f8) {
        this.f22176m = f8;
        return this;
    }

    public final C2677fx e(float f8, int i8) {
        this.f22168e = f8;
        this.f22169f = i8;
        return this;
    }

    public final C2677fx f(int i8) {
        this.f22170g = i8;
        return this;
    }

    public final C2677fx g(Layout.Alignment alignment) {
        this.f22167d = alignment;
        return this;
    }

    public final C2677fx h(float f8) {
        this.f22171h = f8;
        return this;
    }

    public final C2677fx i(int i8) {
        this.f22172i = i8;
        return this;
    }

    public final C2677fx j(float f8) {
        this.f22178o = f8;
        return this;
    }

    public final C2677fx k(float f8) {
        this.f22175l = f8;
        return this;
    }

    public final C2677fx l(CharSequence charSequence) {
        this.f22164a = charSequence;
        return this;
    }

    public final C2677fx m(Layout.Alignment alignment) {
        this.f22166c = alignment;
        return this;
    }

    public final C2677fx n(float f8, int i8) {
        this.f22174k = f8;
        this.f22173j = i8;
        return this;
    }

    public final C2677fx o(int i8) {
        this.f22177n = i8;
        return this;
    }

    public final C3004iy p() {
        return new C3004iy(this.f22164a, this.f22166c, this.f22167d, this.f22165b, this.f22168e, this.f22169f, this.f22170g, this.f22171h, this.f22172i, this.f22173j, this.f22174k, this.f22175l, this.f22176m, false, -16777216, this.f22177n, this.f22178o, null);
    }

    public final CharSequence q() {
        return this.f22164a;
    }

    /* synthetic */ C2677fx(C3004iy c3004iy, AbstractC1362Gx abstractC1362Gx) {
        this.f22164a = c3004iy.f23124a;
        this.f22165b = c3004iy.f23127d;
        this.f22166c = c3004iy.f23125b;
        this.f22167d = c3004iy.f23126c;
        this.f22168e = c3004iy.f23128e;
        this.f22169f = c3004iy.f23129f;
        this.f22170g = c3004iy.f23130g;
        this.f22171h = c3004iy.f23131h;
        this.f22172i = c3004iy.f23132i;
        this.f22173j = c3004iy.f23135l;
        this.f22174k = c3004iy.f23136m;
        this.f22175l = c3004iy.f23133j;
        this.f22176m = c3004iy.f23134k;
        this.f22177n = c3004iy.f23137n;
        this.f22178o = c3004iy.f23138o;
    }
}
