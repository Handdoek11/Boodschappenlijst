package com.google.android.material.textfield;

import V3.g;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;

/* renamed from: com.google.android.material.textfield.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC5473h extends V3.g {

    /* renamed from: Q, reason: collision with root package name */
    b f32489Q;

    /* renamed from: com.google.android.material.textfield.h$c */
    private static class c extends AbstractC5473h {
        c(b bVar) {
            super(bVar);
        }

        @Override // V3.g
        protected void r(Canvas canvas) {
            if (this.f32489Q.f32490w.isEmpty()) {
                super.r(canvas);
                return;
            }
            canvas.save();
            if (Build.VERSION.SDK_INT >= 26) {
                canvas.clipOutRect(this.f32489Q.f32490w);
            } else {
                canvas.clipRect(this.f32489Q.f32490w, Region.Op.DIFFERENCE);
            }
            super.r(canvas);
            canvas.restore();
        }
    }

    static AbstractC5473h g0(V3.k kVar) {
        if (kVar == null) {
            kVar = new V3.k();
        }
        return h0(new b(kVar, new RectF()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static AbstractC5473h h0(b bVar) {
        return new c(bVar);
    }

    boolean i0() {
        return !this.f32489Q.f32490w.isEmpty();
    }

    void j0() {
        k0(0.0f, 0.0f, 0.0f, 0.0f);
    }

    void k0(float f8, float f9, float f10, float f11) {
        if (f8 == this.f32489Q.f32490w.left && f9 == this.f32489Q.f32490w.top && f10 == this.f32489Q.f32490w.right && f11 == this.f32489Q.f32490w.bottom) {
            return;
        }
        this.f32489Q.f32490w.set(f8, f9, f10, f11);
        invalidateSelf();
    }

    void l0(RectF rectF) {
        k0(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    @Override // V3.g, android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.f32489Q = new b(this.f32489Q);
        return this;
    }

    /* renamed from: com.google.android.material.textfield.h$b */
    private static final class b extends g.c {

        /* renamed from: w, reason: collision with root package name */
        private final RectF f32490w;

        @Override // V3.g.c, android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            AbstractC5473h h02 = AbstractC5473h.h0(this);
            h02.invalidateSelf();
            return h02;
        }

        private b(V3.k kVar, RectF rectF) {
            super(kVar, null);
            this.f32490w = rectF;
        }

        private b(b bVar) {
            super(bVar);
            this.f32490w = bVar.f32490w;
        }
    }

    private AbstractC5473h(b bVar) {
        super(bVar);
        this.f32489Q = bVar;
    }
}
