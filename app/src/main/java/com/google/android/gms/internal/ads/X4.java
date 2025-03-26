package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class X4 {

    /* renamed from: f, reason: collision with root package name */
    private int f19958f;

    /* renamed from: h, reason: collision with root package name */
    private int f19960h;

    /* renamed from: n, reason: collision with root package name */
    private float f19966n;

    /* renamed from: a, reason: collision with root package name */
    private String f19953a = "";

    /* renamed from: b, reason: collision with root package name */
    private String f19954b = "";

    /* renamed from: c, reason: collision with root package name */
    private Set f19955c = Collections.emptySet();

    /* renamed from: d, reason: collision with root package name */
    private String f19956d = "";

    /* renamed from: e, reason: collision with root package name */
    private String f19957e = null;

    /* renamed from: g, reason: collision with root package name */
    private boolean f19959g = false;

    /* renamed from: i, reason: collision with root package name */
    private boolean f19961i = false;

    /* renamed from: j, reason: collision with root package name */
    private int f19962j = -1;

    /* renamed from: k, reason: collision with root package name */
    private int f19963k = -1;

    /* renamed from: l, reason: collision with root package name */
    private int f19964l = -1;

    /* renamed from: m, reason: collision with root package name */
    private int f19965m = -1;

    /* renamed from: o, reason: collision with root package name */
    private int f19967o = -1;

    /* renamed from: p, reason: collision with root package name */
    private boolean f19968p = false;

    private static int a(int i8, String str, String str2, int i9) {
        if (str.isEmpty() || i8 == -1) {
            return i8;
        }
        if (str.equals(str2)) {
            return i8 + i9;
        }
        return -1;
    }

    public final boolean A() {
        return this.f19962j == 1;
    }

    public final float b() {
        return this.f19966n;
    }

    public final int c() {
        if (this.f19961i) {
            return this.f19960h;
        }
        throw new IllegalStateException("Background color not defined.");
    }

    public final int d() {
        if (this.f19959g) {
            return this.f19958f;
        }
        throw new IllegalStateException("Font color not defined");
    }

    public final int e() {
        return this.f19965m;
    }

    public final int f() {
        return this.f19967o;
    }

    public final int g(String str, String str2, Set set, String str3) {
        if (this.f19953a.isEmpty() && this.f19954b.isEmpty() && this.f19955c.isEmpty() && this.f19956d.isEmpty()) {
            return TextUtils.isEmpty(str2) ? 1 : 0;
        }
        int a8 = a(a(a(0, this.f19953a, str, 1073741824), this.f19954b, str2, 2), this.f19956d, str3, 4);
        if (a8 == -1 || !set.containsAll(this.f19955c)) {
            return 0;
        }
        return a8 + (this.f19955c.size() * 4);
    }

    public final int h() {
        int i8 = this.f19963k;
        if (i8 == -1 && this.f19964l == -1) {
            return -1;
        }
        return (i8 == 1 ? 1 : 0) | (this.f19964l == 1 ? 2 : 0);
    }

    public final X4 i(int i8) {
        this.f19960h = i8;
        this.f19961i = true;
        return this;
    }

    public final X4 j(boolean z7) {
        this.f19963k = 1;
        return this;
    }

    public final X4 k(boolean z7) {
        this.f19968p = z7;
        return this;
    }

    public final X4 l(int i8) {
        this.f19958f = i8;
        this.f19959g = true;
        return this;
    }

    public final X4 m(String str) {
        this.f19957e = AbstractC4710yf0.a(str);
        return this;
    }

    public final X4 n(float f8) {
        this.f19966n = f8;
        return this;
    }

    public final X4 o(int i8) {
        this.f19965m = i8;
        return this;
    }

    public final X4 p(boolean z7) {
        this.f19964l = 1;
        return this;
    }

    public final X4 q(int i8) {
        this.f19967o = i8;
        return this;
    }

    public final X4 r(boolean z7) {
        this.f19962j = 1;
        return this;
    }

    public final String s() {
        return this.f19957e;
    }

    public final void t(String[] strArr) {
        this.f19955c = new HashSet(Arrays.asList(strArr));
    }

    public final void u(String str) {
        this.f19953a = str;
    }

    public final void v(String str) {
        this.f19954b = str;
    }

    public final void w(String str) {
        this.f19956d = str;
    }

    public final boolean x() {
        return this.f19968p;
    }

    public final boolean y() {
        return this.f19961i;
    }

    public final boolean z() {
        return this.f19959g;
    }
}
