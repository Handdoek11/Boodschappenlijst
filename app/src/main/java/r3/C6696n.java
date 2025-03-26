package r3;

/* renamed from: r3.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C6696n {

    /* renamed from: a, reason: collision with root package name */
    private final Object f42580a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f42581b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f42582c;

    C6696n(Object obj, Object obj2, Object obj3) {
        this.f42580a = obj;
        this.f42581b = obj2;
        this.f42582c = obj3;
    }

    final IllegalArgumentException a() {
        return new IllegalArgumentException("Multiple entries with same key: " + String.valueOf(this.f42580a) + "=" + String.valueOf(this.f42581b) + " and " + String.valueOf(this.f42580a) + "=" + String.valueOf(this.f42582c));
    }
}
