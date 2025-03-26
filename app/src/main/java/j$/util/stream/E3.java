package j$.util.stream;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
final class E3 {
    public static final E3 MAYBE_MORE;
    public static final E3 NO_MORE;
    public static final E3 UNLIMITED;

    /* renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ E3[] f37454a;

    static {
        E3 e32 = new E3("NO_MORE", 0);
        NO_MORE = e32;
        E3 e33 = new E3("MAYBE_MORE", 1);
        MAYBE_MORE = e33;
        E3 e34 = new E3("UNLIMITED", 2);
        UNLIMITED = e34;
        f37454a = new E3[]{e32, e33, e34};
    }

    public static E3 valueOf(String str) {
        return (E3) Enum.valueOf(E3.class, str);
    }

    public static E3[] values() {
        return (E3[]) f37454a.clone();
    }
}
