package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Layout;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.iy, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3004iy {

    /* renamed from: A, reason: collision with root package name */
    private static final String f23106A;

    /* renamed from: B, reason: collision with root package name */
    private static final String f23107B;

    /* renamed from: C, reason: collision with root package name */
    private static final String f23108C;

    /* renamed from: D, reason: collision with root package name */
    private static final String f23109D;

    /* renamed from: E, reason: collision with root package name */
    private static final String f23110E;

    /* renamed from: F, reason: collision with root package name */
    private static final String f23111F;

    /* renamed from: G, reason: collision with root package name */
    private static final String f23112G;

    /* renamed from: p, reason: collision with root package name */
    private static final String f23113p;

    /* renamed from: q, reason: collision with root package name */
    private static final String f23114q;

    /* renamed from: r, reason: collision with root package name */
    private static final String f23115r;

    /* renamed from: s, reason: collision with root package name */
    private static final String f23116s;

    /* renamed from: t, reason: collision with root package name */
    private static final String f23117t;

    /* renamed from: u, reason: collision with root package name */
    private static final String f23118u;

    /* renamed from: v, reason: collision with root package name */
    private static final String f23119v;

    /* renamed from: w, reason: collision with root package name */
    private static final String f23120w;

    /* renamed from: x, reason: collision with root package name */
    private static final String f23121x;

    /* renamed from: y, reason: collision with root package name */
    private static final String f23122y;

    /* renamed from: z, reason: collision with root package name */
    private static final String f23123z;

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f23124a;

    /* renamed from: b, reason: collision with root package name */
    public final Layout.Alignment f23125b;

    /* renamed from: c, reason: collision with root package name */
    public final Layout.Alignment f23126c;

    /* renamed from: d, reason: collision with root package name */
    public final Bitmap f23127d;

    /* renamed from: e, reason: collision with root package name */
    public final float f23128e;

    /* renamed from: f, reason: collision with root package name */
    public final int f23129f;

    /* renamed from: g, reason: collision with root package name */
    public final int f23130g;

    /* renamed from: h, reason: collision with root package name */
    public final float f23131h;

    /* renamed from: i, reason: collision with root package name */
    public final int f23132i;

    /* renamed from: j, reason: collision with root package name */
    public final float f23133j;

    /* renamed from: k, reason: collision with root package name */
    public final float f23134k;

    /* renamed from: l, reason: collision with root package name */
    public final int f23135l;

    /* renamed from: m, reason: collision with root package name */
    public final float f23136m;

    /* renamed from: n, reason: collision with root package name */
    public final int f23137n;

    /* renamed from: o, reason: collision with root package name */
    public final float f23138o;

    static {
        C2677fx c2677fx = new C2677fx();
        c2677fx.l("");
        c2677fx.p();
        f23113p = Integer.toString(0, 36);
        f23114q = Integer.toString(17, 36);
        f23115r = Integer.toString(1, 36);
        f23116s = Integer.toString(2, 36);
        Integer.toString(3, 36);
        f23117t = Integer.toString(18, 36);
        f23118u = Integer.toString(4, 36);
        f23119v = Integer.toString(5, 36);
        f23120w = Integer.toString(6, 36);
        f23121x = Integer.toString(7, 36);
        f23122y = Integer.toString(8, 36);
        f23123z = Integer.toString(9, 36);
        f23106A = Integer.toString(10, 36);
        f23107B = Integer.toString(11, 36);
        f23108C = Integer.toString(12, 36);
        f23109D = Integer.toString(13, 36);
        f23110E = Integer.toString(14, 36);
        f23111F = Integer.toString(15, 36);
        f23112G = Integer.toString(16, 36);
    }

    /* synthetic */ C3004iy(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f8, int i8, int i9, float f9, int i10, int i11, float f10, float f11, float f12, boolean z7, int i12, int i13, float f13, AbstractC1362Gx abstractC1362Gx) {
        if (charSequence == null) {
            bitmap.getClass();
        } else {
            AbstractC3796qC.d(bitmap == null);
        }
        if (charSequence instanceof Spanned) {
            this.f23124a = SpannedString.valueOf(charSequence);
        } else {
            this.f23124a = charSequence != null ? charSequence.toString() : null;
        }
        this.f23125b = alignment;
        this.f23126c = alignment2;
        this.f23127d = bitmap;
        this.f23128e = f8;
        this.f23129f = i8;
        this.f23130g = i9;
        this.f23131h = f9;
        this.f23132i = i10;
        this.f23133j = f11;
        this.f23134k = f12;
        this.f23135l = i11;
        this.f23136m = f10;
        this.f23137n = i13;
        this.f23138o = f13;
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        CharSequence charSequence = this.f23124a;
        if (charSequence != null) {
            bundle.putCharSequence(f23113p, charSequence);
            CharSequence charSequence2 = this.f23124a;
            if (charSequence2 instanceof Spanned) {
                ArrayList<? extends Parcelable> a8 = AbstractC3224kz.a((Spanned) charSequence2);
                if (!a8.isEmpty()) {
                    bundle.putParcelableArrayList(f23114q, a8);
                }
            }
        }
        bundle.putSerializable(f23115r, this.f23125b);
        bundle.putSerializable(f23116s, this.f23126c);
        bundle.putFloat(f23118u, this.f23128e);
        bundle.putInt(f23119v, this.f23129f);
        bundle.putInt(f23120w, this.f23130g);
        bundle.putFloat(f23121x, this.f23131h);
        bundle.putInt(f23122y, this.f23132i);
        bundle.putInt(f23123z, this.f23135l);
        bundle.putFloat(f23106A, this.f23136m);
        bundle.putFloat(f23107B, this.f23133j);
        bundle.putFloat(f23108C, this.f23134k);
        bundle.putBoolean(f23110E, false);
        bundle.putInt(f23109D, -16777216);
        bundle.putInt(f23111F, this.f23137n);
        bundle.putFloat(f23112G, this.f23138o);
        if (this.f23127d != null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            AbstractC3796qC.f(this.f23127d.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream));
            bundle.putByteArray(f23117t, byteArrayOutputStream.toByteArray());
        }
        return bundle;
    }

    public final C2677fx b() {
        return new C2677fx(this, null);
    }

    public final boolean equals(Object obj) {
        Bitmap bitmap;
        Bitmap bitmap2;
        if (this == obj) {
            return true;
        }
        if (obj != null && C3004iy.class == obj.getClass()) {
            C3004iy c3004iy = (C3004iy) obj;
            if (TextUtils.equals(this.f23124a, c3004iy.f23124a) && this.f23125b == c3004iy.f23125b && this.f23126c == c3004iy.f23126c && ((bitmap = this.f23127d) != null ? !((bitmap2 = c3004iy.f23127d) == null || !bitmap.sameAs(bitmap2)) : c3004iy.f23127d == null) && this.f23128e == c3004iy.f23128e && this.f23129f == c3004iy.f23129f && this.f23130g == c3004iy.f23130g && this.f23131h == c3004iy.f23131h && this.f23132i == c3004iy.f23132i && this.f23133j == c3004iy.f23133j && this.f23134k == c3004iy.f23134k && this.f23135l == c3004iy.f23135l && this.f23136m == c3004iy.f23136m && this.f23137n == c3004iy.f23137n && this.f23138o == c3004iy.f23138o) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f23124a, this.f23125b, this.f23126c, this.f23127d, Float.valueOf(this.f23128e), Integer.valueOf(this.f23129f), Integer.valueOf(this.f23130g), Float.valueOf(this.f23131h), Integer.valueOf(this.f23132i), Float.valueOf(this.f23133j), Float.valueOf(this.f23134k), Boolean.FALSE, -16777216, Integer.valueOf(this.f23135l), Float.valueOf(this.f23136m), Integer.valueOf(this.f23137n), Float.valueOf(this.f23138o)});
    }
}
