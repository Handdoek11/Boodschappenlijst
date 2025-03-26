package w3;

/* loaded from: classes2.dex */
public enum p {
    UNINITIALIZED("uninitialized"),
    POLICY("eu_consent_policy"),
    DENIED("denied"),
    GRANTED("granted");


    /* renamed from: o, reason: collision with root package name */
    private final String f44344o;

    p(String str) {
        this.f44344o = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f44344o;
    }
}
