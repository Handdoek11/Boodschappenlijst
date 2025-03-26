package m4;

/* loaded from: classes2.dex */
public enum F {
    DEVELOPER(1),
    USER_SIDELOAD(2),
    TEST_DISTRIBUTION(3),
    APP_STORE(4);


    /* renamed from: o, reason: collision with root package name */
    private final int f38994o;

    F(int i8) {
        this.f38994o = i8;
    }

    public static F c(String str) {
        return str != null ? APP_STORE : DEVELOPER;
    }

    public int f() {
        return this.f38994o;
    }

    @Override // java.lang.Enum
    public String toString() {
        return Integer.toString(this.f38994o);
    }
}
