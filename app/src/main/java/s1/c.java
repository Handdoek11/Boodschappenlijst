package s1;

import android.net.Uri;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final Set f42671a = new HashSet();

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final Uri f42672a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f42673b;

        a(Uri uri, boolean z7) {
            this.f42672a = uri;
            this.f42673b = z7;
        }

        public Uri a() {
            return this.f42672a;
        }

        public boolean b() {
            return this.f42673b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f42673b == aVar.f42673b && this.f42672a.equals(aVar.f42672a);
        }

        public int hashCode() {
            return (this.f42672a.hashCode() * 31) + (this.f42673b ? 1 : 0);
        }
    }

    public void a(Uri uri, boolean z7) {
        this.f42671a.add(new a(uri, z7));
    }

    public Set b() {
        return this.f42671a;
    }

    public int c() {
        return this.f42671a.size();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        return this.f42671a.equals(((c) obj).f42671a);
    }

    public int hashCode() {
        return this.f42671a.hashCode();
    }
}
