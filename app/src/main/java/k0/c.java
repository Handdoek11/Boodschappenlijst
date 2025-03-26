package K0;

import I6.l;
import J6.r;
import J6.s;
import Q6.j;
import U6.M;
import android.content.Context;
import java.io.File;
import java.util.List;

/* loaded from: classes.dex */
public final class c implements M6.a {

    /* renamed from: a, reason: collision with root package name */
    private final String f3588a;

    /* renamed from: b, reason: collision with root package name */
    private final J0.b f3589b;

    /* renamed from: c, reason: collision with root package name */
    private final l f3590c;

    /* renamed from: d, reason: collision with root package name */
    private final M f3591d;

    /* renamed from: e, reason: collision with root package name */
    private final Object f3592e;

    /* renamed from: f, reason: collision with root package name */
    private volatile I0.e f3593f;

    static final class a extends s implements I6.a {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ Context f3594o;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ c f3595s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Context context, c cVar) {
            super(0);
            this.f3594o = context;
            this.f3595s = cVar;
        }

        @Override // I6.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final File invoke() {
            Context context = this.f3594o;
            r.d(context, "applicationContext");
            return b.a(context, this.f3595s.f3588a);
        }
    }

    public c(String str, J0.b bVar, l lVar, M m8) {
        r.e(str, "name");
        r.e(lVar, "produceMigrations");
        r.e(m8, "scope");
        this.f3588a = str;
        this.f3589b = bVar;
        this.f3590c = lVar;
        this.f3591d = m8;
        this.f3592e = new Object();
    }

    @Override // M6.a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public I0.e a(Context context, j jVar) {
        I0.e eVar;
        r.e(context, "thisRef");
        r.e(jVar, "property");
        I0.e eVar2 = this.f3593f;
        if (eVar2 != null) {
            return eVar2;
        }
        synchronized (this.f3592e) {
            try {
                if (this.f3593f == null) {
                    Context applicationContext = context.getApplicationContext();
                    L0.c cVar = L0.c.f3683a;
                    J0.b bVar = this.f3589b;
                    l lVar = this.f3590c;
                    r.d(applicationContext, "applicationContext");
                    this.f3593f = cVar.a(bVar, (List) lVar.invoke(applicationContext), this.f3591d, new a(applicationContext, this));
                }
                eVar = this.f3593f;
                r.b(eVar);
            } catch (Throwable th) {
                throw th;
            }
        }
        return eVar;
    }
}
