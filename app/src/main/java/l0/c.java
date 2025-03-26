package L0;

import J6.r;
import J6.s;
import U6.M;
import java.io.File;
import java.util.List;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f3683a = new c();

    static final class a extends s implements I6.a {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ I6.a f3684o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(I6.a aVar) {
            super(0);
            this.f3684o = aVar;
        }

        @Override // I6.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final File invoke() {
            File file = (File) this.f3684o.invoke();
            String a8 = G6.b.a(file);
            h hVar = h.f3689a;
            if (r.a(a8, hVar.f())) {
                return file;
            }
            throw new IllegalStateException(("File extension for file: " + file + " does not match required extension for Preferences file: " + hVar.f()).toString());
        }
    }

    private c() {
    }

    public final I0.e a(J0.b bVar, List list, M m8, I6.a aVar) {
        r.e(list, "migrations");
        r.e(m8, "scope");
        r.e(aVar, "produceFile");
        return new b(I0.f.f2983a.a(h.f3689a, bVar, list, m8, new a(aVar)));
    }
}
