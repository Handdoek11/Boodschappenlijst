package M1;

import android.graphics.Bitmap;
import android.os.Build;
import d2.AbstractC5710l;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* loaded from: classes.dex */
public class o implements l {

    /* renamed from: d, reason: collision with root package name */
    private static final Bitmap.Config[] f3760d;

    /* renamed from: e, reason: collision with root package name */
    private static final Bitmap.Config[] f3761e;

    /* renamed from: f, reason: collision with root package name */
    private static final Bitmap.Config[] f3762f;

    /* renamed from: g, reason: collision with root package name */
    private static final Bitmap.Config[] f3763g;

    /* renamed from: h, reason: collision with root package name */
    private static final Bitmap.Config[] f3764h;

    /* renamed from: a, reason: collision with root package name */
    private final c f3765a = new c();

    /* renamed from: b, reason: collision with root package name */
    private final g f3766b = new g();

    /* renamed from: c, reason: collision with root package name */
    private final Map f3767c = new HashMap();

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f3768a;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            f3768a = iArr;
            try {
                iArr[Bitmap.Config.ARGB_8888.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3768a[Bitmap.Config.RGB_565.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3768a[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3768a[Bitmap.Config.ALPHA_8.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static final class b implements m {

        /* renamed from: a, reason: collision with root package name */
        private final c f3769a;

        /* renamed from: b, reason: collision with root package name */
        int f3770b;

        /* renamed from: c, reason: collision with root package name */
        private Bitmap.Config f3771c;

        public b(c cVar) {
            this.f3769a = cVar;
        }

        @Override // M1.m
        public void a() {
            this.f3769a.c(this);
        }

        public void b(int i8, Bitmap.Config config) {
            this.f3770b = i8;
            this.f3771c = config;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f3770b == bVar.f3770b && AbstractC5710l.d(this.f3771c, bVar.f3771c);
        }

        public int hashCode() {
            int i8 = this.f3770b * 31;
            Bitmap.Config config = this.f3771c;
            return i8 + (config != null ? config.hashCode() : 0);
        }

        public String toString() {
            return o.h(this.f3770b, this.f3771c);
        }
    }

    static class c extends M1.c {
        c() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // M1.c
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public b a() {
            return new b(this);
        }

        public b e(int i8, Bitmap.Config config) {
            b bVar = (b) b();
            bVar.b(i8, config);
            return bVar;
        }
    }

    static {
        Bitmap.Config[] configArr = {Bitmap.Config.ARGB_8888, null};
        if (Build.VERSION.SDK_INT >= 26) {
            configArr = (Bitmap.Config[]) Arrays.copyOf(configArr, 3);
            configArr[configArr.length - 1] = Bitmap.Config.RGBA_F16;
        }
        f3760d = configArr;
        f3761e = configArr;
        f3762f = new Bitmap.Config[]{Bitmap.Config.RGB_565};
        f3763g = new Bitmap.Config[]{Bitmap.Config.ARGB_4444};
        f3764h = new Bitmap.Config[]{Bitmap.Config.ALPHA_8};
    }

    private void f(Integer num, Bitmap bitmap) {
        NavigableMap j8 = j(bitmap.getConfig());
        Integer num2 = (Integer) j8.get(num);
        if (num2 != null) {
            if (num2.intValue() == 1) {
                j8.remove(num);
                return;
            } else {
                j8.put(num, Integer.valueOf(num2.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + num + ", removed: " + e(bitmap) + ", this: " + this);
    }

    private b g(int i8, Bitmap.Config config) {
        b e8 = this.f3765a.e(i8, config);
        for (Bitmap.Config config2 : i(config)) {
            Integer num = (Integer) j(config2).ceilingKey(Integer.valueOf(i8));
            if (num != null && num.intValue() <= i8 * 8) {
                if (num.intValue() == i8) {
                    if (config2 == null) {
                        if (config == null) {
                            return e8;
                        }
                    } else if (config2.equals(config)) {
                        return e8;
                    }
                }
                this.f3765a.c(e8);
                return this.f3765a.e(num.intValue(), config2);
            }
        }
        return e8;
    }

    static String h(int i8, Bitmap.Config config) {
        return "[" + i8 + "](" + config + ")";
    }

    private static Bitmap.Config[] i(Bitmap.Config config) {
        if (Build.VERSION.SDK_INT >= 26 && Bitmap.Config.RGBA_F16.equals(config)) {
            return f3761e;
        }
        int i8 = a.f3768a[config.ordinal()];
        return i8 != 1 ? i8 != 2 ? i8 != 3 ? i8 != 4 ? new Bitmap.Config[]{config} : f3764h : f3763g : f3762f : f3760d;
    }

    private NavigableMap j(Bitmap.Config config) {
        NavigableMap navigableMap = (NavigableMap) this.f3767c.get(config);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.f3767c.put(config, treeMap);
        return treeMap;
    }

    @Override // M1.l
    public String a(int i8, int i9, Bitmap.Config config) {
        return h(AbstractC5710l.g(i8, i9, config), config);
    }

    @Override // M1.l
    public int b(Bitmap bitmap) {
        return AbstractC5710l.h(bitmap);
    }

    @Override // M1.l
    public void c(Bitmap bitmap) {
        b e8 = this.f3765a.e(AbstractC5710l.h(bitmap), bitmap.getConfig());
        this.f3766b.d(e8, bitmap);
        NavigableMap j8 = j(bitmap.getConfig());
        Integer num = (Integer) j8.get(Integer.valueOf(e8.f3770b));
        j8.put(Integer.valueOf(e8.f3770b), Integer.valueOf(num != null ? 1 + num.intValue() : 1));
    }

    @Override // M1.l
    public Bitmap d(int i8, int i9, Bitmap.Config config) {
        b g8 = g(AbstractC5710l.g(i8, i9, config), config);
        Bitmap bitmap = (Bitmap) this.f3766b.a(g8);
        if (bitmap != null) {
            f(Integer.valueOf(g8.f3770b), bitmap);
            bitmap.reconfigure(i8, i9, config);
        }
        return bitmap;
    }

    @Override // M1.l
    public String e(Bitmap bitmap) {
        return h(AbstractC5710l.h(bitmap), bitmap.getConfig());
    }

    @Override // M1.l
    public Bitmap removeLast() {
        Bitmap bitmap = (Bitmap) this.f3766b.f();
        if (bitmap != null) {
            f(Integer.valueOf(AbstractC5710l.h(bitmap)), bitmap);
        }
        return bitmap;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SizeConfigStrategy{groupedMap=");
        sb.append(this.f3766b);
        sb.append(", sortedSizes=(");
        for (Map.Entry entry : this.f3767c.entrySet()) {
            sb.append(entry.getKey());
            sb.append('[');
            sb.append(entry.getValue());
            sb.append("], ");
        }
        if (!this.f3767c.isEmpty()) {
            sb.replace(sb.length() - 2, sb.length(), "");
        }
        sb.append(")}");
        return sb.toString();
    }
}
