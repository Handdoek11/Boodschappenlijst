package r7;

/* loaded from: classes2.dex */
public enum b {
    ERROR(40, "ERROR"),
    WARN(30, "WARN"),
    INFO(20, "INFO"),
    DEBUG(10, "DEBUG"),
    TRACE(0, "TRACE");


    /* renamed from: o, reason: collision with root package name */
    private int f42637o;

    /* renamed from: s, reason: collision with root package name */
    private String f42638s;

    b(int i8, String str) {
        this.f42637o = i8;
        this.f42638s = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f42638s;
    }
}
