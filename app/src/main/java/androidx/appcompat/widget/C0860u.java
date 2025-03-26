package androidx.appcompat.widget;

import android.R;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.drawable.shapes.Shape;
import android.util.AttributeSet;
import android.widget.ProgressBar;

/* renamed from: androidx.appcompat.widget.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C0860u {

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f7935c = {R.attr.indeterminateDrawable, R.attr.progressDrawable};

    /* renamed from: a, reason: collision with root package name */
    private final ProgressBar f7936a;

    /* renamed from: b, reason: collision with root package name */
    private Bitmap f7937b;

    /* renamed from: androidx.appcompat.widget.u$a */
    private static class a {
        public static void a(LayerDrawable layerDrawable, LayerDrawable layerDrawable2, int i8) {
            layerDrawable2.setLayerGravity(i8, layerDrawable.getLayerGravity(i8));
            layerDrawable2.setLayerWidth(i8, layerDrawable.getLayerWidth(i8));
            layerDrawable2.setLayerHeight(i8, layerDrawable.getLayerHeight(i8));
            layerDrawable2.setLayerInsetLeft(i8, layerDrawable.getLayerInsetLeft(i8));
            layerDrawable2.setLayerInsetRight(i8, layerDrawable.getLayerInsetRight(i8));
            layerDrawable2.setLayerInsetTop(i8, layerDrawable.getLayerInsetTop(i8));
            layerDrawable2.setLayerInsetBottom(i8, layerDrawable.getLayerInsetBottom(i8));
            layerDrawable2.setLayerInsetStart(i8, layerDrawable.getLayerInsetStart(i8));
            layerDrawable2.setLayerInsetEnd(i8, layerDrawable.getLayerInsetEnd(i8));
        }
    }

    C0860u(ProgressBar progressBar) {
        this.f7936a = progressBar;
    }

    private Shape a() {
        return new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null);
    }

    private Drawable e(Drawable drawable) {
        if (!(drawable instanceof AnimationDrawable)) {
            return drawable;
        }
        AnimationDrawable animationDrawable = (AnimationDrawable) drawable;
        int numberOfFrames = animationDrawable.getNumberOfFrames();
        AnimationDrawable animationDrawable2 = new AnimationDrawable();
        animationDrawable2.setOneShot(animationDrawable.isOneShot());
        for (int i8 = 0; i8 < numberOfFrames; i8++) {
            Drawable d8 = d(animationDrawable.getFrame(i8), true);
            d8.setLevel(10000);
            animationDrawable2.addFrame(d8, animationDrawable.getDuration(i8));
        }
        animationDrawable2.setLevel(10000);
        return animationDrawable2;
    }

    Bitmap b() {
        return this.f7937b;
    }

    void c(AttributeSet attributeSet, int i8) {
        f0 v7 = f0.v(this.f7936a.getContext(), attributeSet, f7935c, i8, 0);
        Drawable h8 = v7.h(0);
        if (h8 != null) {
            this.f7936a.setIndeterminateDrawable(e(h8));
        }
        Drawable h9 = v7.h(1);
        if (h9 != null) {
            this.f7936a.setProgressDrawable(d(h9, false));
        }
        v7.x();
    }

    /* JADX WARN: Multi-variable type inference failed */
    Drawable d(Drawable drawable, boolean z7) {
        if (drawable instanceof r0.b) {
            r0.b bVar = (r0.b) drawable;
            Drawable b8 = bVar.b();
            if (b8 != null) {
                bVar.a(d(b8, z7));
            }
        } else {
            if (drawable instanceof LayerDrawable) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                int numberOfLayers = layerDrawable.getNumberOfLayers();
                Drawable[] drawableArr = new Drawable[numberOfLayers];
                for (int i8 = 0; i8 < numberOfLayers; i8++) {
                    int id = layerDrawable.getId(i8);
                    drawableArr[i8] = d(layerDrawable.getDrawable(i8), id == 16908301 || id == 16908303);
                }
                LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
                for (int i9 = 0; i9 < numberOfLayers; i9++) {
                    layerDrawable2.setId(i9, layerDrawable.getId(i9));
                    a.a(layerDrawable, layerDrawable2, i9);
                }
                return layerDrawable2;
            }
            if (drawable instanceof BitmapDrawable) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                Bitmap bitmap = bitmapDrawable.getBitmap();
                if (this.f7937b == null) {
                    this.f7937b = bitmap;
                }
                ShapeDrawable shapeDrawable = new ShapeDrawable(a());
                shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
                shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
                return z7 ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
            }
        }
        return drawable;
    }
}
