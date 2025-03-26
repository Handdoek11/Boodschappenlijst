package com.bumptech.glide.load.resource.bitmap;

import android.content.Context;
import android.graphics.Bitmap;
import d2.AbstractC5710l;

/* renamed from: com.bumptech.glide.load.resource.bitmap.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1084h implements J1.l {
    @Override // J1.l
    public final L1.c a(Context context, L1.c cVar, int i8, int i9) {
        if (!AbstractC5710l.u(i8, i9)) {
            throw new IllegalArgumentException("Cannot apply transformation on width: " + i8 + " or height: " + i9 + " less than or equal to zero and not Target.SIZE_ORIGINAL");
        }
        M1.d f8 = com.bumptech.glide.b.c(context).f();
        Bitmap bitmap = (Bitmap) cVar.get();
        if (i8 == Integer.MIN_VALUE) {
            i8 = bitmap.getWidth();
        }
        if (i9 == Integer.MIN_VALUE) {
            i9 = bitmap.getHeight();
        }
        Bitmap c8 = c(f8, bitmap, i8, i9);
        return bitmap.equals(c8) ? cVar : C1083g.f(c8, f8);
    }

    protected abstract Bitmap c(M1.d dVar, Bitmap bitmap, int i8, int i9);
}
