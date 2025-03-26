package x6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: x6.n, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC6932n {

    /* renamed from: o, reason: collision with root package name */
    public static final EnumC6932n f44480o = new EnumC6932n("SYNCHRONIZED", 0);

    /* renamed from: s, reason: collision with root package name */
    public static final EnumC6932n f44481s = new EnumC6932n("PUBLICATION", 1);

    /* renamed from: t, reason: collision with root package name */
    public static final EnumC6932n f44482t = new EnumC6932n("NONE", 2);

    /* renamed from: u, reason: collision with root package name */
    private static final /* synthetic */ EnumC6932n[] f44483u;

    /* renamed from: v, reason: collision with root package name */
    private static final /* synthetic */ C6.a f44484v;

    static {
        EnumC6932n[] a8 = a();
        f44483u = a8;
        f44484v = C6.b.a(a8);
    }

    private EnumC6932n(String str, int i8) {
    }

    private static final /* synthetic */ EnumC6932n[] a() {
        return new EnumC6932n[]{f44480o, f44481s, f44482t};
    }

    public static EnumC6932n valueOf(String str) {
        return (EnumC6932n) Enum.valueOf(EnumC6932n.class, str);
    }

    public static EnumC6932n[] values() {
        return (EnumC6932n[]) f44483u.clone();
    }
}
