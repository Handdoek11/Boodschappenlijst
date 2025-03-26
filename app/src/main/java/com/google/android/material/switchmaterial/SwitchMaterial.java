package com.google.android.material.switchmaterial;

import D3.b;
import D3.d;
import D3.k;
import N3.a;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.SwitchCompat;
import com.google.android.material.internal.l;
import com.google.android.material.internal.o;

/* loaded from: classes2.dex */
public class SwitchMaterial extends SwitchCompat {

    /* renamed from: s0, reason: collision with root package name */
    private static final int f32275s0 = k.f1628r;

    /* renamed from: t0, reason: collision with root package name */
    private static final int[][] f32276t0 = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* renamed from: o0, reason: collision with root package name */
    private final a f32277o0;

    /* renamed from: p0, reason: collision with root package name */
    private ColorStateList f32278p0;

    /* renamed from: q0, reason: collision with root package name */
    private ColorStateList f32279q0;

    /* renamed from: r0, reason: collision with root package name */
    private boolean f32280r0;

    public SwitchMaterial(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, b.f1394R);
    }

    private ColorStateList getMaterialThemeColorsThumbTintList() {
        if (this.f32278p0 == null) {
            int d8 = L3.a.d(this, b.f1413l);
            int d9 = L3.a.d(this, b.f1407f);
            float dimension = getResources().getDimension(d.f1477g0);
            if (this.f32277o0.d()) {
                dimension += o.f(this);
            }
            int c8 = this.f32277o0.c(d8, dimension);
            int[][] iArr = f32276t0;
            int[] iArr2 = new int[iArr.length];
            iArr2[0] = L3.a.j(d8, d9, 1.0f);
            iArr2[1] = c8;
            iArr2[2] = L3.a.j(d8, d9, 0.38f);
            iArr2[3] = c8;
            this.f32278p0 = new ColorStateList(iArr, iArr2);
        }
        return this.f32278p0;
    }

    private ColorStateList getMaterialThemeColorsTrackTintList() {
        if (this.f32279q0 == null) {
            int[][] iArr = f32276t0;
            int[] iArr2 = new int[iArr.length];
            int d8 = L3.a.d(this, b.f1413l);
            int d9 = L3.a.d(this, b.f1407f);
            int d10 = L3.a.d(this, b.f1410i);
            iArr2[0] = L3.a.j(d8, d9, 0.54f);
            iArr2[1] = L3.a.j(d8, d10, 0.32f);
            iArr2[2] = L3.a.j(d8, d9, 0.12f);
            iArr2[3] = L3.a.j(d8, d10, 0.12f);
            this.f32279q0 = new ColorStateList(iArr, iArr2);
        }
        return this.f32279q0;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f32280r0 && getThumbTintList() == null) {
            setThumbTintList(getMaterialThemeColorsThumbTintList());
        }
        if (this.f32280r0 && getTrackTintList() == null) {
            setTrackTintList(getMaterialThemeColorsTrackTintList());
        }
    }

    public void setUseMaterialThemeColors(boolean z7) {
        this.f32280r0 = z7;
        if (z7) {
            setThumbTintList(getMaterialThemeColorsThumbTintList());
            setTrackTintList(getMaterialThemeColorsTrackTintList());
        } else {
            setThumbTintList(null);
            setTrackTintList(null);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SwitchMaterial(Context context, AttributeSet attributeSet, int i8) {
        int i9 = f32275s0;
        super(Z3.a.c(context, attributeSet, i8, i9), attributeSet, i8);
        Context context2 = getContext();
        this.f32277o0 = new a(context2);
        TypedArray i10 = l.i(context2, attributeSet, D3.l.f1711J5, i8, i9, new int[0]);
        this.f32280r0 = i10.getBoolean(D3.l.f1719K5, false);
        i10.recycle();
    }
}
