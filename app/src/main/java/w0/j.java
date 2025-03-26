package w0;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.os.Build;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import l1.AbstractC6167a;
import q.C6406j;
import q.C6407k;
import w0.l;
import y0.InterfaceC6936a;

/* loaded from: classes.dex */
abstract class j {

    /* renamed from: a, reason: collision with root package name */
    static final C6406j f44204a = new C6406j(16);

    /* renamed from: b, reason: collision with root package name */
    private static final ExecutorService f44205b = m.a("fonts-androidx", 10, 10000);

    /* renamed from: c, reason: collision with root package name */
    static final Object f44206c = new Object();

    /* renamed from: d, reason: collision with root package name */
    static final C6407k f44207d = new C6407k();

    class a implements Callable {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ String f44208o;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ Context f44209s;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ f f44210t;

        /* renamed from: u, reason: collision with root package name */
        final /* synthetic */ int f44211u;

        a(String str, Context context, f fVar, int i8) {
            this.f44208o = str;
            this.f44209s = context;
            this.f44210t = fVar;
            this.f44211u = i8;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public e call() {
            return j.c(this.f44208o, this.f44209s, q0.g.a(new Object[]{this.f44210t}), this.f44211u);
        }
    }

    class b implements InterfaceC6936a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C6863a f44212a;

        b(C6863a c6863a) {
            this.f44212a = c6863a;
        }

        @Override // y0.InterfaceC6936a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(e eVar) {
            if (eVar == null) {
                eVar = new e(-3);
            }
            this.f44212a.b(eVar);
        }
    }

    class c implements Callable {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ String f44213o;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ Context f44214s;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ List f44215t;

        /* renamed from: u, reason: collision with root package name */
        final /* synthetic */ int f44216u;

        c(String str, Context context, List list, int i8) {
            this.f44213o = str;
            this.f44214s = context;
            this.f44215t = list;
            this.f44216u = i8;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public e call() {
            try {
                return j.c(this.f44213o, this.f44214s, this.f44215t, this.f44216u);
            } catch (Throwable unused) {
                return new e(-3);
            }
        }
    }

    class d implements InterfaceC6936a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f44217a;

        d(String str) {
            this.f44217a = str;
        }

        @Override // y0.InterfaceC6936a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(e eVar) {
            synchronized (j.f44206c) {
                try {
                    C6407k c6407k = j.f44207d;
                    ArrayList arrayList = (ArrayList) c6407k.get(this.f44217a);
                    if (arrayList == null) {
                        return;
                    }
                    c6407k.remove(this.f44217a);
                    for (int i8 = 0; i8 < arrayList.size(); i8++) {
                        ((InterfaceC6936a) arrayList.get(i8)).accept(eVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    private static String a(List list, int i8) {
        StringBuilder sb = new StringBuilder();
        for (int i9 = 0; i9 < list.size(); i9++) {
            sb.append(((f) list.get(i9)).d());
            sb.append("-");
            sb.append(i8);
            if (i9 < list.size() - 1) {
                sb.append(";");
            }
        }
        return sb.toString();
    }

    private static int b(l.a aVar) {
        int i8 = 1;
        if (aVar.e() != 0) {
            return aVar.e() != 1 ? -3 : -2;
        }
        l.b[] c8 = aVar.c();
        if (c8 != null && c8.length != 0) {
            i8 = 0;
            for (l.b bVar : c8) {
                int b8 = bVar.b();
                if (b8 != 0) {
                    if (b8 < 0) {
                        return -3;
                    }
                    return b8;
                }
            }
        }
        return i8;
    }

    static e c(String str, Context context, List list, int i8) {
        AbstractC6167a.a("getFontSync");
        try {
            C6406j c6406j = f44204a;
            Typeface typeface = (Typeface) c6406j.c(str);
            if (typeface != null) {
                return new e(typeface);
            }
            l.a e8 = w0.e.e(context, list, null);
            int b8 = b(e8);
            if (b8 != 0) {
                return new e(b8);
            }
            Typeface b9 = (!e8.f() || Build.VERSION.SDK_INT < 29) ? q0.h.b(context, null, e8.c(), i8) : q0.h.c(context, null, e8.d(), i8);
            if (b9 == null) {
                return new e(-3);
            }
            c6406j.d(str, b9);
            return new e(b9);
        } catch (PackageManager.NameNotFoundException unused) {
            return new e(-1);
        } finally {
            AbstractC6167a.b();
        }
    }

    static Typeface d(Context context, List list, int i8, Executor executor, C6863a c6863a) {
        String a8 = a(list, i8);
        Typeface typeface = (Typeface) f44204a.c(a8);
        if (typeface != null) {
            c6863a.b(new e(typeface));
            return typeface;
        }
        b bVar = new b(c6863a);
        synchronized (f44206c) {
            try {
                C6407k c6407k = f44207d;
                ArrayList arrayList = (ArrayList) c6407k.get(a8);
                if (arrayList != null) {
                    arrayList.add(bVar);
                    return null;
                }
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(bVar);
                c6407k.put(a8, arrayList2);
                c cVar = new c(a8, context, list, i8);
                if (executor == null) {
                    executor = f44205b;
                }
                m.c(executor, cVar, new d(a8));
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    static Typeface e(Context context, f fVar, C6863a c6863a, int i8, int i9) {
        String a8 = a(q0.g.a(new Object[]{fVar}), i8);
        Typeface typeface = (Typeface) f44204a.c(a8);
        if (typeface != null) {
            c6863a.b(new e(typeface));
            return typeface;
        }
        if (i9 == -1) {
            e c8 = c(a8, context, q0.g.a(new Object[]{fVar}), i8);
            c6863a.b(c8);
            return c8.f44218a;
        }
        try {
            e eVar = (e) m.d(f44205b, new a(a8, context, fVar, i8), i9);
            c6863a.b(eVar);
            return eVar.f44218a;
        } catch (InterruptedException unused) {
            c6863a.b(new e(-3));
            return null;
        }
    }

    static final class e {

        /* renamed from: a, reason: collision with root package name */
        final Typeface f44218a;

        /* renamed from: b, reason: collision with root package name */
        final int f44219b;

        e(int i8) {
            this.f44218a = null;
            this.f44219b = i8;
        }

        boolean a() {
            return this.f44219b == 0;
        }

        e(Typeface typeface) {
            this.f44218a = typeface;
            this.f44219b = 0;
        }
    }
}
