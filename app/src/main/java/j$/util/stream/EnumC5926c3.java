package j$.util.stream;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: j$.util.stream.c3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class EnumC5926c3 {
    public static final EnumC5926c3 OP;
    public static final EnumC5926c3 SPLITERATOR;
    public static final EnumC5926c3 STREAM;
    public static final EnumC5926c3 TERMINAL_OP;
    public static final EnumC5926c3 UPSTREAM_TERMINAL_OP;

    /* renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ EnumC5926c3[] f37638a;

    public static EnumC5926c3 valueOf(String str) {
        return (EnumC5926c3) Enum.valueOf(EnumC5926c3.class, str);
    }

    public static EnumC5926c3[] values() {
        return (EnumC5926c3[]) f37638a.clone();
    }

    static {
        EnumC5926c3 enumC5926c3 = new EnumC5926c3("SPLITERATOR", 0);
        SPLITERATOR = enumC5926c3;
        EnumC5926c3 enumC5926c32 = new EnumC5926c3("STREAM", 1);
        STREAM = enumC5926c32;
        EnumC5926c3 enumC5926c33 = new EnumC5926c3("OP", 2);
        OP = enumC5926c33;
        EnumC5926c3 enumC5926c34 = new EnumC5926c3("TERMINAL_OP", 3);
        TERMINAL_OP = enumC5926c34;
        EnumC5926c3 enumC5926c35 = new EnumC5926c3("UPSTREAM_TERMINAL_OP", 4);
        UPSTREAM_TERMINAL_OP = enumC5926c35;
        f37638a = new EnumC5926c3[]{enumC5926c3, enumC5926c32, enumC5926c33, enumC5926c34, enumC5926c35};
    }
}
