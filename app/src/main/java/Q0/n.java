package q0;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.io.InputStream;
import java.util.List;
import p0.e;
import w0.l;

/* loaded from: classes.dex */
abstract class n {

    /* renamed from: a, reason: collision with root package name */
    private ConcurrentHashMap f40925a = new ConcurrentHashMap();

    class a implements b {
        a() {
        }

        @Override // q0.n.b
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public int a(l.b bVar) {
            return bVar.e();
        }

        @Override // q0.n.b
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean b(l.b bVar) {
            return bVar.f();
        }
    }

    private interface b {
        int a(Object obj);

        boolean b(Object obj);
    }

    n() {
    }

    private static Object f(Object[] objArr, int i8, b bVar) {
        return g(objArr, (i8 & 1) == 0 ? 400 : 700, (i8 & 2) != 0, bVar);
    }

    private static Object g(Object[] objArr, int i8, boolean z7, b bVar) {
        Object obj = null;
        int i9 = Integer.MAX_VALUE;
        for (Object obj2 : objArr) {
            int abs = (Math.abs(bVar.a(obj2) - i8) * 2) + (bVar.b(obj2) == z7 ? 0 : 1);
            if (obj == null || i9 > abs) {
                obj = obj2;
                i9 = abs;
            }
        }
        return obj;
    }

    public abstract Typeface a(Context context, e.c cVar, Resources resources, int i8);

    public abstract Typeface b(Context context, CancellationSignal cancellationSignal, l.b[] bVarArr, int i8);

    public Typeface c(Context context, CancellationSignal cancellationSignal, List list, int i8) {
        throw new IllegalStateException("createFromFontInfoWithFallback must only be called on API 29+");
    }

    protected Typeface d(Context context, InputStream inputStream) {
        File e8 = o.e(context);
        if (e8 == null) {
            return null;
        }
        try {
            if (o.d(e8, inputStream)) {
                return Typeface.createFromFile(e8.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            e8.delete();
        }
    }

    public Typeface e(Context context, Resources resources, int i8, String str, int i9) {
        File e8 = o.e(context);
        if (e8 == null) {
            return null;
        }
        try {
            if (o.c(e8, resources, i8)) {
                return Typeface.createFromFile(e8.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            e8.delete();
        }
    }

    protected l.b h(l.b[] bVarArr, int i8) {
        return (l.b) f(bVarArr, i8, new a());
    }
}
