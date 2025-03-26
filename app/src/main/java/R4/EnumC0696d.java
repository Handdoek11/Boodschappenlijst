package R4;

/* renamed from: R4.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC0696d implements C4.f {
    COLLECTION_UNKNOWN(0),
    COLLECTION_SDK_NOT_INSTALLED(1),
    COLLECTION_ENABLED(2),
    COLLECTION_DISABLED(3),
    COLLECTION_DISABLED_REMOTE(4),
    COLLECTION_SAMPLED(5);


    /* renamed from: o, reason: collision with root package name */
    private final int f4866o;

    EnumC0696d(int i8) {
        this.f4866o = i8;
    }

    @Override // C4.f
    public int e() {
        return this.f4866o;
    }
}
