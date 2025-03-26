package T6;

import java.util.concurrent.TimeUnit;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class d {

    /* renamed from: A, reason: collision with root package name */
    private static final /* synthetic */ C6.a f5303A;

    /* renamed from: s, reason: collision with root package name */
    public static final d f5304s = new d("NANOSECONDS", 0, TimeUnit.NANOSECONDS);

    /* renamed from: t, reason: collision with root package name */
    public static final d f5305t = new d("MICROSECONDS", 1, TimeUnit.MICROSECONDS);

    /* renamed from: u, reason: collision with root package name */
    public static final d f5306u = new d("MILLISECONDS", 2, TimeUnit.MILLISECONDS);

    /* renamed from: v, reason: collision with root package name */
    public static final d f5307v = new d("SECONDS", 3, TimeUnit.SECONDS);

    /* renamed from: w, reason: collision with root package name */
    public static final d f5308w = new d("MINUTES", 4, TimeUnit.MINUTES);

    /* renamed from: x, reason: collision with root package name */
    public static final d f5309x = new d("HOURS", 5, TimeUnit.HOURS);

    /* renamed from: y, reason: collision with root package name */
    public static final d f5310y = new d("DAYS", 6, TimeUnit.DAYS);

    /* renamed from: z, reason: collision with root package name */
    private static final /* synthetic */ d[] f5311z;

    /* renamed from: o, reason: collision with root package name */
    private final TimeUnit f5312o;

    static {
        d[] a8 = a();
        f5311z = a8;
        f5303A = C6.b.a(a8);
    }

    private d(String str, int i8, TimeUnit timeUnit) {
        this.f5312o = timeUnit;
    }

    private static final /* synthetic */ d[] a() {
        return new d[]{f5304s, f5305t, f5306u, f5307v, f5308w, f5309x, f5310y};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f5311z.clone();
    }

    public final TimeUnit c() {
        return this.f5312o;
    }
}
