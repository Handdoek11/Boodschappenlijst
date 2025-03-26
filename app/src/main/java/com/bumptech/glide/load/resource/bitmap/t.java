package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.DisplayMetrics;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.bumptech.glide.load.resource.bitmap.n;
import com.bumptech.glide.load.resource.bitmap.z;
import d2.AbstractC5705g;
import d2.AbstractC5709k;
import d2.AbstractC5710l;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Queue;
import java.util.Set;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: f, reason: collision with root package name */
    public static final J1.g f12939f = J1.g.f("com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat", J1.b.f3464t);

    /* renamed from: g, reason: collision with root package name */
    public static final J1.g f12940g = J1.g.e("com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace");

    /* renamed from: h, reason: collision with root package name */
    public static final J1.g f12941h = n.f12934h;

    /* renamed from: i, reason: collision with root package name */
    public static final J1.g f12942i;

    /* renamed from: j, reason: collision with root package name */
    public static final J1.g f12943j;

    /* renamed from: k, reason: collision with root package name */
    private static final Set f12944k;

    /* renamed from: l, reason: collision with root package name */
    private static final b f12945l;

    /* renamed from: m, reason: collision with root package name */
    private static final Set f12946m;

    /* renamed from: n, reason: collision with root package name */
    private static final Queue f12947n;

    /* renamed from: a, reason: collision with root package name */
    private final M1.d f12948a;

    /* renamed from: b, reason: collision with root package name */
    private final DisplayMetrics f12949b;

    /* renamed from: c, reason: collision with root package name */
    private final M1.b f12950c;

    /* renamed from: d, reason: collision with root package name */
    private final List f12951d;

    /* renamed from: e, reason: collision with root package name */
    private final y f12952e = y.b();

    public interface b {
        void a();

        void b(M1.d dVar, Bitmap bitmap);
    }

    static {
        Boolean bool = Boolean.FALSE;
        f12942i = J1.g.f("com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize", bool);
        f12943j = J1.g.f("com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode", bool);
        f12944k = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList("image/vnd.wap.wbmp", "image/x-ico")));
        f12945l = new a();
        f12946m = DesugarCollections.unmodifiableSet(EnumSet.of(ImageHeaderParser.ImageType.JPEG, ImageHeaderParser.ImageType.PNG_A, ImageHeaderParser.ImageType.PNG));
        f12947n = AbstractC5710l.f(0);
    }

    public t(List list, DisplayMetrics displayMetrics, M1.d dVar, M1.b bVar) {
        this.f12951d = list;
        this.f12949b = (DisplayMetrics) AbstractC5709k.d(displayMetrics);
        this.f12948a = (M1.d) AbstractC5709k.d(dVar);
        this.f12950c = (M1.b) AbstractC5709k.d(bVar);
    }

    private static int a(double d8) {
        return x((d8 / (r1 / r0)) * x(l(d8) * d8));
    }

    private void b(z zVar, J1.b bVar, boolean z7, boolean z8, BitmapFactory.Options options, int i8, int i9) {
        boolean z9;
        if (this.f12952e.g(i8, i9, options, z7, z8)) {
            return;
        }
        if (bVar == J1.b.PREFER_ARGB_8888) {
            options.inPreferredConfig = Bitmap.Config.ARGB_8888;
            return;
        }
        try {
            z9 = zVar.d().hasAlpha();
        } catch (IOException e8) {
            if (Log.isLoggable("Downsampler", 3)) {
                Log.d("Downsampler", "Cannot determine whether the image has alpha or not from header, format " + bVar, e8);
            }
            z9 = false;
        }
        Bitmap.Config config = z9 ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565;
        options.inPreferredConfig = config;
        if (config == Bitmap.Config.RGB_565) {
            options.inDither = true;
        }
    }

    private static void c(ImageHeaderParser.ImageType imageType, z zVar, b bVar, M1.d dVar, n nVar, int i8, int i9, int i10, int i11, int i12, BitmapFactory.Options options) {
        int i13;
        int i14;
        int i15;
        int floor;
        double floor2;
        int i16;
        if (i9 <= 0 || i10 <= 0) {
            if (Log.isLoggable("Downsampler", 3)) {
                Log.d("Downsampler", "Unable to determine dimensions for: " + imageType + " with target [" + i11 + "x" + i12 + "]");
                return;
            }
            return;
        }
        if (r(i8)) {
            i14 = i9;
            i13 = i10;
        } else {
            i13 = i9;
            i14 = i10;
        }
        float b8 = nVar.b(i13, i14, i11, i12);
        if (b8 <= 0.0f) {
            throw new IllegalArgumentException("Cannot scale with factor: " + b8 + " from: " + nVar + ", source: [" + i9 + "x" + i10 + "], target: [" + i11 + "x" + i12 + "]");
        }
        n.g a8 = nVar.a(i13, i14, i11, i12);
        if (a8 == null) {
            throw new IllegalArgumentException("Cannot round with null rounding");
        }
        float f8 = i13;
        float f9 = i14;
        int x7 = i13 / x(b8 * f8);
        int x8 = i14 / x(b8 * f9);
        n.g gVar = n.g.MEMORY;
        int max = a8 == gVar ? Math.max(x7, x8) : Math.min(x7, x8);
        int i17 = Build.VERSION.SDK_INT;
        if (i17 > 23 || !f12944k.contains(options.outMimeType)) {
            int max2 = Math.max(1, Integer.highestOneBit(max));
            if (a8 == gVar && max2 < 1.0f / b8) {
                max2 <<= 1;
            }
            i15 = max2;
        } else {
            i15 = 1;
        }
        options.inSampleSize = i15;
        if (imageType == ImageHeaderParser.ImageType.JPEG) {
            float min = Math.min(i15, 8);
            floor = (int) Math.ceil(f8 / min);
            i16 = (int) Math.ceil(f9 / min);
            int i18 = i15 / 8;
            if (i18 > 0) {
                floor /= i18;
                i16 /= i18;
            }
        } else {
            if (imageType == ImageHeaderParser.ImageType.PNG || imageType == ImageHeaderParser.ImageType.PNG_A) {
                float f10 = i15;
                floor = (int) Math.floor(f8 / f10);
                floor2 = Math.floor(f9 / f10);
            } else if (imageType.isWebp()) {
                if (i17 >= 24) {
                    float f11 = i15;
                    floor = Math.round(f8 / f11);
                    i16 = Math.round(f9 / f11);
                } else {
                    float f12 = i15;
                    floor = (int) Math.floor(f8 / f12);
                    floor2 = Math.floor(f9 / f12);
                }
            } else if (i13 % i15 == 0 && i14 % i15 == 0) {
                floor = i13 / i15;
                i16 = i14 / i15;
            } else {
                int[] m8 = m(zVar, options, bVar, dVar);
                floor = m8[0];
                i16 = m8[1];
            }
            i16 = (int) floor2;
        }
        double b9 = nVar.b(floor, i16, i11, i12);
        options.inTargetDensity = a(b9);
        options.inDensity = l(b9);
        if (s(options)) {
            options.inScaled = true;
        } else {
            options.inTargetDensity = 0;
            options.inDensity = 0;
        }
        if (Log.isLoggable("Downsampler", 2)) {
            Log.v("Downsampler", "Calculate scaling, source: [" + i9 + "x" + i10 + "], degreesToRotate: " + i8 + ", target: [" + i11 + "x" + i12 + "], power of two scaled: [" + floor + "x" + i16 + "], exact scale factor: " + b8 + ", power of 2 sample size: " + i15 + ", adjusted scale factor: " + b9 + ", target density: " + options.inTargetDensity + ", density: " + options.inDensity);
        }
    }

    private L1.c e(z zVar, int i8, int i9, J1.h hVar, b bVar) {
        byte[] bArr = (byte[]) this.f12950c.e(65536, byte[].class);
        BitmapFactory.Options k8 = k();
        k8.inTempStorage = bArr;
        J1.b bVar2 = (J1.b) hVar.c(f12939f);
        J1.i iVar = (J1.i) hVar.c(f12940g);
        n nVar = (n) hVar.c(n.f12934h);
        boolean booleanValue = ((Boolean) hVar.c(f12942i)).booleanValue();
        J1.g gVar = f12943j;
        try {
            return C1083g.f(h(zVar, k8, nVar, bVar2, iVar, hVar.c(gVar) != null && ((Boolean) hVar.c(gVar)).booleanValue(), i8, i9, booleanValue, bVar), this.f12948a);
        } finally {
            v(k8);
            this.f12950c.d(bArr);
        }
    }

    private Bitmap h(z zVar, BitmapFactory.Options options, n nVar, J1.b bVar, J1.i iVar, boolean z7, int i8, int i9, boolean z8, b bVar2) {
        int i10;
        int i11;
        String str;
        int i12;
        int round;
        int i13;
        int i14;
        long b8 = AbstractC5705g.b();
        int[] m8 = m(zVar, options, bVar2, this.f12948a);
        int i15 = m8[0];
        int i16 = m8[1];
        String str2 = options.outMimeType;
        boolean z9 = (i15 == -1 || i16 == -1) ? false : z7;
        int a8 = zVar.a();
        int i17 = H.i(a8);
        boolean l8 = H.l(a8);
        if (i8 == Integer.MIN_VALUE) {
            i10 = i9;
            i11 = r(i17) ? i16 : i15;
        } else {
            i10 = i9;
            i11 = i8;
        }
        int i18 = i10 == Integer.MIN_VALUE ? r(i17) ? i15 : i16 : i10;
        ImageHeaderParser.ImageType d8 = zVar.d();
        c(d8, zVar, bVar2, this.f12948a, nVar, i17, i15, i16, i11, i18, options);
        b(zVar, bVar, z9, l8, options, i11, i18);
        int i19 = Build.VERSION.SDK_INT;
        if (z(d8)) {
            if (i15 < 0 || i16 < 0 || !z8) {
                float f8 = s(options) ? options.inTargetDensity / options.inDensity : 1.0f;
                int i20 = options.inSampleSize;
                float f9 = i20;
                int ceil = (int) Math.ceil(i15 / f9);
                int ceil2 = (int) Math.ceil(i16 / f9);
                int round2 = Math.round(ceil * f8);
                round = Math.round(ceil2 * f8);
                str = "Downsampler";
                if (Log.isLoggable(str, 2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Calculated target [");
                    sb.append(round2);
                    sb.append("x");
                    sb.append(round);
                    i13 = round2;
                    sb.append("] for source [");
                    sb.append(i15);
                    sb.append("x");
                    sb.append(i16);
                    sb.append("], sampleSize: ");
                    sb.append(i20);
                    sb.append(", targetDensity: ");
                    sb.append(options.inTargetDensity);
                    sb.append(", density: ");
                    sb.append(options.inDensity);
                    sb.append(", density multiplier: ");
                    sb.append(f8);
                    Log.v(str, sb.toString());
                } else {
                    i13 = round2;
                }
                i14 = i13;
            } else {
                str = "Downsampler";
                i14 = i11;
                round = i18;
            }
            if (i14 > 0 && round > 0) {
                y(options, this.f12948a, i14, round);
            }
        } else {
            str = "Downsampler";
        }
        if (iVar != null) {
            if (i19 >= 28) {
                options.inPreferredColorSpace = ColorSpace.get((iVar == J1.i.DISPLAY_P3 && options.outColorSpace != null && options.outColorSpace.isWideGamut()) ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB);
            } else if (i19 >= 26) {
                options.inPreferredColorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
            }
        }
        Bitmap i21 = i(zVar, options, bVar2, this.f12948a);
        bVar2.b(this.f12948a, i21);
        if (Log.isLoggable(str, 2)) {
            i12 = a8;
            t(i15, i16, str2, options, i21, i8, i9, b8);
        } else {
            i12 = a8;
        }
        if (i21 == null) {
            return null;
        }
        i21.setDensity(this.f12949b.densityDpi);
        Bitmap m9 = H.m(this.f12948a, i21, i12);
        if (i21.equals(m9)) {
            return m9;
        }
        this.f12948a.c(i21);
        return m9;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:?, code lost:
    
        throw r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static android.graphics.Bitmap i(com.bumptech.glide.load.resource.bitmap.z r5, android.graphics.BitmapFactory.Options r6, com.bumptech.glide.load.resource.bitmap.t.b r7, M1.d r8) {
        /*
            java.lang.String r0 = "Downsampler"
            boolean r1 = r6.inJustDecodeBounds
            if (r1 != 0) goto Lc
            r7.a()
            r5.c()
        Lc:
            int r1 = r6.outWidth
            int r2 = r6.outHeight
            java.lang.String r3 = r6.outMimeType
            java.util.concurrent.locks.Lock r4 = com.bumptech.glide.load.resource.bitmap.H.h()
            r4.lock()
            android.graphics.Bitmap r5 = r5.b(r6)     // Catch: java.lang.Throwable -> L25 java.lang.IllegalArgumentException -> L27
            java.util.concurrent.locks.Lock r6 = com.bumptech.glide.load.resource.bitmap.H.h()
            r6.unlock()
            return r5
        L25:
            r5 = move-exception
            goto L50
        L27:
            r4 = move-exception
            java.io.IOException r1 = u(r4, r1, r2, r3, r6)     // Catch: java.lang.Throwable -> L25
            r2 = 3
            boolean r2 = android.util.Log.isLoggable(r0, r2)     // Catch: java.lang.Throwable -> L25
            if (r2 == 0) goto L38
            java.lang.String r2 = "Failed to decode with inBitmap, trying again without Bitmap re-use"
            android.util.Log.d(r0, r2, r1)     // Catch: java.lang.Throwable -> L25
        L38:
            android.graphics.Bitmap r0 = r6.inBitmap     // Catch: java.lang.Throwable -> L25
            if (r0 == 0) goto L4f
            r8.c(r0)     // Catch: java.lang.Throwable -> L25 java.io.IOException -> L4e
            r0 = 0
            r6.inBitmap = r0     // Catch: java.lang.Throwable -> L25 java.io.IOException -> L4e
            android.graphics.Bitmap r5 = i(r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L25 java.io.IOException -> L4e
            java.util.concurrent.locks.Lock r6 = com.bumptech.glide.load.resource.bitmap.H.h()
            r6.unlock()
            return r5
        L4e:
            throw r1     // Catch: java.lang.Throwable -> L25
        L4f:
            throw r1     // Catch: java.lang.Throwable -> L25
        L50:
            java.util.concurrent.locks.Lock r6 = com.bumptech.glide.load.resource.bitmap.H.h()
            r6.unlock()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.resource.bitmap.t.i(com.bumptech.glide.load.resource.bitmap.z, android.graphics.BitmapFactory$Options, com.bumptech.glide.load.resource.bitmap.t$b, M1.d):android.graphics.Bitmap");
    }

    private static String j(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig() + (" (" + bitmap.getAllocationByteCount() + ")");
    }

    private static synchronized BitmapFactory.Options k() {
        BitmapFactory.Options options;
        synchronized (t.class) {
            Queue queue = f12947n;
            synchronized (queue) {
                options = (BitmapFactory.Options) queue.poll();
            }
            if (options == null) {
                options = new BitmapFactory.Options();
                w(options);
            }
        }
        return options;
    }

    private static int l(double d8) {
        if (d8 > 1.0d) {
            d8 = 1.0d / d8;
        }
        return (int) Math.round(d8 * 2.147483647E9d);
    }

    private static int[] m(z zVar, BitmapFactory.Options options, b bVar, M1.d dVar) {
        options.inJustDecodeBounds = true;
        i(zVar, options, bVar, dVar);
        options.inJustDecodeBounds = false;
        return new int[]{options.outWidth, options.outHeight};
    }

    private static String n(BitmapFactory.Options options) {
        return j(options.inBitmap);
    }

    private static boolean r(int i8) {
        return i8 == 90 || i8 == 270;
    }

    private static boolean s(BitmapFactory.Options options) {
        int i8;
        int i9 = options.inTargetDensity;
        return i9 > 0 && (i8 = options.inDensity) > 0 && i9 != i8;
    }

    private static void t(int i8, int i9, String str, BitmapFactory.Options options, Bitmap bitmap, int i10, int i11, long j8) {
        Log.v("Downsampler", "Decoded " + j(bitmap) + " from [" + i8 + "x" + i9 + "] " + str + " with inBitmap " + n(options) + " for [" + i10 + "x" + i11 + "], sample size: " + options.inSampleSize + ", density: " + options.inDensity + ", target density: " + options.inTargetDensity + ", thread: " + Thread.currentThread().getName() + ", duration: " + AbstractC5705g.a(j8));
    }

    private static IOException u(IllegalArgumentException illegalArgumentException, int i8, int i9, String str, BitmapFactory.Options options) {
        return new IOException("Exception decoding bitmap, outWidth: " + i8 + ", outHeight: " + i9 + ", outMimeType: " + str + ", inBitmap: " + n(options), illegalArgumentException);
    }

    private static void v(BitmapFactory.Options options) {
        w(options);
        Queue queue = f12947n;
        synchronized (queue) {
            queue.offer(options);
        }
    }

    private static void w(BitmapFactory.Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.inDensity = 0;
        options.inTargetDensity = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            options.inPreferredColorSpace = null;
            options.outColorSpace = null;
            options.outConfig = null;
        }
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }

    private static int x(double d8) {
        return (int) (d8 + 0.5d);
    }

    private static void y(BitmapFactory.Options options, M1.d dVar, int i8, int i9) {
        Bitmap.Config config;
        if (Build.VERSION.SDK_INT < 26) {
            config = null;
        } else if (options.inPreferredConfig == Bitmap.Config.HARDWARE) {
            return;
        } else {
            config = options.outConfig;
        }
        if (config == null) {
            config = options.inPreferredConfig;
        }
        options.inBitmap = dVar.e(i8, i9, config);
    }

    private boolean z(ImageHeaderParser.ImageType imageType) {
        return true;
    }

    public L1.c d(ParcelFileDescriptor parcelFileDescriptor, int i8, int i9, J1.h hVar) {
        return e(new z.c(parcelFileDescriptor, this.f12951d, this.f12950c), i8, i9, hVar, f12945l);
    }

    public L1.c f(InputStream inputStream, int i8, int i9, J1.h hVar, b bVar) {
        return e(new z.b(inputStream, this.f12951d, this.f12950c), i8, i9, hVar, bVar);
    }

    public L1.c g(ByteBuffer byteBuffer, int i8, int i9, J1.h hVar) {
        return e(new z.a(byteBuffer, this.f12951d, this.f12950c), i8, i9, hVar, f12945l);
    }

    public boolean o(ParcelFileDescriptor parcelFileDescriptor) {
        return ParcelFileDescriptorRewinder.c();
    }

    public boolean p(InputStream inputStream) {
        return true;
    }

    public boolean q(ByteBuffer byteBuffer) {
        return true;
    }

    class a implements b {
        a() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.t.b
        public void a() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.t.b
        public void b(M1.d dVar, Bitmap bitmap) {
        }
    }
}
