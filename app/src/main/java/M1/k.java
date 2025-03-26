package M1;

import android.graphics.Bitmap;
import android.os.Build;
import android.util.Log;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public class k implements d {

    /* renamed from: k, reason: collision with root package name */
    private static final Bitmap.Config f3749k = Bitmap.Config.ARGB_8888;

    /* renamed from: a, reason: collision with root package name */
    private final l f3750a;

    /* renamed from: b, reason: collision with root package name */
    private final Set f3751b;

    /* renamed from: c, reason: collision with root package name */
    private final long f3752c;

    /* renamed from: d, reason: collision with root package name */
    private final a f3753d;

    /* renamed from: e, reason: collision with root package name */
    private long f3754e;

    /* renamed from: f, reason: collision with root package name */
    private long f3755f;

    /* renamed from: g, reason: collision with root package name */
    private int f3756g;

    /* renamed from: h, reason: collision with root package name */
    private int f3757h;

    /* renamed from: i, reason: collision with root package name */
    private int f3758i;

    /* renamed from: j, reason: collision with root package name */
    private int f3759j;

    private interface a {
        void a(Bitmap bitmap);

        void b(Bitmap bitmap);
    }

    k(long j8, l lVar, Set set) {
        this.f3752c = j8;
        this.f3754e = j8;
        this.f3750a = lVar;
        this.f3751b = set;
        this.f3753d = new b();
    }

    private static void f(Bitmap.Config config) {
        if (Build.VERSION.SDK_INT >= 26 && config == Bitmap.Config.HARDWARE) {
            throw new IllegalArgumentException("Cannot create a mutable Bitmap with config: " + config + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
        }
    }

    private static Bitmap g(int i8, int i9, Bitmap.Config config) {
        if (config == null) {
            config = f3749k;
        }
        return Bitmap.createBitmap(i8, i9, config);
    }

    private void h() {
        if (Log.isLoggable("LruBitmapPool", 2)) {
            i();
        }
    }

    private void i() {
        Log.v("LruBitmapPool", "Hits=" + this.f3756g + ", misses=" + this.f3757h + ", puts=" + this.f3758i + ", evictions=" + this.f3759j + ", currentSize=" + this.f3755f + ", maxSize=" + this.f3754e + "\nStrategy=" + this.f3750a);
    }

    private void j() {
        q(this.f3754e);
    }

    private static Set k() {
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        int i8 = Build.VERSION.SDK_INT;
        hashSet.add(null);
        if (i8 >= 26) {
            hashSet.remove(Bitmap.Config.HARDWARE);
        }
        return DesugarCollections.unmodifiableSet(hashSet);
    }

    private static l l() {
        return new o();
    }

    private synchronized Bitmap m(int i8, int i9, Bitmap.Config config) {
        Bitmap d8;
        try {
            f(config);
            d8 = this.f3750a.d(i8, i9, config != null ? config : f3749k);
            if (d8 == null) {
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    Log.d("LruBitmapPool", "Missing bitmap=" + this.f3750a.a(i8, i9, config));
                }
                this.f3757h++;
            } else {
                this.f3756g++;
                this.f3755f -= this.f3750a.b(d8);
                this.f3753d.a(d8);
                p(d8);
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                Log.v("LruBitmapPool", "Get bitmap=" + this.f3750a.a(i8, i9, config));
            }
            h();
        } catch (Throwable th) {
            throw th;
        }
        return d8;
    }

    private static void o(Bitmap bitmap) {
        bitmap.setPremultiplied(true);
    }

    private static void p(Bitmap bitmap) {
        bitmap.setHasAlpha(true);
        o(bitmap);
    }

    private synchronized void q(long j8) {
        while (this.f3755f > j8) {
            try {
                Bitmap removeLast = this.f3750a.removeLast();
                if (removeLast == null) {
                    if (Log.isLoggable("LruBitmapPool", 5)) {
                        Log.w("LruBitmapPool", "Size mismatch, resetting");
                        i();
                    }
                    this.f3755f = 0L;
                    return;
                }
                this.f3753d.a(removeLast);
                this.f3755f -= this.f3750a.b(removeLast);
                this.f3759j++;
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    Log.d("LruBitmapPool", "Evicting bitmap=" + this.f3750a.e(removeLast));
                }
                h();
                removeLast.recycle();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // M1.d
    public void a(int i8) {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "trimMemory, level=" + i8);
        }
        if (i8 >= 40 || i8 >= 20) {
            b();
        } else if (i8 >= 20 || i8 == 15) {
            q(n() / 2);
        }
    }

    @Override // M1.d
    public void b() {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "clearMemory");
        }
        q(0L);
    }

    @Override // M1.d
    public synchronized void c(Bitmap bitmap) {
        try {
            if (bitmap == null) {
                throw new NullPointerException("Bitmap must not be null");
            }
            if (bitmap.isRecycled()) {
                throw new IllegalStateException("Cannot pool recycled bitmap");
            }
            if (bitmap.isMutable() && this.f3750a.b(bitmap) <= this.f3754e && this.f3751b.contains(bitmap.getConfig())) {
                int b8 = this.f3750a.b(bitmap);
                this.f3750a.c(bitmap);
                this.f3753d.b(bitmap);
                this.f3758i++;
                this.f3755f += b8;
                if (Log.isLoggable("LruBitmapPool", 2)) {
                    Log.v("LruBitmapPool", "Put bitmap in pool=" + this.f3750a.e(bitmap));
                }
                h();
                j();
                return;
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                Log.v("LruBitmapPool", "Reject bitmap from pool, bitmap: " + this.f3750a.e(bitmap) + ", is mutable: " + bitmap.isMutable() + ", is allowed config: " + this.f3751b.contains(bitmap.getConfig()));
            }
            bitmap.recycle();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // M1.d
    public Bitmap d(int i8, int i9, Bitmap.Config config) {
        Bitmap m8 = m(i8, i9, config);
        if (m8 == null) {
            return g(i8, i9, config);
        }
        m8.eraseColor(0);
        return m8;
    }

    @Override // M1.d
    public Bitmap e(int i8, int i9, Bitmap.Config config) {
        Bitmap m8 = m(i8, i9, config);
        return m8 == null ? g(i8, i9, config) : m8;
    }

    public long n() {
        return this.f3754e;
    }

    public k(long j8) {
        this(j8, l(), k());
    }

    private static final class b implements a {
        b() {
        }

        @Override // M1.k.a
        public void a(Bitmap bitmap) {
        }

        @Override // M1.k.a
        public void b(Bitmap bitmap) {
        }
    }
}
