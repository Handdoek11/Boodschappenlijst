package j$.util.stream;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: j$.util.stream.e3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC5936e3 {
    public static final EnumC5936e3 DOUBLE_VALUE;
    public static final EnumC5936e3 INT_VALUE;
    public static final EnumC5936e3 LONG_VALUE;
    public static final EnumC5936e3 REFERENCE;

    /* renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ EnumC5936e3[] f37674a;

    public static EnumC5936e3 valueOf(String str) {
        return (EnumC5936e3) Enum.valueOf(EnumC5936e3.class, str);
    }

    public static EnumC5936e3[] values() {
        return (EnumC5936e3[]) f37674a.clone();
    }

    static {
        EnumC5936e3 enumC5936e3 = new EnumC5936e3("REFERENCE", 0);
        REFERENCE = enumC5936e3;
        EnumC5936e3 enumC5936e32 = new EnumC5936e3("INT_VALUE", 1);
        INT_VALUE = enumC5936e32;
        EnumC5936e3 enumC5936e33 = new EnumC5936e3("LONG_VALUE", 2);
        LONG_VALUE = enumC5936e33;
        EnumC5936e3 enumC5936e34 = new EnumC5936e3("DOUBLE_VALUE", 3);
        DOUBLE_VALUE = enumC5936e34;
        f37674a = new EnumC5936e3[]{enumC5936e3, enumC5936e32, enumC5936e33, enumC5936e34};
    }
}
