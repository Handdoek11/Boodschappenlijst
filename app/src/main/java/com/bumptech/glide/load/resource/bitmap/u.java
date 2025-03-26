package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import java.util.concurrent.locks.Lock;

/* loaded from: classes.dex */
abstract class u {

    /* renamed from: a, reason: collision with root package name */
    private static final M1.d f12953a = new a();

    class a extends M1.e {
        a() {
        }

        @Override // M1.e, M1.d
        public void c(Bitmap bitmap) {
        }
    }

    static L1.c a(M1.d dVar, Drawable drawable, int i8, int i9) {
        Bitmap bitmap;
        Drawable current = drawable.getCurrent();
        boolean z7 = false;
        if (current instanceof BitmapDrawable) {
            bitmap = ((BitmapDrawable) current).getBitmap();
        } else if (current instanceof Animatable) {
            bitmap = null;
        } else {
            bitmap = b(dVar, current, i8, i9);
            z7 = true;
        }
        if (!z7) {
            dVar = f12953a;
        }
        return C1083g.f(bitmap, dVar);
    }

    private static Bitmap b(M1.d dVar, Drawable drawable, int i8, int i9) {
        if (i8 == Integer.MIN_VALUE && drawable.getIntrinsicWidth() <= 0) {
            if (Log.isLoggable("DrawableToBitmap", 5)) {
                Log.w("DrawableToBitmap", "Unable to draw " + drawable + " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic width");
            }
            return null;
        }
        if (i9 == Integer.MIN_VALUE && drawable.getIntrinsicHeight() <= 0) {
            if (Log.isLoggable("DrawableToBitmap", 5)) {
                Log.w("DrawableToBitmap", "Unable to draw " + drawable + " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic height");
            }
            return null;
        }
        if (drawable.getIntrinsicWidth() > 0) {
            i8 = drawable.getIntrinsicWidth();
        }
        if (drawable.getIntrinsicHeight() > 0) {
            i9 = drawable.getIntrinsicHeight();
        }
        Lock h8 = H.h();
        h8.lock();
        Bitmap d8 = dVar.d(i8, i9, Bitmap.Config.ARGB_8888);
        try {
            Canvas canvas = new Canvas(d8);
            drawable.setBounds(0, 0, i8, i9);
            drawable.draw(canvas);
            canvas.setBitmap(null);
            return d8;
        } finally {
            h8.unlock();
        }
    }
}
