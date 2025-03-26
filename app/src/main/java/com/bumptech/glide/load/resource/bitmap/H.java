package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Build;
import android.util.Log;
import d2.AbstractC5709k;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public abstract class H {

    /* renamed from: a, reason: collision with root package name */
    private static final Paint f12895a = new Paint(6);

    /* renamed from: b, reason: collision with root package name */
    private static final Paint f12896b = new Paint(7);

    /* renamed from: c, reason: collision with root package name */
    private static final Paint f12897c;

    /* renamed from: d, reason: collision with root package name */
    private static final Set f12898d;

    /* renamed from: e, reason: collision with root package name */
    private static final Lock f12899e;

    class a implements b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f12900a;

        a(int i8) {
            this.f12900a = i8;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.H.b
        public void a(Canvas canvas, Paint paint, RectF rectF) {
            int i8 = this.f12900a;
            canvas.drawRoundRect(rectF, i8, i8, paint);
        }
    }

    private interface b {
        void a(Canvas canvas, Paint paint, RectF rectF);
    }

    private static final class c implements Lock {
        c() {
        }

        @Override // java.util.concurrent.locks.Lock
        public void lock() {
        }

        @Override // java.util.concurrent.locks.Lock
        public void lockInterruptibly() {
        }

        @Override // java.util.concurrent.locks.Lock
        public Condition newCondition() {
            throw new UnsupportedOperationException("Should not be called");
        }

        @Override // java.util.concurrent.locks.Lock
        public boolean tryLock() {
            return true;
        }

        @Override // java.util.concurrent.locks.Lock
        public void unlock() {
        }

        @Override // java.util.concurrent.locks.Lock
        public boolean tryLock(long j8, TimeUnit timeUnit) {
            return true;
        }
    }

    static {
        HashSet hashSet = new HashSet(Arrays.asList("XT1085", "XT1092", "XT1093", "XT1094", "XT1095", "XT1096", "XT1097", "XT1098", "XT1031", "XT1028", "XT937C", "XT1032", "XT1008", "XT1033", "XT1035", "XT1034", "XT939G", "XT1039", "XT1040", "XT1042", "XT1045", "XT1063", "XT1064", "XT1068", "XT1069", "XT1072", "XT1077", "XT1078", "XT1079"));
        f12898d = hashSet;
        f12899e = hashSet.contains(Build.MODEL) ? new ReentrantLock() : new c();
        Paint paint = new Paint(7);
        f12897c = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
    }

    private static void a(Bitmap bitmap, Bitmap bitmap2, Matrix matrix) {
        Lock lock = f12899e;
        lock.lock();
        try {
            Canvas canvas = new Canvas(bitmap2);
            canvas.drawBitmap(bitmap, matrix, f12895a);
            d(canvas);
            lock.unlock();
        } catch (Throwable th) {
            f12899e.unlock();
            throw th;
        }
    }

    public static Bitmap b(M1.d dVar, Bitmap bitmap, int i8, int i9) {
        float width;
        float height;
        if (bitmap.getWidth() == i8 && bitmap.getHeight() == i9) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        float f8 = 0.0f;
        if (bitmap.getWidth() * i9 > bitmap.getHeight() * i8) {
            width = i9 / bitmap.getHeight();
            f8 = (i8 - (bitmap.getWidth() * width)) * 0.5f;
            height = 0.0f;
        } else {
            width = i8 / bitmap.getWidth();
            height = (i9 - (bitmap.getHeight() * width)) * 0.5f;
        }
        matrix.setScale(width, width);
        matrix.postTranslate((int) (f8 + 0.5f), (int) (height + 0.5f));
        Bitmap d8 = dVar.d(i8, i9, j(bitmap));
        p(bitmap, d8);
        a(bitmap, d8, matrix);
        return d8;
    }

    public static Bitmap c(M1.d dVar, Bitmap bitmap, int i8, int i9) {
        if (bitmap.getWidth() > i8 || bitmap.getHeight() > i9) {
            if (Log.isLoggable("TransformationUtils", 2)) {
                Log.v("TransformationUtils", "requested target size too big for input, fit centering instead");
            }
            return e(dVar, bitmap, i8, i9);
        }
        if (Log.isLoggable("TransformationUtils", 2)) {
            Log.v("TransformationUtils", "requested target size larger or equal to input, returning input");
        }
        return bitmap;
    }

    private static void d(Canvas canvas) {
        canvas.setBitmap(null);
    }

    public static Bitmap e(M1.d dVar, Bitmap bitmap, int i8, int i9) {
        if (bitmap.getWidth() == i8 && bitmap.getHeight() == i9) {
            if (Log.isLoggable("TransformationUtils", 2)) {
                Log.v("TransformationUtils", "requested target size matches input, returning input");
            }
            return bitmap;
        }
        float min = Math.min(i8 / bitmap.getWidth(), i9 / bitmap.getHeight());
        int round = Math.round(bitmap.getWidth() * min);
        int round2 = Math.round(bitmap.getHeight() * min);
        if (bitmap.getWidth() == round && bitmap.getHeight() == round2) {
            if (Log.isLoggable("TransformationUtils", 2)) {
                Log.v("TransformationUtils", "adjusted target size matches input, returning input");
            }
            return bitmap;
        }
        Bitmap d8 = dVar.d((int) (bitmap.getWidth() * min), (int) (bitmap.getHeight() * min), j(bitmap));
        p(bitmap, d8);
        if (Log.isLoggable("TransformationUtils", 2)) {
            Log.v("TransformationUtils", "request: " + i8 + "x" + i9);
            Log.v("TransformationUtils", "toFit:   " + bitmap.getWidth() + "x" + bitmap.getHeight());
            Log.v("TransformationUtils", "toReuse: " + d8.getWidth() + "x" + d8.getHeight());
            StringBuilder sb = new StringBuilder();
            sb.append("minPct:   ");
            sb.append(min);
            Log.v("TransformationUtils", sb.toString());
        }
        Matrix matrix = new Matrix();
        matrix.setScale(min, min);
        a(bitmap, d8, matrix);
        return d8;
    }

    private static Bitmap f(M1.d dVar, Bitmap bitmap) {
        Bitmap.Config g8 = g(bitmap);
        if (g8.equals(bitmap.getConfig())) {
            return bitmap;
        }
        Bitmap d8 = dVar.d(bitmap.getWidth(), bitmap.getHeight(), g8);
        new Canvas(d8).drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        return d8;
    }

    private static Bitmap.Config g(Bitmap bitmap) {
        return (Build.VERSION.SDK_INT < 26 || !Bitmap.Config.RGBA_F16.equals(bitmap.getConfig())) ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGBA_F16;
    }

    public static Lock h() {
        return f12899e;
    }

    public static int i(int i8) {
        switch (i8) {
            case 3:
            case 4:
                return 180;
            case 5:
            case 6:
                return 90;
            case 7:
            case 8:
                return 270;
            default:
                return 0;
        }
    }

    private static Bitmap.Config j(Bitmap bitmap) {
        return bitmap.getConfig() != null ? bitmap.getConfig() : Bitmap.Config.ARGB_8888;
    }

    static void k(int i8, Matrix matrix) {
        switch (i8) {
            case 2:
                matrix.setScale(-1.0f, 1.0f);
                break;
            case 3:
                matrix.setRotate(180.0f);
                break;
            case 4:
                matrix.setRotate(180.0f);
                matrix.postScale(-1.0f, 1.0f);
                break;
            case 5:
                matrix.setRotate(90.0f);
                matrix.postScale(-1.0f, 1.0f);
                break;
            case 6:
                matrix.setRotate(90.0f);
                break;
            case 7:
                matrix.setRotate(-90.0f);
                matrix.postScale(-1.0f, 1.0f);
                break;
            case 8:
                matrix.setRotate(-90.0f);
                break;
        }
    }

    public static boolean l(int i8) {
        switch (i8) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return true;
            default:
                return false;
        }
    }

    public static Bitmap m(M1.d dVar, Bitmap bitmap, int i8) {
        if (!l(i8)) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        k(i8, matrix);
        RectF rectF = new RectF(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight());
        matrix.mapRect(rectF);
        Bitmap d8 = dVar.d(Math.round(rectF.width()), Math.round(rectF.height()), j(bitmap));
        matrix.postTranslate(-rectF.left, -rectF.top);
        d8.setHasAlpha(bitmap.hasAlpha());
        a(bitmap, d8, matrix);
        return d8;
    }

    public static Bitmap n(M1.d dVar, Bitmap bitmap, int i8) {
        AbstractC5709k.a(i8 > 0, "roundingRadius must be greater than 0.");
        return o(dVar, bitmap, new a(i8));
    }

    private static Bitmap o(M1.d dVar, Bitmap bitmap, b bVar) {
        Bitmap.Config g8 = g(bitmap);
        Bitmap f8 = f(dVar, bitmap);
        Bitmap d8 = dVar.d(f8.getWidth(), f8.getHeight(), g8);
        d8.setHasAlpha(true);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(f8, tileMode, tileMode);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setShader(bitmapShader);
        RectF rectF = new RectF(0.0f, 0.0f, d8.getWidth(), d8.getHeight());
        Lock lock = f12899e;
        lock.lock();
        try {
            Canvas canvas = new Canvas(d8);
            canvas.drawColor(0, PorterDuff.Mode.CLEAR);
            bVar.a(canvas, paint, rectF);
            d(canvas);
            lock.unlock();
            if (!f8.equals(bitmap)) {
                dVar.c(f8);
            }
            return d8;
        } catch (Throwable th) {
            f12899e.unlock();
            throw th;
        }
    }

    public static void p(Bitmap bitmap, Bitmap bitmap2) {
        bitmap2.setHasAlpha(bitmap.hasAlpha());
    }
}
