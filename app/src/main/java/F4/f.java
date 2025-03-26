package F4;

import A3.AbstractC0376j;
import A3.AbstractC0379m;
import F4.j;
import android.content.Context;
import android.util.Base64OutputStream;
import f4.InterfaceC5782a;
import g4.B;
import g4.C5807c;
import g4.r;
import java.io.ByteArrayOutputStream;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;
import v0.v;

/* loaded from: classes2.dex */
public class f implements i, j {

    /* renamed from: a, reason: collision with root package name */
    private final H4.b f2371a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f2372b;

    /* renamed from: c, reason: collision with root package name */
    private final H4.b f2373c;

    /* renamed from: d, reason: collision with root package name */
    private final Set f2374d;

    /* renamed from: e, reason: collision with root package name */
    private final Executor f2375e;

    private f(final Context context, final String str, Set set, H4.b bVar, Executor executor) {
        this(new H4.b() { // from class: F4.c
            @Override // H4.b
            public final Object get() {
                return f.j(context, str);
            }
        }, set, executor, bVar, context);
    }

    public static C5807c g() {
        final B a8 = B.a(InterfaceC5782a.class, Executor.class);
        return C5807c.f(f.class, i.class, j.class).b(r.l(Context.class)).b(r.l(com.google.firebase.f.class)).b(r.o(g.class)).b(r.n(P4.i.class)).b(r.k(a8)).f(new g4.h() { // from class: F4.b
            @Override // g4.h
            public final Object a(g4.e eVar) {
                return f.h(a8, eVar);
            }
        }).d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ f h(B b8, g4.e eVar) {
        return new f((Context) eVar.a(Context.class), ((com.google.firebase.f) eVar.a(com.google.firebase.f.class)).o(), eVar.g(g.class), eVar.d(P4.i.class), (Executor) eVar.f(b8));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String i() {
        String byteArrayOutputStream;
        synchronized (this) {
            try {
                k kVar = (k) this.f2371a.get();
                List c8 = kVar.c();
                kVar.b();
                JSONArray jSONArray = new JSONArray();
                for (int i8 = 0; i8 < c8.size(); i8++) {
                    l lVar = (l) c8.get(i8);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("agent", lVar.c());
                    jSONObject.put("dates", new JSONArray((Collection) lVar.b()));
                    jSONArray.put(jSONObject);
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("heartbeats", jSONArray);
                jSONObject2.put("version", "2");
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream2, 11);
                try {
                    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                    try {
                        gZIPOutputStream.write(jSONObject2.toString().getBytes("UTF-8"));
                        gZIPOutputStream.close();
                        base64OutputStream.close();
                        byteArrayOutputStream = byteArrayOutputStream2.toString("UTF-8");
                    } finally {
                    }
                } finally {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return byteArrayOutputStream;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ k j(Context context, String str) {
        return new k(context, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Void k() {
        synchronized (this) {
            ((k) this.f2371a.get()).k(System.currentTimeMillis(), ((P4.i) this.f2373c.get()).a());
        }
        return null;
    }

    @Override // F4.i
    public AbstractC0376j a() {
        return !v.a(this.f2372b) ? AbstractC0379m.e("") : AbstractC0379m.c(this.f2375e, new Callable() { // from class: F4.d
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f2369o.i();
            }
        });
    }

    @Override // F4.j
    public synchronized j.a b(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        k kVar = (k) this.f2371a.get();
        if (!kVar.i(currentTimeMillis)) {
            return j.a.NONE;
        }
        kVar.g();
        return j.a.GLOBAL;
    }

    public AbstractC0376j l() {
        return this.f2374d.size() <= 0 ? AbstractC0379m.e(null) : !v.a(this.f2372b) ? AbstractC0379m.e(null) : AbstractC0379m.c(this.f2375e, new Callable() { // from class: F4.e
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f2370o.k();
            }
        });
    }

    f(H4.b bVar, Set set, Executor executor, H4.b bVar2, Context context) {
        this.f2371a = bVar;
        this.f2374d = set;
        this.f2375e = executor;
        this.f2373c = bVar2;
        this.f2372b = context;
    }
}
