package N4;

import com.google.firebase.messaging.K;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: b, reason: collision with root package name */
    private static final b f4152b = new a().a();

    /* renamed from: a, reason: collision with root package name */
    private final N4.a f4153a;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private N4.a f4154a = null;

        a() {
        }

        public b a() {
            return new b(this.f4154a);
        }

        public a b(N4.a aVar) {
            this.f4154a = aVar;
            return this;
        }
    }

    b(N4.a aVar) {
        this.f4153a = aVar;
    }

    public static a b() {
        return new a();
    }

    public N4.a a() {
        return this.f4153a;
    }

    public byte[] c() {
        return K.a(this);
    }
}
