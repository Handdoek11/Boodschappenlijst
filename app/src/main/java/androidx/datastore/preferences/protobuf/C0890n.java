package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.AbstractC0897v;
import java.util.Collections;
import java.util.Map;

/* renamed from: androidx.datastore.preferences.protobuf.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0890n {

    /* renamed from: b, reason: collision with root package name */
    private static boolean f9456b = true;

    /* renamed from: d, reason: collision with root package name */
    private static volatile C0890n f9458d;

    /* renamed from: a, reason: collision with root package name */
    private final Map f9460a = Collections.emptyMap();

    /* renamed from: c, reason: collision with root package name */
    private static final Class f9457c = c();

    /* renamed from: e, reason: collision with root package name */
    static final C0890n f9459e = new C0890n(true);

    /* renamed from: androidx.datastore.preferences.protobuf.n$a */
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final Object f9461a;

        /* renamed from: b, reason: collision with root package name */
        private final int f9462b;

        a(Object obj, int i8) {
            this.f9461a = obj;
            this.f9462b = i8;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f9461a == aVar.f9461a && this.f9462b == aVar.f9462b;
        }

        public int hashCode() {
            return (System.identityHashCode(this.f9461a) * 65535) + this.f9462b;
        }
    }

    C0890n(boolean z7) {
    }

    public static C0890n b() {
        C0890n c0890n = f9458d;
        if (c0890n == null) {
            synchronized (C0890n.class) {
                try {
                    c0890n = f9458d;
                    if (c0890n == null) {
                        c0890n = f9456b ? AbstractC0889m.a() : f9459e;
                        f9458d = c0890n;
                    }
                } finally {
                }
            }
        }
        return c0890n;
    }

    static Class c() {
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.Extension");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public AbstractC0897v.c a(M m8, int i8) {
        androidx.appcompat.app.E.a(this.f9460a.get(new a(m8, i8)));
        return null;
    }
}
