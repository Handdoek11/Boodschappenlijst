package P1;

import P1.n;
import c2.C0978b;
import com.bumptech.glide.load.data.d;

/* loaded from: classes.dex */
public class w implements n {

    /* renamed from: a, reason: collision with root package name */
    private static final w f4387a = new w();

    public static class a implements o {

        /* renamed from: a, reason: collision with root package name */
        private static final a f4388a = new a();

        public static a a() {
            return f4388a;
        }

        @Override // P1.o
        public n d(r rVar) {
            return w.c();
        }
    }

    public static w c() {
        return f4387a;
    }

    @Override // P1.n
    public n.a a(Object obj, int i8, int i9, J1.h hVar) {
        return new n.a(new C0978b(obj), new b(obj));
    }

    @Override // P1.n
    public boolean b(Object obj) {
        return true;
    }

    private static class b implements com.bumptech.glide.load.data.d {

        /* renamed from: o, reason: collision with root package name */
        private final Object f4389o;

        b(Object obj) {
            this.f4389o = obj;
        }

        @Override // com.bumptech.glide.load.data.d
        public Class a() {
            return this.f4389o.getClass();
        }

        @Override // com.bumptech.glide.load.data.d
        public J1.a d() {
            return J1.a.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.d
        public void e(com.bumptech.glide.g gVar, d.a aVar) {
            aVar.f(this.f4389o);
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
        }
    }
}
