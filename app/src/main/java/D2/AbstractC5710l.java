package d2;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Queue;

/* renamed from: d2.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5710l {

    /* renamed from: a, reason: collision with root package name */
    private static final char[] f35230a = "0123456789abcdef".toCharArray();

    /* renamed from: b, reason: collision with root package name */
    private static final char[] f35231b = new char[64];

    /* renamed from: c, reason: collision with root package name */
    private static volatile Handler f35232c;

    /* renamed from: d2.l$a */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f35233a;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            f35233a = iArr;
            try {
                iArr[Bitmap.Config.ALPHA_8.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f35233a[Bitmap.Config.RGB_565.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f35233a[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f35233a[Bitmap.Config.RGBA_F16.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f35233a[Bitmap.Config.ARGB_8888.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public static void a() {
        if (!s()) {
            throw new IllegalArgumentException("You must call this method on the main thread");
        }
    }

    public static boolean b(Z1.a aVar, Z1.a aVar2) {
        return aVar == null ? aVar2 == null : aVar.J(aVar2);
    }

    public static boolean c(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static boolean d(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    private static String e(byte[] bArr, char[] cArr) {
        for (int i8 = 0; i8 < bArr.length; i8++) {
            byte b8 = bArr[i8];
            int i9 = i8 * 2;
            char[] cArr2 = f35230a;
            cArr[i9] = cArr2[(b8 & 255) >>> 4];
            cArr[i9 + 1] = cArr2[b8 & 15];
        }
        return new String(cArr);
    }

    public static Queue f(int i8) {
        return new ArrayDeque(i8);
    }

    public static int g(int i8, int i9, Bitmap.Config config) {
        return i8 * i9 * i(config);
    }

    public static int h(Bitmap bitmap) {
        if (!bitmap.isRecycled()) {
            try {
                return bitmap.getAllocationByteCount();
            } catch (NullPointerException unused) {
                return bitmap.getHeight() * bitmap.getRowBytes();
            }
        }
        throw new IllegalStateException("Cannot obtain size for recycled Bitmap: " + bitmap + "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig());
    }

    public static int i(Bitmap.Config config) {
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        int i8 = a.f35233a[config.ordinal()];
        if (i8 == 1) {
            return 1;
        }
        if (i8 == 2 || i8 == 3) {
            return 2;
        }
        return i8 != 4 ? 4 : 8;
    }

    public static List j(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (Object obj : collection) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    private static Handler k() {
        if (f35232c == null) {
            synchronized (AbstractC5710l.class) {
                try {
                    if (f35232c == null) {
                        f35232c = new Handler(Looper.getMainLooper());
                    }
                } finally {
                }
            }
        }
        return f35232c;
    }

    public static int l(float f8) {
        return m(f8, 17);
    }

    public static int m(float f8, int i8) {
        return o(Float.floatToIntBits(f8), i8);
    }

    public static int n(int i8) {
        return o(i8, 17);
    }

    public static int o(int i8, int i9) {
        return (i9 * 31) + i8;
    }

    public static int p(Object obj, int i8) {
        return o(obj == null ? 0 : obj.hashCode(), i8);
    }

    public static int q(boolean z7, int i8) {
        return o(z7 ? 1 : 0, i8);
    }

    public static boolean r() {
        return !s();
    }

    public static boolean s() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public static boolean t(int i8) {
        return i8 > 0 || i8 == Integer.MIN_VALUE;
    }

    public static boolean u(int i8, int i9) {
        return t(i8) && t(i9);
    }

    public static void v(Runnable runnable) {
        k().post(runnable);
    }

    public static void w(Runnable runnable) {
        k().removeCallbacks(runnable);
    }

    public static String x(byte[] bArr) {
        String e8;
        char[] cArr = f35231b;
        synchronized (cArr) {
            e8 = e(bArr, cArr);
        }
        return e8;
    }
}
