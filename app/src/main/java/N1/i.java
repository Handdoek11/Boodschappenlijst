package N1;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    private final int f4072a;

    /* renamed from: b, reason: collision with root package name */
    private final int f4073b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f4074c;

    /* renamed from: d, reason: collision with root package name */
    private final int f4075d;

    public static final class a {

        /* renamed from: i, reason: collision with root package name */
        static final int f4076i;

        /* renamed from: a, reason: collision with root package name */
        final Context f4077a;

        /* renamed from: b, reason: collision with root package name */
        ActivityManager f4078b;

        /* renamed from: c, reason: collision with root package name */
        c f4079c;

        /* renamed from: e, reason: collision with root package name */
        float f4081e;

        /* renamed from: d, reason: collision with root package name */
        float f4080d = 2.0f;

        /* renamed from: f, reason: collision with root package name */
        float f4082f = 0.4f;

        /* renamed from: g, reason: collision with root package name */
        float f4083g = 0.33f;

        /* renamed from: h, reason: collision with root package name */
        int f4084h = 4194304;

        static {
            f4076i = Build.VERSION.SDK_INT < 26 ? 4 : 1;
        }

        public a(Context context) {
            this.f4081e = f4076i;
            this.f4077a = context;
            this.f4078b = (ActivityManager) context.getSystemService("activity");
            this.f4079c = new b(context.getResources().getDisplayMetrics());
            if (Build.VERSION.SDK_INT < 26 || !i.e(this.f4078b)) {
                return;
            }
            this.f4081e = 0.0f;
        }

        public i a() {
            return new i(this);
        }
    }

    private static final class b implements c {

        /* renamed from: a, reason: collision with root package name */
        private final DisplayMetrics f4085a;

        b(DisplayMetrics displayMetrics) {
            this.f4085a = displayMetrics;
        }

        @Override // N1.i.c
        public int a() {
            return this.f4085a.heightPixels;
        }

        @Override // N1.i.c
        public int b() {
            return this.f4085a.widthPixels;
        }
    }

    interface c {
        int a();

        int b();
    }

    i(a aVar) {
        this.f4074c = aVar.f4077a;
        int i8 = e(aVar.f4078b) ? aVar.f4084h / 2 : aVar.f4084h;
        this.f4075d = i8;
        int c8 = c(aVar.f4078b, aVar.f4082f, aVar.f4083g);
        float b8 = aVar.f4079c.b() * aVar.f4079c.a() * 4;
        int round = Math.round(aVar.f4081e * b8);
        int round2 = Math.round(b8 * aVar.f4080d);
        int i9 = c8 - i8;
        int i10 = round2 + round;
        if (i10 <= i9) {
            this.f4073b = round2;
            this.f4072a = round;
        } else {
            float f8 = i9;
            float f9 = aVar.f4081e;
            float f10 = aVar.f4080d;
            float f11 = f8 / (f9 + f10);
            this.f4073b = Math.round(f10 * f11);
            this.f4072a = Math.round(f11 * aVar.f4081e);
        }
        if (Log.isLoggable("MemorySizeCalculator", 3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Calculation complete, Calculated memory cache size: ");
            sb.append(f(this.f4073b));
            sb.append(", pool size: ");
            sb.append(f(this.f4072a));
            sb.append(", byte array size: ");
            sb.append(f(i8));
            sb.append(", memory class limited? ");
            sb.append(i10 > c8);
            sb.append(", max size: ");
            sb.append(f(c8));
            sb.append(", memoryClass: ");
            sb.append(aVar.f4078b.getMemoryClass());
            sb.append(", isLowMemoryDevice: ");
            sb.append(e(aVar.f4078b));
            Log.d("MemorySizeCalculator", sb.toString());
        }
    }

    private static int c(ActivityManager activityManager, float f8, float f9) {
        float memoryClass = activityManager.getMemoryClass() * 1048576;
        if (e(activityManager)) {
            f8 = f9;
        }
        return Math.round(memoryClass * f8);
    }

    static boolean e(ActivityManager activityManager) {
        return activityManager.isLowRamDevice();
    }

    private String f(int i8) {
        return Formatter.formatFileSize(this.f4074c, i8);
    }

    public int a() {
        return this.f4075d;
    }

    public int b() {
        return this.f4072a;
    }

    public int d() {
        return this.f4073b;
    }
}
