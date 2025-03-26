package B6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: o, reason: collision with root package name */
    public static final a f729o = new a("COROUTINE_SUSPENDED", 0);

    /* renamed from: s, reason: collision with root package name */
    public static final a f730s = new a("UNDECIDED", 1);

    /* renamed from: t, reason: collision with root package name */
    public static final a f731t = new a("RESUMED", 2);

    /* renamed from: u, reason: collision with root package name */
    private static final /* synthetic */ a[] f732u;

    /* renamed from: v, reason: collision with root package name */
    private static final /* synthetic */ C6.a f733v;

    static {
        a[] a8 = a();
        f732u = a8;
        f733v = C6.b.a(a8);
    }

    private a(String str, int i8) {
    }

    private static final /* synthetic */ a[] a() {
        return new a[]{f729o, f730s, f731t};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f732u.clone();
    }
}
