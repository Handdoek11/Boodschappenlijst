package u4;

import A3.AbstractC0376j;
import A3.AbstractC0379m;
import A3.C0377k;
import A3.InterfaceC0375i;
import android.content.Context;
import android.content.SharedPreferences;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
import m4.AbstractC6203i;
import m4.D;
import m4.E;
import m4.F;
import m4.J;
import m4.c0;
import org.json.JSONObject;
import r4.C6706b;

/* loaded from: classes2.dex */
public class g implements j {

    /* renamed from: a, reason: collision with root package name */
    private final Context f43989a;

    /* renamed from: b, reason: collision with root package name */
    private final k f43990b;

    /* renamed from: c, reason: collision with root package name */
    private final h f43991c;

    /* renamed from: d, reason: collision with root package name */
    private final D f43992d;

    /* renamed from: e, reason: collision with root package name */
    private final C6814a f43993e;

    /* renamed from: f, reason: collision with root package name */
    private final l f43994f;

    /* renamed from: g, reason: collision with root package name */
    private final E f43995g;

    /* renamed from: h, reason: collision with root package name */
    private final AtomicReference f43996h;

    /* renamed from: i, reason: collision with root package name */
    private final AtomicReference f43997i;

    class a implements InterfaceC0375i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ n4.f f43998a;

        a(n4.f fVar) {
            this.f43998a = fVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ JSONObject c() {
            return g.this.f43994f.a(g.this.f43990b, true);
        }

        @Override // A3.InterfaceC0375i
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public AbstractC0376j a(Void r52) {
            JSONObject jSONObject = (JSONObject) this.f43998a.f39589d.c().submit(new Callable() { // from class: u4.f
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.f43988o.c();
                }
            }).get();
            if (jSONObject != null) {
                d b8 = g.this.f43991c.b(jSONObject);
                g.this.f43993e.c(b8.f43973c, jSONObject);
                g.this.q(jSONObject, "Loaded settings: ");
                g gVar = g.this;
                gVar.r(gVar.f43990b.f44006f);
                g.this.f43996h.set(b8);
                ((C0377k) g.this.f43997i.get()).e(b8);
            }
            return AbstractC0379m.e(null);
        }
    }

    g(Context context, k kVar, D d8, h hVar, C6814a c6814a, l lVar, E e8) {
        AtomicReference atomicReference = new AtomicReference();
        this.f43996h = atomicReference;
        this.f43997i = new AtomicReference(new C0377k());
        this.f43989a = context;
        this.f43990b = kVar;
        this.f43992d = d8;
        this.f43991c = hVar;
        this.f43993e = c6814a;
        this.f43994f = lVar;
        this.f43995g = e8;
        atomicReference.set(C6815b.b(d8));
    }

    public static g l(Context context, String str, J j8, C6706b c6706b, String str2, String str3, s4.g gVar, E e8) {
        String g8 = j8.g();
        c0 c0Var = new c0();
        return new g(context, new k(str, j8.h(), j8.i(), j8.j(), j8, AbstractC6203i.h(AbstractC6203i.m(context), str, str3, str2), str3, str2, F.c(g8).f()), c0Var, new h(c0Var), new C6814a(gVar), new C6816c(String.format(Locale.US, "https://firebase-settings.crashlytics.com/spi/v2/platforms/android/gmp/%s/settings", str), c6706b), e8);
    }

    private d m(e eVar) {
        d dVar = null;
        try {
            if (!e.SKIP_CACHE_LOOKUP.equals(eVar)) {
                JSONObject b8 = this.f43993e.b();
                if (b8 != null) {
                    d b9 = this.f43991c.b(b8);
                    if (b9 != null) {
                        q(b8, "Loaded cached settings: ");
                        long a8 = this.f43992d.a();
                        if (e.IGNORE_CACHE_EXPIRATION.equals(eVar) || !b9.a(a8)) {
                            try {
                                j4.g.f().i("Returning cached settings.");
                                dVar = b9;
                            } catch (Exception e8) {
                                e = e8;
                                dVar = b9;
                                j4.g.f().e("Failed to get cached settings", e);
                                return dVar;
                            }
                        } else {
                            j4.g.f().i("Cached settings have expired.");
                        }
                    } else {
                        j4.g.f().e("Failed to parse cached settings data.", null);
                    }
                } else {
                    j4.g.f().b("No cached settings data found.");
                }
            }
        } catch (Exception e9) {
            e = e9;
        }
        return dVar;
    }

    private String n() {
        return AbstractC6203i.q(this.f43989a).getString("existing_instance_identifier", "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q(JSONObject jSONObject, String str) {
        j4.g.f().b(str + jSONObject.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean r(String str) {
        SharedPreferences.Editor edit = AbstractC6203i.q(this.f43989a).edit();
        edit.putString("existing_instance_identifier", str);
        edit.apply();
        return true;
    }

    @Override // u4.j
    public AbstractC0376j a() {
        return ((C0377k) this.f43997i.get()).a();
    }

    @Override // u4.j
    public d b() {
        return (d) this.f43996h.get();
    }

    boolean k() {
        return !n().equals(this.f43990b.f44006f);
    }

    public AbstractC0376j o(n4.f fVar) {
        return p(e.USE_CACHE, fVar);
    }

    public AbstractC0376j p(e eVar, n4.f fVar) {
        d m8;
        if (!k() && (m8 = m(eVar)) != null) {
            this.f43996h.set(m8);
            ((C0377k) this.f43997i.get()).e(m8);
            return AbstractC0379m.e(null);
        }
        d m9 = m(e.IGNORE_CACHE_EXPIRATION);
        if (m9 != null) {
            this.f43996h.set(m9);
            ((C0377k) this.f43997i.get()).e(m9);
        }
        return this.f43995g.i().u(fVar.f39586a, new a(fVar));
    }
}
