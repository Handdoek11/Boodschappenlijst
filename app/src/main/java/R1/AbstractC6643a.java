package r1;

import android.os.Build;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* renamed from: r1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6643a implements p {

    /* renamed from: c, reason: collision with root package name */
    private static final Set f42385c = new HashSet();

    /* renamed from: a, reason: collision with root package name */
    private final String f42386a;

    /* renamed from: b, reason: collision with root package name */
    private final String f42387b;

    /* renamed from: r1.a$a, reason: collision with other inner class name */
    private static class C0324a {

        /* renamed from: a, reason: collision with root package name */
        static final Set f42388a = new HashSet(Arrays.asList(x.c().a()));
    }

    /* renamed from: r1.a$b */
    public static class b extends AbstractC6643a {
        b(String str, String str2) {
            super(str, str2);
        }

        @Override // r1.AbstractC6643a
        public final boolean c() {
            return true;
        }
    }

    /* renamed from: r1.a$c */
    public static class c extends AbstractC6643a {
        c(String str, String str2) {
            super(str, str2);
        }

        @Override // r1.AbstractC6643a
        public final boolean c() {
            return Build.VERSION.SDK_INT >= 24;
        }
    }

    /* renamed from: r1.a$d */
    public static class d extends AbstractC6643a {
        d(String str, String str2) {
            super(str, str2);
        }

        @Override // r1.AbstractC6643a
        public final boolean c() {
            return false;
        }
    }

    /* renamed from: r1.a$e */
    public static class e extends AbstractC6643a {
        e(String str, String str2) {
            super(str, str2);
        }

        @Override // r1.AbstractC6643a
        public final boolean c() {
            return Build.VERSION.SDK_INT >= 26;
        }
    }

    /* renamed from: r1.a$f */
    public static class f extends AbstractC6643a {
        f(String str, String str2) {
            super(str, str2);
        }

        @Override // r1.AbstractC6643a
        public final boolean c() {
            return Build.VERSION.SDK_INT >= 27;
        }
    }

    /* renamed from: r1.a$g */
    public static class g extends AbstractC6643a {
        g(String str, String str2) {
            super(str, str2);
        }

        @Override // r1.AbstractC6643a
        public final boolean c() {
            return Build.VERSION.SDK_INT >= 28;
        }
    }

    /* renamed from: r1.a$h */
    public static class h extends AbstractC6643a {
        h(String str, String str2) {
            super(str, str2);
        }

        @Override // r1.AbstractC6643a
        public final boolean c() {
            return Build.VERSION.SDK_INT >= 29;
        }
    }

    /* renamed from: r1.a$i */
    public static class i extends AbstractC6643a {
        i(String str, String str2) {
            super(str, str2);
        }

        @Override // r1.AbstractC6643a
        public final boolean c() {
            return Build.VERSION.SDK_INT >= 33;
        }
    }

    AbstractC6643a(String str, String str2) {
        this.f42386a = str;
        this.f42387b = str2;
        f42385c.add(this);
    }

    public static Set e() {
        return DesugarCollections.unmodifiableSet(f42385c);
    }

    @Override // r1.p
    public String a() {
        return this.f42386a;
    }

    @Override // r1.p
    public boolean b() {
        return c() || d();
    }

    public abstract boolean c();

    public boolean d() {
        return o7.a.b(C0324a.f42388a, this.f42387b);
    }
}
