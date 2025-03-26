package Z2;

import android.os.Bundle;
import com.google.android.gms.common.api.a;

/* renamed from: Z2.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0785y implements a.d {

    /* renamed from: c, reason: collision with root package name */
    public static final C0785y f6425c = a().a();

    /* renamed from: b, reason: collision with root package name */
    private final String f6426b;

    /* renamed from: Z2.y$a */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private String f6427a;

        /* synthetic */ a(A a8) {
        }

        public C0785y a() {
            return new C0785y(this.f6427a, null);
        }

        public a b(String str) {
            this.f6427a = str;
            return this;
        }
    }

    /* synthetic */ C0785y(String str, B b8) {
        this.f6426b = str;
    }

    public static a a() {
        return new a(null);
    }

    public final Bundle b() {
        Bundle bundle = new Bundle();
        String str = this.f6426b;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0785y) {
            return AbstractC0777p.a(this.f6426b, ((C0785y) obj).f6426b);
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC0777p.b(this.f6426b);
    }
}
