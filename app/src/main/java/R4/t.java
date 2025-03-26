package R4;

/* loaded from: classes2.dex */
public enum t implements C4.f {
    LOG_ENVIRONMENT_UNKNOWN(0),
    LOG_ENVIRONMENT_AUTOPUSH(1),
    LOG_ENVIRONMENT_STAGING(2),
    LOG_ENVIRONMENT_PROD(3);


    /* renamed from: o, reason: collision with root package name */
    private final int f4897o;

    t(int i8) {
        this.f4897o = i8;
    }

    @Override // C4.f
    public int e() {
        return this.f4897o;
    }
}
