package q0;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import java.util.List;
import l1.AbstractC6167a;
import p0.e;
import p0.h;
import q.C6406j;
import w0.l;

/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    private static final n f40906a;

    /* renamed from: b, reason: collision with root package name */
    private static final C6406j f40907b;

    public static class a extends l.c {

        /* renamed from: a, reason: collision with root package name */
        private h.e f40908a;

        public a(h.e eVar) {
            this.f40908a = eVar;
        }

        @Override // w0.l.c
        public void a(int i8) {
            h.e eVar = this.f40908a;
            if (eVar != null) {
                eVar.f(i8);
            }
        }

        @Override // w0.l.c
        public void b(Typeface typeface) {
            h.e eVar = this.f40908a;
            if (eVar != null) {
                eVar.g(typeface);
            }
        }
    }

    static {
        AbstractC6167a.a("TypefaceCompat static init");
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 29) {
            f40906a = new m();
        } else if (i8 >= 28) {
            f40906a = new l();
        } else if (i8 >= 26) {
            f40906a = new k();
        } else if (i8 < 24 || !j.k()) {
            f40906a = new i();
        } else {
            f40906a = new j();
        }
        f40907b = new C6406j(16);
        AbstractC6167a.b();
    }

    public static Typeface a(Context context, Typeface typeface, int i8) {
        if (context != null) {
            return Typeface.create(typeface, i8);
        }
        throw new IllegalArgumentException("Context cannot be null");
    }

    public static Typeface b(Context context, CancellationSignal cancellationSignal, l.b[] bVarArr, int i8) {
        AbstractC6167a.a("TypefaceCompat.createFromFontInfo");
        try {
            return f40906a.b(context, cancellationSignal, bVarArr, i8);
        } finally {
            AbstractC6167a.b();
        }
    }

    public static Typeface c(Context context, CancellationSignal cancellationSignal, List list, int i8) {
        AbstractC6167a.a("TypefaceCompat.createFromFontInfoWithFallback");
        try {
            return f40906a.c(context, cancellationSignal, list, i8);
        } finally {
            AbstractC6167a.b();
        }
    }

    public static Typeface d(Context context, e.b bVar, Resources resources, int i8, String str, int i9, int i10, h.e eVar, Handler handler, boolean z7) {
        Typeface a8;
        if (bVar instanceof e.C0301e) {
            e.C0301e c0301e = (e.C0301e) bVar;
            Typeface h8 = h(c0301e.d());
            if (h8 != null) {
                if (eVar != null) {
                    eVar.d(h8, handler);
                }
                return h8;
            }
            a8 = w0.l.c(context, c0301e.a() != null ? g.a(new Object[]{c0301e.c(), c0301e.a()}) : g.a(new Object[]{c0301e.c()}), i10, !z7 ? eVar != null : c0301e.b() != 0, z7 ? c0301e.e() : -1, h.e.e(handler), new a(eVar));
        } else {
            a8 = f40906a.a(context, (e.c) bVar, resources, i10);
            if (eVar != null) {
                if (a8 != null) {
                    eVar.d(a8, handler);
                } else {
                    eVar.c(-3, handler);
                }
            }
        }
        if (a8 != null) {
            f40907b.d(f(resources, i8, str, i9, i10), a8);
        }
        return a8;
    }

    public static Typeface e(Context context, Resources resources, int i8, String str, int i9, int i10) {
        Typeface e8 = f40906a.e(context, resources, i8, str, i10);
        if (e8 != null) {
            f40907b.d(f(resources, i8, str, i9, i10), e8);
        }
        return e8;
    }

    private static String f(Resources resources, int i8, String str, int i9, int i10) {
        return resources.getResourcePackageName(i8) + '-' + str + '-' + i9 + '-' + i8 + '-' + i10;
    }

    public static Typeface g(Resources resources, int i8, String str, int i9, int i10) {
        return (Typeface) f40907b.c(f(resources, i8, str, i9, i10));
    }

    private static Typeface h(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        Typeface create = Typeface.create(str, 0);
        Typeface create2 = Typeface.create(Typeface.DEFAULT, 0);
        if (create == null || create.equals(create2)) {
            return null;
        }
        return create;
    }
}
