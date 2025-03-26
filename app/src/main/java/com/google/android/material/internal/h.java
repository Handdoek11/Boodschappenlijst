package com.google.android.material.internal;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;

/* loaded from: classes2.dex */
final class h {

    /* renamed from: n, reason: collision with root package name */
    static final int f32119n = 1;

    /* renamed from: a, reason: collision with root package name */
    private CharSequence f32120a;

    /* renamed from: b, reason: collision with root package name */
    private final TextPaint f32121b;

    /* renamed from: c, reason: collision with root package name */
    private final int f32122c;

    /* renamed from: e, reason: collision with root package name */
    private int f32124e;

    /* renamed from: l, reason: collision with root package name */
    private boolean f32131l;

    /* renamed from: d, reason: collision with root package name */
    private int f32123d = 0;

    /* renamed from: f, reason: collision with root package name */
    private Layout.Alignment f32125f = Layout.Alignment.ALIGN_NORMAL;

    /* renamed from: g, reason: collision with root package name */
    private int f32126g = Integer.MAX_VALUE;

    /* renamed from: h, reason: collision with root package name */
    private float f32127h = 0.0f;

    /* renamed from: i, reason: collision with root package name */
    private float f32128i = 1.0f;

    /* renamed from: j, reason: collision with root package name */
    private int f32129j = f32119n;

    /* renamed from: k, reason: collision with root package name */
    private boolean f32130k = true;

    /* renamed from: m, reason: collision with root package name */
    private TextUtils.TruncateAt f32132m = null;

    static class a extends Exception {
    }

    private h(CharSequence charSequence, TextPaint textPaint, int i8) {
        this.f32120a = charSequence;
        this.f32121b = textPaint;
        this.f32122c = i8;
        this.f32124e = charSequence.length();
    }

    public static h b(CharSequence charSequence, TextPaint textPaint, int i8) {
        return new h(charSequence, textPaint, i8);
    }

    public StaticLayout a() {
        if (this.f32120a == null) {
            this.f32120a = "";
        }
        int max = Math.max(0, this.f32122c);
        CharSequence charSequence = this.f32120a;
        if (this.f32126g == 1) {
            charSequence = TextUtils.ellipsize(charSequence, this.f32121b, max, this.f32132m);
        }
        int min = Math.min(charSequence.length(), this.f32124e);
        this.f32124e = min;
        if (this.f32131l && this.f32126g == 1) {
            this.f32125f = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, this.f32123d, min, this.f32121b, max);
        obtain.setAlignment(this.f32125f);
        obtain.setIncludePad(this.f32130k);
        obtain.setTextDirection(this.f32131l ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
        TextUtils.TruncateAt truncateAt = this.f32132m;
        if (truncateAt != null) {
            obtain.setEllipsize(truncateAt);
        }
        obtain.setMaxLines(this.f32126g);
        float f8 = this.f32127h;
        if (f8 != 0.0f || this.f32128i != 1.0f) {
            obtain.setLineSpacing(f8, this.f32128i);
        }
        if (this.f32126g > 1) {
            obtain.setHyphenationFrequency(this.f32129j);
        }
        return obtain.build();
    }

    public h c(Layout.Alignment alignment) {
        this.f32125f = alignment;
        return this;
    }

    public h d(TextUtils.TruncateAt truncateAt) {
        this.f32132m = truncateAt;
        return this;
    }

    public h e(int i8) {
        this.f32129j = i8;
        return this;
    }

    public h f(boolean z7) {
        this.f32130k = z7;
        return this;
    }

    public h g(boolean z7) {
        this.f32131l = z7;
        return this;
    }

    public h h(float f8, float f9) {
        this.f32127h = f8;
        this.f32128i = f9;
        return this;
    }

    public h i(int i8) {
        this.f32126g = i8;
        return this;
    }

    public h j(i iVar) {
        return this;
    }
}
